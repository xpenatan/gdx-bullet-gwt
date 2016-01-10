package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btShapeHull extends BulletBase
{
	btConvexShape shape;
	
	public btShapeHull(btConvexShape shape) 
	{
		this.shape = shape;
		jsObject = createObj(shape);
	}

	public static native JavaScriptObject createObj(btConvexShape shape) /*-{
		var convShape = shape.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.myShapeHull(convShape);
		return obj;
	}-*/;
	
	@Override
	public void dispose()
	{
		super.dispose();
		shape = null;
	}
	
	public native void buildHull(float margin) /*-{
		var shapeHull = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		shapeHull.buildHull(margin);
	}-*/;

	public native int numTriangles() /*-{
		var shapeHull = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		shapeHull.numTriangles();
	}-*/;

	public native int numVertices() /*-{
		var shapeHull = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		shapeHull.numVertices();
	}-*/;

	public native int numIndices() /*-{
		var shapeHull = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		shapeHull.numIndices();
	}-*/;

}
