package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btBoxShape extends btPolyhedralConvexShape
{
	private Vector3 realhalfExtentsWithOutMargin = new Vector3();
	Vector3 halfExtentsWithOutMargin = new Vector3();
	Vector3 halfExtentsWithMargin = new Vector3();

	public btBoxShape(Vector3 boxHalfExtents)
	{
		realhalfExtentsWithOutMargin.set(boxHalfExtents);
		jsObject = createObj(boxHalfExtents.x, boxHalfExtents.y, boxHalfExtents.z);
	}

	private native JavaScriptObject createObj(float x, float y, float z) /*-{
		var obj = new $wnd.Ammo.btBoxShape(new $wnd.Ammo.btVector3(x, y, z));
		return obj;
	}-*/;

	private native float getMargin() /*-{
		var boxShape = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return boxShape.getMargin();;
	}-*/;

	public Vector3 getHalfExtentsWithoutMargin()
	{
		halfExtentsWithOutMargin.set(realhalfExtentsWithOutMargin);
		return halfExtentsWithOutMargin;
	}

	public Vector3 getHalfExtentsWithMargin()
	{
		halfExtentsWithMargin.set(realhalfExtentsWithOutMargin);
		float margin = getMargin();
		halfExtentsWithMargin.add(margin);
		return halfExtentsWithMargin;
	}
}
