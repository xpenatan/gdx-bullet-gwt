package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btDispatcher extends BulletBase
{
	public btPersistentManifold manifold = new btPersistentManifold();

	public native int getNumManifolds() /*-{
		var dispacher = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return dispacher.getNumManifolds();
	}-*/;

	public btPersistentManifold getManifoldByIndexInternal(int index)
	{
		//		long cPtr = CollisionJNI.btDispatcher_getManifoldByIndexInternal(swigCPtr, this, index);
		//		return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
		
		manifold.jsObject = getManifoldByIndexInternall(index);
		return manifold;
	}

	private native JavaScriptObject getManifoldByIndexInternall(int index) /*-{
		var dispacher = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return dispacher.getManifoldByIndexInternal(index);
	}-*/;
}
