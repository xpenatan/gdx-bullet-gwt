package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw;
import com.google.gwt.core.client.JavaScriptObject;

public class btCollisionWorld extends BulletBase
{
	
	
	protected btDispatcher m_dispatcher;
	btIDebugDraw debugDrawer = new btIDebugDraw();
	
	protected btCollisionObjectArray objectArray = new btCollisionObjectArray();
	
	public btCollisionWorld() {
	
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
	
	public native void addCollisionObject(btCollisionObject collisionObject) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = collisionObject.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.addCollisionObject(bodyJS);
	}-*/;
	
	public native void addCollisionObject(btCollisionObject collisionObject, short collisionFilterGroup, short collisionFilterMask) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = collisionObject.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.addCollisionObject(bodyJS, collisionFilterGroup, collisionFilterMask);
	}-*/;
	
	public native void removeCollisionObject(btCollisionObject collisionObject) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = collisionObject.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.removeCollisionObject(bodyJS); 
	}-*/;
	
	public native btCollisionObjectArray getCollisionObjectArray() /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var array = this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::objectArray;
		array.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = worldJS.getCollisionObjectArray();
		return array;
	}-*/;
	
	public native void setDebugDrawer(btIDebugDraw debugDrawer) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::debugDrawer = debugDrawer;
		var debugJS = debugDrawer.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.setDebugDrawer(debugJS);
	}-*/;
	
	public native btIDebugDraw getDebugDrawer() /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var debugDrawer = this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::debugDrawer;
//		debugDrawer.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = worldJS.getDebugDrawer();
		return debugDrawer;
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
