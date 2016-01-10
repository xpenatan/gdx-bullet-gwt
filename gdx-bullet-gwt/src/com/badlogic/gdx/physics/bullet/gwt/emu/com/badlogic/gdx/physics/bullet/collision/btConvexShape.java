package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Vector3;

public class btConvexShape extends btCollisionShape
{
	
	public native int getNumPreferredPenetrationDirections() /*-{
		var collShape = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return collShape.getNumPreferredPenetrationDirections();
	}-*/;
	
	public native int getPreferredPenetrationDirection(int index, Vector3 penetrationVector) /*-{
		var collShape = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = penetrationVector.@com.badlogic.gdx.math.Vector3::x;
		var y = penetrationVector.@com.badlogic.gdx.math.Vector3::y;
		var z = penetrationVector.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		collShape.setValue(x,y,z);
		hullShape.getPreferredPenetrationDirection(index, tmpbtVector);
	}-*/;
}
