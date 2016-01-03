package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btConeShape extends btConvexInternalShape
{
	public btConeShape()
	{
		
	}
	public btConeShape(float radius, float height)
	{
		jsObject = createObj(radius, height);
	}
	
	public static native JavaScriptObject createObj(float radius, float height) /*-{
		var obj = new $wnd.Ammo.btConeShape(radius, height);
		return obj;
	}-*/;
}
