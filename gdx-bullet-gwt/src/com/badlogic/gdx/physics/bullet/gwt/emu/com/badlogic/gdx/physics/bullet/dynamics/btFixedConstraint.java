package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix4;
import com.google.gwt.core.client.JavaScriptObject;

public class btFixedConstraint extends btGeneric6DofSpring2Constraint
{
	
	public btFixedConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 frameInA, Matrix4 frameInB) {
		jsObject = createObj(rbA, rbB, frameInA, frameInB);
	}

	private native JavaScriptObject createObj(btRigidBody rbA, btRigidBody rbB, Matrix4 frameInA, Matrix4 frameInB) /*-{
		var rbAJS = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var rbBJS = rbB.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtTransform1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpbtTransform1, frameInA);
		var tmpbtTransform2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_2;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpbtTransform2, frameInB);
		var obj = new $wnd.Ammo.btFixedConstraint(rbAJS, rbBJS, tmpbtTransform1, tmpbtTransform2);
		obj.javaObject = this;
		return obj;
	}-*/;
}
