package com.badlogic.gdx.physics.bullet;

import java.util.Arrays;

import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.g3d.model.Node;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.collision.LocalRayResult;
import com.badlogic.gdx.physics.bullet.collision.LocalShapeInfo;
import com.badlogic.gdx.physics.bullet.collision.btBroadphasePairArray;
import com.badlogic.gdx.physics.bullet.collision.btBvhTriangleMeshShape;
import com.badlogic.gdx.physics.bullet.collision.btCollisionObjectWrapper;
import com.badlogic.gdx.physics.bullet.collision.btCollisionShape;
import com.badlogic.gdx.physics.bullet.collision.btCompoundShape;
import com.badlogic.gdx.physics.bullet.collision.btManifoldPoint;
import com.badlogic.gdx.physics.bullet.collision.btOverlappingPairCache;
import com.badlogic.gdx.physics.bullet.collision.btPersistentManifold;
import com.badlogic.gdx.physics.bullet.dynamics.btConstraintSetting;
import com.badlogic.gdx.physics.bullet.dynamics.btWheelInfo;
import com.badlogic.gdx.physics.bullet.dynamics.btWheelInfo.RaycastInfo;
import com.badlogic.gdx.physics.bullet.gwt.GwtBullet;
import com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3;
import com.badlogic.gdx.physics.bullet.linearmath.btQuaternion;
import com.badlogic.gdx.physics.bullet.linearmath.btTransform;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;
import com.badlogic.gdx.physics.bullet.softbody.btSparseSdf3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Pool;
import com.google.gwt.core.client.JavaScriptObject;


public class Bullet
{
	//***** a few javascript/java object so its not need to create for every set and get when sync java objects. They are created in CollisionWorld
	// Dont change names. Refactor dont work in JS. 
		public static JavaScriptObject TMP_btVector3js_1;
		public static JavaScriptObject TMP_btVector3js_2;
		public static JavaScriptObject TMP_btVector3js_3;
		public static JavaScriptObject TMP_btVector3js_4;
		public static JavaScriptObject TMP_btQuaternionjs_1;
		public static JavaScriptObject TMP_btTransformjs_1;
		public static JavaScriptObject TMP_btTransformjs_2;
		public static JavaScriptObject TMP_btMatrix3x3JS_1;
		
		public static Vector3 TMP_Vector3_1 = new Vector3();
		public static Vector3 TMP_Vector3_2 = new Vector3();
		public static Vector3 TMP_Vector3_3 = new Vector3();
		public static Vector3 TMP_Vector3_4 = new Vector3();
		public static btVector3 TMP_btVector3_1 = new btVector3(false);
		public static Quaternion TMP_Quaternion_1 = new Quaternion();
		public static Matrix4 TMP_Matrix4_1 = new Matrix4();
		public static Matrix3 TMP_Matrix3_1 = new Matrix3();
		public static btCollisionObjectWrapper TMP_btCollisionObjectWrapper_1 = new btCollisionObjectWrapper();
		public static btCollisionObjectWrapper TMP_btCollisionObjectWrapper_2 = new btCollisionObjectWrapper();
		public static btManifoldPoint TMP_btManifoldPoint_1 = new btManifoldPoint();
		public static btPersistentManifold TMP_btPersistentManifold_1 = new btPersistentManifold();
		public static btConstraintSetting TMP_btConstraintSetting_1 = new btConstraintSetting();
		public static btOverlappingPairCache TMP_btOverlappingPairCache_1 = new btOverlappingPairCache();
		public static btBroadphasePairArray TMP_btBroadphasePairArray_1 = new btBroadphasePairArray();
		public static btTransform TMP_btTransform_1 = new btTransform(false);
		public static btWheelInfo TMP_btWheelInfo_1 = new btWheelInfo();
		public static btWheelInfo.RaycastInfo TMP_RaycastInfo_1 = new RaycastInfo();
		public static LocalShapeInfo TMP_LocalShapeInfo_1 = new LocalShapeInfo();
		public static LocalRayResult TMP_LocalRayResult_1 = new LocalRayResult();
		public static btSparseSdf3 TMP_btSparseSdf3_1 = new btSparseSdf3();
		
	//*****
	
	public static void init()
	{
		GwtBullet.init();
	}

	public static void initVariables()
	{
		if(Bullet.TMP_btVector3js_1 == null)
			Bullet.TMP_btVector3js_1 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btVector3js_2 == null)
			Bullet.TMP_btVector3js_2 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btVector3js_3 == null)
			Bullet.TMP_btVector3js_3 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btVector3js_4 == null)
			Bullet.TMP_btVector3js_4 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btTransformjs_1 == null)
			Bullet.TMP_btTransformjs_1 = btTransform.createObj();
		if(Bullet.TMP_btTransformjs_2 == null)
			Bullet.TMP_btTransformjs_2 = btTransform.createObj();
		if(Bullet.TMP_btQuaternionjs_1 == null)
			Bullet.TMP_btQuaternionjs_1 = btQuaternion.createObj(0, 0, 0, 1);
		if(Bullet.TMP_btMatrix3x3JS_1 == null)
			Bullet.TMP_btMatrix3x3JS_1 = btMatrix3x3.createObj();
	}
	public static native void destroyJS(JavaScriptObject jsObject) /*-{
		$wnd.Ammo.destroy(jsObject);
	}-*/;
	

	public static native JavaScriptObject getJavaBody(int pointer) /*-{
		var obj;
		var obj = $wnd.Ammo.getCache($wnd.Ammo.btCollisionObject)[pointer];
		if(!obj || !obj.javaObject)	{
			obj = $wnd.Ammo.getCache($wnd.Ammo.btRigidBody)[pointer];
			if(!obj || !obj.javaObject)	{
				obj = $wnd.Ammo.getCache($wnd.Ammo.btGhostObject)[pointer];
				if(!obj || !obj.javaObject)	{
					obj = $wnd.Ammo.getCache($wnd.Ammo.btPairCachingGhostObject)[pointer];
					if(!obj || !obj.javaObject)	{
						obj = $wnd.Ammo.getCache($wnd.Ammo.btSoftBody)[pointer];
						if(!obj || !obj.javaObject)	{
							obj = $wnd.Ammo.getCache($wnd.Ammo.btMultiBodyLinkCollider)[pointer];
						}
					}
				}
			}
		}
		if(!obj)
			return null;
		return obj.javaObject;
	}-*/;
	
	public static native JavaScriptObject getJavaWorld(int pointer) /*-{
		var obj;
		var obj = $wnd.Ammo.getCache($wnd.Ammo.btDynamicsWorld)[pointer];
		if(!obj || !obj.javaObject)	{
			obj = $wnd.Ammo.getCache($wnd.Ammo.btDiscreteDynamicsWorld)[pointer];
			if(!obj || !obj.javaObject)	{
				obj = $wnd.Ammo.getCache($wnd.Ammo.btSoftRigidDynamicsWorld)[pointer];
				if(!obj || !obj.javaObject)	{
					obj = $wnd.Ammo.getCache($wnd.Ammo.btMultiBodyDynamicsWorld)[pointer];
				}
			}
		}
		if(!obj)
			return null;
		return obj.javaObject;
	}-*/;
	
	protected static class ShapePart {
		public Array<MeshPart> parts = new Array<MeshPart>();
		public Matrix4 transform = new Matrix4();
	}
	
	private final static Pool<ShapePart> shapePartPool = new Pool<ShapePart>() {
		@Override
		protected ShapePart newObject () {
			return new ShapePart();
		}
	};
	
	private final static Array<ShapePart> shapePartArray = new Array<ShapePart>();
	private final static Matrix4 idt = new Matrix4();
	private final static Matrix4 tmpM = new Matrix4();
	
	public static void getShapeParts(final Node node, final boolean applyTransform, final Array<ShapePart> out, final int offset, final Pool<ShapePart> pool) {
		final Matrix4 transform = applyTransform ? node.localTransform : idt;
		if (node.parts.size > 0) {
			ShapePart part = null;
			for (int i = offset, n = out.size; i < n; i++) {
				final ShapePart p = out.get(i);
				if (Arrays.equals(p.transform.val, transform.val))
				{
					part = p;
					break;
				}
			}
			if (part == null) {
				part = pool.obtain();
				part.parts.clear();
				part.transform.set(transform);
				out.add(part);
			}
			for (int i = 0, n = node.parts.size; i < n; i++)
				part.parts.add(node.parts.get(i).meshPart);
		}
		if (node.hasChildren())	{
			final boolean transformed = applyTransform && !Arrays.equals(transform.val, idt.val);
			final int o = transformed ? out.size : offset;
			getShapeParts(node.getChildren(), out, o, pool);
			if (transformed) {
				for (int i = o, n = out.size; i < n; i++) {
					final ShapePart part = out.get(i);
					tmpM.set(part.transform);
					part.transform.set(transform).mul(tmpM);
				}
			}
		}
	}
	
	public static <T extends Node> void getShapeParts(final Iterable<T> nodes, final Array<ShapePart> out, final int offset, final Pool<ShapePart> pool) {
		for (T node : nodes)
			getShapeParts(node, true, out, offset, pool);
	}
	
	public static btCollisionShape obtainStaticNodeShape (final Node node, final boolean applyTransform) {
		getShapeParts(node, applyTransform, shapePartArray, 0, shapePartPool);
		btCollisionShape result = obtainStaticShape(shapePartArray);
		shapePartPool.freeAll(shapePartArray);
		shapePartArray.clear();
		return result;
	}
	
	public static btCollisionShape obtainStaticNodeShape (final Array<Node> nodes) {
		getShapeParts(nodes, shapePartArray, 0, shapePartPool);
		btCollisionShape result = obtainStaticShape(shapePartArray);
		shapePartPool.freeAll(shapePartArray);
		shapePartArray.clear();
		return result;
	}
	
	public static btCollisionShape obtainStaticShape (final Array<ShapePart> parts) {
		if (parts.size == 0) return null;
		if (parts.size == 1 && Arrays.equals(parts.get(0).transform.val, idt.val))
			return btBvhTriangleMeshShape.obtain(parts.get(0).parts);
		btCompoundShape result = new btCompoundShape();
		result.obtain();
		for (int i = 0, n = parts.size; i < n; i++) {
			final btBvhTriangleMeshShape shape = btBvhTriangleMeshShape.obtain(parts.get(i).parts);
			result.addChildShape(parts.get(i).transform, shape);
			shape.release();
		}
		return result;
	}
}
