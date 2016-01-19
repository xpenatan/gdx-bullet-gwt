package com.badlogic.gdx.physics.bullet.extras;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.collision.btCollisionShape;
import com.badlogic.gdx.physics.bullet.dynamics.btRigidBody;

public class btWorldImporter extends BulletBase {

	public btRigidBody createRigidBody(boolean isDynamic, float mass, Matrix4 startTransform, btCollisionShape shape, String bodyName) {
		return null;
	}
	
	public native void deleteAllData() /*-{
		var importerJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		importerJS.deleteAllData();
	}-*/;
}
