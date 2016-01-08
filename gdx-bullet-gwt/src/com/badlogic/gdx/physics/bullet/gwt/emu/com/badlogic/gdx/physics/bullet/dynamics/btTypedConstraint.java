package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.linearmath.btTypedObject;

public class btTypedConstraint extends btTypedObject
{
	public native void setBreakingImpulseThreshold(float threshold) /*-{
		var constraintJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		constraintJS.setBreakingImpulseThreshold(threshold);
	}-*/;
	
	public native void enableFeedback(boolean needsFeedback) /*-{
		var constraintJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		constraintJS.enableFeedback(needsFeedback);
	}-*/;
}
