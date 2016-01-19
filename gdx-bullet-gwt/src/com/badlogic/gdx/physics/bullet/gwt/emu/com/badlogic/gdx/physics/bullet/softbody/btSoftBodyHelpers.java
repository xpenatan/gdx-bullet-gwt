package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;

public class btSoftBodyHelpers extends BulletBase {
	
	
	public static native void Draw(btSoftBody psb, btIDebugDraw idraw, int drawflags) /*-{
	}-*/;

	public static native void Draw(btSoftBody psb, btIDebugDraw idraw) /*-{
	}-*/;

	public static native void DrawInfos(btSoftBody psb, btIDebugDraw idraw, boolean masses, boolean areas, boolean stress) /*-{
	}-*/;

	public static native void DrawNodeTree(btSoftBody psb, btIDebugDraw idraw, int mindepth, int maxdepth) /*-{
	}-*/;

	public static native void DrawNodeTree(btSoftBody psb, btIDebugDraw idraw, int mindepth) /*-{
	}-*/;

	public static native void DrawNodeTree(btSoftBody psb, btIDebugDraw idraw) /*-{
	}-*/;

	public static native void DrawFaceTree(btSoftBody psb, btIDebugDraw idraw, int mindepth, int maxdepth) /*-{
	}-*/;

	public static native void DrawFaceTree(btSoftBody psb, btIDebugDraw idraw, int mindepth) /*-{
	}-*/;

	public static native void DrawFaceTree(btSoftBody psb, btIDebugDraw idraw) /*-{
	}-*/;

	public static native void DrawClusterTree(btSoftBody psb, btIDebugDraw idraw, int mindepth, int maxdepth) /*-{
	}-*/;

	public static native void DrawClusterTree(btSoftBody psb, btIDebugDraw idraw, int mindepth) /*-{
	}-*/;

	public static native void DrawClusterTree(btSoftBody psb, btIDebugDraw idraw) /*-{
	}-*/;

	public static native void DrawFrame(btSoftBody psb, btIDebugDraw idraw) /*-{
	}-*/;

	public static native btSoftBody CreateRope(btSoftBodyWorldInfo worldInfo, Vector3 from, Vector3 to, int res, int fixeds) /*-{
		return null;
	}-*/;

	public static native btSoftBody CreatePatch(btSoftBodyWorldInfo worldInfo, Vector3 corner00, Vector3 corner10, Vector3 corner01, Vector3 corner11, int resx, int resy, int fixeds, boolean gendiags) /*-{
		var worldInfoJS = worldInfo.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(corner00.@com.badlogic.gdx.math.Vector3::x,corner00.@com.badlogic.gdx.math.Vector3::y,corner00.@com.badlogic.gdx.math.Vector3::z);
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(corner10.@com.badlogic.gdx.math.Vector3::x,corner10.@com.badlogic.gdx.math.Vector3::y,corner10.@com.badlogic.gdx.math.Vector3::z);
		var tmpbtVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_3;
		tmpbtVector3.setValue(corner01.@com.badlogic.gdx.math.Vector3::x,corner01.@com.badlogic.gdx.math.Vector3::y,corner01.@com.badlogic.gdx.math.Vector3::z);
		var tmpbtVector4 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_4;
		tmpbtVector4.setValue(corner11.@com.badlogic.gdx.math.Vector3::x,corner11.@com.badlogic.gdx.math.Vector3::y,corner11.@com.badlogic.gdx.math.Vector3::z);
		var softBodyJS = $wnd.Ammo.btSoftBodyHelpers.prototype.CreatePatch(worldInfoJS, tmpbtVector1, tmpbtVector2, tmpbtVector3, tmpbtVector4, resx, resy, fixeds, gendiags);
		var softBodyJava = @com.badlogic.gdx.physics.bullet.softbody.btSoftBody::new()();
		softBodyJava.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = softBodyJS;
		softBodyJava.@com.badlogic.gdx.physics.bullet.collision.btCollisionObject::internalSetGdxBridge();
		return softBodyJava;
	}-*/;

	public static btSoftBody CreatePatchUV(btSoftBodyWorldInfo worldInfo, Vector3 corner00, Vector3 corner10, Vector3 corner01, Vector3 corner11, int resx, int resy, int fixeds, boolean gendiags, java.nio.FloatBuffer tex_coords)
	{
		assert tex_coords.isDirect() : "Buffer must be allocated direct.";
		{
			return null;
		}
	}

	public static native btSoftBody CreatePatchUV(btSoftBodyWorldInfo worldInfo, Vector3 corner00, Vector3 corner10, Vector3 corner01, Vector3 corner11, int resx, int resy, int fixeds, boolean gendiags) /*-{
		return null;
	}-*/;

	public static native float CalculateUV(int resx, int resy, int ix, int iy, int id) /*-{
		return null;
	}-*/;

	public static native btSoftBody CreateEllipsoid(btSoftBodyWorldInfo worldInfo, Vector3 center, Vector3 radius, int res) /*-{
		return null;
	}-*/;

	public static btSoftBody CreateFromTriMesh(btSoftBodyWorldInfo worldInfo, java.nio.FloatBuffer vertices, java.nio.IntBuffer triangles, int ntriangles, boolean randomizeConstraints)
	{
		assert vertices.isDirect() : "Buffer must be allocated direct.";
		assert triangles.isDirect() : "Buffer must be allocated direct.";
		{
			return null;
		}
	}

	public static btSoftBody CreateFromTriMesh(btSoftBodyWorldInfo worldInfo, java.nio.FloatBuffer vertices, java.nio.IntBuffer triangles, int ntriangles)
	{
		assert vertices.isDirect() : "Buffer must be allocated direct.";
		assert triangles.isDirect() : "Buffer must be allocated direct.";
		{
			return null;
		}
	}

	public static native btSoftBody CreateFromConvexHull(btSoftBodyWorldInfo worldInfo, btVector3 vertices, int nvertices, boolean randomizeConstraints) /*-{
		return null;
	}-*/;

	public static native btSoftBody CreateFromConvexHull(btSoftBodyWorldInfo worldInfo, btVector3 vertices, int nvertices) /*-{
		return null;
	}-*/;

	public static native btSoftBody CreateFromTetGenData(btSoftBodyWorldInfo worldInfo, String ele, String face, String node, boolean bfacelinks, boolean btetralinks, boolean bfacesfromtetras) /*-{
		return null;
	}-*/;

	public static native void ReoptimizeLinkOrder(btSoftBody psb) /*-{
	}-*/;
}
