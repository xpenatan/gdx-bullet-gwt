package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;

public class btCollisionShape extends BulletBase
{
	protected int shapeType = -1;
	
	public native void setLocalScaling(Vector3 scaling) /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = scaling.@com.badlogic.gdx.math.Vector3::x;
		var y = scaling.@com.badlogic.gdx.math.Vector3::y;
		var z = scaling.@com.badlogic.gdx.math.Vector3::z;
		var vector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		vector.setValue(x,y,z);
		collObject.setLocalScaling(vector);
	}-*/;

	public native void calculateLocalInertia(float mass, Vector3 inertia) /*-{
		var shapeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		
		var x = inertia.@com.badlogic.gdx.math.Vector3::x;
		var y = inertia.@com.badlogic.gdx.math.Vector3::y;
		var z = inertia.@com.badlogic.gdx.math.Vector3::z;
		
		var vector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		shapeJS.calculateLocalInertia(mass, vector);
		
		inertia.@com.badlogic.gdx.math.Vector3::x = vector.x();
		inertia.@com.badlogic.gdx.math.Vector3::y = vector.y();
		inertia.@com.badlogic.gdx.math.Vector3::z = vector.z();
	}-*/;
	
	public int getShapeType() {
		return shapeType;
	}
	
	public native float getMargin() /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return collObject.getMargin();
	}-*/;

	public native void setMargin(float margin) /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		collObject.setMargin(margin);
	}-*/;
	
}
