package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObject;
import com.badlogic.gdx.physics.bullet.collision.btCollisionShape;
import com.badlogic.gdx.physics.bullet.linearmath.btMotionState;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btRigidBody extends btCollisionObject
{
	btMotionState motionState;
	
	btVector3 m_gravity = new btVector3();
	
	btVector3 tmp = new btVector3();

	public btRigidBody(btRigidBodyConstructionInfo constructionInfo)
	{
		refCollisionShape(constructionInfo.collisionShape);
		refMotionState(constructionInfo.motionState);
		jsObject = createObj(constructionInfo);
	}
	
	public btRigidBody(float mass, btMotionState motionState, btCollisionShape collisionShape, Vector3 localInertia)
	{
		this(new btRigidBodyConstructionInfo(mass, motionState, collisionShape, localInertia));
	}

	public btRigidBody(float mass, btMotionState motionState, btCollisionShape collisionShape) 
	{
		this(new btRigidBodyConstructionInfo(mass, motionState, collisionShape));
	}
	

	private native JavaScriptObject createObj(btRigidBodyConstructionInfo constructionInfo) /*-{
		var rbInfo = constructionInfo.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btRigidBody(rbInfo);
		return obj;
	}-*/;

	public void setMotionState(btMotionState motionState)
	{
		refMotionState(motionState);
		setMotionStatee(motionState);
	}
	
	private native void setMotionStatee(btMotionState motionState) /*-{  
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var c = motionState.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rBody.setMotionState(c);
	}-*/;
	

	
	public native void setCenterOfMassTransform(Matrix4 xform) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtTransform = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpbtTransform, xform);
		rBody.setCenterOfMassTransform(tmpbtTransform);
	}-*/;
	
	public native void setSleepingThresholds(float linear, float angular) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rBody.setSleepingThresholds(linear, angular);
	}-*/;
	
	public native void setDamping(float lin_damping, float ang_damping) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rBody.setDamping(lin_damping, ang_damping);
	}-*/;
	
	public native void setMassProps(float mass, Vector3 inertia) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = inertia.@com.badlogic.gdx.math.Vector3::x;
		var y = inertia.@com.badlogic.gdx.math.Vector3::y;
		var z = inertia.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.setMassProps(mass, tmpbtVector);
	}-*/;
	
	public native void setLinearFactor(Vector3 linearFactor) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = linearFactor.@com.badlogic.gdx.math.Vector3::x;
		var y = linearFactor.@com.badlogic.gdx.math.Vector3::y;
		var z = linearFactor.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.setLinearFactor(tmpbtVector);
	}-*/;
	
	public native void applyTorque(Vector3 torque) /*-{
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = torque.@com.badlogic.gdx.math.Vector3::x;
		var y = torque.@com.badlogic.gdx.math.Vector3::y;
		var z = torque.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.applyTorque(tmpbtVector);
	}-*/;
	public native void applyForce(Vector3 force, Vector3 rel_pos) /*-{
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x1 = force.@com.badlogic.gdx.math.Vector3::x;
		var y1 = force.@com.badlogic.gdx.math.Vector3::y;
		var z1 = force.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(x1,y1,z1);
		var x2 = rel_pos.@com.badlogic.gdx.math.Vector3::x;
		var y2 = rel_pos.@com.badlogic.gdx.math.Vector3::y;
		var z2 = rel_pos.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(x2,y2,z2);
		rBody.applyForce(tmpbtVector, tmpbtVector2);
	}-*/;
	
	public native void applyCentralForce(Vector3 force) /*-{
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = force.@com.badlogic.gdx.math.Vector3::x;
		var y = force.@com.badlogic.gdx.math.Vector3::y;
		var z = force.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.applyCentralForce(tmpbtVector);
	}-*/;

//	applyCentralLocalForce is not bullet method. its a custom one for ammo so I dont use it.

	public native void applyTorqueImpulse(Vector3 torque) /*-{
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = torque.@com.badlogic.gdx.math.Vector3::x;
		var y = torque.@com.badlogic.gdx.math.Vector3::y;
		var z = torque.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.applyTorqueImpulse(tmpbtVector);
	}-*/;
	
	public native void applyCentralImpulse(Vector3 impulse) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = impulse.@com.badlogic.gdx.math.Vector3::x;
		var y = impulse.@com.badlogic.gdx.math.Vector3::y;
		var z = impulse.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.applyCentralImpulse(tmpbtVector);
	}-*/;
	
	public native void updateInertiaTensor() /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rBody.updateInertiaTensor();
	}-*/;
	
	public native Vector3 getLinearVelocity() /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var linVelo = rBody.getLinearVelocity();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = linVelo.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = linVelo.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = linVelo.z();
		return tmpVector3;
	}-*/;
	
	public native Vector3 getAngularVelocity() /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var angVelo = rBody.getAngularVelocity();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = angVelo.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = angVelo.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = angVelo.z();
		return tmpVector3;
	}-*/;
	
	public native void setLinearVelocity(Vector3 lin_vel) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = lin_vel.@com.badlogic.gdx.math.Vector3::x;
		var y = lin_vel.@com.badlogic.gdx.math.Vector3::y;
		var z = lin_vel.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.setLinearVelocity(tmpbtVector);
	}-*/;
	
	public native void setAngularVelocity(Vector3 ang_vel) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = ang_vel.@com.badlogic.gdx.math.Vector3::x;
		var y = ang_vel.@com.badlogic.gdx.math.Vector3::y;
		var z = ang_vel.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.setAngularVelocity(tmpbtVector);
	}-*/;
	
	public btMotionState getMotionState()
	{
		return motionState;
	}
	
	public native void setAngularFactor(Vector3 angularFactor) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = angularFactor.@com.badlogic.gdx.math.Vector3::x;
		var y = angularFactor.@com.badlogic.gdx.math.Vector3::y;
		var z = angularFactor.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.setAngularFactor(tmpbtVector);
	}-*/;
	
	public native void applyGravity()/*-{
//		if (isStaticOrKinematicObject()) //FIXME  needs implementation
//			return;
		
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(0,0,0);
		rBody.applyCentralForce(tmpbtVector);
	}-*/;

	public void setGravity(Vector3 gravity) 
	{ //FIXME ammo.js dont have this method
	
	}
	
	protected void refMotionState(btMotionState motionState)
	{
		if (this.motionState == motionState)
			return;
		//		if (this.motionState != null)
		//			this.motionState.release();
		this.motionState = motionState;
		//		if (this.motionState != null)
		//			this.motionState.obtain();
	}

	static public class btRigidBodyConstructionInfo extends BulletBase
	{
		btMotionState motionState;
		btCollisionShape collisionShape;

		public btRigidBodyConstructionInfo(float mass, btMotionState motionState, btCollisionShape collisionShape, Vector3 localInertia)
		{
			this.motionState = motionState;
			this.collisionShape = collisionShape;
			jsObject = createObj(mass, motionState == null ? null : motionState.jsObject, collisionShape.jsObject, localInertia == null ? null : new btVector3(localInertia).jsObject);
		}

		public btRigidBodyConstructionInfo(float mass, btMotionState motionState, btCollisionShape collisionShape)
		{
			jsObject = createObj(mass, null, collisionShape.jsObject);
		}

		private native JavaScriptObject createObj(float mass, JavaScriptObject motionState, JavaScriptObject collisionShape, JavaScriptObject localInertia) /*-{
			return new $wnd.Ammo.btRigidBodyConstructionInfo(mass, motionState, collisionShape, localInertia);
		}-*/;

		private native JavaScriptObject createObj(float mass, JavaScriptObject motionState, JavaScriptObject collisionShape) /*-{
			return new $wnd.Ammo.btRigidBodyConstructionInfo(mass, motionState, collisionShape);
		}-*/;
		
		public btCollisionShape getCollisionShape() {
	  		return collisionShape;
	  	}
		
		public native void setLinearDamping(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_linearDamping = value;
		}-*/;
		
		public native float getLinearDamping()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_linearDamping;
		}-*/;
		
		public native void setAngularDamping(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_angularDamping = value;
		}-*/;
		
		public native float getAngularDamping()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_angularDamping;
		}-*/;
		
		public native void setFriction(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_friction = value;
		}-*/;
		
		public native float getFriction()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_friction;
		}-*/;
		
		public native void setRollingFriction(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_rollingFriction = value;
		}-*/;
		
		public native float getRollingFriction()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_rollingFriction;
		}-*/;
		
		public native void setRestitution(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_restitution = value;
		}-*/;
		
		public native float getRestitution()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_restitution;
		}-*/;
		
		public native void setLinearSleepingThreshold(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_linearSleepingThreshold = value;
		}-*/;
		
		public native float getLinearSleepingThreshold()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_linearSleepingThreshold;
		}-*/;
		
		public native void setAngularSleepingThreshold(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_angularSleepingThreshold = value;
		}-*/;
		
		public native float getAngularSleepingThreshold()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_angularSleepingThreshold;
		}-*/;
		
		public native void setAdditionalDamping(boolean value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_additionalDamping = value;
		}-*/;
		
		public native boolean getAdditionalDamping()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_additionalDamping;
		}-*/;
		
		public native void setAdditionalDampingFactor(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_additionalDampingFactor = value;
		}-*/;
		
		public native float getAdditionalDampingFactor()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_additionalDampingFactor;
		}-*/;
		
		public native void setAdditionalLinearDampingThresholdSqr(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_additionalLinearDampingThresholdSqr = value;
		}-*/;
		
		public native float getAdditionalLinearDampingThresholdSqr()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_additionalLinearDampingThresholdSqr;
		}-*/;
		
		public native void setAdditionalAngularDampingThresholdSqr(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_additionalAngularDampingThresholdSqr = value;
		}-*/;
		
		public native float getAdditionalAngularDampingThresholdSqr()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_additionalAngularDampingThresholdSqr;
		}-*/;
		
		public native void setAdditionalAngularDampingFactor(float value) /*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			constrInfo.m_additionalAngularDampingFactor = value;
		}-*/;
		
		public native float getAdditionalAngularDampingFactor()/*-{ 
			var constrInfo = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return constrInfo.m_additionalAngularDampingFactor;
		}-*/;
	}
}
