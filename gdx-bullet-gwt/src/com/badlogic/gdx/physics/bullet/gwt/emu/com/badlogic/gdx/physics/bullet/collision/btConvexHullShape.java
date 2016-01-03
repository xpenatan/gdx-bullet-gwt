package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btConvexHullShape extends btPolyhedralConvexAabbCachingShape
{
	public btConvexHullShape()
	{
		jsObject = createObj();
	}
	
	public static native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btConvexHullShape();
		return obj;
	}-*/;
	
	
	public native void addPoint(Vector3 point) /*-{
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = point.@com.badlogic.gdx.math.Vector3::x;
		var y = point.@com.badlogic.gdx.math.Vector3::y;
		var z = point.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.addPoint(tmpbtVector);
	}-*/;
	
	public native void addPoint(Vector3 point, boolean recalculateLocalAABB) /*-{
		var rBody = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = point.@com.badlogic.gdx.math.Vector3::x;
		var y = point.@com.badlogic.gdx.math.Vector3::y;
		var z = point.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		rBody.addPoint(tmpbtVector, recalculateLocalAABB);
	}-*/;
}
