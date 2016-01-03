package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btConeShapeX extends btConeShape
{
	public btConeShapeX(float radius, float height)
	{
		jsObject = createObj(radius, height);
	}
	
	public static native JavaScriptObject createObj(float radius, float height) /*-{
		var obj = new $wnd.Ammo.btConeShapeX(radius, height);
		return obj;
	}-*/;
}
