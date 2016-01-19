package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btGhostPairCallback extends btOverlappingPairCallback {
	public btGhostPairCallback() {
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btGhostPairCallback();
		obj.javaObject = this;
		return obj;
	}-*/;
}
