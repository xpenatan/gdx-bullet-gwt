package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class CustomCollisionDispatcher extends btCollisionDispatcher {

	public CustomCollisionDispatcher(btCollisionConfiguration config)
	{
		jsObject = createObj(config.jsObject);
	}
	
	private native JavaScriptObject createObj(JavaScriptObject obj) /*-{
		var obj = new $wnd.Ammo.CustomCollisionDispatcher(obj);
		var self = this;
		obj.needsCollision = function(body0ptr, body1ptr)
		{
			var body0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(body0ptr);
			var body1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(body1ptr);
			return self.@com.badlogic.gdx.physics.bullet.collision.CustomCollisionDispatcher::needsCollision(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)
			(body0, body1);
		};
		
		obj.needsResponse = function(body0ptr, body1ptr)
		{
			var body0 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(body0ptr);
			var body1 = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(body1ptr);
			return self.@com.badlogic.gdx.physics.bullet.collision.CustomCollisionDispatcher::needsResponse(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)
			(body0, body1);
		};
		
		return obj;
	}-*/;
	
	
	public boolean needsCollision(btCollisionObject body0, btCollisionObject body1) {
		return needsCollisionSuper(body0, body1);
	}
	
	private native boolean needsCollisionSuper(btCollisionObject body0, btCollisionObject body1) /*-{
		var collisionDispatcherJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var body0JS = body0.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var body1JS = body1.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return collisionDispatcherJS.needsCollisionSuper(body0JS, body1JS);
	}-*/;

	public boolean needsResponse(btCollisionObject body0, btCollisionObject body1) {
		return needsResponseSuper(body0, body1);
	}
	
	private native boolean needsResponseSuper(btCollisionObject body0, btCollisionObject body1) /*-{
		var collisionDispatcherJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var body0JS = body0.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var body1JS = body1.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return collisionDispatcherJS.needsResponseSuper(body0JS, body1JS);
	}-*/;

}
