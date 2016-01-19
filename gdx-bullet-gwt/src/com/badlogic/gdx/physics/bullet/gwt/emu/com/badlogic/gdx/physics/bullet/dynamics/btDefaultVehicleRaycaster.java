package com.badlogic.gdx.physics.bullet.dynamics;

import com.google.gwt.core.client.JavaScriptObject;

public class btDefaultVehicleRaycaster extends btVehicleRaycaster
{
	public btDefaultVehicleRaycaster(btDynamicsWorld world)	{
		jsObject = createObj(world);
	}
	
	public native static JavaScriptObject createObj(btDynamicsWorld world) /*-{
		var worldJS = world.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btDefaultVehicleRaycaster(worldJS);
		return obj;
	}-*/;
}
