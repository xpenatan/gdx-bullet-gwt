package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btMatrix3x3 extends BulletBase
{
	
	float x1, y1, z1;
	float x2, y2, z2;
	float x3, y3, z3;
	
	
	public void getMatrixJS(JavaScriptObject jsMatrix, Matrix3 out)
	{
		jsObject = jsMatrix;
		getJSValue();
		out.val[0] = x1;
		out.val[1] = y1;
		out.val[2] = z1;

		out.val[3] = x2;
		out.val[4] = y2;
		out.val[5] = z2;
		
		out.val[6] = x3;
		out.val[7] = y3;
		out.val[8] = z3;
	}
	
	/**
	 * NOT WORKING, AMMO DONT LET CHANGE MATRIX. MAYBE IN FUTURE
	 */
	private void setMatrixJS(JavaScriptObject jsMatrix, Matrix3 out)
	{ 
		x1 = out.val[0];
		y1 = out.val[1];
		z1 = out.val[2];

		x2 = out.val[3];
		y2 = out.val[4];
		z2 = out.val[5];
		
		x3 = out.val[6];
		y3 = out.val[7];
		z3 = out.val[8];
		
		jsObject = jsMatrix;
		setJSValue();
	}
	
	
	/**
	 * NOT WORKING, AMMO DONT LET CHANGE MATRIX. MAYBE IN FUTURE
	 */
	private native void setJSValue() /*-{
		var matrixJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	
		var row0 = matrixJS.getRow(0);
		var row1 = matrixJS.getRow(1);
		var row2 = matrixJS.getRow(2);
		
		var x1 = this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::x1;
		var y1 = this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::y1;
		var z1 = this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::z1;
		
		var x2 = this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::x2;
		var y2 = this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::y2;
		var z2 = this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::z2;
		
		var x3 = this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::x3;
		var y3 = this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::y3;
		var z3 = this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::z3;
		
		row0.setX(x1)
		row0.setY(y1);
		row0.setZ(z1);
		
		var row0000 = matrixJS.getRow(0);
		var xxx = row0000.x();
		var yyy = row0000.y();
		var zzz = row0000.z();
		
		row1.setX(x1)
		row1.setY(y1);
		row1.setZ(z1);
		
		row2.setX(x1)
		row2.setY(y1);
		row2.setZ(z1);
	}-*/;
	
	private native void getJSValue() /*-{
		var matrixJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		
		var row0 = matrixJS.getRow(0);
		var row1 = matrixJS.getRow(1);
		var row2 = matrixJS.getRow(2);
		
		this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::x1 = row0.x();
		this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::y1 = row0.y();
		this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::z1 = row0.z();
		
		this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::x2 = row1.x();
		this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::y2 = row1.y();
		this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::z2 = row1.z();
		
		this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::x3 = row2.x();
		this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::y3 = row2.y();
		this.@com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3::z3 = row2.z();
	}-*/;
}
