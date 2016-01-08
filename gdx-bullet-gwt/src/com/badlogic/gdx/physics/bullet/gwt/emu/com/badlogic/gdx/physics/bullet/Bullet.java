package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
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
		public static JavaScriptObject TMP_btMatrix3x3JS_1;
		
		public static Vector3 TMP_Vector3_1 = new Vector3();
		public static Vector3 TMP_Vector3_2 = new Vector3();
		public static Vector3 TMP_Vector3_3 = new Vector3();
		public static Vector3 TMP_Vector3_4 = new Vector3();
		public static Quaternion TMP_Quaternion_1 = new Quaternion();
		public static Matrix4 TMP_Matrix4_1 = new Matrix4();
		public static Matrix3 TMP_Matrix3_1 = new Matrix3();
	//*****
	
	public static void init()
	{
		GwtBullet.init();
	}

	
	public static native void destroyJS(JavaScriptObject jsObject) /*-{
		$wnd.Ammo.destroy(jsObject);
	}-*/;
}
