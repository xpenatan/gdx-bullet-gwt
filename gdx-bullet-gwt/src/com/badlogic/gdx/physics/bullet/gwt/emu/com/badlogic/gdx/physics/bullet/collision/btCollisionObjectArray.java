package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.utils.ArrayMap;
import com.google.gwt.core.client.JavaScriptObject;

public class btCollisionObjectArray
{
	public ArrayMap<JavaScriptObject, btCollisionObject> m_collisionObjects = new ArrayMap<JavaScriptObject, btCollisionObject>(); // FIXME, this is used in btPersistentManifold getBoldy 0 and 1
	
	public int size()
	{
		return m_collisionObjects.size;
	}
	
	public btCollisionObject at(int index)
	{
		return m_collisionObjects.getValueAt(index);
	}
}
