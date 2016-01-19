package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class ContactCache extends BulletBase
{
	public ContactCache()
	{
		jsObject = createObj();
	}
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.myContactCache();
		obj.javaObject = this;
		var self = this;
		//btPersistentManifold manifold, [Const] boolean match0, [Const] boolean match1
		obj.onContactStarted = function(manifold, match0, match1) {
			manifold = $wnd.Ammo.wrapPointer(manifold, $wnd.Ammo.btPersistentManifold);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btPersistentManifold_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = manifold;
			manifold = tmp;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactCache::onContactStarted(Lcom/badlogic/gdx/physics/bullet/collision/btPersistentManifold;ZZ)
			(manifold, match0, match1);
		};
		//[Const] btCollisionObject colObj0, [Const] boolean match0, [Const] btCollisionObject colObj1, [Const] boolean match1
		obj.onContactEnded = function(colObj0, match0, colObj1, match1)	{
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactCache::onContactEnded(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;ZLcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Z)
			(colObj0, match0, colObj1, match1);
		}
		return obj;
	}-*/;
	
	public native void setCacheTime(float value) /*-{
		var listener = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		listener.set_cacheTime(value);
	}-*/;

	public native float getCacheTime() /*-{
		var listener = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return listener.get_cacheTime();
	}-*/;

	public native void enable() /*-{
		var listener = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		listener.enable();
	}-*/;

	public native void disable() /*-{
		var listener = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		listener.disable();
	}-*/;
	
	public native void clear() /*-{
		var listener = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		listener.clear();
	}-*/;

	public native void update(float delta) /*-{
		var listener = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		listener.update(delta);
	}-*/;

	public native boolean isEnabled() /*-{
		var listener = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return listener.isEnabled();
	}-*/;

	public void onContactStarted(btPersistentManifold manifold, boolean match0, boolean match1)
	{
	}

	public void onContactEnded(btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1)
	{
	}

	
}
