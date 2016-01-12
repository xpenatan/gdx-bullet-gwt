package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btBoxShape extends btPolyhedralConvexShape
{
	private Vector3 realhalfExtentsWithOutMargin = new Vector3();
	Vector3 halfExtentsWithOutMargin = new Vector3();
	Vector3 halfExtentsWithMargin = new Vector3();

	public btBoxShape(Vector3 boxHalfExtents) {
		realhalfExtentsWithOutMargin.set(boxHalfExtents);
		jsObject = createObj(boxHalfExtents.x, boxHalfExtents.y, boxHalfExtents.z);
	}

	public static native JavaScriptObject createObj(float x, float y, float z) /*-{
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		var obj = new $wnd.Ammo.btBoxShape(tmpbtVector);
		return obj;
	}-*/;

	public Vector3 getHalfExtentsWithoutMargin() {
		halfExtentsWithOutMargin.set(realhalfExtentsWithOutMargin);
		return halfExtentsWithOutMargin;
	}

	public Vector3 getHalfExtentsWithMargin() {
		halfExtentsWithMargin.set(realhalfExtentsWithOutMargin);
		float margin = getMargin();
		halfExtentsWithMargin.add(margin);
		return halfExtentsWithMargin;
	}
}
