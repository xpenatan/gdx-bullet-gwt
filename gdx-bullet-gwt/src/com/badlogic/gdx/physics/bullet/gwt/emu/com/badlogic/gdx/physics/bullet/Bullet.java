package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.collision.btBroadphasePairArray;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObjectWrapper;
import com.badlogic.gdx.physics.bullet.collision.btManifoldPoint;
import com.badlogic.gdx.physics.bullet.collision.btOverlappingPairCache;
import com.badlogic.gdx.physics.bullet.dynamics.btConstraintSetting;
import com.badlogic.gdx.physics.bullet.gwt.GwtBullet;
import com.google.gwt.core.client.JavaScriptObject;


public class Bullet
{
	//***** a few javascript/java object so its not need to create for every set and get when sync java objects. They are created in CollisionWorld
	// Dont change names. Refactor dont work in JS. 
		public static JavaScriptObject TMP_btVector3js_1;
		public static JavaScriptObject TMP_btVector3js_2;
		public static JavaScriptObject TMP_btVector3js_3;
		public static JavaScriptObject TMP_btQuaternionjs_1;
		public static JavaScriptObject TMP_btTransformjs_1;
		public static JavaScriptObject TMP_btTransformjs_2;
		public static JavaScriptObject TMP_btMatrix3x3JS_1;
		
		public static Vector3 TMP_Vector3_1 = new Vector3();
		public static Vector3 TMP_Vector3_2 = new Vector3();
		public static Vector3 TMP_Vector3_3 = new Vector3();
		public static Vector3 TMP_Vector3_4 = new Vector3();
		public static Quaternion TMP_Quaternion_1 = new Quaternion();
		public static Matrix4 TMP_Matrix4_1 = new Matrix4();
		public static Matrix3 TMP_Matrix3_1 = new Matrix3();
		public static btCollisionObjectWrapper TMP_btCollisionObjectWrapper_1 = new btCollisionObjectWrapper();
		public static btCollisionObjectWrapper TMP_btCollisionObjectWrapper_2 = new btCollisionObjectWrapper();
		public static btManifoldPoint TMP_btManifoldPoint_1 = new btManifoldPoint();
		public static btConstraintSetting TMP_btConstraintSetting_1 = new btConstraintSetting();
		public static btOverlappingPairCache TMP_btOverlappingPairCache_1 = new btOverlappingPairCache();
		public static btBroadphasePairArray TMP_btBroadphasePairArray_1 = new btBroadphasePairArray();
	//*****
	
	public static void init()
	{
		GwtBullet.init();
	}

	
	public static native void destroyJS(JavaScriptObject jsObject) /*-{
		$wnd.Ammo.destroy(jsObject);
	}-*/;
	

	public static native JavaScriptObject getJavaBody(int pointer) /*-{
		var obj;
		var obj = $wnd.Ammo.getCache($wnd.Ammo.btCollisionObject)[pointer];
		if(!obj || !obj.javaObject)	{
			obj = $wnd.Ammo.getCache($wnd.Ammo.btRigidBody)[pointer];
			if(!obj || !obj.javaObject)	{
				obj = $wnd.Ammo.getCache($wnd.Ammo.btGhostObject)[pointer];
				if(!obj || !obj.javaObject)	{
					obj = $wnd.Ammo.getCache($wnd.Ammo.btPairCachingGhostObject)[pointer];
					if(!obj || !obj.javaObject)	{
						obj = $wnd.Ammo.getCache($wnd.Ammo.btSoftBody)[pointer];
						if(!obj || !obj.javaObject)	{
							obj = $wnd.Ammo.getCache($wnd.Ammo.btMultiBodyLinkCollider)[pointer];
						}
					}
				}
			}
		}
		if(!obj)
			return null;
		return obj.javaObject;
	}-*/;
	
	public static native JavaScriptObject getJavaWorld(int pointer) /*-{
		var obj;
		var obj = $wnd.Ammo.getCache($wnd.Ammo.btDynamicsWorld)[pointer];
		if(!obj || !obj.javaObject)	{
			obj = $wnd.Ammo.getCache($wnd.Ammo.btDiscreteDynamicsWorld)[pointer];
			if(!obj || !obj.javaObject)	{
				obj = $wnd.Ammo.getCache($wnd.Ammo.btSoftRigidDynamicsWorld)[pointer];
				if(!obj || !obj.javaObject)	{
					obj = $wnd.Ammo.getCache($wnd.Ammo.btMultiBodyDynamicsWorld)[pointer];
				}
			}
		}
		if(!obj)
			return null;
		return obj.javaObject;
	}-*/;
}
