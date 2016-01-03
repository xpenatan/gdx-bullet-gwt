package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Matrix4;

public class btDefaultMotionState extends btMotionState
{
	public Matrix4 worldTrans = new Matrix4();
	
	@Override
	public void getWorldTransform(Matrix4 centerOfMassWorldTrans )
	{
		centerOfMassWorldTrans.set(this.worldTrans);
	}

	
	///synchronizes world transform from physics to user
	///Bullet only calls the update of worldtransform for active objects
	public void setWorldTransform(Matrix4 centerOfMassWorldTrans ) 
	{
		this.worldTrans.set(centerOfMassWorldTrans );
	}
}
