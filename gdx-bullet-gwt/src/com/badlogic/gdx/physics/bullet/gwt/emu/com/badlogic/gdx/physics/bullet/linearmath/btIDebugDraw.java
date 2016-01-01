package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Disposable;

public class btIDebugDraw implements Disposable
{

	public void drawContactPoint(Vector3 PointOnB, Vector3 normalOnB, float distance, int lifeTime, Vector3 color)
	{
	}

	public void draw3dText(Vector3 location, String textString)
	{
	}

	public void reportErrorWarning(String warningString)
	{
	}

	public void drawTriangle(Vector3 v0, Vector3 v1, Vector3 v2, Vector3 arg3, Vector3 arg4, Vector3 arg5, Vector3 color, float alpha)
	{
	}

	public void drawTriangle(Vector3 v0, Vector3 v1, Vector3 v2, Vector3 color, float arg4)
	{
	}

	public void drawTransform(Matrix4 transform, float orthoLen)
	{
	}

	public void drawLine(Vector3 from, Vector3 to, Vector3 color)
	{
		

	}

	public void drawBox(Vector3 bbMin, Vector3 bbMax, Vector3 color)
	{
//		drawLine(btVector3(bbMin[0], bbMin[1], bbMin[2]), btVector3(bbMax[0], bbMin[1], bbMin[2]), color);
//		drawLine(btVector3(bbMax[0], bbMin[1], bbMin[2]), btVector3(bbMax[0], bbMax[1], bbMin[2]), color);
//		drawLine(btVector3(bbMax[0], bbMax[1], bbMin[2]), btVector3(bbMin[0], bbMax[1], bbMin[2]), color);
//		drawLine(btVector3(bbMin[0], bbMax[1], bbMin[2]), btVector3(bbMin[0], bbMin[1], bbMin[2]), color);
//		drawLine(btVector3(bbMin[0], bbMin[1], bbMin[2]), btVector3(bbMin[0], bbMin[1], bbMax[2]), color);
//		drawLine(btVector3(bbMax[0], bbMin[1], bbMin[2]), btVector3(bbMax[0], bbMin[1], bbMax[2]), color);
//		drawLine(btVector3(bbMax[0], bbMax[1], bbMin[2]), btVector3(bbMax[0], bbMax[1], bbMax[2]), color);
//		drawLine(btVector3(bbMin[0], bbMax[1], bbMin[2]), btVector3(bbMin[0], bbMax[1], bbMax[2]), color);
//		drawLine(btVector3(bbMin[0], bbMin[1], bbMax[2]), btVector3(bbMax[0], bbMin[1], bbMax[2]), color);
//		drawLine(btVector3(bbMax[0], bbMin[1], bbMax[2]), btVector3(bbMax[0], bbMax[1], bbMax[2]), color);
//		drawLine(btVector3(bbMax[0], bbMax[1], bbMax[2]), btVector3(bbMin[0], bbMax[1], bbMax[2]), color);
//		drawLine(btVector3(bbMin[0], bbMax[1], bbMax[2]), btVector3(bbMin[0], bbMin[1], bbMax[2]), color);
		
		
	}
	
	
	Matrix4 trans = new Matrix4();
	
	Vector3 tmp1 = new Vector3();
	Vector3 tmp2 = new Vector3();

	public void drawBox(Vector3 bbMin, Vector3 bbMax, Matrix4 trans, Vector3 color)
	{
//		trans.idt();
//		trans2.getTranslation(position)
		
		drawLine(tmp1.set(bbMin.x, bbMin.y, bbMin.z).mul(trans), tmp2.set(bbMax.x, bbMin.y, bbMin.z).mul(trans), color);
		drawLine(tmp1.set(bbMax.x, bbMin.y, bbMin.z).mul(trans), tmp2.set(bbMax.x, bbMax.y, bbMin.z).mul(trans), color);
		drawLine(tmp1.set(bbMax.x, bbMax.y, bbMin.z).mul(trans), tmp2.set(bbMin.x, bbMax.y, bbMin.z).mul(trans), color);
		drawLine(tmp1.set(bbMin.x, bbMax.y, bbMin.z).mul(trans), tmp2.set(bbMin.x, bbMin.y, bbMin.z).mul(trans), color);
		drawLine(tmp1.set(bbMin.x, bbMin.y, bbMin.z).mul(trans), tmp2.set(bbMin.x, bbMin.y, bbMax.z).mul(trans), color);
		drawLine(tmp1.set(bbMax.x, bbMin.y, bbMin.z).mul(trans), tmp2.set(bbMax.x, bbMin.y, bbMax.z).mul(trans), color);
		drawLine(tmp1.set(bbMax.x, bbMax.y, bbMin.z).mul(trans), tmp2.set(bbMax.x, bbMax.y, bbMax.z).mul(trans), color);
		drawLine(tmp1.set(bbMin.x, bbMax.y, bbMin.z).mul(trans), tmp2.set(bbMin.x, bbMax.y, bbMax.z).mul(trans), color);
		drawLine(tmp1.set(bbMin.x, bbMin.y, bbMax.z).mul(trans), tmp2.set(bbMax.x, bbMin.y, bbMax.z).mul(trans), color);
		drawLine(tmp1.set(bbMax.x, bbMin.y, bbMax.z).mul(trans), tmp2.set(bbMax.x, bbMax.y, bbMax.z).mul(trans), color);
		drawLine(tmp1.set(bbMax.x, bbMax.y, bbMax.z).mul(trans), tmp2.set(bbMin.x, bbMax.y, bbMax.z).mul(trans), color);
		drawLine(tmp1.set(bbMin.x, bbMax.y, bbMax.z).mul(trans), tmp2.set(bbMin.x, bbMin.y, bbMax.z).mul(trans), color);
	}

	public int getDebugMode()
	{
		//		return LinearMathJNI.btIDebugDraw_getDebugMode(swigCPtr, this);
		return 0;
	}

	public void setDebugMode(int debugMode)
	{
	}

	@Override
	public void dispose()
	{
	}

	public final static class DebugDrawModes
	{
		public final static int DBG_NoDebug = 0;
		public final static int DBG_DrawWireframe = 1;
		public final static int DBG_DrawAabb = 2;
		public final static int DBG_DrawFeaturesText = 4;
		public final static int DBG_DrawContactPoints = 8;
		public final static int DBG_NoDeactivation = 16;
		public final static int DBG_NoHelpText = 32;
		public final static int DBG_DrawText = 64;
		public final static int DBG_ProfileTimings = 128;
		public final static int DBG_EnableSatComparison = 256;
		public final static int DBG_DisableBulletLCP = 512;
		public final static int DBG_EnableCCD = 1024;
		public final static int DBG_DrawConstraints = (1 << 11);
		public final static int DBG_DrawConstraintLimits = (1 << 12);
		public final static int DBG_FastWireframe = (1 << 13);
		public final static int DBG_DrawNormals = (1 << 14);
		public final static int DBG_DrawFrames = (1 << 15);
		public final static int DBG_MAX_DEBUG_DRAW_MODE = DBG_DrawFrames + 1;
	}
}
