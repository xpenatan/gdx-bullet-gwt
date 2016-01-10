package com.badlogic.gdx.physics.bullet.collision;

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
	
	protected btCollisionObjectArray objectArray = new btCollisionObjectArray();
	
	public btCollisionWorld() {
		if(Bullet.TMP_btVector3js_1 == null)
			Bullet.TMP_btVector3js_1 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btVector3js_2 == null)
			Bullet.TMP_btVector3js_2 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btVector3js_3 == null)
			Bullet.TMP_btVector3js_3 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btTransformjs_1 == null)
			Bullet.TMP_btTransformjs_1 = btTransform.createObj();
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
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::addObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(body);
		worldJS.addCollisionObject(bodyJS);
	}-*/;
	
	public native void removeCollisionObject(btCollisionObject collisionObject) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::removeObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(body);
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
	
	public native float getAppliedImpulse() /*-{
		
		return 0;
	}-*/;
	
	 public native void contactPairTest(btCollisionObject colObjA, btCollisionObject colObjB, ContactResultCallback resultCallback) /*-{
		 var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		 var colObjAJS = colObjA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		 var colObjBJS = colObjB.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		 var resultCallbackJS = resultCallback.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		 worldJS.contactPairTest(colObjAJS, colObjBJS, resultCallbackJS);
	 }-*/;
}
