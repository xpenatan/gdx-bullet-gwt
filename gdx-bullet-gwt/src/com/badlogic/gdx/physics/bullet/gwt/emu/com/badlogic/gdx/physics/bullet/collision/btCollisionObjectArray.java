package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.utils.ArrayMap;
import com.google.gwt.core.client.JavaScriptObject;

public class btCollisionObjectArray extends BulletBase
{
	btCollisionWorld world;
	public ArrayMap<JavaScriptObject, btCollisionObject> m_collisionObjects = new ArrayMap<JavaScriptObject, btCollisionObject>(); // FIXME, this is used in btPersistentManifold getBoldy 0 and 1
	
	public btCollisionObjectArray(btCollisionWorld world)
	{
		this.world= world;
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.myAlignedObjectArrayHelper();
		return obj;
	}-*/;
	
	public int size()
	{
		return m_collisionObjects.size;
	}
	
	public native int size2() /*-{
		var world = this.@com.badlogic.gdx.physics.bullet.collision.btCollisionObjectArray::world;
		var worldJS = world.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var helper = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		helper.setCollisionWorld(worldJS);
		return helper.size();
	}-*/;
	
	public native btCollisionObject at2(int index) /*-{
		var world = this.@com.badlogic.gdx.physics.bullet.collision.btCollisionObjectArray::world;
		var worldJS = world.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var helper = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		helper.setCollisionWorld(worldJS);
		var body = helper.at(index);
		body = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(body);
		return body;
	}-*/;
	
	public btCollisionObject at(int index)
	{
		return m_collisionObjects.getValueAt(index);
	}
}
