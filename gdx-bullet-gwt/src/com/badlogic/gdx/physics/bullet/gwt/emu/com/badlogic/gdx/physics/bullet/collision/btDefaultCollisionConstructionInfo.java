package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btDefaultCollisionConstructionInfo extends BulletBase
{
	public btDefaultCollisionConstructionInfo()
	{
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
	  	var obj = new $wnd.Ammo.btDefaultCollisionConstructionInfo();
	  	obj.javaObject = this;
		return obj;
	}-*/;
}
