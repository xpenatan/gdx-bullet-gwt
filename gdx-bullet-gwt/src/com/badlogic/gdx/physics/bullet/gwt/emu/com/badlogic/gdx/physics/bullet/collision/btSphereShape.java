package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btSphereShape extends btConvexInternalShape
{
	public btSphereShape(float radius)
	{
		shapeType = BroadphaseNativeTypes.SPHERE_SHAPE_PROXYTYPE;
		jsObject = createObj(radius);
	}
	
	public static native JavaScriptObject createObj(float radius) /*-{
		var obj = new $wnd.Ammo.btSphereShape (radius);
		return obj;
	}-*/;
}
