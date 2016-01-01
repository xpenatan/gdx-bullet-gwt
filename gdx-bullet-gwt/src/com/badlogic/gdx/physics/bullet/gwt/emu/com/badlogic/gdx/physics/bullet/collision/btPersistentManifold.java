package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.btTypedObject;
import com.badlogic.gdx.utils.ArrayMap;
import com.google.gwt.core.client.JavaScriptObject;

public class btPersistentManifold extends btTypedObject
{

	public ArrayMap<JavaScriptObject, btCollisionObject> m_collisionObjects = new ArrayMap<JavaScriptObject, btCollisionObject>(); // FIXME, this is used in btPersistentManifold getBoldy 0 and 1
	
	
	btManifoldPoint maniFoldPoint = new btManifoldPoint();

	public native int getNumContacts()/*-{
		var maniFold = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return maniFold.getNumContacts();
	}-*/;

	public btManifoldPoint getContactPoint(int index)
	{
		maniFoldPoint.jsObject = getContactPointt(index);
		return maniFoldPoint;
	}

	private native JavaScriptObject getContactPointt(int index)/*-{
		var maniFold = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return maniFold.getContactPoint(index);
	}-*/;

	public btCollisionObject getBody0()
	{
		JavaScriptObject obj = getBody_0();
		return m_collisionObjects.get(obj);
	}
	public btCollisionObject getBody1()
	{
		JavaScriptObject obj = getBody_1();
		return m_collisionObjects.get(obj);
	}
	
	public native JavaScriptObject getBody_0()/*-{
		var maniFold = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return maniFold.getBody0();
	}-*/;

	public native JavaScriptObject getBody_1()/*-{
		var maniFold = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return maniFold.getBody1();
	}-*/;

}
