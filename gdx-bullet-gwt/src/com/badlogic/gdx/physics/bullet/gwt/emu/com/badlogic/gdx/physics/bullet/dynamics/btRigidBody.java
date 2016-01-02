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
	}
	
	
//	public native void setMotionState(btMotionState motionState) /*-{  FIXME Dont work. maybe with a fixed ammo.js this will proper implemented. 
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
	
	public native void applyCentralImpulse(Vector3 impulse) /*-{ 
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = impulse.@com.badlogic.gdx.math.Vector3::x;
		var y = impulse.@com.badlogic.gdx.math.Vector3::y;
		var z = impulse.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.applyCentralImpulse(tmpbtVector);
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
	
	
	public native void applyCentralForce(Vector3 force) /*-{
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = force.@com.badlogic.gdx.math.Vector3::x;
		var y = force.@com.badlogic.gdx.math.Vector3::y;
		var z = force.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.applyCentralForce(tmpbtVector);
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
	}
}
