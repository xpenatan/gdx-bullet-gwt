package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btAxisSweep3 extends btAxisSweep3InternalShort
{
	public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles, btOverlappingPairCache pairCache, boolean disableRaycastAccelerator) {
		jsObject = createObj(worldAabbMin, worldAabbMax, maxHandles, pairCache, disableRaycastAccelerator);
	}

	public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles, btOverlappingPairCache pairCache) {
		jsObject = createObj(worldAabbMin, worldAabbMax, maxHandles, pairCache);
	}

	public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles) {
		jsObject = createObj(worldAabbMin, worldAabbMax, maxHandles);
	}

	public btAxisSweep3(Vector3 worldAabbMin, Vector3 worldAabbMax) {
		jsObject = createObj(worldAabbMin, worldAabbMax);
	}
	
	private native JavaScriptObject createObj(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles, btOverlappingPairCache pairCache, boolean disableRaycastAccelerator) /*-{
		var x1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::x;
		var y1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::y;
		var z1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::z;
		var x2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::x;
		var y2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::y;
		var z2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector1.setValue(x1,y1,z1);
		tmpbtVector2.setValue(x2,y2,z2);
		var pairCacheJS = pairCache.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	  	var obj = new $wnd.Ammo.btAxisSweep3(tmpbtVector1, tmpbtVector2, maxHandles, pairCacheJS, disableRaycastAccelerator);
	  	obj.javaObject = this;
		return obj;
	}-*/;
	private native JavaScriptObject createObj(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles, btOverlappingPairCache pairCache) /*-{
		var x1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::x;
		var y1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::y;
		var z1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::z;
		var x2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::x;
		var y2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::y;
		var z2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector1.setValue(x1,y1,z1);
		tmpbtVector2.setValue(x2,y2,z2);
		var pairCacheJS = pairCache.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	  	var obj = new $wnd.Ammo.btAxisSweep3(tmpbtVector1, tmpbtVector2, maxHandles, pairCacheJS);
	  	obj.javaObject = this;
		return obj;
	}-*/;
	private native JavaScriptObject createObj(Vector3 worldAabbMin, Vector3 worldAabbMax, int maxHandles) /*-{
		var x1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::x;
		var y1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::y;
		var z1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::z;
		var x2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::x;
		var y2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::y;
		var z2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector1.setValue(x1,y1,z1);
		tmpbtVector2.setValue(x2,y2,z2);
	  	var obj = new $wnd.Ammo.btAxisSweep3(tmpbtVector1, tmpbtVector2, maxHandles);
	  	obj.javaObject = this;
		return obj;
	}-*/;
	private native JavaScriptObject createObj(Vector3 worldAabbMin, Vector3 worldAabbMax) /*-{
		var x1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::x;
		var y1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::y;
		var z1 = worldAabbMin.@com.badlogic.gdx.math.Vector3::z;
		var x2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::x;
		var y2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::y;
		var z2 = worldAabbMax.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector1.setValue(x1,y1,z1);
		tmpbtVector2.setValue(x2,y2,z2);
	  	var obj = new $wnd.Ammo.btAxisSweep3(tmpbtVector1, tmpbtVector2);
	  	obj.javaObject = this;
		return obj;
	}-*/;
}
