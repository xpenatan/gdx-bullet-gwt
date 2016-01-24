package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class LocalShapeInfo extends BulletBase {
	public native void setShapePart(int value) /*-{
		var infoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		infoJS.set_m_shapePart(value);
	}-*/;

	public native int getShapePart() /*-{
		var infoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return infoJS.m_shapePart();
	}-*/;

	public native void setTriangleIndex(int value) /*-{
		var infoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		infoJS.set_m_triangleIndex(value);
	}-*/;

	public native int getTriangleIndex() /*-{
		var infoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return infoJS.get_m_triangleIndex();
	}-*/;
}
