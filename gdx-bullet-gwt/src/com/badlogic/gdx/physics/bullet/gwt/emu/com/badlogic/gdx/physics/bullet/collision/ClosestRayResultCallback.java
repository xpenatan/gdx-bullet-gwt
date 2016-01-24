package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class ClosestRayResultCallback extends RayResultCallback
{
	public ClosestRayResultCallback(Vector3 rayFromWorld, Vector3 rayToWorld)
	{
		jsObject = createObj(rayFromWorld, rayToWorld);
	}

	public JavaScriptObject createObj()
	{
		return null;
	}

	private native JavaScriptObject createObj(Vector3 rayFromWorld, Vector3 rayToWorld) /*-{
		var rayFromWorldJS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		var rayToWorldJS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		var x1 = rayFromWorld.@com.badlogic.gdx.math.Vector3::x;
		var y1 = rayFromWorld.@com.badlogic.gdx.math.Vector3::y;
		var z1 = rayFromWorld.@com.badlogic.gdx.math.Vector3::z;
		var x2 = rayToWorld.@com.badlogic.gdx.math.Vector3::x;
		var y2 = rayToWorld.@com.badlogic.gdx.math.Vector3::y;
		var z2 = rayToWorld.@com.badlogic.gdx.math.Vector3::z;
		rayFromWorldJS.setValue(x1, y1, z1);
		rayToWorldJS.setValue(x2, y2, z2);
		var obj = new $wnd.Ammo.jsClosestRayResultCallback(rayFromWorldJS, rayToWorldJS);
		var self = this;
		obj.addSingleResult = function(rayResult, normalInWorldSpace) {
			rayResultJS = $wnd.Ammo.wrapPointer(rayResult, $wnd.Ammo.LocalRayResult);
			var rayResult = @com.badlogic.gdx.physics.bullet.Bullet::TMP_LocalRayResult_1;
			rayResult.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = rayResultJS;
			return self.@com.badlogic.gdx.physics.bullet.collision.ClosestRayResultCallback::addSingleResult(Lcom/badlogic/gdx/physics/bullet/collision/LocalRayResult;Z)
			(rayResult, normalInWorldSpace);
		};
		return obj;
	}-*/;

	public native float addSingleResult(LocalRayResult rayResult, boolean normalInWorldSpace) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var localRayResultJS = rayResult.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return rayJS.addSingleResultSuper(localRayResultJS, normalInWorldSpace);
	}-*/;

	
	public native void getRayFromWorld(Vector3 out) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		out.@com.badlogic.gdx.math.Vector3::x = rayJS.get_m_rayFromWorld().x();
		out.@com.badlogic.gdx.math.Vector3::y = rayJS.get_m_rayFromWorld().y();
		out.@com.badlogic.gdx.math.Vector3::z = rayJS.get_m_rayFromWorld().z();
	}-*/;

	public native void setRayFromWorld(Vector3 value) /*-{
		var x1 = value.@com.badlogic.gdx.math.Vector3::x;
		var y1 = value.@com.badlogic.gdx.math.Vector3::y;
		var z1 = value.@com.badlogic.gdx.math.Vector3::z;
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rayJS.get_m_rayFromWorld().setValue(x1,y1,z1);
	}-*/;

	public native void getRayToWorld(Vector3 out) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		out.@com.badlogic.gdx.math.Vector3::x = rayJS.get_m_rayToWorld().x();
		out.@com.badlogic.gdx.math.Vector3::y = rayJS.get_m_rayToWorld().y();
		out.@com.badlogic.gdx.math.Vector3::z = rayJS.get_m_rayToWorld().z();
	}-*/;

	public native void setRayToWorld(Vector3 value) /*-{
		var x1 = value.@com.badlogic.gdx.math.Vector3::x;
		var y1 = value.@com.badlogic.gdx.math.Vector3::y;
		var z1 = value.@com.badlogic.gdx.math.Vector3::z;
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rayJS.get_m_rayToWorld().setValue(x1,y1,z1);
	}-*/;

	public native void getHitNormalWorld(Vector3 out) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		out.@com.badlogic.gdx.math.Vector3::x = rayJS.get_m_hitNormalWorld().x();
		out.@com.badlogic.gdx.math.Vector3::y = rayJS.get_m_hitNormalWorld().y();
		out.@com.badlogic.gdx.math.Vector3::z = rayJS.get_m_hitNormalWorld().z();
	}-*/;

	public native void setHitNormalWorld(Vector3 value) /*-{
		var x1 = value.@com.badlogic.gdx.math.Vector3::x;
		var y1 = value.@com.badlogic.gdx.math.Vector3::y;
		var z1 = value.@com.badlogic.gdx.math.Vector3::z;
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rayJS.get_m_hitNormalWorld().setValue(x1,y1,z1);
	}-*/;
	
	public native void getHitPointWorld(Vector3 out) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		out.@com.badlogic.gdx.math.Vector3::x = rayJS.get_m_hitPointWorld().x();
		out.@com.badlogic.gdx.math.Vector3::y = rayJS.get_m_hitPointWorld().y();
		out.@com.badlogic.gdx.math.Vector3::z = rayJS.get_m_hitPointWorld().z();
	}-*/;

	public native void setHitPointWorld(Vector3 value) /*-{
		var x1 = value.@com.badlogic.gdx.math.Vector3::x;
		var y1 = value.@com.badlogic.gdx.math.Vector3::y;
		var z1 = value.@com.badlogic.gdx.math.Vector3::z;
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rayJS.get_m_hitPointWorld().setValue(x1,y1,z1);
	}-*/;
}
