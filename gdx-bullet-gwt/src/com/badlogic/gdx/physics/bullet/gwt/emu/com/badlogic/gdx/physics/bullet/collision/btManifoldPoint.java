package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btManifoldPoint extends BulletBase
{
	btVector3 tmp = new btVector3(false);
	
	public native void getPositionWorldOnA(Vector3 out)  /*-{
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vector3JS = manifoldPoint.getPositionWorldOnA();
		out.@com.badlogic.gdx.math.Vector3::x = vector3JS.z();
		out.@com.badlogic.gdx.math.Vector3::y = vector3JS.y();
		out.@com.badlogic.gdx.math.Vector3::z = vector3JS.x();
	}-*/;
	
	public native void getPositionWorldOnB(Vector3 out)  /*-{
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vector3JS = manifoldPoint.getPositionWorldOnB();
		out.@com.badlogic.gdx.math.Vector3::x = vector3JS.z();
		out.@com.badlogic.gdx.math.Vector3::y = vector3JS.y();
		out.@com.badlogic.gdx.math.Vector3::z = vector3JS.x();
	}-*/;
	
	public native void getNormalWorldOnB(Vector3 out)  /*-{
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vector3JS = manifoldPoint.get_m_normalWorldOnB();
		out.@com.badlogic.gdx.math.Vector3::x = vector3JS.z();
		out.@com.badlogic.gdx.math.Vector3::y = vector3JS.y();
		out.@com.badlogic.gdx.math.Vector3::z = vector3JS.x();
	}-*/;

	
	private native JavaScriptObject getNormalWorldOnB() /*-{
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return manifoldPoint.get_m_normalWorldOnB();
	}-*/;

	public native float getDistance() /*-{
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return manifoldPoint.getDistance();
	}-*/;

	public native int getLifeTime() /*-{
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return manifoldPoint.getLifeTime();
	}-*/;
}
