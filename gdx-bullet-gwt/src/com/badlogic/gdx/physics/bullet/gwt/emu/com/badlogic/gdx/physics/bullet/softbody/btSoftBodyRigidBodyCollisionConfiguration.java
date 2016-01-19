package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.collision.btDefaultCollisionConfiguration;
import com.badlogic.gdx.physics.bullet.collision.btDefaultCollisionConstructionInfo;
import com.google.gwt.core.client.JavaScriptObject;

public class btSoftBodyRigidBodyCollisionConfiguration extends btDefaultCollisionConfiguration {
	
	public btSoftBodyRigidBodyCollisionConfiguration() {
		jsObject = createObj();
	}
	
	public btSoftBodyRigidBodyCollisionConfiguration(btDefaultCollisionConstructionInfo constructionInfo) {
		jsObject = createObj(constructionInfo);
	}
	
	private native JavaScriptObject createObj() /*-{
	  	var obj = new $wnd.Ammo.btSoftBodyRigidBodyCollisionConfiguration();
	  	obj.javaObject = this;
		return obj;
	}-*/;
	private native JavaScriptObject createObj(btDefaultCollisionConstructionInfo constructionInfo) /*-{
		var constructJS = constructionInfo.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;;
	  	var obj = new $wnd.Ammo.btSoftBodyRigidBodyCollisionConfiguration(constructJS);
	  	obj.javaObject = this;
		return obj;
	}-*/;
}
