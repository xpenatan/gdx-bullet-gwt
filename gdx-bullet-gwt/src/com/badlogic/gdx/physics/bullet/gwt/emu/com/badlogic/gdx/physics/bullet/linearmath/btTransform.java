package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btTransform extends BulletBase
{
	static Matrix3 tmp3x3 = new Matrix3();
	static btMatrix3x3 btTmp3x3 = new btMatrix3x3();
	static Quaternion quat = new Quaternion();
	static Vector3 pos = new Vector3();

	float rx;
	float ry;
	float rz;
	float rw;
	
	public btTransform(Matrix4 transform)
	{
		jsObject = createObj();
		setTransform(transform);
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

	public native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btTransform();
		return obj;
	}-*/;

	Vector3 tmp = new Vector3();
	
	JavaScriptObject quatJS;
	
	/**
	 * this set matrix transform value to javascript transform
	 */
	public void setTransform(Matrix4 out)
	{
		if(quatJS == null)
			quatJS = newQuat();
		out.getTranslation(tmp);
		out.getRotation(quat);
		
		setJSValue(quatJS, quat, tmp.x, tmp.y, tmp.z);
	}
	
	
	
	private native JavaScriptObject newQuat() /*-{
		return new $wnd.Ammo.btQuaternion(0,0,0,1);
	}-*/;
	

	/**
	 * this sync matrix transform with javascript transform
	 */
	public void getSSTransform(Matrix4 out)
	{//FIXME need check if there is a better way to sync
		
		
		getJSValue(pos);
		
		quat.x = rx;
		quat.y = ry;
		quat.z = rz;
		quat.w = rw;
		
		out.idt();
		out.translate(pos);
		out.rotate(quat);
		
		
		
		//***  NOT WORKING  Basis should be faster than using quat/rotate calculation but its not working.
//		tmp3x3.idt();
//		getJSValue(pos);
//		
//		JavaScriptObject basis = getBasis();
//		btTmp3x3.getMatrixJS(basis, tmp3x3);
//		
//		out.idt();
//		out.set(tmp3x3.transpose()).setTranslation(pos);
		//**************************
	}
	
//	transform.set(btT.getBasis()).setTranslation(btT.getOrigin());
	
	
	private native void setJSValue(JavaScriptObject quatJS, Quaternion quat, float x, float y, float z) /*-{
		var transformJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var rotation = transformJS.getRotation();
		var origin = transformJS.getOrigin();
	
		origin.setX(x);
		origin.setY(y);
		origin.setZ(z);
		
		var xx = quat.@com.badlogic.gdx.math.Quaternion::x;
		var yy = quat.@com.badlogic.gdx.math.Quaternion::y;
		var zz = quat.@com.badlogic.gdx.math.Quaternion::z;
		var ww = quat.@com.badlogic.gdx.math.Quaternion::w;
	
		quatJS.setValue(xx, yy, zz, ww);
		transformJS.setRotation(quatJS);
	}-*/;
	
	
	private native void getJSValue(Vector3 position) /*-{
		var transformJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var rotation = transformJS.getRotation();
		var origin = transformJS.getOrigin();

		position.@com.badlogic.gdx.math.Vector3::x = origin.x();
		position.@com.badlogic.gdx.math.Vector3::y = origin.y();
		position.@com.badlogic.gdx.math.Vector3::z = origin.z();
		
		this.@com.badlogic.gdx.physics.bullet.linearmath.btTransform::rx = rotation.x();
		this.@com.badlogic.gdx.physics.bullet.linearmath.btTransform::ry = rotation.y();
		this.@com.badlogic.gdx.physics.bullet.linearmath.btTransform::rz = rotation.z();
		this.@com.badlogic.gdx.physics.bullet.linearmath.btTransform::rw = rotation.w();
		
	}-*/;
	
	private native JavaScriptObject getBasis() /*-{
		var transformJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return transformJS.getBasis();
	}-*/;
}
