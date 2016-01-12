package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btGhostObject extends btCollisionObject 
{
	@Override
	public JavaScriptObject createMe() {
		return createObj(); 
	}
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btGhostObject();
		obj.javaObject = this;
		return obj;
	}-*/;
	
	public native int getNumOverlappingObjects() /*-{
		var ghostObjectJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return ghostObjectJS.getNumOverlappingObjects();
	}-*/;
	
	public native btCollisionObject getOverlappingObject(int index) /*-{
		var ghostObjectJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = ghostObjectJS.getOverlappingObject(index);
		return @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(bodyJS.ptr);
	}-*/;
}
