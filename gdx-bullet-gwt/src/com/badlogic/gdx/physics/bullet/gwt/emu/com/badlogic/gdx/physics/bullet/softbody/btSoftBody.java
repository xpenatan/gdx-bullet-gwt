package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObject;
import com.google.gwt.core.client.JavaScriptObject;

public class btSoftBody extends btCollisionObject
{
	public btSoftBody() {
		
	}
	public btSoftBody(btSoftBodyWorldInfo worldInfo, java.nio.FloatBuffer vertices, int vertexSize, int posOffset, int normalOffset, java.nio.ShortBuffer indices, int indexOffset, int numVertices, java.nio.ShortBuffer indexMap, int indexMapOffset) {
		jsObject = createObj(worldInfo, vertices, vertexSize, posOffset, normalOffset, indices, indexOffset, numVertices, indexMap, indexMapOffset);
	}
	
	
	private native JavaScriptObject createObj(btSoftBodyWorldInfo worldInfo, java.nio.FloatBuffer vertices, int vertexSize, int posOffset, int normalOffset, java.nio.ShortBuffer indices, int indexOffset, int numVertices, java.nio.ShortBuffer indexMap, int indexMapOffset) /*-{
		var worldInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var verticesArray = vertices.@java.nio.DirectReadWriteFloatBufferAdapter::getTypedArray()();
		var indicesArray = indices.@java.nio.DirectReadWriteShortBufferAdapter::getTypedArray()();
		var indexMapArray = indexMap.@java.nio.DirectReadWriteShortBufferAdapter::getTypedArray()();
		
//		var data = new Int16Array([1, 2, 3, 4, 5]);
//		var nDataBytes = data.length * data.BYTES_PER_ELEMENT;
//		var dataPtr = $wnd.Ammo._malloc(nDataBytes);
//		var dataHeap = new Uint8Array($wnd.Ammo.HEAPU8.buffer, dataPtr, nDataBytes);
//		dataHeap.set(new Uint8Array(data.buffer));
//		$wnd.Ammo.myClassHelper.prototype.testArray(dataHeap.byteOffset);
//		var result = new Int16Array(dataHeap.buffer, dataHeap.byteOffset, data.length);
//		data.set(result);
		
		
		var nDataBytes1 = verticesArray.length * verticesArray.BYTES_PER_ELEMENT;
		var nDataBytes2 = indicesArray.length * indicesArray.BYTES_PER_ELEMENT;
		var nDataBytes3 = indexMapArray.length * indexMapArray.BYTES_PER_ELEMENT;
		
		var dataPtr1 = $wnd.Ammo._malloc(nDataBytes1);
		var dataPtr2 = $wnd.Ammo._malloc(nDataBytes2);
		var dataPtr3 = $wnd.Ammo._malloc(nDataBytes3);
		var dataHeap1 = new Uint8Array($wnd.Ammo.HEAPU8.buffer, dataPtr1, nDataBytes1);
		var dataHeap2 = new Uint8Array($wnd.Ammo.HEAPU8.buffer, dataPtr2, nDataBytes2);
		var dataHeap3 = new Uint8Array($wnd.Ammo.HEAPU8.buffer, dataPtr3, nDataBytes3);
		
		dataHeap1.set(new Uint8Array(verticesArray.buffer));
		dataHeap2.set(new Uint8Array(indicesArray.buffer));
		dataHeap3.set(new Uint8Array(indexMapArray.buffer));
		
		var softBodyJS = $wnd.Ammo.myClassHelper.prototype.createbtSoftBody(worldInfoJS, dataHeap1.byteOffset, vertexSize, posOffset, normalOffset,  dataHeap2.byteOffset, indexOffset, numVertices, dataHeap3.byteOffset, indexMapOffset);
		
		var result1 = new Float32Array(dataHeap1.buffer, dataHeap1.byteOffset, verticesArray.length);
		var result2 = new Int16Array(dataHeap2.buffer, dataHeap2.byteOffset, indicesArray.length);
		var result3 = new Int16Array(dataHeap3.buffer, dataHeap3.byteOffset, indexMapArray.length);
		verticesArray.set(result1);
		indicesArray.set(result2);
		indexMapArray.set(result3);
		
		//var softBodyJS = new $wnd.Ammo.btSoftBody(worldInfoJS);
		
		
//		var aARRAY = new Array([1, 8]);
//		aARRAY[0] = 9;
//		aARRAY[1] = 99;
//		$wnd.Ammo.myClassHelper.prototype.testArray(aARRAY);
//		
//		var result = new $wnd.Ammo.btSoftBody(worldInfoJS);
//		result.javaObject = this;
//		var poffset = posOffset / $wnd.Ammo.myClassHelper.prototype.getScalarSizeOf();
//		var noffset = normalOffset / $wnd.Ammo.myClassHelper.prototype.getScalarSizeOf();
//		var size = vertexSize / $wnd.Ammo.myClassHelper.prototype.getScalarSizeOf();
//		
//		var pm = result.appendMaterial();
//		pm.set_m_kLST(1);
//		pm.set_m_kAST(1);
//		pm.set_m_kVST(1);
//		pm.set_m_flags(1);
//		var margin = result.getCollisionShape().getMargin();
//		var nodeCount = 0;
//		result.get_m_nodes().resize(numVertices);
//		
//		for (var i = 0; i < numVertices; i++) {
//			var idxValue = indices.@java.nio.ShortBuffer::get(I)(indexOffset+i);
//			var vertIdx = idxValue*size+poffset;
//			var x = vertices.@java.nio.FloatBuffer::get(I)(vertIdx);
//			var y = vertices.@java.nio.FloatBuffer::get(I)(vertIdx+1);
//			var z = vertices.@java.nio.FloatBuffer::get(I)(vertIdx+2);
//			//var point = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
//			var point = new $wnd.Ammo.btVector3();
//			point.setValue(x,y,z);
//			var idx = -1;
//			for (var j = 0; j < nodeCount; j++) {
//				if (result.get_m_nodes().at(j).get_m_x().op_equal(point)) {
//					idx = j;
//					break;
//				}
//			}
//			if (idx < 0) {
//				var node = result.get_m_nodes().at(nodeCount);
//				//memset(&node,0,sizeof(btSoftBody::Node));
//				node.get_m_x().op_Assignment(point);
//				node.get_m_q().op_Assignment(node.get_m_x());
//				node.set_m_im(1);
//			}
//		}

		
		return softBodyJS;
	}-*/;
	
	@Override
	public JavaScriptObject createMe()
	{
		return null;
	}
	
	public void getVertices(java.nio.FloatBuffer buffer, int vertexCount, int vertexSize, int posOffset)
	{
		assert buffer.isDirect() : "Buffer must be allocated direct.";
		{
			getVerticesJS(buffer, vertexCount, vertexSize, posOffset);
		}
	}
	
	private native void getVerticesJS(java.nio.FloatBuffer buffer, int vertexCount, int vertexSize, int posOffset) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var offset = posOffset / $wnd.Ammo.myClassHelper.prototype.getScalarSizeOf();
		var size = vertexSize / $wnd.Ammo.myClassHelper.prototype.getScalarSizeOf();
		for (var i = 0; i < vertexCount; i++) {
			var o = i*size+offset;
			var nodeJS = softBodyJS.get_m_nodes().at(i);
			var x =  nodeJS.get_m_x().x();
			var y =  nodeJS.get_m_x().y();
			var z =  nodeJS.get_m_x().z();
			buffer.@java.nio.FloatBuffer::put(IF)(o, x);
			buffer.@java.nio.FloatBuffer::put(IF)(o+1, y);
			buffer.@java.nio.FloatBuffer::put(IF)(o+2, z);
		}
	}-*/;
	
	public void getVertices(java.nio.FloatBuffer vertices, int vertexSize, int posOffset, int normalOffset, java.nio.ShortBuffer indices, int indexOffset, int numVertices, java.nio.ShortBuffer indexMap, int indexMapOffset) {
		assert vertices.isDirect() : "Buffer must be allocated direct.";
		assert indices.isDirect() : "Buffer must be allocated direct.";
		assert indexMap.isDirect() : "Buffer must be allocated direct.";
		{
			getVerticesJS(vertices, vertexSize, posOffset, normalOffset, indices, indexOffset, numVertices, indexMap, indexMapOffset);
		}
	}
	
	private native void getVerticesJS(java.nio.FloatBuffer vertices, int vertexSize, int posOffset, int normalOffset, java.nio.ShortBuffer indices, int indexOffset, int numVertices, java.nio.ShortBuffer indexMap, int indexMapOffset) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var poffset = posOffset / $wnd.Ammo.myClassHelper.prototype.getScalarSizeOf();
		var noffset = normalOffset / $wnd.Ammo.myClassHelper.prototype.getScalarSizeOf();
		var size = vertexSize / $wnd.Ammo.myClassHelper.prototype.getScalarSizeOf();
		
		for (var i = 0; i < numVertices; i++) {
			var idxValue = indices.@java.nio.ShortBuffer::get(I)(indexOffset+i);
			var vidx = idxValue*size+poffset;
			var nidx = idxValue*size+noffset;
			var pidx = indexMap.@java.nio.ShortBuffer::get(I)(indexMapOffset+i);
			var nodeJS = softBodyJS.get_m_nodes().at(i);
			var m_xJS = nodeJS.get_m_x();
			var m_nJS = nodeJS.get_m_n();
			var v1 = m_xJS.x();
			var v2 = m_xJS.y();
			var v3 = m_xJS.z();
			var v4 = m_nJS.x();
			var v5 = m_nJS.y();
			var v6 = m_nJS.z();
			vertices.@java.nio.FloatBuffer::put(IF)(vidx, v1);
			vertices.@java.nio.FloatBuffer::put(IF)(vidx+1, v2);
			vertices.@java.nio.FloatBuffer::put(IF)(vidx+2, v3);
			vertices.@java.nio.FloatBuffer::put(IF)(nidx, v4);
			vertices.@java.nio.FloatBuffer::put(IF)(nidx+1, v5);
			vertices.@java.nio.FloatBuffer::put(IF)(nidx+2, v6);
		}
	}-*/;

	public void getIndices(java.nio.ShortBuffer buffer, int triangleCount)
	{
		assert buffer.isDirect() : "Buffer must be allocated direct.";
		{
			getIndexJS(buffer, triangleCount);
		}
	}
	
	private native void getIndexJS(java.nio.ShortBuffer buffer, int triangleCount) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var nodeSize = $wnd.Ammo.myClassHelper.prototype.getSoftBodyNodeSizeOf();
		var nodes = softBodyJS.get_m_nodes();
		var node0 = nodes.at(0);
		var nodeOffset = node0.ptr;
		for (var i = 0; i < triangleCount; i++) {
			var idx = i * 3;
			var faceJS = softBodyJS.get_m_faces().at(i);
			var node1JS = $wnd.Ammo.myClassHelper.prototype.getFaceNode(0, faceJS);
			var node2JS = $wnd.Ammo.myClassHelper.prototype.getFaceNode(1, faceJS);
			var node3JS = $wnd.Ammo.myClassHelper.prototype.getFaceNode(2, faceJS);
			buffer.@java.nio.ShortBuffer::put(IS)(idx, (node1JS.ptr - nodeOffset) / nodeSize);
			buffer.@java.nio.ShortBuffer::put(IS)(idx+1, (node2JS.ptr - nodeOffset) / nodeSize);
			buffer.@java.nio.ShortBuffer::put(IS)(idx+2, (node3JS.ptr - nodeOffset) / nodeSize);
		}
	}-*/;
	
	public native int getNodeCount() /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return softBodyJS.get_m_nodes().size();
	}-*/;
	public native int getFaceCount() /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return softBodyJS.get_m_faces().size();
	}-*/;
	
	public native void setTotalMass(float mass, boolean fromfaces) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		softBodyJS.setTotalMass(mass, fromfaces);
	}-*/;
	public native void setTotalMass(float mass) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		softBodyJS.setTotalMass(mass);
	}-*/;
	
	public native void setMass(int node, float mass) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		softBodyJS.setMass(node, mass);
	}-*/;
	
	public native void randomizeConstraints() /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		softBodyJS.randomizeConstraints();
	}-*/;
	
	public native void scale(Vector3 scl) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(scl.@com.badlogic.gdx.math.Vector3::x, scl.@com.badlogic.gdx.math.Vector3::y, scl.@com.badlogic.gdx.math.Vector3::z);
		softBodyJS.translate(tmpbtVector);
	}-*/;
	
	public native void translate(Vector3 vec) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(vec.@com.badlogic.gdx.math.Vector3::x, vec.@com.badlogic.gdx.math.Vector3::y, vec.@com.badlogic.gdx.math.Vector3::z);
		softBodyJS.translate(tmpbtVector);
	}-*/;
	
	public native void rotate(Quaternion rot) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtQuaternion = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btQuaternionjs_1;
		tmpbtQuaternion.setValue(vec.@com.badlogic.gdx.math.Quaternion::x, vec.@com.badlogic.gdx.math.Quaternion::y, vec.@com.badlogic.gdx.math.Quaternion::z, vec.@com.badlogic.gdx.math.Quaternion::w);
		softBodyJS.rotate(tmpbtQuaternion);
	}-*/;
	
	public native void transform(Matrix4 trs) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var transformJS = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransformjs_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::setTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(transformJS, trs);
		softBodyJS.transform(transformJS);
	}-*/;
	
	public native btSoftBody.Material appendMaterial() /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var softBodyJava = @com.badlogic.gdx.physics.bullet.softbody.btSoftBody.Material::new()();
		softBodyJava.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = softBodyJS.appendMaterial();
		return softBodyJava;
	}-*/;
	
	public native int generateBendingConstraints(int distance, btSoftBody.Material mat) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var materialJS = mat.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return softBodyJS.generateBendingConstraints(distance, materialJS);
	}-*/;
	
	public native void setConfig_piterations(int v) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		softBodyJS.get_m_cfg().set_piterations(v);
	}-*/;
	
	public native void setConfig_kDF(float v) /*-{
		var softBodyJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		softBodyJS.get_m_cfg().set_kDF(v);
	}-*/;
	
	static public class Element extends BulletBase
	{
		public Element()
		{
		}

		public void setTag(long value)
		{
		}

		public long getTag()
		{
			return -1;
		}
	}

	static public class Material extends btSoftBody.Element
	{
		public Material()
		{
		}
		
		public native void setKLST(float value) /*-{
			var materialJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			materialJS.set_m_kLST(value);
		}-*/;

		public native float getKLST() /*-{
			var materialJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return materialJS.get_m_kLST();
		}-*/;

		public native void setKAST(float value) /*-{
			var materialJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			materialJS.set_m_kAST(value);
		}-*/;

		public native float getKAST() /*-{
			var materialJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return materialJS.get_m_kAST();
		}-*/;

		public native void setKVST(float value) /*-{
			var materialJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			materialJS.set_m_kVST(value);
		}-*/;

		public native float getKVST() /*-{
			var materialJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return materialJS.get_m_kVST();
		}-*/;

		public native void setFlags(int value) /*-{
			var materialJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			materialJS.set_m_flags(value);
		}-*/;

		public native int getFlags() /*-{
			var materialJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return materialJS.get_m_flags();
		}-*/;
	}
}
