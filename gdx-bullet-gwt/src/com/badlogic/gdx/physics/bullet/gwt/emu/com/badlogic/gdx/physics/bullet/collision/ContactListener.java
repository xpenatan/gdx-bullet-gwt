package com.badlogic.gdx.physics.bullet.collision;


import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class ContactListener extends BulletBase
{
	public ContactListener() {
		jsObject = createObj();
	}
	
	public static boolean overridesMethod(com.badlogic.gdx.utils.reflect.Method methods, Class<?> clazz) {
	    return clazz == methods.getDeclaringClass();
	}

	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.myContactListener2();
		obj.javaObject = this;
		var self = this;
		
		//btManifoldPoint cp, btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1
		obj.onContactAdded0 = function(cp, colObj0Wrap, partId0, index0, colObj1Wrap, partId1, index1)	{
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			colObj0Wrap = $wnd.Ammo.wrapPointer(colObj0Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			var tmp1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
			tmp1.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj0Wrap;
			colObj0Wrap = tmp1;
			colObj1Wrap = $wnd.Ammo.wrapPointer(colObj1Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			var tmp2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
			tmp2.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj1Wrap;
			colObj0Wrap = tmp2;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;IILcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;II)
			(cp, colObj0Wrap, partId0, index0, colObj1Wrap, partId1, index1);
		};
		//btManifoldPoint cp, btCollisionObject colObj0, int partId0, int index0, btCollisionObject colObj1, int partId1, int index1)
		obj.onContactAdded1 = function(cp, colObj0, partId0, index0, colObj1, partId1, index1)	{
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;IILcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;II)
			(cp, colObj0, partId0, index0, colObj1, partId1, index1);
		};
		//btManifoldPoint cp, int userValue0, int partId0, int index0, int userValue1, int partId1, int index1
		obj.onContactAdded2 = function(cp, userValue0, partId0, index0, userValue1, partId1, index1) {
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;IIIIII)
			(cp, userValue0, partId0, index0, userValue1, partId1, index1);
		};
		//btManifoldPoint cp, btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, boolean match0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1, boolean match1
		obj.onContactAdded3 = function(cp, colObj0Wrap, partId0, index0, match0, colObj1Wrap, partId1, index1, match1)	{
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			colObj0Wrap = $wnd.Ammo.wrapPointer(colObj0Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			var tmp1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
			tmp1.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj0Wrap;
			colObj0Wrap = tmp1;
			colObj1Wrap = $wnd.Ammo.wrapPointer(colObj1Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			var tmp2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
			tmp2.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj1Wrap;
			colObj0Wrap = tmp2;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;IIZLcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;IIZ)
			(cp, colObj0Wrap, partId0, index0, match0, colObj1Wrap, partId1, index1, match1);
		};
		//btManifoldPoint cp, btCollisionObject colObj0, int partId0, int index0, boolean match0, btCollisionObject colObj1, int partId1, int index1, boolean match1
		obj.onContactAdded4 = function(cp, colObj0, partId0, index0, match0, colObj1, partId1, index1, match1)	{
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;IIZLcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;IIZ)
			(cp, colObj0, partId0, index0, match0, colObj1, partId1, index1, match1)
		};
		//btManifoldPoint cp, int userValue0, int partId0, int index0, boolean match0, int userValue1, int partId1, int index1, boolean match1
		obj.onContactAdded5 = function(cp, userValue0, partId0, index0, match0, userValue1, partId1, index1, match1) {
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;IIIZIIIZ)
			(cp, userValue0, partId0, index0, match0, userValue1, partId1, index1, match1);
		};
		//btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1
		obj.onContactAdded6 = function(colObj0Wrap, partId0, index0, colObj1Wrap, partId1, index1)	{
			colObj0Wrap = $wnd.Ammo.wrapPointer(colObj0Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			var tmp1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
			tmp1.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj0Wrap;
			colObj0Wrap = tmp1;
			colObj1Wrap = $wnd.Ammo.wrapPointer(colObj1Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			var tmp2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
			tmp2.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj1Wrap;
			colObj0Wrap = tmp2;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;IILcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;II)
			(colObj0Wrap, partId0, index0, colObj1Wrap, partId1, index1);
		};
		//btCollisionObject colObj0, int partId0, int index0, btCollisionObject colObj1, int partId1, int index1
		obj.onContactAdded7 = function(colObj0, partId0, index0, colObj1, partId1, index1)
		{
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;IILcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;II)
			(colObj0, partId0, index0, colObj1, partId1, index1);
		};
		//int userValue0, int partId0, int index0, int userValue1, int partId1, int index1
		obj.onContactAdded8 = function(userValue0, partId0, index0, userValue1, partId1, index1) {
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(IIIIII)
			(userValue0, partId0, index0, userValue1, partId1, index1);
		};
		//btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, boolean match0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1, boolean match1
		obj.onContactAdded9 = function(colObj0Wrap, partId0, index0, match0, colObj1Wrap, partId1, index1, match1)	{
			colObj0Wrap = $wnd.Ammo.wrapPointer(colObj0Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			var tmp1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
			tmp1.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj0Wrap;
			colObj0Wrap = tmp1;
			colObj1Wrap = $wnd.Ammo.wrapPointer(colObj1Wrap, $wnd.Ammo.btCollisionObjectWrapper);
			var tmp2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btCollisionObjectWrapper_1;
			tmp2.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = colObj1Wrap;
			colObj0Wrap = tmp2;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;IIZLcom/badlogic/gdx/physics/bullet/collision/btCollisionObjectWrapper;IIZ)
			(colObj0Wrap, partId0, index0, match0, colObj1Wrap, partId1, index1, match1);
		};
		//btCollisionObject colObj0, int partId0, int index0, boolean match0, btCollisionObject colObj1, int partId1, int index1, boolean match1
		obj.onContactAdded10 = function(colObj0, partId0, index0, match0, colObj1, partId1, index1, match1) {
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;IIZLcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;IIZ)
			(colObj0, partId0, index0, match0, colObj1, partId1, index1, match1);
		};
		//int userValue0, int partId0, int index0, boolean match0, int userValue1, int partId1, int index1, boolean match1
		obj.onContactAdded11 = function(userValue0, partId0, index0, match0, userValue1, partId1, index1, match1) {
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactAdded(IIIZIIIZ)(colObj0, partId0, index0, match0, colObj1, partId1, index1, match1);
		};
		//btManifoldPoint cp, btCollisionObject colObj0, btCollisionObject colObj1
		obj.onContactProcessed12 = function(cp, colObj0, colObj1) {
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactProcessed(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)
			(cp, colObj0, colObj1);
		};
		//btManifoldPoint cp, int userValue0, int userValue1
		obj.onContactProcessed13 = function(cp, userValue0, userValue1) {
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactProcessed(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;II)
			(cp, userValue0, userValue1);
		};
		//btManifoldPoint cp, btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1
		obj.onContactProcessed14 = function(cp, colObj0, match0, colObj1, match1) {
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactProcessed(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;ZLcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Z)
			(cp, colObj0, match0, colObj1, match1);
		};
		//btManifoldPoint cp, int userValue0, boolean match0, int userValue1, boolean match1
		obj.onContactProcessed15 = function(cp, userValue0, match0, userValue1, match1) {
			cp = $wnd.Ammo.wrapPointer(cp, $wnd.Ammo.btManifoldPoint);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btManifoldPoint_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = cp;
			cp = tmp;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactProcessed(Lcom/badlogic/gdx/physics/bullet/collision/btManifoldPoint;IZIZ)
			(cp, userValue0, match0, userValue1, match1);
		};
		//btCollisionObject colObj0, btCollisionObject colObj1
		obj.onContactProcessed16 = function(colObj0, colObj1) {
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactProcessed(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)
			(colObj0, colObj1);
		};
		//int userValue0, int userValue1
		obj.onContactProcessed17 = function(userValue0, userValue1) {
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactProcessed(II)(userValue0, userValue1);
		};
		//btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1
		obj.onContactProcessed18 = function(colObj0, match0, colObj1, match1) {
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactProcessed(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;ZLcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Z)
			(colObj0, match0, colObj1, match1);
		};
		obj.onContactProcessed19 = function(userValue0, match0, userValue1, match1) {
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactProcessed(IZIZ)(userValue0, match0, userValue1, match1)
		};
		
		//int manifoldPointUserValue
		obj.onContactDestroyed20 = function(manifoldPointUserValue) {
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactDestroyed(I)(manifoldPointUserValue);
		};
		//btPersistentManifold manifold
		obj.onContactStarted21 = function(manifold) {
			manifold = $wnd.Ammo.wrapPointer(manifold, $wnd.Ammo.btPersistentManifold);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btPersistentManifold_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = manifold;
			manifold = tmp;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactStarted(Lcom/badlogic/gdx/physics/bullet/collision/btPersistentManifold;)
			(manifold);
		};
		//btCollisionObject colObj0, btCollisionObject colObj1
		obj.onContactStarted22 = function(colObj0, colObj1) {
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactStarted(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)
			(colObj0, colObj1);
		};
		//int userValue0, int userValue1
		obj.onContactStarted23 = function(userValue0, userValue1) {
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactStarted(II)(userValue0, userValue1);
		};
		//btPersistentManifold manifold, boolean match0, boolean match1
		obj.onContactStarted24 = function(manifold, match0, match1) {
			manifold = $wnd.Ammo.wrapPointer(manifold, $wnd.Ammo.btPersistentManifold);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btPersistentManifold_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = manifold;
			manifold = tmp;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactStarted(Lcom/badlogic/gdx/physics/bullet/collision/btPersistentManifold;ZZ)
			(manifold, match0, match1);
		};
		//btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1
		obj.onContactStarted25 = function(colObj0, match0, colObj1, match1) {
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactStarted(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;ZLcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Z)
			(colObj0, match0, colObj1, match1);
		};
		//int userValue0, boolean match0, int userValue1, boolean match1
		obj.onContactStarted26 = function(userValue0, match0, userValue1, match1) {
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactStarted(IZIZ)(userValue0, match0, userValue1, match1);
		};
		
		//btPersistentManifold manifold
		obj.onContactEnded27 = function(manifold) {
			manifold = $wnd.Ammo.wrapPointer(manifold, $wnd.Ammo.btPersistentManifold);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btPersistentManifold_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = manifold;
			manifold = tmp;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactEnded(Lcom/badlogic/gdx/physics/bullet/collision/btPersistentManifold;)
			(manifold);
		};
		//btCollisionObject colObj0, btCollisionObject colObj1
		obj.onContactEnded28 = function(colObj0, colObj1) {
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactEnded(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)
			(colObj0, colObj1);
		};
		//int userValue0, int userValue1
		obj.onContactEnded29 = function(userValue0, userValue1) {
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactEnded(II)(userValue0, userValue1);
		};
		//btPersistentManifold manifold, boolean match0, boolean match1
		obj.onContactEnded30 = function(manifold, match0, match1) {
			manifold = $wnd.Ammo.wrapPointer(manifold, $wnd.Ammo.btPersistentManifold);
			var tmp = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btPersistentManifold_1;
			tmp.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = manifold;
			manifold = tmp;
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactEnded(Lcom/badlogic/gdx/physics/bullet/collision/btPersistentManifold;ZZ)
			(manifold, match0, match1);
		};
		//btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1
		obj.onContactEnded31 = function(colObj0, match0, colObj1, match1) {
			colObj0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj0);
			colObj1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(colObj1);
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactEnded(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;ZLcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Z)
			(colObj0, match0, colObj1, match1);
		};
		//int userValue0, boolean match0, int userValue1, boolean match1
		obj.onContactEnded32 = function(userValue0, match0, userValue1, match1) {
			self.@com.badlogic.gdx.physics.bullet.collision.ContactListener::onContactEnded(IZIZ)(userValue0, match0, userValue1, match1);
		};
		return obj;
	}-*/;

	private native void setEvents(int val) /*-{
		var listener = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		listener.setEvents(val);
		listener.enable();
	}-*/;
	
	
	public void setMethods(int onContactAdded, int onContactProcessed, int onContactDestroyed, int onContactStarted, int onContactEnded) {
		int events = 0;
		if (onContactAdded == 0)
			events |= ContactCallbackEvent.ON_ADDED_UNFILTERED_WRAPPER_INCLUDEPOINT;
		else if (onContactAdded == 1)
			events |= ContactCallbackEvent.ON_ADDED_UNFILTERED_OBJECT_INCLUDEPOINT;
		else if (onContactAdded == 2)
			events |= ContactCallbackEvent.ON_ADDED_UNFILTERED_VALUE_INCLUDEPOINT;
		else if (onContactAdded == 3)
			events |= ContactCallbackEvent.ON_ADDED_FILTERED_WRAPPER_INCLUDEPOINT;
		else if (onContactAdded == 4)
			events |= ContactCallbackEvent.ON_ADDED_FILTERED_OBJECT_INCLUDEPOINT;
		else if (onContactAdded == 5)
			events |= ContactCallbackEvent.ON_ADDED_FILTERED_VALUE_INCLUDEPOINT;
		else if (onContactAdded == 6)
			events |= ContactCallbackEvent.ON_ADDED_UNFILTERED_WRAPPER;
		else if (onContactAdded == 7)
			events |= ContactCallbackEvent.ON_ADDED_UNFILTERED_OBJECT;
		else if (onContactAdded == 8)
			events |= ContactCallbackEvent.ON_ADDED_UNFILTERED_VALUE;
		else if (onContactAdded == 9)
			events |= ContactCallbackEvent.ON_ADDED_FILTERED_WRAPPER;
		else if (onContactAdded == 10)
			events |= ContactCallbackEvent.ON_ADDED_FILTERED_OBJECT;
		else if (onContactAdded == 11)
			events |= ContactCallbackEvent.ON_ADDED_FILTERED_VALUE;
		
		if (onContactProcessed == 12)
			events |= ContactCallbackEvent.ON_PROCESSED_UNFILTERED_OBJECT_INCLUDEPOINT;
		else if (onContactProcessed == 13)
			events |= ContactCallbackEvent.ON_PROCESSED_UNFILTERED_VALUE_INCLUDEPOINT;
		else if (onContactProcessed == 14)
			events |= ContactCallbackEvent.ON_PROCESSED_FILTERED_OBJECT_INCLUDEPOINT;
		else if (onContactProcessed == 15)
			events |= ContactCallbackEvent.ON_PROCESSED_FILTERED_VALUE_INCLUDEPOINT;
		else if (onContactProcessed == 16)
			events |= ContactCallbackEvent.ON_PROCESSED_UNFILTERED_OBJECT;
		else if (onContactProcessed == 17)
			events |= ContactCallbackEvent.ON_PROCESSED_UNFILTERED_VALUE;
		else if (onContactProcessed == 18)
			events |= ContactCallbackEvent.ON_PROCESSED_FILTERED_OBJECT;
		else if (onContactProcessed == 19)
			events |= ContactCallbackEvent.ON_PROCESSED_FILTERED_VALUE;
		
		if (onContactDestroyed == 20)
			events |= ContactCallbackEvent.ON_DESTROYED;
		
		if (onContactStarted == 21)
			events |= ContactCallbackEvent.ON_STARTED_UNFILTERED_MANIFOLD;
		else if (onContactStarted == 22)
			events |= ContactCallbackEvent.ON_STARTED_UNFILTERED_OBJECT;
		else if (onContactStarted == 23)
			events |= ContactCallbackEvent.ON_STARTED_UNFILTERED_VALUE;
		else if (onContactStarted == 24)
			events |= ContactCallbackEvent.ON_STARTED_FILTERED_MANIFOLD;
		else if (onContactStarted == 25)
			events |= ContactCallbackEvent.ON_STARTED_FILTERED_OBJECT;
		else if (onContactStarted == 26)
			events |= ContactCallbackEvent.ON_STARTED_FILTERED_VALUE;
		
		if (onContactEnded == 27)
			events |= ContactCallbackEvent.ON_ENDED_UNFILTERED_MANIFOLD;
		else if (onContactEnded == 28)
			events |= ContactCallbackEvent.ON_ENDED_UNFILTERED_OBJECT;
		else if (onContactEnded == 29)
			events |= ContactCallbackEvent.ON_ENDED_UNFILTERED_VALUE;
		else if (onContactEnded == 30)
			events |= ContactCallbackEvent.ON_ENDED_FILTERED_MANIFOLD;
		else if (onContactEnded == 31)
			events |= ContactCallbackEvent.ON_ENDED_FILTERED_OBJECT;
		else if (onContactEnded == 32)
			events |= ContactCallbackEvent.ON_ENDED_FILTERED_VALUE;
		
		setEvents(events);
	}
	
	public native void enable() /*-{
		var listener = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		listener.enable();
	}-*/;

	public void disable() {
	}

	public void enableOnAdded() {
	}

	public void disableOnAdded() {
	}

	public boolean isOnAddedEnabled() {
		return false;
	}
	
	public void enableOnProcessed() {
	}

	public void disableOnProcessed() {
	}

	public boolean isOnProcessedEnabled() {
		return false;
	}
	
	public void enableOnDestroyed() {
	}

	public void disableOnDestroyed() {
	}

	public boolean isOnDestroyedEnabled() {
		return false;
	}
	
	public void enableOnStarted() {
	}

	public void disableOnStarted() {
	}

	public boolean isOnStartedEnabled() {
		return false;
	}
	
	public void enableOnEnded() {
	}

	public void disableOnEnded() {
	}

	public boolean isOnEndedEnabled() {
		return false;
	}

	public boolean onContactAdded(btManifoldPoint cp, btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1)	{
		return false;
	}

	public boolean onContactAdded(btManifoldPoint cp, btCollisionObject colObj0, int partId0, int index0, btCollisionObject colObj1, int partId1, int index1) {
		return false;
	}

	public boolean onContactAdded(btManifoldPoint cp, int userValue0, int partId0, int index0, int userValue1, int partId1, int index1) {
		return false;
	}

	public boolean onContactAdded(btManifoldPoint cp, btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, boolean match0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1, boolean match1)	{
		return false;
	}

	public boolean onContactAdded(btManifoldPoint cp, btCollisionObject colObj0, int partId0, int index0, boolean match0, btCollisionObject colObj1, int partId1, int index1, boolean match1) {
		return false;
	}

	public boolean onContactAdded(btManifoldPoint cp, int userValue0, int partId0, int index0, boolean match0, int userValue1, int partId1, int index1, boolean match1) {
		return false;
	}

	public boolean onContactAdded(btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1)	{
		return false;
	}

	public boolean onContactAdded(btCollisionObject colObj0, int partId0, int index0, btCollisionObject colObj1, int partId1, int index1) {
		return false;
	}

	public boolean onContactAdded(int userValue0, int partId0, int index0, int userValue1, int partId1, int index1)	{
		return false;
	}

	public boolean onContactAdded(btCollisionObjectWrapper colObj0Wrap, int partId0, int index0, boolean match0, btCollisionObjectWrapper colObj1Wrap, int partId1, int index1, boolean match1)	{
		return false;
	}

	public boolean onContactAdded(btCollisionObject colObj0, int partId0, int index0, boolean match0, btCollisionObject colObj1, int partId1, int index1, boolean match1) {
		return false;
	}

	public boolean onContactAdded(int userValue0, int partId0, int index0, boolean match0, int userValue1, int partId1, int index1, boolean match1) {
		return false;
	}
	
	public void onContactProcessed(btManifoldPoint cp, btCollisionObject colObj0, btCollisionObject colObj1) {
	}

	public void onContactProcessed(btManifoldPoint cp, int userValue0, int userValue1) {
	}

	public void onContactProcessed(btManifoldPoint cp, btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1) {
	}

	public void onContactProcessed(btManifoldPoint cp, int userValue0, boolean match0, int userValue1, boolean match1) {
	}

	public void onContactProcessed(btCollisionObject colObj0, btCollisionObject colObj1) {
	}

	public void onContactProcessed(int userValue0, int userValue1) {
	}

	public void onContactProcessed(btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1) {
	}
	
	public void onContactProcessed(int userValue0, boolean match0, int userValue1, boolean match1) {
	}

	public void onContactDestroyed(int manifoldPointUserValue) {
	}
	
	public void onContactStarted(btPersistentManifold manifold) {
	}

	public void onContactStarted(btCollisionObject colObj0, btCollisionObject colObj1) {
	}

	public void onContactStarted(int userValue0, int userValue1) {
	}

	public void onContactStarted(btPersistentManifold manifold, boolean match0, boolean match1) {
	}

	public void onContactStarted(btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1) {
	}

	public void onContactStarted(int userValue0, boolean match0, int userValue1, boolean match1) {
	}
	
	public void onContactEnded(btPersistentManifold manifold) {
	}

	public void onContactEnded(btCollisionObject colObj0, btCollisionObject colObj1) {
	}

	public void onContactEnded(int userValue0, int userValue1) {
	}

	public void onContactEnded(btPersistentManifold manifold, boolean match0, boolean match1) {
	}

	public void onContactEnded(btCollisionObject colObj0, boolean match0, btCollisionObject colObj1, boolean match1) {
	}

	public void onContactEnded(int userValue0, boolean match0, int userValue1, boolean match1) {
	}
}
