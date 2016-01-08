package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btMatrix3x3 extends BulletBase
{
	public static native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btMatrix3x3();
		return obj;
	}-*/;
	
	public static native void getMatrix(JavaScriptObject matrix3InJS, Matrix3 matrix3Out) /*-{
		var row0 = matrix3InJS.getRow(0);
		var row1 = matrix3InJS.getRow(1);
		var row2 = matrix3InJS.getRow(2);
		var x0 = row0.x();
		var y0 = row0.y();
		var z0 = row0.z();
		var x1 = row1.x();
		var y1 = row1.y();
		var z1 = row1.z();
		var x2 = row2.x();
		var y2 = row2.y();
		var z2 = row2.z();
		matrix3Out.@com.badlogic.gdx.math.Matrix3::val[0] = x0;
		matrix3Out.@com.badlogic.gdx.math.Matrix3::val[1] = y0;
		matrix3Out.@com.badlogic.gdx.math.Matrix3::val[2] = z0;
		matrix3Out.@com.badlogic.gdx.math.Matrix3::val[3] = x1;
		matrix3Out.@com.badlogic.gdx.math.Matrix3::val[4] = y1;
		matrix3Out.@com.badlogic.gdx.math.Matrix3::val[5] = z1;
		matrix3Out.@com.badlogic.gdx.math.Matrix3::val[6] = x2;
		matrix3Out.@com.badlogic.gdx.math.Matrix3::val[7] = y2;
		matrix3Out.@com.badlogic.gdx.math.Matrix3::val[8] = z2;
	}-*/;

	public static native void setMatrix(JavaScriptObject matrix3OutJS, Matrix3 matrix3In)/*-{
		var x0 = matrix3In.@com.badlogic.gdx.math.Matrix3::val[0];
		var y0 = matrix3In.@com.badlogic.gdx.math.Matrix3::val[1];
		var z0 = matrix3In.@com.badlogic.gdx.math.Matrix3::val[2];
		var x1 = matrix3In.@com.badlogic.gdx.math.Matrix3::val[3];
		var y1 = matrix3In.@com.badlogic.gdx.math.Matrix3::val[4];
		var z1 = matrix3In.@com.badlogic.gdx.math.Matrix3::val[5];
		var x2 = matrix3In.@com.badlogic.gdx.math.Matrix3::val[6];
		var y2 = matrix3In.@com.badlogic.gdx.math.Matrix3::val[7];
		var z2 = matrix3In.@com.badlogic.gdx.math.Matrix3::val[8];
		matrix3OutJS.getRow(0).setValue(x0, y0, z0);
		matrix3OutJS.getRow(1).setValue(x1, y1, z1);
		matrix3OutJS.getRow(2).setValue(x2, y2, z2);
	}-*/;
}
