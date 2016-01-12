package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btDbvtBroadphase extends btBroadphaseInterface
{
	public btDbvtBroadphase() {
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
	  var obj = new $wnd.Ammo.btDbvtBroadphase();
	  return obj;
	}-*/;
}
