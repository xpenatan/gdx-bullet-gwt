package com.badlogic.gdx.physics.bullet.dynamics;

import com.google.gwt.core.client.JavaScriptObject;

public class btSequentialImpulseConstraintSolver extends btConstraintSolver
{
	public btSequentialImpulseConstraintSolver()
	{
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
	  var obj = new $wnd.Ammo.btSequentialImpulseConstraintSolver();
	  return obj;
	}-*/;
}
