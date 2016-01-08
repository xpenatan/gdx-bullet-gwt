package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btMotionState extends BulletBase
{
	
	public btMotionState()
	{
		jsObject = createObj();
	}

	private native JavaScriptObject createObj() /*-{
		var self = this;
		var jsMotionState = new $wnd.Ammo.myMotionState();
		jsMotionState.getWorldTransform = function(transPtr) { 
			var jsTrasnform = $wnd.Ammo.wrapPointer(transPtr, $wnd.Ammo.btTransform);
			var matrix4 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Matrix4_1;
			@com.badlogic.gdx.physics.bullet.linearmath.btTransform::getTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(jsTrasnform, matrix4)
			self.@com.badlogic.gdx.physics.bullet.linearmath.btMotionState::getWorldTransform(Lcom/badlogic/gdx/math/Matrix4;)(matrix4)
			@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(jsTrasnform, matrix4)
		};
		jsMotionState.setWorldTransform = function(transPtr) { 
			var jsTrasnform = $wnd.Ammo.wrapPointer(transPtr, $wnd.Ammo.btTransform);
			var matrix4 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Matrix4_1;
			@com.badlogic.gdx.physics.bullet.linearmath.btTransform::getTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(jsTrasnform, matrix4)
			self.@com.badlogic.gdx.physics.bullet.linearmath.btMotionState::setWorldTransform(Lcom/badlogic/gdx/math/Matrix4;)(matrix4)
		};
		return jsMotionState;
	}-*/;
	
	
	/** For dynamic and static bodies this method is called by bullet once to get the initial state of the body. For kinematic
	 * bodies this method is called on every update, unless the body is deactivated. */
	public void getWorldTransform(Matrix4 worldTrans)
	{
	}
	
	/** For dynamic bodies this method is called by bullet every update to inform about the new position and rotation. */
	public void setWorldTransform(Matrix4 worldTrans)
	{
	}
}
