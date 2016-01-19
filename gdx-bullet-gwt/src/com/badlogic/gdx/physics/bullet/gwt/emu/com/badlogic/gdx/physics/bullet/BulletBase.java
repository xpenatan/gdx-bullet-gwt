package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.utils.Disposable;
import com.google.gwt.core.client.JavaScriptObject;

public class BulletBase implements Disposable
{
	public JavaScriptObject jsObject; // public to be able to easily access in js code.
	boolean disposed;

	@Override
	public void dispose()
	{
		disposed = true;
		if(jsObject != null)
			internaldispose();
		jsObject = null;
	}

	private native void internaldispose() /*-{
		var bulletBase = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		$wnd.Ammo.destroy(bulletBase);
	}-*/;

	public boolean isDisposed()
	{
		return disposed;
	}
	
	/** Obtains a reference to this object, call release to free the reference. */
	public void obtain() {
	}
	
	/** Release a previously obtained reference, causing the object to be disposed when this was the last reference. */
	public void release() {
	}
	
	/** @return Whether this instance is obtained using the {@link #obtain()} method. */
	public boolean isObtained() {
		return false;
	}
	
	protected void construct() {
	}
	
	public void takeOwnership() {
	}
}
