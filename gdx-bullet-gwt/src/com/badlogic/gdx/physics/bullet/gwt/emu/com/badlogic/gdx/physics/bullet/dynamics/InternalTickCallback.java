package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class InternalTickCallback extends BulletBase
{
	public InternalTickCallback(btDynamicsWorld dynamicsWorld, boolean isPreTick) {
		jsObject = createObj(dynamicsWorld, isPreTick);
	}

	public InternalTickCallback(btDynamicsWorld dynamicsWorld) {
		jsObject = createObj(dynamicsWorld, false);
	}

	public InternalTickCallback() {
		jsObject = createObj(null, false);
	}
	
	
	private native JavaScriptObject createObj(btDynamicsWorld dynamicsWorld, boolean isPreTick) /*-{
		var obj = new $wnd.Ammo.myInternalTickCallback();
		obj.javaObject = this;
		var self = this;
		obj.onInternalTick = function(dynamicWorldPtr, timeStep)
		{
			var world = @com.badlogic.gdx.physics.bullet.Bullet::getJavaWorld(I)(dynamicWorldPtr)
			self.@com.badlogic.gdx.physics.bullet.dynamics.InternalTickCallback::onInternalTick(Lcom/badlogic/gdx/physics/bullet/dynamics/btDynamicsWorld;F)(world, isPreTick);
		}
		
		if(dynamicsWorld)
		{
			var world = dynamicsWorld.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			obj.attach(world, isPreTick);
		}
		return obj;
	}-*/;
	


	public native void detach() /*-{
		var tickCallback = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		tickCallback.detach();
	}-*/;

	public native void attach(btDynamicsWorld dynamicsWorld, boolean isPreTick) /*-{
		var tickCallback = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var world = dynamicsWorld.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		tickCallback.attach(world, isPreTick);
	}-*/;

	public native void attach() /*-{
		var tickCallback = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		tickCallback.attach();
	}-*/;

	public native static void detach(btDynamicsWorld dynamicsWorld, boolean isPreTick) /*-{
		var world = dynamicsWorld.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		$wnd.Ammo.InternalTickCallback.prototype.detach(world, isPreTick);
	}-*/;

	public void onInternalTick(btDynamicsWorld dynamicsWorld, float timeStep) {
	}
}
