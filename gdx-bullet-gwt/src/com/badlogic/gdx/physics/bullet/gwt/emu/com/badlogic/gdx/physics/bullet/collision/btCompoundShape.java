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
		var children = this.@com.badlogic.gdx.physics.bullet.collision.btCompoundShape::children;
//		children.@com.badlogic.gdx.utils.Array::add(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionShape;)(shape);
		children.@com.badlogic.gdx.utils.Array::add(Ljava/lang/Object;)(shape);
	}-*/;

	public native void removeChildShape(btCollisionShape shape)/*-{
		var children = this.@com.badlogic.gdx.physics.bullet.collision.btCompoundShape::children;
//		var idx = children.@com.badlogic.gdx.utils.Array::indexOf(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionShape;Z)(shape, false);
		var idx = children.@com.badlogic.gdx.utils.Array::indexOf(Ljava/lang/Object;Z)(shape, false);
		if (idx >= 0)
		{
			var compountShapeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			compountShapeJS.removeChildShapeByIndex(index);
			children.@com.badlogic.gdx.utils.Array::removeIndex(I)(idx);
		}
	}-*/;
	
	public native void removeChildShapeByIndex(int index)/*-{
		var children = this.@com.badlogic.gdx.physics.bullet.collision.btCompoundShape::children;
		if(children.@com.badlogic.gdx.utils.Array::removeIndex(I)(idx) != null)
		{
			var compountShapeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			compountShapeJS.removeChildShapeByIndex(index);
			//FIXME  should dispose this shape?
		}
	}-*/;

	public int getNumChildShapes()
	{
		return children.size;
	}
	
	public btCollisionShape getChildShape(int index)
	{
		return children.get(index);
	}
	
	public Matrix4 getChildTransform(int index)
	{ // TODO not yet implemented. it uses btCompoundShapeChild
		btCollisionShape childShape = getChildShape(index);
		if(childShape != null)
		{
			
		}
		return null;
	}
}
