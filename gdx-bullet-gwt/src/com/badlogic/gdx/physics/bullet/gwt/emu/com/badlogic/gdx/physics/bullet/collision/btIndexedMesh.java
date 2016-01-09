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
	protected final static Array<btIndexedMesh> instances = new Array<btIndexedMesh>();

	protected static btIndexedMesh getInstance(final Object tag)
	{
		final int n = instances.size;
		for (int i = 0; i < n; i++)
		{
			final btIndexedMesh mesh = instances.get(i);
			if (tag.equals(mesh.tag))
				return mesh;
		}
		return null;
	}

	/**
	 * Create or reuse a btIndexedMesh instance based on the specified
	 * {@link MeshPart}. Use {@link #release()} to release the mesh when it's no
	 * longer needed.
	 */
	public static btIndexedMesh obtain(JavaScriptObject btTriangleMesh, final MeshPart meshPart)
	{
		if (meshPart == null)
			throw new GdxRuntimeException("meshPart cannot be null");

		btIndexedMesh result = null;
//		btIndexedMesh result = getInstance(meshPart);
		if (result == null)
		{
//			result = new btIndexedMesh(meshPart);
			
			set(btTriangleMesh, meshPart);
//			instances.add(result);
		}
//		result.obtain();
		return result;
	}

	/**
	 * Create or reuse a btIndexedMesh instance based on the specified tag. Use
	 * {@link #release()} to release the mesh when it's no longer needed.
	 */
	public static btIndexedMesh obtain(JavaScriptObject btTriangleMesh, final Object tag, final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes, final ShortBuffer indices, int indexOffset, int indexCount)
	{
		if (tag == null)
			throw new GdxRuntimeException("tag cannot be null");

		btIndexedMesh result = getInstance(tag);
		if (result == null)
		{
			result = new btIndexedMesh(btTriangleMesh, vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes, indices, indexOffset, indexCount);
			result.tag = tag;
			instances.add(result);
		}
		result.obtain();
		return result;
	}

	/**
	 * The tag to identify this btIndexedMesh, may be null. Typically this is
	 * the {@link Mesh} or {@link MeshPart} used to create or set this
	 * btIndexedMesh. Use by the static obtain(...) methods to avoid creating
	 * duplicate instances.
	 */
	public Object tag;

	public btIndexedMesh()
	{
		jsObject = createObj();
	}

	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btIndexedMesh();
		return obj;
	}-*/;

	/**
	 * Construct a new btIndexedMesh based on the supplied {@link Mesh} The
	 * specified mesh must be indexed and triangulated and must outlive this
	 * btIndexedMesh. The buffers for the vertices and indices are shared amonst
	 * both.
	 */
	public btIndexedMesh(JavaScriptObject btTriangleMesh, final Mesh mesh)
	{
		this();
		set(btTriangleMesh, mesh);
	}

	/**
	 * Construct a new btIndexedMesh based on the supplied {@link MeshPart} The
	 * specified mesh must be indexed and triangulated and must outlive this
	 * btIndexedMesh. The buffers for the vertices and indices are shared amonst
	 * both.
	 */
	public btIndexedMesh(JavaScriptObject btTriangleMesh, final MeshPart meshPart)
	{
		this();
		set(btTriangleMesh, meshPart);
	}

	/**
	 * Construct a new btIndexedMesh based on the supplied {@link Mesh} The
	 * specified mesh must be indexed and triangulated and must outlive this
	 * btIndexedMesh. The buffers for the vertices and indices are shared amonst
	 * both.
	 */
	public btIndexedMesh(JavaScriptObject btTriangleMesh, final Mesh mesh, int offset, int count)
	{
		this();
		set(btTriangleMesh, mesh, offset, count);
	}

	/**
	 * Construct a new btIndexedMesh based on the supplied vertex and index
	 * data. The specified data must be indexed and triangulated and must
	 * outlive this btIndexedMesh. The buffers for the vertices and indices are
	 * shared amonst both.
	 */
	public btIndexedMesh(JavaScriptObject btTriangleMesh, final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes, final ShortBuffer indices, int indexOffset, int indexCount)
	{
		this();
		set(btTriangleMesh, vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes, indices, indexOffset, indexCount);
	}

	/**
	 * Convenience method to set this btIndexedMesh to the specified
	 * {@link Mesh} The specified mesh must be indexed and triangulated and must
	 * outlive this btIndexedMesh. The buffers for the vertices and indices are
	 * shared amonst both.
	 */
	static public void set(JavaScriptObject btTriangleMesh, final Mesh mesh)
	{
		set(btTriangleMesh, mesh, mesh, 0, mesh.getNumIndices());
	}

	/**
	 * Convenience method to set this btIndexedMesh to the specified
	 * {@link Mesh} The specified mesh must be indexed and triangulated and must
	 * outlive this btIndexedMesh. The buffers for the vertices and indices are
	 * shared amonst both.
	 */
	static public void set(JavaScriptObject btTriangleMesh, final Object tag, final Mesh mesh)
	{
		set(btTriangleMesh, tag, mesh, 0, mesh.getNumIndices());
	}

	/**
	 * Convenience method to set this btIndexedMesh to the specified
	 * {@link MeshPart} The specified mesh must be indexed and triangulated and
	 * must outlive this btIndexedMesh. The buffers for the vertices and indices
	 * are shared amonst both.
	 */
	static public void set(JavaScriptObject btTriangleMesh, final MeshPart meshPart)
	{
		if (meshPart.primitiveType != com.badlogic.gdx.graphics.GL20.GL_TRIANGLES)
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Mesh must be indexed and triangulated");
		set(btTriangleMesh, meshPart, meshPart.mesh, meshPart.offset, meshPart.size);
	}

	/**
	 * Convenience method to set this btIndexedMesh to the specified
	 * {@link Mesh} The specified mesh must be indexed and triangulated and must
	 * outlive this btIndexedMesh. The buffers for the vertices and indices are
	 * shared amonst both.
	 */
	public void set(JavaScriptObject btTriangleMesh, final Mesh mesh, int offset, int count)
	{
		set(btTriangleMesh, null, mesh, offset, count);
	}

	/**
	 * Convenience method to set this btIndexedMesh to the specified
	 * {@link Mesh} The specified mesh must be indexed and triangulated and must
	 * outlive this btIndexedMesh. The buffers for the vertices and indices are
	 * shared amonst both.
	 */
	static public void set(JavaScriptObject btTriangleMesh, final Object tag, final Mesh mesh, int offset, int count)
	{
		if ((count <= 0) || ((count % 3) != 0))
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Mesh must be indexed and triangulated");

		VertexAttribute posAttr = mesh.getVertexAttribute(Usage.Position);

		if (posAttr == null)
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Mesh doesn't have a position attribute");

		if(setVertices(mesh.getVerticesBuffer(), mesh.getVertexSize(), mesh.getNumVertices(), posAttr.offset) && setIndices(mesh.getIndicesBuffer(), offset, count))
			set(btTriangleMesh, tag, mesh.getVerticesBuffer(), mesh.getVertexSize(), mesh.getNumVertices(), posAttr.offset, mesh.getIndicesBuffer(), offset, count);
	
		int sizeInBytesOfEachVertex =  mesh.getVertexSize();
		int numberOf4Bytes = sizeInBytesOfEachVertex/4;
		FloatBuffer verticesBuffer = mesh.getVerticesBuffer();
		int remaining = verticesBuffer.remaining();
		int i = 0;
		while(i+(3*numberOf4Bytes) < remaining)
		{
			float x1 = verticesBuffer.get(i);
			float y1 = verticesBuffer.get(i+1);
			float z1 = verticesBuffer.get(i+2);
			i=i+numberOf4Bytes;
			float x2 = verticesBuffer.get(i);
			float y2 = verticesBuffer.get(i+1);
			float z2 = verticesBuffer.get(i+2);
			i=i+numberOf4Bytes;
			float x3 = verticesBuffer.get(i);
			float y3 = verticesBuffer.get(i+1);
			float z3 = verticesBuffer.get(i+2);
			i=i+numberOf4Bytes;
			set(btTriangleMesh, x1, y1, z1, x2, y2, z2, x3, y3, z3);
		}
	}

	/**
	 * Convenience method to set this btIndexedMesh to the specified vertex and
	 * index data. The specified data must be indexed and triangulated and must
	 * outlive this btIndexedMesh.
	 */
	public void set(JavaScriptObject btTriangleMesh, final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes, final ShortBuffer indices, int indexOffset, int indexCount)
	{
		if(setVertices(vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes) && setIndices(indices, indexOffset, indexCount))
			set(btTriangleMesh, null, vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes, indices, indexOffset, indexCount);
		
		

	}

	
	static public native void set(JavaScriptObject btTriangleMesh, float x1, float y1, float z1,float x2, float y2, float z2, float x3, float y3, float z3)  /*-{
	
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x1,y1,z1);
	
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(x2,y2,z2);
	
		var tmpbtVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_3;
		tmpbtVector3.setValue(x3,y3,z3);
	
		btTriangleMesh.addTriangle(tmpbtVector, tmpbtVector2, tmpbtVector3, true);
//		btTriangleMesh.addIndex(btTriangleMesh.findOrAddVertex(tmpbtVector, true));
	
	}-*/;
	
	
	/**
	 * Convenience method to set this btIndexedMesh to the specified vertex and
	 * index data. The specified data must be indexed and triangulated and must
	 * outlive this btIndexedMesh.
	 */
	static public native void set(JavaScriptObject btTriangleMesh, final Object tag, final FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes, final ShortBuffer indices, int indexOffset, int indexCount)  /*-{
		
		
		
//		if(setVertices(vertices, sizeInBytesOfEachVertex, vertexCount, positionOffsetInBytes) && setIndices(indices, indexOffset, indexCount))
//		{
//			
//		}
//		this.tag = tag;
	}-*/;

	static public boolean setVertices(java.nio.FloatBuffer vertices, int sizeInBytesOfEachVertex, int vertexCount, int positionOffsetInBytes)
	{
		assert vertices.isDirect() : "Buffer must be allocated direct.";
		{
			return true;
		}
	}
	
	static public boolean setIndices(java.nio.ShortBuffer indices, int indexOffset, int indexCount)
	{
		assert indices.isDirect() : "Buffer must be allocated direct.";
		{
			return true;
		}
	}
}
