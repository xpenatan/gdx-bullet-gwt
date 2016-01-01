package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btVector3 extends BulletBase
{
	public btVector3()
	{
		this(true);
	}

	public btVector3(boolean create)
	{
		if (create)
			jsObject = createObj(0, 0, 0);
	}
	
	public btVector3(Vector3 vector3)
	{
		jsObject = createObj(vector3.x, vector3.y, vector3.z);
	}

	private native JavaScriptObject createObj(float x, float y, float z) /*-{
		var obj = new $wnd.Ammo.btVector3(x, y, z);
		return obj;
	}-*/;

	//	public float dot(Vector3 v)
	//	{
	//		return LinearMathJNI.btVector3_dot(swigCPtr, this, v);
	//	}

	//	public float length2()
	//	{
	//		return LinearMathJNI.btVector3_length2(swigCPtr, this);
	//	}
	//
	//	public float length()
	//	{
	//		return LinearMathJNI.btVector3_length(swigCPtr, this);
	//	}
	//
	//	public float norm()
	//	{
	//		return LinearMathJNI.btVector3_norm(swigCPtr, this);
	//	}
	//
	//	public float distance2(Vector3 v)
	//	{
	//		return LinearMathJNI.btVector3_distance2(swigCPtr, this, v);
	//	}
	//
	//	public float distance(Vector3 v)
	//	{
	//		return LinearMathJNI.btVector3_distance(swigCPtr, this, v);
	//	}
	//
	//	public Vector3 safeNormalize()
	//	{
	//		return LinearMathJNI.btVector3_safeNormalize(swigCPtr, this);
	//	}
	//
	//	public Vector3 normalize()
	//	{
	//		return LinearMathJNI.btVector3_normalize(swigCPtr, this);
	//	}
	//
	//	public Vector3 normalized()
	//	{
	//		return LinearMathJNI.btVector3_normalized(swigCPtr, this);
	//	}
	//
	//	public Vector3 rotate(Vector3 wAxis, float angle)
	//	{
	//		return LinearMathJNI.btVector3_rotate(swigCPtr, this, wAxis, angle);
	//	}
	//
	//	public float angle(Vector3 v)
	//	{
	//		return LinearMathJNI.btVector3_angle(swigCPtr, this, v);
	//	}
	//
	//	public Vector3 absolute()
	//	{
	//		return LinearMathJNI.btVector3_absolute(swigCPtr, this);
	//	}
	//
	//	public Vector3 cross(Vector3 v)
	//	{
	//		return LinearMathJNI.btVector3_cross(swigCPtr, this, v);
	//	}
	//
	//	public float triple(Vector3 v1, Vector3 v2)
	//	{
	//		return LinearMathJNI.btVector3_triple(swigCPtr, this, v1, v2);
	//	}
	//
	//	public int minAxis()
	//	{
	//		return LinearMathJNI.btVector3_minAxis(swigCPtr, this);
	//	}
	//
	//	public int maxAxis()
	//	{
	//		return LinearMathJNI.btVector3_maxAxis(swigCPtr, this);
	//	}
	//
	//	public int furthestAxis()
	//	{
	//		return LinearMathJNI.btVector3_furthestAxis(swigCPtr, this);
	//	}
	//
	//	public int closestAxis()
	//	{
	//		return LinearMathJNI.btVector3_closestAxis(swigCPtr, this);
	//	}
	//
	//	public void setInterpolate3(Vector3 v0, Vector3 v1, float rt)
	//	{
	//		LinearMathJNI.btVector3_setInterpolate3(swigCPtr, this, v0, v1, rt);
	//	}
	//
	//	public Vector3 lerp(Vector3 v, float t)
	//	{
	//		return LinearMathJNI.btVector3_lerp(swigCPtr, this, v, t);
	//	}
	//

	public native float getX() /*-{
		var vector = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vector.x();
	}-*/;

	public native float getY() /*-{
		var vector = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vector.y();
	}-*/;

	public native float getZ() /*-{
		var vector = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vector.z();
	}-*/;

	public void set(Vector3 value)
	{
		set(value.x, value.y, value.z);
	}
	
	public native void set(float x, float y, float z) /*-{
		var vector = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vector.setX(x);
		vector.setY(y);
		vector.setZ(z);
	}-*/;
	
	public native void setX(float value) /*-{
		var vector = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vector.setX(value);
	}-*/;

	public native void setY(float value) /*-{
		var vector = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vector.setY(value);
	}-*/;

	public native void setZ(float value) /*-{
		var vector = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vector.setZ(value);
	}-*/;

	//	public void setW(float _w)
	//	{
	//		LinearMathJNI.btVector3_setW(swigCPtr, this, _w);
	//	}
	//
	//	public float x()
	//	{
	//		return LinearMathJNI.btVector3_x(swigCPtr, this);
	//	}
	//
	//	public float y()
	//	{
	//		return LinearMathJNI.btVector3_y(swigCPtr, this);
	//	}
	//
	//	public float z()
	//	{
	//		return LinearMathJNI.btVector3_z(swigCPtr, this);
	//	}
	//
	//	public float w()
	//	{
	//		return LinearMathJNI.btVector3_w(swigCPtr, this);
	//	}
	//
	//	public void setMax(Vector3 other)
	//	{
	//		LinearMathJNI.btVector3_setMax(swigCPtr, this, other);
	//	}
	//
	//	public void setMin(Vector3 other)
	//	{
	//		LinearMathJNI.btVector3_setMin(swigCPtr, this, other);
	//	}
	//
	//	public void setValue(float _x, float _y, float _z)
	//	{
	//		LinearMathJNI.btVector3_setValue(swigCPtr, this, _x, _y, _z);
	//	}
	//
	//	public void getSkewSymmetricMatrix(btVector3 v0, btVector3 v1, btVector3 v2)
	//	{
	//		LinearMathJNI.btVector3_getSkewSymmetricMatrix(swigCPtr, this, btVector3.getCPtr(v0), v0, btVector3.getCPtr(v1), v1, btVector3.getCPtr(v2), v2);
	//	}
	//
	//	public void setZero()
	//	{
	//		LinearMathJNI.btVector3_setZero(swigCPtr, this);
	//	}
	//
	//	public boolean isZero()
	//	{
	//		return LinearMathJNI.btVector3_isZero(swigCPtr, this);
	//	}
	//
	//	public boolean fuzzyZero()
	//	{
	//		return LinearMathJNI.btVector3_fuzzyZero(swigCPtr, this);
	//	}
	//
	//	public void serialize(btVector3FloatData dataOut)
	//	{
	//		LinearMathJNI.btVector3_serialize(swigCPtr, this, btVector3FloatData.getCPtr(dataOut), dataOut);
	//	}
	//
	//	public void deSerialize(btVector3FloatData dataIn)
	//	{
	//		LinearMathJNI.btVector3_deSerialize(swigCPtr, this, btVector3FloatData.getCPtr(dataIn), dataIn);
	//	}
	//
	//	public void serializeFloat(btVector3FloatData dataOut)
	//	{
	//		LinearMathJNI.btVector3_serializeFloat(swigCPtr, this, btVector3FloatData.getCPtr(dataOut), dataOut);
	//	}
	//
	//	public void deSerializeFloat(btVector3FloatData dataIn)
	//	{
	//		LinearMathJNI.btVector3_deSerializeFloat(swigCPtr, this, btVector3FloatData.getCPtr(dataIn), dataIn);
	//	}
	//
	//	public void serializeDouble(btVector3DoubleData dataOut)
	//	{
	//		LinearMathJNI.btVector3_serializeDouble(swigCPtr, this, btVector3DoubleData.getCPtr(dataOut), dataOut);
	//	}
	//
	//	public void deSerializeDouble(btVector3DoubleData dataIn)
	//	{
	//		LinearMathJNI.btVector3_deSerializeDouble(swigCPtr, this, btVector3DoubleData.getCPtr(dataIn), dataIn);
	//	}
	//
	//	public int maxDot(btVector3 array, int array_count, SWIGTYPE_p_float dotOut)
	//	{
	//		return LinearMathJNI.btVector3_maxDot(swigCPtr, this, btVector3.getCPtr(array), array, array_count, SWIGTYPE_p_float.getCPtr(dotOut));
	//	}
	//
	//	public int minDot(btVector3 array, int array_count, SWIGTYPE_p_float dotOut)
	//	{
	//		return LinearMathJNI.btVector3_minDot(swigCPtr, this, btVector3.getCPtr(array), array, array_count, SWIGTYPE_p_float.getCPtr(dotOut));
	//	}
	//
	//	public Vector3 dot3(Vector3 v0, Vector3 v1, Vector3 v2)
	//	{
	//		return LinearMathJNI.btVector3_dot3(swigCPtr, this, v0, v1, v2);
	//	}
}
