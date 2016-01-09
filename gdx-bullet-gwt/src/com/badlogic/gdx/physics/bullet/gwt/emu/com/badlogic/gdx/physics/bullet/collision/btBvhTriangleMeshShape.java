package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.google.gwt.core.client.JavaScriptObject;

public class btBvhTriangleMeshShape extends btTriangleMeshShape
{ //FIXME needs to finish implementation and clean up.
	private btStridingMeshInterface meshInterface = null;
	
	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts)
	{
		this(meshParts, true);
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression)
	{
		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression);
//		this(1, null, useQuantizedAabbCompression);
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression, boolean buildBvh)
	{
//		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression, buildBvh);
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax)
	{
//		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh)
	{
//		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression)
	{
		this(0, meshInterface, useQuantizedAabbCompression);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh)
	{
		this(0, meshInterface, useQuantizedAabbCompression, buildBvh);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh)
	{
		this(0, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax)
	{
		this(0, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression)
	{
		this(true, meshInterface, useQuantizedAabbCompression);
		this.meshInterface = meshInterface;
//		if (obtained == 0)
//			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh)
	{
		this(true, meshInterface, useQuantizedAabbCompression, buildBvh);
		this.meshInterface = meshInterface;
//		if (obtained == 0)
//			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh)
	{
		this(true, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
		this.meshInterface = meshInterface;
//		if (obtained == 0)
//			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax)
	{
		this(true, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
		this.meshInterface = meshInterface;
//		if (obtained == 0)
//			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh)
	{
		jsObject = createObj(meshInterface, useQuantizedAabbCompression, buildBvh);
	}

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression)
	{
		jsObject = createObj(meshInterface, useQuantizedAabbCompression);
	}
	
	private native JavaScriptObject createObj(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) /*-{
		var meshInterface = meshInterface.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
//		var triMesh = new $wnd.Ammo.btTriangleMesh(true, true);
		
//		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
//		tmpbtVector.setValue(0,0,0);
//		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
//		tmpbtVector2.setValue(1,1,1);
//		var tmpbtVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_3;
//		tmpbtVector3.setValue(1,0,1);

//		triMesh.addTriangle(tmpbtVector, tmpbtVector2, tmpbtVector3, true);

		var obj = new $wnd.Ammo.btBvhTriangleMeshShape(meshInterface, true);
		return obj;
	}-*/;
	
	private native JavaScriptObject createObj(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) /*-{
		var meshInterface = meshInterface.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btBvhTriangleMeshShape(meshInterface, useQuantizedAabbCompression, buildBvh);
		return obj;
	}-*/;

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh)
	{
//		this(CollisionJNI.new_btBvhTriangleMeshShape__SWIG_2(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh), true);
	}

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax)
	{
//		this(CollisionJNI.new_btBvhTriangleMeshShape__SWIG_3(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax), true);
	}
	
	
}
