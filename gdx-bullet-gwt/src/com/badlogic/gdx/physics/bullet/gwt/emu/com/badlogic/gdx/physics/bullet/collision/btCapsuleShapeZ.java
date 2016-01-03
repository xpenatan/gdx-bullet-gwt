package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btCapsuleShapeZ extends btConvexInternalShape
{
	public btCapsuleShapeZ(float radius, float height)
	{
		jsObject = createObj(radius, height);
	}
	
	public static native JavaScriptObject createObj(float radius, float height) /*-{
		var obj = new $wnd.Ammo.btCapsuleShapeZ(radius, height);
		return obj;
	}-*/;
}
