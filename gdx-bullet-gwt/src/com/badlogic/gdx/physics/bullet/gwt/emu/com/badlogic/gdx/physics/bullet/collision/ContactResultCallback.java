package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class ContactResultCallback extends BulletBase
{
	public ContactResultCallback() {
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.ConcreteContactResultCallback();
		var self = this;
		obj.addSingleResult = function(cp, colObj0Wrap, partId0, index0, colObj1Wrap, partId1, index1)
		{
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			colObj0Wrap = $wnd.Ammo.wrapPointer(colObj0Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			colObj1Wrap = $wnd.Ammo.wrapPointer(colObj1Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			var btManifoldPoint = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			btManifoldPoint.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			var btCollisionObjectWrapper1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
			btCollisionObjectWrapper1.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj0Wrap;
			var btCollisionObjectWrapper2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_2;
			btCollisionObjectWrapper2.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj1Wrap;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactResultCallback::addSingleResult(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;IILcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;II)
			(btManifoldPoint, btCollisionObjectWrapper1, partId0, index0, btCollisionObjectWrapper2, partId1, index1);
		};
		return obj;
	}-*/;
	
	
	public native boolean needsCollision(btBroadphaseProxy proxy0)  /*-{
		var resCallBackJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var proxy0JS = proxy0.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return false; // TODO not implemented yet.
	}-*/;
	
	public float addSingleResult(btManifoldPoint cp, btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1) {
		return 0;
	}
}
