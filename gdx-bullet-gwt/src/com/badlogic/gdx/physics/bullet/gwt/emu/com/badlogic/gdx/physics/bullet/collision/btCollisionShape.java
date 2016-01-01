package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;

public class btCollisionShape extends BulletBase
{

	public native void calculateLocalInertia(float mass, Vector3 inertia) /*-{
		var shapeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		
		var x = inertia.@com.badlogic.gdx.math.Vector3::x;
		var y = inertia.@com.badlogic.gdx.math.Vector3::y;
		var z = inertia.@com.badlogic.gdx.math.Vector3::z;
		
		var vector = new $wnd.Ammo.btVector3(x, y, z);
		shapeJS.calculateLocalInertia(mass, vector);
		
		inertia.@com.badlogic.gdx.math.Vector3::x = vector.x();
		inertia.@com.badlogic.gdx.math.Vector3::y = vector.y();
		inertia.@com.badlogic.gdx.math.Vector3::z = vector.z();
		
		$wnd.Ammo.destroy(vector);
	}-*/;
	
	public int getShapeType() {
		return 0;
	}
}
