package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw;
import com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3;
import com.badlogic.gdx.physics.bullet.linearmath.btQuaternion;
import com.badlogic.gdx.physics.bullet.linearmath.btTransform;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btCollisionWorld extends BulletBase
{
	
	
	protected btDispatcher m_dispatcher;
	btIDebugDraw debugDrawer;
	
	protected btCollisionObjectArray objectArray = new btCollisionObjectArray(this);
	
	public btCollisionWorld() {
		if(Bullet.TMP_btVector3js_1 == null)
			Bullet.TMP_btVector3js_1 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btVector3js_2 == null)
			Bullet.TMP_btVector3js_2 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btVector3js_3 == null)
			Bullet.TMP_btVector3js_3 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btTransformjs_1 == null)
			Bullet.TMP_btTransformjs_1 = btTransform.createObj();
		if(Bullet.TMP_btTransformjs_2 == null)
			Bullet.TMP_btTransformjs_2 = btTransform.createObj();
		if(Bullet.TMP_btQuaternionjs_1 == null)
			Bullet.TMP_btQuaternionjs_1 = btQuaternion.createObj(0, 0, 0, 1);
		if(Bullet.TMP_btMatrix3x3JS_1 == null)
			Bullet.TMP_btMatrix3x3JS_1 = btMatrix3x3.createObj();
	}
	
	public btCollisionWorld(btDispatcher dispatcher, btBroadphaseInterface broadphasePairCache, btCollisionConfiguration collisionConfiguration) {
		this();
		jsObject = createObj(dispatcher, broadphasePairCache, collisionConfiguration);
	}
	
	private native JavaScriptObject createObj(btDispatcher dispatcher, btBroadphaseInterface broadphasePairCache, btCollisionConfiguration collisionConfiguration) /*-{
		var dispatcherJS = dispatcher.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	  	var broadphasePairCacheJS = broadphasePairCache.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var collisionConfigurationJS = collisionConfiguration.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btCollisionWorld(dispatcherJS, broadphasePairCacheJS, collisionConfigurationJS);
		return obj;
	}-*/;
	
	protected void addObject(btCollisionObject body) {
		objectArray.m_collisionObjects.put(body.jsObject, body);
	}

	protected boolean removeObject(btCollisionObject body) {
		return objectArray.m_collisionObjects.removeValue(body, true);
	}
	
	public native void addCollisionObject(btCollisionObject collisionObject) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = collisionObject.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::addObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(collisionObject);
		worldJS.addCollisionObject(bodyJS);
	}-*/;
	
	public native void removeCollisionObject(btCollisionObject collisionObject) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = collisionObject.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::removeObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(collisionObject);
		worldJS.removeCollisionObject(bodyJS); 
	}-*/;
	
	public btCollisionObjectArray getCollisionObjectArray() {
		return objectArray;
	}
	
	public native void setDebugDrawer(btIDebugDraw debugDrawer) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::debugDrawer = debugDrawer;
		var debugJS = debugDrawer.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.setDebugDrawer(debugJS);
	}-*/;

	public btDispatcher getDispatcher() {
		return m_dispatcher;
	}
	
	public native void debugDrawWorld() /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.debugDrawWorld();
	}-*/;
	
	public native void performDiscreteCollisionDetection() /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.performDiscreteCollisionDetection();
	}-*/;
	
	public native void contactTest(btCollisionObject colObj, ContactResultCallback resultCallback) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = colObj.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var callBackJS = resultCallback.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.contactTest(bodyJS, callBackJS);
	}-*/;
	
	public native void contactPairTest(btCollisionObject colObjA, btCollisionObject colObjB, ContactResultCallback resultCallback) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var colObjAJS = colObjA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var colObjBJS = colObjB.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var resultCallbackJS = resultCallback.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.contactPairTest(colObjAJS, colObjBJS, resultCallbackJS);
	 }-*/;
	 
	public native void rayTest(Vector3 rayFromWorld, Vector3 rayToWorld, RayResultCallback resultCallback) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var resultCallbackJS = resultCallback.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x1 = rayFromWorld.@com.badlogic.gdx.math.Vector3::x;
		var y1 = rayFromWorld.@com.badlogic.gdx.math.Vector3::y;
		var z1 = rayFromWorld.@com.badlogic.gdx.math.Vector3::z;
		var x2 = rayToWorld.@com.badlogic.gdx.math.Vector3::x;
		var y2 = rayToWorld.@com.badlogic.gdx.math.Vector3::y;
		var z2 = rayToWorld.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(x1,y1,z1);
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(x2,y2,z2);
		worldJS.rayTest(tmpbtVector1, tmpbtVector2, resultCallbackJS);
	 }-*/;
}
