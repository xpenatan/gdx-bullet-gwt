package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.collision.btConvexShape;
import com.badlogic.gdx.physics.bullet.collision.btPairCachingGhostObject;
import com.google.gwt.core.client.JavaScriptObject;

public class btKinematicCharacterController extends btCharacterControllerInterface {

	public btKinematicCharacterController(btPairCachingGhostObject ghostObject, btConvexShape convexShape, float stepHeight, int upAxis) {
		jsObject = createObj(ghostObject, convexShape, stepHeight, upAxis);
	}

	public btKinematicCharacterController(btPairCachingGhostObject ghostObject, btConvexShape convexShape, float stepHeight) {
		jsObject = createObj(ghostObject, convexShape, stepHeight);
	}
	
	private native JavaScriptObject createObj(btPairCachingGhostObject ghostObject, btConvexShape convexShape, float stepHeight, int upAxis) /*-{
		var ghostObjectJS = ghostObject.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var convexShapeJS = convexShape.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btKinematicCharacterController(ghostObjectJS, convexShapeJS, stepHeight, upAxis);
		obj.javaObject = this;
		return obj;
	}-*/;
	
	private native JavaScriptObject createObj(btPairCachingGhostObject ghostObject, btConvexShape convexShape, float stepHeight) /*-{
		var ghostObjectJS = ghostObject.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var convexShapeJS = convexShape.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btKinematicCharacterController(ghostObjectJS, convexShapeJS, stepHeight);
		obj.javaObject = this;
		return obj;
	}-*/;
	
	public native void setWalkDirection(Vector3 walkDirection) /*-{  
		var controllerJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(walkDirection.@com.badlogic.gdx.math.Vector3::x,walkDirection.@com.badlogic.gdx.math.Vector3::y,walkDirection.@com.badlogic.gdx.math.Vector3::z);
		controllerJS.setWalkDirection(tmpbtVector);
	}-*/;
}
