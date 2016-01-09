package com.badlogic.gdx.physics.bullet.collision;

public class btGImpactShapeInterface extends btConcaveShape
{

	public native void updateBound() /*-{
		var shapeInterface = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		shapeInterface.updateBound();
	}-*/;
}
