package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.Array;

public class btCompoundShape extends btCollisionShape
{
	protected Array<btCollisionShape> children = new Array<btCollisionShape>();

	public native void addChildShape(Matrix4 localTransform, btCollisionShape shape)/*-{
		var tmpbtTransform = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(tmpbtTransform, localTransform);
		var shapeJS = shape.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var compountShapeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		compountShapeJS.addChildShape(tmpbtTransform, shapeJS);
		children.@com.badlogic.gdx.utils.Array::add(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionShape;)(shape);
	}-*/;

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

	private native void internalRemoveChildShape(int index) /*-{
		var compountShapeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		compountShapeJS.removeChildShapeByIndex(index);
	}-*/;
}
