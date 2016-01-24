package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btCollisionObjectArray extends BulletBase
{
	public btCollisionObjectArray()
	{
	}
	
	public native int size() /*-{
		var arrayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return arrayJS.size();
	}-*/;
	
	public native btCollisionObject at(int index) /*-{
		var arrayJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = arrayJS.at(index);
		bodyJS = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(bodyJS.ptr);
		return bodyJS;
	}-*/;
}
