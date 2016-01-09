package com.badlogic.gdx.physics.bullet.collision;

public class btGImpactCollisionAlgorithm extends btActivatingCollisionAlgorithm
{
	public static native void registerAlgorithm(btCollisionDispatcher dispatcher)/*-{
		var dispatcherJS = dispatcher.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		$wnd.Ammo.btGImpactCollisionAlgorithm.prototype.registerAlgorithm(dispatcherJS);
	}-*/;

	
}
