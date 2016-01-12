package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.collision.btCollisionWorld;

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
		worldJS.addRigidBody(bodyJS);
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::addObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(body);
	}-*/;

	public native void removeRigidBody(btRigidBody body) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.removeRigidBody(bodyJS);
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::removeObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(body);
	}-*/;
	
	public native void addConstraint(btTypedConstraint constraint, boolean disableCollisionsBetweenLinkedBodies) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var constraintJS = constraint.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.addConstraint(constraintJS, disableCollisionsBetweenLinkedBodies);
	}-*/;

	public native void addConstraint(btTypedConstraint constraint) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var constraintJS = constraint.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.addConstraint(constraintJS);
	}-*/;

	public native void removeConstraint(btTypedConstraint constraint) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var constraintJS = constraint.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
  		worldJS.removeConstraint(constraintJS);
	}-*/;
	
	public native void clearForces() /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.clearForces();
	}-*/;
}
