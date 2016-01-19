package com.badlogic.gdx.physics.bullet.softbody;

import com.google.gwt.core.client.JavaScriptObject;

public class btDefaultSoftBodySolver extends btSoftBodySolver
{
	public btDefaultSoftBodySolver()
	{
		jsObject = createObj();
	}
	private native JavaScriptObject createObj() /*-{
	  	var obj = new $wnd.Ammo.btDefaultSoftBodySolver();
	  	obj.javaObject = this;
		return obj;
	}-*/;
}
