package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btBroadphaseInterface extends BulletBase
{
	
	public native btOverlappingPairCache getOverlappingPairCache() /*-{
		var bpInterfaceJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var pairCacheJS = bpInterfaceJS.getOverlappingPairCache();
		var pairCache = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btOverlappingPairCache_1;
		pairCache.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = pairCacheJS;
		return pairCache;
	}-*/;
}
