package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btQuaternion extends BulletBase
{
	public btQuaternion()
	{
		this(true);
	}

	public btQuaternion(boolean create)
	{
		if (create)
			jsObject = createObj(0, 0, 0, 1);
	}
	
	public static native JavaScriptObject createObj(float x, float y, float z, float w) /*-{
		var obj = new $wnd.Ammo.btQuaternion(x, y, z, w);
		return obj;
	}-*/;
}
