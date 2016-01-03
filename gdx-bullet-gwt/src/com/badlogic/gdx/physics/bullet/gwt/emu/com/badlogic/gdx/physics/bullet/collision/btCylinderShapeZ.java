package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btCylinderShapeZ extends btCylinderShape
{
	public btCylinderShapeZ(Vector3 halfExtents)
	{
		jsObject = createObj(halfExtents);
	}
	
	public static native JavaScriptObject createObj(Vector3 halfExtents) /*-{
		var x = halfExtents.@com.badlogic.gdx.math.Vector3::x;
		var y = halfExtents.@com.badlogic.gdx.math.Vector3::y;
		var z = halfExtents.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		var obj = new $wnd.Ammo.btCylinderShapeZ(tmpbtVector);
		return obj;
	}-*/;
}
