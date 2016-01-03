package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btCapsuleShape extends btConvexInternalShape
{
	public btCapsuleShape()
	{
		
	}
	public btCapsuleShape(float radius, float height)
	{
		jsObject = createObj(radius, height);
	}
	
	public static native JavaScriptObject createObj(float radius, float height) /*-{
		var obj = new $wnd.Ammo.btCapsuleShape(radius, height);
		return obj;
	}-*/;
}
