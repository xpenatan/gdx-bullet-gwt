package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btTransform extends BulletBase
{
	public btTransform(Matrix4 transform)
	{
		jsObject = createObj();
		setTransform(jsObject, transform);
	}

	public btTransform()
	{
		this(true);
	}

	public btTransform(boolean create)
	{
		if (create)
			jsObject = createObj();
	}

	public native static JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btTransform();
		return obj;
	}-*/;

	/**
	 * This sync (set) javascript transform with matrix transform. btTransformJS is the btTransform from ammo.
	 */
	public static native void setTransform(JavaScriptObject btTransformJS, Matrix4 matrix4In) /*-{
		var origin = btTransformJS.getOrigin();
		var matrix3x3JS = btTransformJS.getBasis();
		var row0  = matrix3x3JS.getRow(0);
		var row1  = matrix3x3JS.getRow(1);
		var row2  = matrix3x3JS.getRow(2);
		var x = matrix4In.@com.badlogic.gdx.math.Matrix4::val[12];
		var y = matrix4In.@com.badlogic.gdx.math.Matrix4::val[13];
		var z = matrix4In.@com.badlogic.gdx.math.Matrix4::val[14];
		origin.setValue(x,y,z);
		var x0 = matrix4In.@com.badlogic.gdx.math.Matrix4::val[0];
		var y0 = matrix4In.@com.badlogic.gdx.math.Matrix4::val[4];
		var z0 = matrix4In.@com.badlogic.gdx.math.Matrix4::val[8];
		var x1 = matrix4In.@com.badlogic.gdx.math.Matrix4::val[1];
		var y1 = matrix4In.@com.badlogic.gdx.math.Matrix4::val[5];
		var z1 = matrix4In.@com.badlogic.gdx.math.Matrix4::val[9];
		var x2 = matrix4In.@com.badlogic.gdx.math.Matrix4::val[2];
		var y2 = matrix4In.@com.badlogic.gdx.math.Matrix4::val[6];
		var z2 = matrix4In.@com.badlogic.gdx.math.Matrix4::val[10];
		row0.setValue(x0,y0,z0);
		row1.setValue(x1,y1,z1);
		row2.setValue(x2,y2,z2);
	}-*/;
	
	/**
	 * this sync (get) matrix transform with javascript transform. btTransformJS is the btTransform from ammo.
	 */
	public static native void getTransform(JavaScriptObject btTransformJS, Matrix4 matrix4Out) /*-{
		var matrix3x3JS = btTransformJS.getBasis();
		var row0  = matrix3x3JS.getRow(0);
		var row1  = matrix3x3JS.getRow(1);
		var row2  = matrix3x3JS.getRow(2);
		var origin = btTransformJS.getOrigin();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[0] = row0.x();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[1] = row1.x();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[2] = row2.x();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[3] = 0;
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[4] = row0.y();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[5] = row1.y();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[6] = row2.y();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[7] = 0;
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[8] = row0.z();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[9] = row1.z();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[10] = row2.z();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[11] = 0;
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[12] = origin.x();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[13] = origin.y();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[14] = origin.z();
		matrix4Out.@com.badlogic.gdx.math.Matrix4::val[15] = 1.0;
	}-*/;
	
	
	private native JavaScriptObject getBasis() /*-{
		var transformJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return transformJS.getBasis();
	}-*/;
}
