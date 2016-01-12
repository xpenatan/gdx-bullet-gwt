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
	}

	public btHingeConstraint(btRigidBody rbA, Vector3 pivotInA, Vector3 axisInA) {
	}

	public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame, boolean useReferenceFrameA) {
	}

	public btHingeConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) {
		jsObject = createObj(rbA, rbB, rbAFrame, rbBFrame);
	}

	public btHingeConstraint(btRigidBody rbA, Matrix4 rbAFrame, boolean useReferenceFrameA) {
	}

	public btHingeConstraint(btRigidBody rbA, Matrix4 rbAFrame) {
		jsObject = createObj(rbA, rbAFrame);
	}
	
	private native JavaScriptObject createObj(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) /*-{
		var btRigidBodyAJS = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var btRigidBodyBJS = rbB.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpTransform1JS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpTransform1JS, rbAFrame);
		var tmpTransform2JS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_2;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpTransform2JS, rbBFrame);
		var obj = new $wnd.Ammo.btHingeConstraint(btRigidBodyAJS, btRigidBodyBJS, tmpTransform1JS, tmpTransform2JS);
		obj.javaObject = this;
		return obj;
	}-*/;
	
	private native JavaScriptObject createObj(btRigidBody rbA, Matrix4 rbAFrame) /*-{
		var btRigidBodyAJS = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpTransform1JS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpTransform1JS, rbAFrame);
		var obj = new $wnd.Ammo.btHingeConstraint(btRigidBodyAJS, mpTransform1JS);
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
