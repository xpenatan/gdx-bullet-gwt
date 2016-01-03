package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btStaticPlaneShape extends btConcaveShape
{
	public btStaticPlaneShape(Vector3 planeNormal, float planeConstant)
	{
		jsObject = createObj(planeNormal, planeConstant);
	}
	
	public static native JavaScriptObject createObj(Vector3 planeNormal, float planeConstant) /*-{
		var x = point.@com.badlogic.gdx.math.Vector3::x;
		var y = point.@com.badlogic.gdx.math.Vector3::y;
		var z = point.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		var obj = new $wnd.Ammo.btStaticPlaneShape(tmpbtVector, planeConstant);
		return obj;
	}-*/;
	
}
