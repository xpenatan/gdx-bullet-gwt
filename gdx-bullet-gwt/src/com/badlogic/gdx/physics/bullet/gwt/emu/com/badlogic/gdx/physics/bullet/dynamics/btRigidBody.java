package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Vector3;
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

	private native JavaScriptObject createObj(btRigidBodyConstructionInfo constructionInfo) /*-{
		var rbInfo = constructionInfo.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btRigidBody(rbInfo);
		return obj;
	}-*/;

	public void setMotionState(btMotionState motionState)
	{
		refMotionState(motionState);
	}
	
	
//	public native void setMotionState(btMotionState motionState) /*-{ 
//		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::javaScriptObject;
//		
////		var motinState = new $wnd.Ammo.btDefaultMotionState(new $wnd.Ammo.btTransform());
////		
////		motinState.get_m_graphicsWorldTrans = function(btTransform) {
////    		$wnd.alert("111");
////  		};
////		motinState.set_m_graphicsWorldTrans = function(btTransform) {
////    		$wnd.alert("222");
////  		};
////  		
////		rBody.setMotionState( motinState );
//		
//		rBody.setMotionState( 
//		{
//			get_m_graphicsWorldTrans: function(btTransform) { 
//				$wnd.alert("111");
//			},
//			set_m_graphicsWorldTrans: function(btTransform) {
//				$wnd.alert("222");
//			}
//		}
//		);
//		
//	}-*/;
	
	public void applyCentralImpulse(Vector3 impulse)
	{
		applyCentralImpulse(tmp.jsObject, impulse);
	}
	
	private native void applyCentralImpulse(JavaScriptObject btVector, Vector3 impulse) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = impulse.@com.badlogic.gdx.math.Vector3::x;
		var y = impulse.@com.badlogic.gdx.math.Vector3::y;
		var z = impulse.@com.badlogic.gdx.math.Vector3::z;
		btVector.setX(x);
		btVector.setY(y);
		btVector.setZ(z);
		rBody.applyCentralImpulse(btVector);
	}-*/;
	
	
	public void setMassProps(float mass, Vector3 inertia) {
		tmp.set(inertia);
		setMassProps(mass, tmp);
	}
	
	private native void setMassProps(float mass, btVector3 inertia) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var inertiaa = inertia.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rBody.setMassProps(mass, inertiaa);
	}-*/;
	
	public void applyCentralForce(Vector3 force)
	{
		tmp.set(force.x, force.y, force.z);
		applyCentralForce(tmp);
	}
	
	private native void applyCentralForce(btVector3 value) /*-{
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var force = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rBody.applyCentralForce(force);
	}-*/;

	public void applyGravity()
	{
		//FIXME 
//		if (isStaticOrKinematicObject())
//			return;
		
		applyCentralForce(m_gravity);
	}

	public void setGravity(Vector3 gravity) 
	{ //FIXME ammo.js dont have this method
	
	}
	
	//	public btRigidBody(float mass, btMotionState motionState, btCollisionShape collisionShape, Vector3 localInertia) {
	//		this(false, mass, motionState, collisionShape, localInertia);
	//		refCollisionShape(collisionShape);
	//		refMotionState(motionState);
	//	}
	//	
	//	public btRigidBody(float mass, btMotionState motionState, btCollisionShape collisionShape) {
	//		this(false, mass, motionState, collisionShape);
	//		refCollisionShape(collisionShape);
	//		refMotionState(motionState);
	//	}

	protected void refMotionState(btMotionState motionState)
	{
		if (this.motionState == motionState)
			return;
		//		if (this.motionState != null)
		//			this.motionState.release();
		this.motionState = motionState;
		//		if (this.motionState != null)
		//			this.motionState.obtain();
		motionState.first = true;
	}

	public btMotionState getMotionState()
	{
		return motionState;
	}

	static public class btRigidBodyConstructionInfo extends BulletBase
	{
		btMotionState motionState;
		btCollisionShape collisionShape;

		public btRigidBodyConstructionInfo(float mass, btMotionState motionState, btCollisionShape collisionShape, Vector3 localInertia)
		{
			this.motionState = motionState;
			this.collisionShape = collisionShape;
			jsObject = createObj(mass, motionState == null ? null : motionState.jsObject, collisionShape.jsObject, new btVector3(localInertia).jsObject);
		}

		public btRigidBodyConstructionInfo(float mass, btMotionState motionState, btCollisionShape collisionShape)
		{
			jsObject = createObj(mass, null, collisionShape.jsObject);
		}

		private native JavaScriptObject createObj(float mass, JavaScriptObject motionState, JavaScriptObject collisionShape, JavaScriptObject localInertia) /*-{

			//			var startTransform = new  $wnd.Ammo.btTransform();
			//			var myMotionState = new  $wnd.Ammo.btDefaultMotionState(startTransform);

			var obj = new $wnd.Ammo.btRigidBodyConstructionInfo(mass, motionState, collisionShape, localInertia);
			return obj;
		}-*/;

		private native JavaScriptObject createObj(float mass, JavaScriptObject motionState, JavaScriptObject collisionShape) /*-{
			var obj = new $wnd.Ammo.btRigidBodyConstructionInfo(mass, motionState, collisionShape);
			return obj;
		}-*/;
	}
}
