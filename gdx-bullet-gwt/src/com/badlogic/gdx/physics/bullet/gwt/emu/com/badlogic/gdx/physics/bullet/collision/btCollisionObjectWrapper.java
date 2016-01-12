package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btCollisionObjectWrapper extends BulletBase
{
	public native btCollisionObject getCollisionObject() /*-{
		var objectWrapperJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var body = objectWrapperJS.getCollisionObject();
		return @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(body.ptr);
	}-*/;
}
