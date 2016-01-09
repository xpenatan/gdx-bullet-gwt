package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btGImpactMeshShape extends btGImpactShapeInterface
{
	public btGImpactMeshShape(btStridingMeshInterface meshInterface) 
	{
		jsObject = createObj(meshInterface);
	}
	
	private native JavaScriptObject createObj(btStridingMeshInterface meshInterface) /*-{
		var meshInterface = meshInterface.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btGImpactMeshShape(meshInterface);
		return obj;
	}-*/;
}
