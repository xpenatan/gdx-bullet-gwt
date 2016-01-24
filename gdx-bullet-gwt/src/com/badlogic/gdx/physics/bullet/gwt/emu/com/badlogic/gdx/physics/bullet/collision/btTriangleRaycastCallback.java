package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btTriangleRaycastCallback extends btTriangleCallback {

	public btTriangleRaycastCallback(Vector3 from, Vector3 to) {
		jsObject = createObj(from, to, 0);
	}
	public btTriangleRaycastCallback(Vector3 from, Vector3 to, int flags) {
		jsObject = createObj(from, to, flags);
	}
	
	private native JavaScriptObject createObj(Vector3 from, Vector3 to, int flags) /*-{
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(from.@com.badlogic.gdx.math.Vector3::x,from.@com.badlogic.gdx.math.Vector3::y,from.@com.badlogic.gdx.math.Vector3::z);
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(to.@com.badlogic.gdx.math.Vector3::x,to.@com.badlogic.gdx.math.Vector3::y,to.@com.badlogic.gdx.math.Vector3::z);
		var obj = new $wnd.Ammo.jsTriangleRaycastCallback(tmpbtVector1, tmpbtVector2, flags);
		var self = this;
		obj.reportHit = function(hitNormalLocal, hitFraction, partId, triangleIndex)
		{
			hitNormalLocal = $wnd.Ammo.wrapPointer(hitNormalLocal, $wnd.Ammo.btVector3);
			var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			tmpVector3.@com.badlogic.gdx.math.Vector3::x = hitNormalLocal.x();
			tmpVector3.@com.badlogic.gdx.math.Vector3::y = hitNormalLocal.y();
			tmpVector3.@com.badlogic.gdx.math.Vector3::z = hitNormalLocal.z();
			return self.@com.badlogic.gdx.physics.bullet.collision.btTriangleRaycastCallback::reportHit(Lcom/badlogic/gdx/math/Vector3;FII)(tmpVector3, hitFraction, partId, triangleIndex);
		};
		obj.javaObject = this;
		return obj;
	}-*/;
	
	
	public native void processTriangle(btVector3 triangle, int partId, int triangleIndex) /*-{
		var callbackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(triangle.@com.badlogic.gdx.math.Vector3::x,triangle.@com.badlogic.gdx.math.Vector3::y,triangle.@com.badlogic.gdx.math.Vector3::z);
		callbackJS.processTriangle(tmpbtVector1, partId, triangleIndex);
	}-*/;
	
	public float reportHit(Vector3 hitNormalLocal, float hitFraction, int partId, int triangleIndex) {
		return -1;
	}
	
	public native void setFrom(btVector3 value) /*-{
		var callbackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vector3JS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		callbackJS.set_m_from(vector3JS);
	}-*/;

	public native btVector3 getFrom() /*-{
		var callbackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vector3JS = callbackJS.get_m_from();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = vector3JS.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = vector3JS.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = vector3JS.z();
		return tmpVector3;
	}-*/;

	public native void setTo(btVector3 value) /*-{
		var callbackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vector3JS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		callbackJS.set_m_to(vector3JS);
	}-*/;

	public native btVector3 getTo() /*-{
		var callbackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vector3JS = callbackJS.get_m_to();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = vector3JS.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = vector3JS.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = vector3JS.z();
		return tmpVector3;
	}-*/;

	public native void setFlags(int value) /*-{
		var callbackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		callbackJS.set_m_flags(value);
	}-*/;

	public native int getFlags() /*-{
		var callbackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return callbackJS.get_m_flags();
	}-*/;

	public native void setHitFraction(float value) /*-{
		var callbackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return callbackJS.set_m_hitFraction(value);
	}-*/;

	public native float getHitFraction() /*-{
		var callbackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return callbackJS.get_m_hitFraction();
	}-*/;
	
	public final static class EFlags {
		public final static int kF_None = 0;
		public final static int kF_FilterBackfaces = 1 << 0;
		public final static int kF_KeepUnflippedNormal = 1 << 1;
		public final static int kF_UseSubSimplexConvexCastRaytest = 1 << 2;
		public final static int kF_UseGjkConvexCastRaytest = 1 << 3;
		public final static int kF_Terminator = 0xFFFFFFFF;
	}
}
