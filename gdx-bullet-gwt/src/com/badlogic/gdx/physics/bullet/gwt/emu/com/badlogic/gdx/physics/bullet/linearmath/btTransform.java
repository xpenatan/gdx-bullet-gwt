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
	public static native void setTransform(JavaScriptObject btTransformJS, Matrix4 out) /*-{
	//FIXME need check if there is a better way to sync
		var origin = btTransformJS.getOrigin();
		var tmpVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		out.@com.badlogic.gdx.math.Matrix4::getTranslation(Lcom/badlogic/gdx/math/Vector3;)(tmpVector);
		var x = tmpVector.@com.badlogic.gdx.math.Vector3::x;
		var y = tmpVector.@com.badlogic.gdx.math.Vector3::y;
		var z = tmpVector.@com.badlogic.gdx.math.Vector3::z;
		origin.setValue(x,y,z);
		
		var tmpQuaternion = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Quaternion_1;
		out.@com.badlogic.gdx.math.Matrix4::getRotation(Lcom/badlogic/gdx/math/Quaternion;)(tmpQuaternion);
		var xx = tmpQuaternion.@com.badlogic.gdx.math.Quaternion::x;
		var yy = tmpQuaternion.@com.badlogic.gdx.math.Quaternion::y;
		var zz = tmpQuaternion.@com.badlogic.gdx.math.Quaternion::z;
		var ww = tmpQuaternion.@com.badlogic.gdx.math.Quaternion::w;
	
		var tmpbtQuaternion = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btQuaternionjs_1;
		tmpbtQuaternion.setValue(xx, yy, zz, ww);
		btTransformJS.setRotation(tmpbtQuaternion);
	}-*/;
	
	/**
	 * this sync (get) matrix transform with javascript transform. btTransformJS is the btTransform from ammo.
	 */
	public static native void getTransform(JavaScriptObject btTransformJS, Matrix4 out) /*-{
	//FIXME need check if there is a better way to sync
		
		var rotation = btTransformJS.getRotation();
		var origin = btTransformJS.getOrigin();

		var vector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		vector3.@com.badlogic.gdx.math.Vector3::x = origin.x();
		vector3.@com.badlogic.gdx.math.Vector3::y = origin.y();
		vector3.@com.badlogic.gdx.math.Vector3::z = origin.z();
		
		var quaternion = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Quaternion_1;
		quaternion.@com.badlogic.gdx.math.Quaternion::x = rotation.x();
		quaternion.@com.badlogic.gdx.math.Quaternion::y = rotation.y();
		quaternion.@com.badlogic.gdx.math.Quaternion::z = rotation.z();
		quaternion.@com.badlogic.gdx.math.Quaternion::w = rotation.w();
		
		out.@com.badlogic.gdx.math.Matrix4::idt()();
		out.@com.badlogic.gdx.math.Matrix4::translate(Lcom/badlogic/gdx/math/Vector3;)(vector3);
		out.@com.badlogic.gdx.math.Matrix4::rotate(Lcom/badlogic/gdx/math/Quaternion;)(quaternion);
		
		
//***  NOT WORKING  Basis should be faster than using quat/rotate calculation but its not working.
//		tmp3x3.idt();
//		getJSValue(pos);
//		
//		JavaScriptObject basis = getBasis();
//		btTmp3x3.getMatrixJS(basis, tmp3x3);
//		
//		out.idt();
//		out.set(tmp3x3).setTranslation(pos);
//**************************
	}-*/;
	
	
	private native JavaScriptObject getBasis() /*-{
		var transformJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return transformJS.getBasis();
	}-*/;
}
