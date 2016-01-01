package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btTransform;
import com.google.gwt.core.client.JavaScriptObject;

public class btCollisionObject extends BulletBase
{
	btTransform btTransform = new btTransform(false);
	Matrix4 transform = new Matrix4();
	protected btCollisionShape collisionShape;
	
	public Matrix4 getWorldTransform()
	{
		try
		{
			
			if(this.jsObject == null)
			{
				System.out.println("a");
			}
			btTransform.jsObject = getWorldTransformm();
			
			if(btTransform.jsObject == null)
			{
				System.out.println("a");
			}
			
			btTransform.getSSTransform(transform);
		}
		catch (Throwable t)
		{
			System.out.println("a");
		}
	
		return transform;
	}

	public void getWorldTransform(Matrix4 out)
	{
//		getWorldTransform(btTransform.javaScriptObject);
//		btTransform.getTransform(out);
	}

	private native JavaScriptObject getWorldTransformm() /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return collObject.getWorldTransform();
	}-*/;

	private native void getWorldTransform(JavaScriptObject btTransformm) /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		collObject.getWorldTransform(btTransformm); //FIXME not working. only return zeros.
	}-*/;

	public native int getCollisionFlags() /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return collObject.getCollisionFlags();
	}-*/;

	public btCollisionShape getCollisionShape()
	{
		return collisionShape;
	}

	protected void refCollisionShape(btCollisionShape shape)
	{
		if (collisionShape == shape)
			return;
		//		if (collisionShape != null)
		//			collisionShape.release();
		collisionShape = shape;
		//		collisionShape.obtain();
	}
	
	JavaScriptObject setWorldTran;
	
	public void setWorldTransform(Matrix4 transform)
	{
		if(setWorldTran == null)
			setWorldTran = btTransform.createObj();
		
		btTransform.jsObject = setWorldTran;
		btTransform.setTransform(transform);
		setWorldTransform(btTransform);
	}

	private native void setWorldTransform(btTransform btTransform) /*-{
		var transformJS = btTransform.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		collObject.setWorldTransform(transformJS);
	}-*/;

	public native void setCollisionFlags(int flag) /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		collObject.setCollisionFlags(flag);
	}-*/;

	public native void activate(boolean forceActivation) /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		collObject.activate(forceActivation);
	}-*/;

	public native void activate() /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		collObject.activate();
	}-*/;

	public native void forceActivationState(int newState) /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		collObject.forceActivationState(newState);
	}-*/;

	public native boolean isActive() /*-{
		var collObject = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		collObject.isActive();
	}-*/;

	public final static class CollisionFlags
	{
		public final static int CF_STATIC_OBJECT = 1;
		public final static int CF_KINEMATIC_OBJECT = 2;
		public final static int CF_NO_CONTACT_RESPONSE = 4;
		public final static int CF_CUSTOM_MATERIAL_CALLBACK = 8;
		public final static int CF_CHARACTER_OBJECT = 16;
		public final static int CF_DISABLE_VISUALIZE_OBJECT = 32;
		public final static int CF_DISABLE_SPU_COLLISION_PROCESSING = 64;
	}

	public final static class CollisionObjectTypes
	{
		public final static int CO_COLLISION_OBJECT = 1;
		public final static int CO_RIGID_BODY = 2;
		public final static int CO_GHOST_OBJECT = 4;
		public final static int CO_SOFT_BODY = 8;
		public final static int CO_HF_FLUID = 16;
		public final static int CO_USER_TYPE = 32;
		public final static int CO_FEATHERSTONE_LINK = 64;
	}

	public final static class AnisotropicFrictionFlags
	{
		public final static int CF_ANISOTROPIC_FRICTION_DISABLED = 0;
		public final static int CF_ANISOTROPIC_FRICTION = 1;
		public final static int CF_ANISOTROPIC_ROLLING_FRICTION = 2;
	}
}
