package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.bullet.linearmath.btTransform;
import com.badlogic.gdx.utils.Array;

public class btCompoundShape extends btCollisionShape
{
	protected Array<btCollisionShape> children = new Array<btCollisionShape>();

	public void addChildShape(Matrix4 localTransform, btCollisionShape shape)
	{
		btTransform btTransform = new btTransform(localTransform);
		internalAddChildShape(btTransform, shape);
		children.add(shape);
	}

	public void removeChildShape(btCollisionShape shape)
	{
		final int idx = children.indexOf(shape, false);
		if (idx >= 0)
		{
			internalRemoveChildShape(idx);
			children.removeIndex(idx);
		}
	}

	public void removeChildShapeByIndex(int index)
	{
		if(children.removeIndex(index) != null)
			internalRemoveChildShape(index);
		//FIXME  should dispose this shape?
	}

	public btCollisionShape getChildShape(int index)
	{
		return children.get(index);
	}
	
	public int getNumChildShapes()
	{
		return children.size;
	}
	
	public Matrix4 getChildTransform(int index)
	{
		return null;
	}

	private native void internalAddChildShape(btTransform btTransform, btCollisionShape shape) /*-{
		var shapeJS = shape.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var transformJS = btTransform.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var compountShapeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		compountShapeJS.addChildShape(transformJS, shapeJS);
	}-*/;
	private native void internalRemoveChildShape(int index) /*-{
		var compountShapeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		compountShapeJS.removeChildShapeByIndex(index);
	}-*/;
}
