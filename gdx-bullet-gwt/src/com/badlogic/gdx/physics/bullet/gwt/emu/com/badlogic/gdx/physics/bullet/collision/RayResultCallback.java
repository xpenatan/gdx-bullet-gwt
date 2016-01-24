package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class RayResultCallback extends BulletBase
{
	public RayResultCallback()
	{
		jsObject = createObj();
	}
	
	public JavaScriptObject createObj()
	{
		return createObj2();
	}
	
	private native JavaScriptObject createObj2() /*-{
		var obj = new $wnd.Ammo.RayResultCallback();
	//	var self = this;
	//	obj.addSingleResult = function(cp, colObj0Wrap, partId0, index0, colObj1Wrap, partId1, index1)
	//	{
	//		cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
	//		colObj0Wrap = $wnd.Ammo.wrapPointer(colObj0Wrap, $wnd.Ammo.btCollisionObjectWrapper);
	//		colObj1Wrap = $wnd.Ammo.wrapPointer(colObj1Wrap, $wnd.Ammo.btCollisionObjectWrapper);
	//		var btManifoldPoint = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
	//		btManifoldPoint.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
	//		var btCollisionObjectWrapper1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
	//		btCollisionObjectWrapper1.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj0Wrap;
	//		var btCollisionObjectWrapper2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_2;
	//		btCollisionObjectWrapper2.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj1Wrap;
	//		self.@com.badlogic.gdx.physics.bullet.collision.ContactResultCallback::addSingleResult(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;IILcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;II)
	//		(btManifoldPoint, btCollisionObjectWrapper1, partId0, index0, btCollisionObjectWrapper2, partId1, index1);
	//	};
		return obj;
	}-*/;
	
	public native float addSingleResult(LocalRayResult rayResult, boolean normalInWorldSpace) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var localRayResultJS = LocalRayResult.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return rayJS.addSingleResult(localRayResultJS, normalInWorldSpace);
	}-*/;

	public native void setClosestHitFraction(float value) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rayJS.set_m_closestHitFraction(value);
	}-*/;

	public native float getClosestHitFraction() /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return rayJS.m_closestHitFraction();
	}-*/;

	public native void setCollisionObject(btCollisionObject value) /*-{
		var bodyJS = null;
		if(value != null)
		{
			bodyJS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		}
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rayJS.set_m_collisionObject(bodyJS);
	}-*/;

	public native btCollisionObject getCollisionObject() /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = rayJS.get_m_collisionObject();
		if(bodyJS != null)
			return @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(bodyJS.ptr);
		return null;
	}-*/;

	public native void setCollisionFilterGroup(short value) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rayJS.set_m_collisionFilterGroup(value);
	}-*/;

	public native short getCollisionFilterGroup() /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return rayJS.get_m_collisionFilterGroup();
	}-*/;

	public native void setCollisionFilterMask(short value) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rayJS.set_m_collisionFilterMask(value);
	}-*/;

	public native short getCollisionFilterMask() /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return rayJS.get_m_collisionFilterMask();
	}-*/;

	public native void setFlags(int value) /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		rayJS.set_m_flags(value);
	}-*/;

	public native int getFlags() /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return rayJS.get_m_flags();
	}-*/;

	public native boolean hasHit() /*-{
		var rayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return rayJS.hasHit();
	}-*/;
}
