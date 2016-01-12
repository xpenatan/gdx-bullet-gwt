package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btPairCachingGhostObject extends btGhostObject
{
	@Override
	public JavaScriptObject createMe() {
		return createObj(); 
	}
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btPairCachingGhostObject();
		obj.javaObject = this;
		return obj;
	}-*/;
}
