package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.google.gwt.core.client.JavaScriptObject;

public class btConeTwistConstraint extends btTypedConstraint
{
	public btConeTwistConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame)
	{
		jsObject = createObj(rbA, rbB, rbAFrame, rbBFrame);
	}

	public btConeTwistConstraint(btRigidBody rbA, Matrix4 rbAFrame)
	{
		jsObject = createObj(rbA, rbAFrame);
	}
	
	private native JavaScriptObject createObj(btRigidBody rbA, btRigidBody rbB, Matrix4 rbAFrame, Matrix4 rbBFrame) /*-{
		var btRigidBodyAJS = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var btRigidBodyBJS = rbB.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpTransform1JS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpTransform1JS, rbAFrame);
		var tmpTransform2JS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_2;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpTransform2JS, rbBFrame);
		var obj = new $wnd.Ammo.btConeTwistConstraint(btRigidBodyAJS, btRigidBodyBJS, tmpTransform1JS, tmpTransform2JS);
		obj.javaObject = this;
		return obj;
	}-*/;
	
	private native JavaScriptObject createObj(btRigidBody rbA, Matrix4 rbAFrame) /*-{
		var btRigidBodyAJS = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpTransform1JS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpTransform1JS, rbAFrame);
		var obj = new $wnd.Ammo.btConeTwistConstraint(btRigidBodyAJS, mpTransform1JS);
		obj.javaObject = this;
		return obj;
	}-*/;
	
	public native void setLimit(int limitIndex, float limitValue) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.setLimit(limitIndex, limitValue);
	}-*/;
	
	public native void setLimit(float _swingSpan1, float _swingSpan2, float _twistSpan, float _softness, float _biasFactor, float _relaxationFactor) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.setLimit(_swingSpan1, _swingSpan2, _twistSpan, _softness, _biasFactor, _relaxationFactor);
	}-*/;
	
	public native void setLimit(float _swingSpan1, float _swingSpan2, float _twistSpan, float _softness, float _biasFactor) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.setLimit(_swingSpan1, _swingSpan2, _twistSpan, _softness, _biasFactor);
	}-*/;
	
	public native void setLimit(float _swingSpan1, float _swingSpan2, float _twistSpan, float _softness) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.setLimit(_swingSpan1, _swingSpan2, _twistSpan, _softness);
	}-*/;
	
	public native void setLimit(float _swingSpan1, float _swingSpan2, float _twistSpan) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.setLimit(_swingSpan1, _swingSpan2, _twistSpan);
	}-*/;

	public native void setAngularOnly(boolean angularOnly) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.setAngularOnly(angularOnly);
	}-*/;

	public native void setDamping(float damping) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.setDamping(damping);
	}-*/;

	public native void enableMotor(boolean b) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.enableMotor(b);
	}-*/;

	public native void setMaxMotorImpulse(float maxMotorImpulse) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.setMaxMotorImpulse(maxMotorImpulse);
	}-*/;

	public native void setMaxMotorImpulseNormalized(float maxMotorImpulse) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		twistJS.setMaxMotorImpulseNormalized(maxMotorImpulse);
	}-*/;

	public native void setMotorTarget(Quaternion q) /*-{
		var twistJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var quatJS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btQuaternionjs_1;
		var x = q.@com.badlogic.gdx.math.Quaternion::x;
		var y = q.@com.badlogic.gdx.math.Quaternion::y;
		var z = q.@com.badlogic.gdx.math.Quaternion::z;
		var w = q.@com.badlogic.gdx.math.Quaternion::w;
		quatJS.setValue(x,y,z,w);
		twistJS.setMotorTarget(quatJS);
	}-*/;

	public native void setMotorTargetInConstraintSpace(Quaternion q) /*-{
		var twistJS = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var quatJS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btQuaternionjs_1;
		var x = q.@com.badlogic.gdx.math.Quaternion::x;
		var y = q.@com.badlogic.gdx.math.Quaternion::y;
		var z = q.@com.badlogic.gdx.math.Quaternion::z;
		var w = q.@com.badlogic.gdx.math.Quaternion::w;
		quatJS.setValue(x,y,z,w);
		twistJS.setMotorTargetInConstraintSpace(quatJS);
	}-*/;
}
