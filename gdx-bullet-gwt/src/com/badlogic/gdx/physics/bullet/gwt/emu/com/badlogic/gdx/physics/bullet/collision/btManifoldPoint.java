package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btManifoldPoint extends BulletBase
{
	btVector3 tmp = new btVector3(false);
	
	public void getPositionWorldOnB(Vector3 out)
	{
		tmp.jsObject = getPositionWorldOnB();
		out.x = tmp.getX();
		out.y = tmp.getY();
		out.z = tmp.getZ();
	}

	private native JavaScriptObject getPositionWorldOnB() /*-{
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return manifoldPoint.getPositionWorldOnB();
	}-*/;

	public void getNormalWorldOnB(Vector3 out)
	{
		tmp.jsObject = getNormalWorldOnB();
		out.x = tmp.getX();
		out.y = tmp.getY();
		out.z = tmp.getZ();
	}
	
	private native JavaScriptObject getNormalWorldOnB() /*-{
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return manifoldPoint.get_m_normalWorldOnB();
	}-*/;

	public native float getDistance() /*-{
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return manifoldPoint.getDistance();
	}-*/;

	public native int getLifeTime() /*-{  //TODO not in AMMO.JS
		var manifoldPoint = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
//		return manifoldPoint.getLifeTime();
		return 0;
	}-*/;
}
