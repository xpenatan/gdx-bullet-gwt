package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class GdxCollisionObjectBridge extends BulletBase
{
	public GdxCollisionObjectBridge()
	{
		jsObject = createObj();
	}
	
	
	
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.GdxCollisionObjectBridge();
		return obj;
	}-*/;
	
	public native void setUserValue(int value) /*-{
		var bridgeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		bridgeJS.set_userValue(value);
	}-*/;

	public native int getUserValue() /*-{
		var bridgeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return bridgeJS.get_userValue();
	}-*/;

	public native void setContactCallbackFlag(int value) /*-{
		var bridgeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		bridgeJS.set_contactCallbackFlag(value);
	}-*/;

	public native int getContactCallbackFlag() /*-{
		var bridgeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return bridgeJS.get_contactCallbackFlag();
	}-*/;

	public native void setContactCallbackFilter(int value) /*-{
		var bridgeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		bridgeJS.set_contactCallbackFilter(value);
	}-*/;

	public native int getContactCallbackFilter() /*-{
		var bridgeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return bridgeJS.get_contactCallbackFilter();
	}-*/;
}
