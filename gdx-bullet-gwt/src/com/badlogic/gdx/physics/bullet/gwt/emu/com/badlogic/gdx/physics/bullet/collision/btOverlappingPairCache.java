package com.badlogic.gdx.physics.bullet.collision;

public class btOverlappingPairCache extends btOverlappingPairCallback {
	
	public native btBroadphasePairArray getOverlappingPairArray() /*-{
		var pairCacheJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var pairArray = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btBroadphasePairArray_1;
		pairArray.@com.badlogic.gdx.physics.bullet.collision.btBroadphasePairArray::overlappingPairCacheJS = pairCacheJS;
		return pairArray;
		
//		var pairCacheJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
//		var pairArray = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btBroadphasePairArray_1;
//		pairArray.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = pairCacheJS;
//		return pairArray;		
	}-*/;
	
	public native void setInternalGhostPairCallback(btOverlappingPairCallback ghostPairCallback) /*-{
		var pairCacheJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var callbackJS = ghostPairCallback.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		pairCacheJS.setInternalGhostPairCallback(callbackJS);
	}-*/;
}
