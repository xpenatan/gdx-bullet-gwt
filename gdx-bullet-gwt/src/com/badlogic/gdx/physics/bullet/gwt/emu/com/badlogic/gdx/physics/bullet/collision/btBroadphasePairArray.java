package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btBroadphasePairArray extends BulletBase
{
	JavaScriptObject overlappingPairCacheJS;
	JavaScriptObject algorithmArray;
	
	public btBroadphasePairArray()
	{
		jsObject = createObj();
		algorithmArray = createObj();
	}
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.myAlignedObjectArrayHelper();
		return obj;
	}-*/;
	
	/** Fills the given array with user value set using {@link btCollisionObject#setUserValue(int)} of the collision objects
	 * within this pair array colliding with the given collision object.
	 * @param out The array to fill with the user values
	 * @param other The collision object the pair must contain (which itself is excluded from the result)
	 * @return The amount of user values set in the out array. */
	public native int getCollisionObjectsValue(final int[] out, final btCollisionObject other) /*-{
		var otherJS = other.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var myAlignedObjectArrayHelper = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var overlappingPairCacheJS = this.@com.badlogic.gdx.physics.bullet.collision.btBroadphasePairArray::overlappingPairCacheJS;
		var algorithmArrayJS = this.@com.badlogic.gdx.physics.bullet.collision.btBroadphasePairArray::algorithmArray;
		myAlignedObjectArrayHelper.setOverlappingPairCache(overlappingPairCacheJS);
		var max = out.length;
		var n = myAlignedObjectArrayHelper.size();
		var count = 0;
		var obj0, obj1;
		for (var i = 0; i < n; i++) {
			var collisionPair = $wnd.Ammo.wrapPointer(myAlignedObjectArrayHelper.at(i), $wnd.Ammo.btBroadphasePair);
			var algorithm = collisionPair.get_m_algorithm();
			if (algorithm) {
				algorithmArrayJS.setCollisionAlgorithm(algorithm);
				var s = algorithmArrayJS.size();
				for (var j = 0; j < s; j++) {
					var manifold = $wnd.Ammo.wrapPointer(algorithmArrayJS.at(j), $wnd.Ammo.btPersistentManifold);
					if(manifold.getNumContacts() > 0) {
						obj0 = manifold.getBody0();
						obj1 = manifold.getBody1();
						if (obj0.ptr == otherJS.ptr)
							out[count++] = obj1.getUserIndex();
						else if (obj1.ptr == other.ptr)
							out[count++] = obj0.getUserIndex();
						else continue;
						if (count >= max)
							return count;
					}
					var t = 0;
				}
			}
		}
		return count;
	}-*/;
}
