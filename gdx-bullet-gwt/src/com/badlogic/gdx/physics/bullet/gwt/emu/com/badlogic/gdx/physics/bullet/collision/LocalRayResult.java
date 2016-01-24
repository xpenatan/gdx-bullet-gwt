package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;

public class LocalRayResult extends BulletBase {

	public native void setCollisionObject(btCollisionObject value) /*-{
		var resultJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		resultJS.set_m_collisionObject(bodyJS);
	}-*/;

	public native btCollisionObject getCollisionObject() /*-{
		var resultJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = resultJS.get_m_collisionObject();
		return @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(bodyJS.ptr);
	}-*/;

	public native void setLocalShapeInfo(LocalShapeInfo value) /*-{
		var resultJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var localInfo = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		resultJS.set_m_localShapeInfo(localInfo);
	}-*/;

	public native LocalShapeInfo getLocalShapeInfo() /*-{
		var resultJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var localInfo = @com.badlogic.gdx.physics.bullet.Bullet::TMP_LocalShapeInfo_1;
		localInfo.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = resultJS.get_m_localShapeInfo();
		return localInfo;
	}-*/;

	public native void setHitNormalLocal(btVector3 value) /*-{
		var resultJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var valueJS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		resultJS.get_m_hitNormalLocal().setValue(valueJS.x(), valueJS.y(), valueJS.z());
	}-*/;

	public native btVector3 getHitNormalLocal() /*-{
		var resultJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3_1;
		tmpVector3.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = resultJS.get_m_hitNormalLocal();
		return tmpVector3;
	}-*/;

	public native void setHitFraction(float value) /*-{
		var resultJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		resultJS.set_m_hitFraction(value);
	}-*/;

	public native float getHitFraction() /*-{
		var resultJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return resultJS.get_m_hitFraction();
	}-*/;
}
