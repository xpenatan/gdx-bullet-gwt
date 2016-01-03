package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObject;
import com.badlogic.gdx.physics.bullet.collision.btCollisionWorld;
import com.badlogic.gdx.physics.bullet.linearmath.btDefaultMotionState;
import com.badlogic.gdx.physics.bullet.linearmath.btMotionState;

public class btDynamicsWorld extends btCollisionWorld
{
	Vector3 gravity = new Vector3();

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

	public native Vector3 getGravity() /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var jsGravity = worldJS.getGravity();
		var gravity = this.@com.badlogic.gdx.physics.bullet.dynamics.btDynamicsWorld::gravity;
		gravity.@com.badlogic.gdx.math.Vector3::x = jsGravity.x();
		gravity.@com.badlogic.gdx.math.Vector3::y = jsGravity.y();
		gravity.@com.badlogic.gdx.math.Vector3::z = jsGravity.z();
		return gravity;
	}-*/;
	
	public native void setGravity(Vector3 gravity) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = gravity.@com.badlogic.gdx.math.Vector3::x;
		var y = gravity.@com.badlogic.gdx.math.Vector3::y;
		var z = gravity.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		worldJS.setGravity(tmpbtVector);
	}-*/;


	public native void addRigidBody(btRigidBody body) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::addObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(body);
		worldJS.addRigidBody(bodyJS);
	}-*/;

	public native void removeRigidBody(btRigidBody body) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::removeObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(body);
		worldJS.removeRigidBody(bodyJS);
	}-*/;
	
	void loopMotionState()
	{ //FIXME  dirty hack to loop all motionState because ammo.js motionState dont work. Called by btDiscreteDynamicWorld.
		int size = objectArray.m_collisionObjects.size;
		
		for(int i = 0; i < size;i++)
		{
			btCollisionObject body = objectArray.m_collisionObjects.getValueAt(i);
			
			if(body instanceof btRigidBody)
			{
				btMotionState motionState = ((btRigidBody) body).getMotionState();
				
				if(motionState != null)
				{
					
//					if(motionState instanceof btDefaultMotionState)
//					{
//						btDefaultMotionState defaultMotion = (btDefaultMotionState)motionState;
//						
//						
//						if(motionState.first)
//						{
//							motionState.first = false;
//							body.getWorldTransform(Bullet.TMP_Matrix4_1);
//							motionState.getWorldTransform(Bullet.TMP_Matrix4_1);
//							body.setWorldTransform(Bullet.TMP_Matrix4_1);
//						}
//						else
//						{
//							Matrix4 worldTransform = body.getWorldTransform();
//							motionState.setWorldTransform(worldTransform);
//						}
//					}
//					else
					{
						if(motionState.first)
						{
							motionState.first = false;
							body.getWorldTransform(Bullet.TMP_Matrix4_1);
							motionState.getWorldTransform(Bullet.TMP_Matrix4_1);
							body.setWorldTransform(Bullet.TMP_Matrix4_1);
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
}
