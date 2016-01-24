package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.google.gwt.core.client.JavaScriptObject;

public class btBvhTriangleMeshShape extends btTriangleMeshShape {
	private btStridingMeshInterface meshInterface = null;
	protected final static Array<btBvhTriangleMeshShape> instances = new Array<btBvhTriangleMeshShape>();
	
	protected static <T extends MeshPart> btBvhTriangleMeshShape getInstance(final Array<T> meshParts) {
		for (final btBvhTriangleMeshShape instance : instances) {
			if (instance.meshInterface instanceof btTriangleIndexVertexArray &&
					btTriangleIndexVertexArray.compare((btTriangleIndexVertexArray)(instance.meshInterface), meshParts))
				return instance;
		}
		return null;
	}
	
	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts) {
		this(meshParts, true);
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression) {
		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression);
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression, boolean buildBvh) {
		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression, buildBvh);
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
	}

	public <T extends MeshPart> btBvhTriangleMeshShape(final Array<T> meshParts, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
		this(1, btTriangleIndexVertexArray.obtain(meshParts), useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
		this(0, meshInterface, useQuantizedAabbCompression);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
		this(0, meshInterface, useQuantizedAabbCompression, buildBvh);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
		this(0, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
	}

	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
		this(0, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
		this(true, meshInterface, useQuantizedAabbCompression);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
		this(true, meshInterface, useQuantizedAabbCompression, buildBvh);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
		this(true, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(int obtained, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
		this(true, meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
		this.meshInterface = meshInterface;
		if (obtained == 0)
			meshInterface.obtain();
	}

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) {
		jsObject = createObj(meshInterface, useQuantizedAabbCompression, buildBvh);
	}

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression) {
		jsObject = createObj(meshInterface, useQuantizedAabbCompression, true);
	}
	
	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) {
		jsObject = createObj(meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh);
	}

	private btBvhTriangleMeshShape(boolean dummy, btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
		jsObject = createObj(meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, true);
	}
	
	private native JavaScriptObject createObj(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, boolean buildBvh) /*-{
		var meshInterface = meshInterface.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btBvhTriangleMeshShape(meshInterface, useQuantizedAabbCompression, buildBvh);
		return obj;
	}-*/;
	private native JavaScriptObject createObj(btStridingMeshInterface meshInterface, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax, boolean buildBvh) /*-{
		var meshInterface = meshInterface.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(bvhAabbMin.@com.badlogic.gdx.math.Vector3::x,bvhAabbMin.@com.badlogic.gdx.math.Vector3::y,bvhAabbMin.@com.badlogic.gdx.math.Vector3::z);
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(bvhAabbMax.@com.badlogic.gdx.math.Vector3::x,bvhAabbMax.@com.badlogic.gdx.math.Vector3::y,bvhAabbMax.@com.badlogic.gdx.math.Vector3::z);
		var obj = new $wnd.Ammo.btBvhTriangleMeshShape(meshInterface, useQuantizedAabbCompression, tmpbtVector1, tmpbtVector2, buildBvh);
		return obj;
	}-*/;

	public static <T extends MeshPart> btBvhTriangleMeshShape obtain(final Array<T> meshParts) {
		btBvhTriangleMeshShape result = getInstance(meshParts);
		if (result == null) {
			result = new btBvhTriangleMeshShape(btTriangleIndexVertexArray.obtain(meshParts), true);
			instances.add(result);
		}
		result.obtain();
		return result;
	}
	
	/** @return The {@link btStridingMeshInterface} this shape encapsulates. */ 
	public btStridingMeshInterface getMeshInterface() {
		return meshInterface;
	}
	
	public native void performRaycast(btTriangleCallback callback, Vector3 raySource, Vector3 rayTarget) /*-{ 
		var meshShapeJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var callbackJS = callback.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(raySource.@com.badlogic.gdx.math.Vector3::x,raySource.@com.badlogic.gdx.math.Vector3::y,raySource.@com.badlogic.gdx.math.Vector3::z);
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(rayTarget.@com.badlogic.gdx.math.Vector3::x,rayTarget.@com.badlogic.gdx.math.Vector3::y,rayTarget.@com.badlogic.gdx.math.Vector3::z);
		meshShapeJS.performRaycast(callbackJS, tmpbtVector1, tmpbtVector2);
	}-*/;
	
}
