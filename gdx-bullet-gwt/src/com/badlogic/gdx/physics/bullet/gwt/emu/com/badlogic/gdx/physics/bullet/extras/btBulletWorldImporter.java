package com.badlogic.gdx.physics.bullet.extras;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import com.badlogic.gdx.physics.bullet.dynamics.btDynamicsWorld;
import com.badlogic.gdx.utils.BufferUtils;
import com.google.gwt.core.client.JavaScriptObject;

public class btBulletWorldImporter extends btWorldImporter {
	
	public btBulletWorldImporter(btDynamicsWorld world) {
		jsObject = createObj(world);
	}
	
	private native JavaScriptObject createObj(btDynamicsWorld world) /*-{
		var worldJS = world.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.jsBulletWorldImporter(worldJS);
		obj.createRigidBody = function(isDynamic, mass, startTransform, shape, bodyName)
		{
			
			var works = 0;
			
		}
		
		obj.javaObject = this;
		return obj;
	}-*/;
	
	public boolean loadFile(final com.badlogic.gdx.files.FileHandle fileHandle) {
		final int len = (int) fileHandle.length();
		if (len <= 0)
			throw new com.badlogic.gdx.utils.GdxRuntimeException("Incorrect file specified");
		java.nio.ByteBuffer buff = BufferUtils.newByteBuffer(len);
		buff.put(fileHandle.readBytes());
		buff.position(0);
		boolean result = loadFileFromMemory(buff, len);
//		com.badlogic.gdx.utils.BufferUtils.disposeUnsafeByteBuffer(buff);
		return result;
	}

	public boolean loadFileFromMemory(java.nio.ByteBuffer memoryBuffer, int len) {
		//assert memoryBuffer.isDirect() : "Buffer must be allocated direct.";
		{
			return loadFileBuffer(memoryBuffer, len);
		}
	}
	
	
	public native boolean loadFileBuffer(java.nio.ByteBuffer memoryBuffer, int len) /*-{ 
		var importerJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var verticesArray = memoryBuffer.@java.nio.DirectReadWriteByteBuffer::getTypedArray()();
		var bytesN = verticesArray.BYTES_PER_ELEMENT;
		var nDataBytes1 = verticesArray.length * bytesN;
		var dataPtr1 = $wnd.Ammo._malloc(len);
		var dataHeap1 = new Uint8Array($wnd.Ammo.HEAPU8.buffer, dataPtr1, len);
		dataHeap1.set(new Uint8Array(verticesArray.buffer));
		importerJS.loadFileFromMemory(dataHeap1.byteOffset, len);
		//importerJS.loadFileFromMemory(verticesArray, len);
		return false;
	}-*/;

}
