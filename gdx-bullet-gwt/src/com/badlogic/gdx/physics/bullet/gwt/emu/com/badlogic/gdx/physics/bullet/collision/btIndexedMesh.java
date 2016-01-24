package com.badlogic.gdx.physics.bullet.collision;

import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.google.gwt.core.client.JavaScriptObject;

public class btIndexedMesh extends BulletBase
{
	public btIndexedMesh() {
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btIndexedMesh();
		return obj;
	}-*/;
	
	protected final static Array<btIndexedMesh> instances = new Array<btIndexedMesh>();
	protected static btIndexedMesh getInstance(final Object tag) {
		final int n = instances.size;
		for (int i = 0; i < n; i++) {
			final btIndexedMesh mesh = instances.get(i);
			if (tag.equals(mesh.tag))
				return mesh;
		}
		return null;
	}
	
	/** Create or reuse a btIndexedMesh instance based on the specified {@link MeshPart}.
	 * Use {@link #release()} to release the mesh when it's no longer needed. */
	public static btIndexedMesh obtain(final MeshPart meshPart) {
		if (meshPart == null)
			throw new GdxRuntimeException("meshPart cannot be null");
		
		btIndexedMesh result = getInstance(meshPart);
		if (result == null) {
			result = new btIndexedMesh(meshPart);
			instances.add(result);
		}
		result.obtain();
		return result;
	}
	
	/** Create or reuse a btIndexedMesh instance based on the specified tag.
	 * Use {@link #release()} to release the mesh when it's no longer needed. */
	public static btIndexedMesh obtain(final Object tag,
			final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes,
			final ShortBuffer indices, int indexOffset, int indexCount) {
		if (tag == null)
			throw new GdxRuntimeException("tag cannot be null");
		
		btIndexedMesh result = getInstance(tag);
		if (result == null) {
			result = new btIndexedMesh(vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes, indices, indexOffset, indexCount);
			result.tag = tag;
			instances.add(result);
		}
		result.obtain();
		return result;
	}
	
	/** The tag to identify this btIndexedMesh, may be null. Typically this is the {@link Mesh} or {@link MeshPart} used to create or set
	 * this btIndexedMesh. Use by the static obtain(...) methods to avoid creating duplicate instances. */
	public Object tag;
	
	/** Construct a new btIndexedMesh based on the supplied {@link Mesh}
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public btIndexedMesh(final Mesh mesh) {
		this();
		set(mesh);
	}
	
	/** Construct a new btIndexedMesh based on the supplied {@link MeshPart}
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public btIndexedMesh(final MeshPart meshPart) {
		this();
		set(meshPart);
	}
	
	/** Construct a new btIndexedMesh based on the supplied {@link Mesh}
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public btIndexedMesh(final Mesh mesh, int offset, int count) {
		this();
		set(mesh, offset, count);
	}
	
	/** Construct a new btIndexedMesh based on the supplied vertex and index data.
	 * The specified data must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */	
	public btIndexedMesh(final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes,
			final ShortBuffer indices, int indexOffset, int indexCount) {
		this();
		set(vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes, indices, indexOffset, indexCount);
	}
	
	/** Convenience method to set this btIndexedMesh to the specified {@link Mesh} 
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public void set(final Mesh mesh) {
		set(mesh, mesh, 0, mesh.getNumIndices());
	}
	
	/** Convenience method to set this btIndexedMesh to the specified {@link Mesh} 
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public void set(final Object tag, final Mesh mesh) {
		set(tag, mesh, 0, mesh.getNumIndices());
	}

	/** Convenience method to set this btIndexedMesh to the specified {@link MeshPart} 
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public void set(final MeshPart meshPart) {
		if (meshPart.primitiveType != com.badlogic.gdx.graphics.GL20.GL_TRIANGLES)
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Mesh must be indexed and triangulated");
		set(meshPart, meshPart.mesh, meshPart.offset, meshPart.size);
	}
	
	/** Convenience method to set this btIndexedMesh to the specified {@link Mesh} 
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public void set(final Mesh mesh, int offset, int count) {
		set(null, mesh, offset, count);
	}

	/** Convenience method to set this btIndexedMesh to the specified {@link Mesh} 
	 * The specified mesh must be indexed and triangulated and must outlive this btIndexedMesh.
	 * The buffers for the vertices and indices are shared amonst both. */
	public void set(final Object tag, final Mesh mesh, int offset, int count) {
		if ((count <= 0) || ((count % 3) != 0))
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Mesh must be indexed and triangulated");

		VertexAttribute posAttr = mesh.getVertexAttribute(Usage.Position);
		
		if (posAttr == null)
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Mesh doesn't have a position attribute");
		
		set(tag, mesh.getVerticesBuffer(), mesh.getVertexSize(), mesh.getNumVertices(), posAttr.offset, mesh.getIndicesBuffer(), offset, count);
	}

	/** Convenience method to set this btIndexedMesh to the specified vertex and index data. 
	 * The specified data must be indexed and triangulated and must outlive this btIndexedMesh. */
	public void set(final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes,
			final ShortBuffer indices, int indexOffset, int indexCount) {
		set(null, vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes, indices, indexOffset, indexCount);
	}
	
	/** Convenience method to set this btIndexedMesh to the specified vertex and index data. 
	 * The specified data must be indexed and triangulated and must outlive this btIndexedMesh. */
	public void set(final Object tag,
			final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes,
			final ShortBuffer indices, int indexOffset, int indexCount) {
		setVertices(vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes);
		setIndices(indices, indexOffset, indexCount);
		this.tag = tag;
	}
	
	private native void setVertices(FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes) /*-{ 
		var indexMeshJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var verticesArray = vertices.@java.nio.DirectReadWriteFloatBufferAdapter::getTypedArray()();
		var nDataBytes1 = verticesArray.length * verticesArray.BYTES_PER_ELEMENT;
		var dataPtr1 = $wnd.Ammo._malloc(nDataBytes1);
		var dataHeap1 = new Uint8Array($wnd.Ammo.HEAPU8.buffer, dataPtr1, nDataBytes1);
		dataHeap1.set(new Uint8Array(verticesArray.buffer));
		var softBodyJS = $wnd.Ammo.myClassHelper.prototype.setVertices(indexMeshJS, dataHeap1.byteOffset, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes);
	}-*/;
	
	private native void setIndices(ShortBuffer indices, int indexOffset, int indexCount) /*-{ 
		var indexMeshJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var indicesArray = indices.@java.nio.DirectReadWriteShortBufferAdapter::getTypedArray()();
		var nDataBytes2 = indicesArray.length * indicesArray.BYTES_PER_ELEMENT;
		var dataPtr2 = $wnd.Ammo._malloc(nDataBytes2);
		var dataHeap2 = new Uint8Array($wnd.Ammo.HEAPU8.buffer, dataPtr2, nDataBytes2);
		dataHeap2.set(new Uint8Array(indicesArray.buffer));
		var softBodyJS = $wnd.Ammo.myClassHelper.prototype.setIndices(indexMeshJS, dataHeap2.byteOffset, indexOffset, indexCount);
	}-*/;
}
