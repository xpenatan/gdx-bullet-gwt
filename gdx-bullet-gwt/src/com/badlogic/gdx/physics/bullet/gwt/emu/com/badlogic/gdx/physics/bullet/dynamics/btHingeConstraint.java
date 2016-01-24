package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btHingeConstraint extends btTypedConstraint
{
	public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB, Vector3 axisInA, Vector3 axisInB, boolean useReferenceFrameA) {
	}

	public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB, Vector3 axisInA, Vector3 axisInB) {
	}

	public btHingeConstraint(btRigidBody rbA, Vector3 pivotInA, Vector3 axisInA, boolean useReferenceFrameA) {
		jsObject = createObj(rbA, pivotInA, axisInA, useReferenceFrameA);
	}

	public btHingeConstraint(btRigidBody rbA, Vector3 pivotInA, Vector3 axisInA) {
		jsObject = createObj(rbA, pivotInA, axisInA, false);
	}

	public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame, boolean useReferenceFrameA) {
		jsObject = createObj(rbA, rbB, rbAFrame, rbBFrame, useReferenceFrameA);
	}

	public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) {
		jsObject = createObj(rbA, rbB, rbAFrame, rbBFrame, false);
	}

	public btHingeConstraint(btRigidBody rbA, Matrix4 rbAFrame, boolean useReferenceFrameA) {
		jsObject = createObj(rbA, rbAFrame, useReferenceFrameA);
	}

	public btHingeConstraint(btRigidBody rbA, Matrix4 rbAFrame) {
		jsObject = createObj(rbA, rbAFrame, false);
	}
	
	private native JavaScriptObject createObj(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame, boolean useReferenceFrameA) /*-{
		var btRigidBodyAJS = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var btRigidBodyBJS = rbB.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpTransform1JS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpTransform1JS, rbAFrame);
		var tmpTransform2JS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_2;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpTransform2JS, rbBFrame);
		var obj = new $wnd.Ammo.btHingeConstraint(btRigidBodyAJS, btRigidBodyBJS, tmpTransform1JS, tmpTransform2JS, useReferenceFrameA);
		obj.javaObject = this;
		return obj;
	}-*/;
	
	private native JavaScriptObject createObj(btRigidBody rbA, Matrix4 rbAFrame, boolean useReferenceFrameA) /*-{
		var btRigidBodyAJS = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpTransform1JS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpTransform1JS, rbAFrame);
		var obj = new $wnd.Ammo.btHingeConstraint(btRigidBodyAJS, mpTransform1JS, useReferenceFrameA);
		obj.javaObject = this;
		return obj;
	}-*/;
	
	private native JavaScriptObject createObj(btRigidBody rbA, Vector3 pivotInA, Vector3 axisInA, boolean useReferenceFrameA) /*-{
		var btRigidBodyAJS = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(pivotInA.@com.badlogic.gdx.math.Vector3::x,pivotInA.@com.badlogic.gdx.math.Vector3::y,pivotInA.@com.badlogic.gdx.math.Vector3::z);
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(axisInA.@com.badlogic.gdx.math.Vector3::x,axisInA.@com.badlogic.gdx.math.Vector3::y,axisInA.@com.badlogic.gdx.math.Vector3::z);
		var obj = new $wnd.Ammo.btHingeConstraint(btRigidBodyAJS, tmpbtVector1, tmpbtVector2, useReferenceFrameA);
		obj.javaObject = this;
		return obj;
	}-*/;

	public native void setLimit(float low, float high, float _softness, float _biasFactor, float _relaxationFactor) /*-{
		var hingeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		hingeJS.setLimit(low, high, _softness, _biasFactor, _relaxationFactor);
	}-*/;
	
	public native void setLimit(float low, float high, float _softness, float _biasFactor) /*-{
		var hingeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		hingeJS.setLimit(low, high, _softness, _biasFactor);
	}-*/;
	
	public native void setLimit(float low, float high, float _softness) /*-{
		var hingeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		hingeJS.setLimit(low, high, _softness);
	}-*/;
	
	public native void setLimit(float low, float high) /*-{
		var hingeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		hingeJS.setLimit(low, high);
	}-*/;
	
	public native void enableAngularMotor(boolean enableMotor, float targetVelocity, float maxMotorImpulse) /*-{
		var hingeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		hingeJS.enableAngularMotor(enableMotor, targetVelocity, maxMotorImpulse);
	}-*/;
}
