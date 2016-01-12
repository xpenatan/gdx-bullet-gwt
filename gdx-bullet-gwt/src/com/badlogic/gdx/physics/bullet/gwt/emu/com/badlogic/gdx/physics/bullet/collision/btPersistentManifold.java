package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.linearmath.btTypedObject;
import com.google.gwt.core.client.JavaScriptObject;

public class btPersistentManifold extends btTypedObject
{

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

	
	public native btCollisionObject getBody0()/*-{
		var maniFold = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = maniFold.getBody0();;
		if(bodyJS != null)
			return @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(bodyJS.ptr);
		return null
	}-*/;

	public native btCollisionObject getBody1()/*-{
		var maniFold = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = maniFold.getBody1();
		if(bodyJS != null)
			return @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(bodyJS.ptr);
		return null
	}-*/;

}
