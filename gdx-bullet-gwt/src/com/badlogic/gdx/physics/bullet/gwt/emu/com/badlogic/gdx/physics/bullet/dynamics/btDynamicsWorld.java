package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObject;
import com.badlogic.gdx.physics.bullet.collision.btCollisionWorld;
import com.badlogic.gdx.physics.bullet.linearmath.btMotionState;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;

public class btDynamicsWorld extends btCollisionWorld
{
	btVector3 gravity = new btVector3();

	public btDynamicsWorld()
	{

	}

	public native int stepSimulation(float timeStep, int maxSubSteps, float fixedTimeStep) /*-{
		return 0;
	}-*/;

	public native int stepSimulation(float timeStep, int maxSubSteps) /*-{
		return 0;
	}-*/;

	public native int stepSimulation(float timeStep) /*-{
		return 0;
	}-*/;

	public void setGravity(Vector3 gravity)
	{
		this.gravity.setX(gravity.x);
		this.gravity.setY(gravity.y);
		this.gravity.setZ(gravity.z);
		setGravity();

		//		Gdx.app.log("Gravityyy", "" + getGravity());
	}

	private native float getGravity() /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var gravity = worldJS.getGravity();

		return gravity.y();
	}-*/;

	private native void setGravity() /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var gravity = this.@com.badlogic.gdx.physics.bullet.dynamics.btDynamicsWorld::gravity;
		var gravityJS = gravity.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.setGravity(gravityJS);
	}-*/;

	public void addRigidBody(btRigidBody body)
	{
		addObject(body);
		addRigidBodyy(body);
	}

	private native void addRigidBodyy(btRigidBody body) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.addRigidBody(bodyJS);
	}-*/;

	public void removeRigidBody(btRigidBody body)
	{
		removeObject(body);
		removeRigidBodyy(body);
	}

	private native void removeRigidBodyy(btRigidBody body) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.removeRigidBody(bodyJS);
	}-*/;
	
	void loopMotionState()
	{ //FIXME  dirty hack to loop all motionState because ammo.js motionState dont work.
		int size = objectArray.m_collisionObjects.size;
		
		for(int i = 0; i < size;i++)
		{
			btCollisionObject body = objectArray.m_collisionObjects.getValueAt(i);
			
			if(body instanceof btRigidBody)
			{
				btMotionState motionState = ((btRigidBody) body).getMotionState();
				
				if(motionState != null)
				{
					if(motionState.first)
					{
						motionState.first = false;
						motionState.getWorldTransform(body.getWorldTransform());
					}
					else
					{
						Matrix4 worldTransform = body.getWorldTransform();
						motionState.setWorldTransform(worldTransform);
					}
				}
			}
			
		}
		
	}
}
