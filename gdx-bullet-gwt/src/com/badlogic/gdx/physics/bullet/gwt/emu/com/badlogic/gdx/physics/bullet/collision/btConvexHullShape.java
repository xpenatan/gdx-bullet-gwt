package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btConvexHullShape extends btPolyhedralConvexAabbCachingShape
{
	public btConvexHullShape() {
		jsObject = createObj();
	}

	public btConvexHullShape(java.nio.FloatBuffer points, int numPoints, int stride) {
		jsObject = createObj(points, numPoints, stride);
	}

	public btConvexHullShape(btShapeHull hull) {
		jsObject = createObj(hull);
	}

	
	public static native JavaScriptObject createObj(btShapeHull hull) /*-{
		var shapeHull = hull.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		
		var obj = new $wnd.Ammo.btConvexHullShape();
		var numVertices = shapeHull.numVertices();
		var i = 0;
		while(i < numVertices)
		{
			var vectice = shapeHull.getVector(i);
			obj.addPoint(vectice);
			i++;
		}
		return obj;
	}-*/;
	
	public static native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btConvexHullShape();
		return obj;
	}-*/;

	public static native JavaScriptObject createObj(java.nio.FloatBuffer points, int numPoints, int stride) /*-{
		var obj = new $wnd.Ammo.btConvexHullShape();
		stride = stride/4;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		
		var remaining = points.@java.nio.FloatBuffer::remaining()();
		
		var i = 0;
		while (i < remaining) {
			var x = points.@java.nio.FloatBuffer::get(I)(i);
			var y = points.@java.nio.FloatBuffer::get(I)(i + 1);
			var z = points.@java.nio.FloatBuffer::get(I)(i + 2);

			tmpbtVector.setValue(x, y, z);
			obj.addPoint(tmpbtVector);
			i += stride;
		}
		return obj;
	}-*/;

	public native void addPoint(Vector3 point) /*-{
		var hullShape = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = point.@com.badlogic.gdx.math.Vector3::x;
		var y = point.@com.badlogic.gdx.math.Vector3::y;
		var z = point.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x, y, z);
		hullShape.addPoint(tmpbtVector);
	}-*/;

	public native void addPoint(Vector3 point, boolean recalculateLocalAABB) /*-{
		var hullShape = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = point.@com.badlogic.gdx.math.Vector3::x;
		var y = point.@com.badlogic.gdx.math.Vector3::y;
		var z = point.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x, y, z);
		hullShape.addPoint(tmpbtVector, recalculateLocalAABB);
	}-*/;
}
