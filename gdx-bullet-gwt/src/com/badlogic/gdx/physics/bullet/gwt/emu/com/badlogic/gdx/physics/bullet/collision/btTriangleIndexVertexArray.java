package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.g3d.model.NodePart;
import com.badlogic.gdx.utils.Array;
import com.google.gwt.core.client.JavaScriptObject;

public class btTriangleIndexVertexArray extends btStridingMeshInterface 
{
	protected final static Array<btTriangleIndexVertexArray> instances = new Array<btTriangleIndexVertexArray>();

	
	public btTriangleIndexVertexArray() {
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btTriangleMesh();
		return obj;
	}-*/;
	
//	/** @return Whether the supplied array contains all specified tags. */
//	public static <T extends Object> boolean compare(final btTriangleIndexVertexArray array, final Array<T> tags) {
//		if (array.meshes.size != tags.size)
//			return false;
//		for (final btIndexedMesh mesh : array.meshes) {
//			boolean found = false;
//			final Object tag = mesh.tag;
//			if (tag == null) 
//				return false;
//			for (final T t : tags) {
//				if (t.equals(tag)) {
//					found = true;
//					break;
//				}
//			}
//			if (!found)
//				return false;
//		}
//		return true;
//	}
//
//	protected static <T extends Object> btTriangleIndexVertexArray getInstance(final Array<T> tags) {
//		for (final btTriangleIndexVertexArray instance : instances) {
//			if (compare(instance, tags))
//				return instance;
//		}
//		return null;
//	}
	
	/** Create or reuse a btTriangleIndexVertexArray instance based on the specified {@link MeshPart} array.
	 * Use {@link #release()} to release the mesh when it's no longer needed. */
	public static <T extends MeshPart> btTriangleIndexVertexArray obtain(final Array<T> meshParts) {
		btTriangleIndexVertexArray result = null;
//		btTriangleIndexVertexArray result = getInstance(meshParts);
		if (result == null) 
		{
			result = new btTriangleIndexVertexArray(meshParts);
//			instances.add(result);
		}
		result.obtain();
		return result;
	}
	
	//protected final Array<btIndexedMesh> meshes = new Array<btIndexedMesh>(1);
	
	public btTriangleIndexVertexArray(final MeshPart meshPart) {
		this();
		addMeshPart(meshPart);
	}
	
	public <T extends MeshPart> btTriangleIndexVertexArray(final Iterable<T> meshParts) {
		this();
		addMeshParts(meshParts);
	}
	
//	/** The amount of meshes this array contains. */
//	public int getIndexedMeshCount() {
//		return meshes.size;
//	}
	
//	/** Return the {@link btIndexedMesh} at the specified index. */
//	public btIndexedMesh getIndexedMesh(int index) {
//		return meshes.get(index);
//	}

	/** Add a {@link MeshPart} instance to this btTriangleIndexVertexArray. 
	 * The specified mesh must be indexed and triangulated and must outlive this btTriangleIndexVertexArray.
     * The buffers for the vertices and indices are shared amongst both. */
	public btTriangleIndexVertexArray addMeshPart(final MeshPart meshPart) {
		btIndexedMesh mesh = btIndexedMesh.obtain(jsObject, meshPart);
//		addIndexedMesh(mesh, PHY_ScalarType.PHY_SHORT);
//		mesh.release();
		return this;
	}

	/** Add one or more {@link MeshPart} instances to this btTriangleIndexVertexArray. 
	 * The specified meshes must be indexed and triangulated and must outlive this btTriangleIndexVertexArray.
     * The buffers for the vertices and indices are shared amongst both. */
	public btTriangleIndexVertexArray addMeshParts(final MeshPart... meshParts) {
		for (int i = 0; i < meshParts.length; i++)
			addMeshPart(meshParts[i]);
		return this;
	}

	/** Add one or more {@link MeshPart} instances to this btTriangleIndexVertexArray. 
	 * The specified meshes must be indexed and triangulated and must outlive this btTriangleIndexVertexArray.
     * The buffers for the vertices and indices are shared amongst both. */
	public <T extends MeshPart> btTriangleIndexVertexArray addMeshParts(final Iterable<T> meshParts) {
		for (final MeshPart meshPart : meshParts)
			addMeshPart(meshPart);
		return this;
	}
	
	/** Add one or more {@link NodePart} instances to this btTriangleIndexVertexArray. 
	 * The specified meshes must be indexed and triangulated and must outlive this btTriangleIndexVertexArray.
     * The buffers for the vertices and indices are shared amongst both. */
	public <T extends NodePart> btTriangleIndexVertexArray addNodeParts(final Iterable<T> nodeParts) {
		for (final NodePart nodePart : nodeParts)
			addMeshPart(nodePart.meshPart);
		return this;
	}
	
//	/** Add a {@link btIndexedMesh} to this array */
//	public btTriangleIndexVertexArray addIndexedMesh(final btIndexedMesh mesh, int indexType) {
//		mesh.obtain();
//		//internalAddIndexedMesh(mesh, indexType);
////		meshes.add(mesh);
//		return this;
//	}

//	/** Add a {@link btIndexedMesh} to this array */
//	public btTriangleIndexVertexArray addIndexedMesh(final btIndexedMesh mesh) {
//		return addIndexedMesh(mesh, PHY_ScalarType.PHY_SHORT);
//	}
	
	@Override
	public void dispose() {
	//	for (final btIndexedMesh mesh : meshes)
	//		mesh.release();
	//	meshes.clear();
		super.dispose();
	}
}
