package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.bullet.BulletBase;

public class btMotionState extends BulletBase
{
	
	public boolean first;
	
	public btMotionState()
	{
//		javaScriptObject = createObj();
	}

//	private native JavaScriptObject createObj() /*-{
//		var self = this;
//		
//		var callback = ( {
//			getWorldTransform: function(btTransform) { 
//				self.@com.badlogic.gdx.physics.bullet.linearmath.btMotionState::getWorldTransform();
//			},
//			setWorldTransform: function(btTransform) {
//				self.@com.badlogic.gdx.physics.bullet.linearmath.btMotionState::setWorldTransform();
//			}
//		});
//		
////		var obj = new $wnd.Ammo.btRigidBody(rbInfo);
//		return callback;
//	}-*/;
	
	


	public void getWorldTransform(Matrix4 worldTrans)
	{
	}

	public void setWorldTransform(Matrix4 worldTrans)
	{

	}
}
