package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;

public class btBvhTriangleMeshShape extends btTriangleMeshShape
{ //FIXME needs implementation
	private btStridingMeshInterface meshInterface = null;
	
	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts)
	{
		this(meshParts, true);
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression)
	{
//		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression);
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
//		this(CollisionJNI.new_btBvhTriangleMeshShape__SWIG_0(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, buildBvh), true);
	}

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression)
	{
//		this(CollisionJNI.new_btBvhTriangleMeshShape__SWIG_1(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression), true);
	}

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh)
	{
//		this(CollisionJNI.new_btBvhTriangleMeshShape__SWIG_2(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh), true);
	}

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax)
	{
//		this(CollisionJNI.new_btBvhTriangleMeshShape__SWIG_3(dummy, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax), true);
	}
	
	
}
