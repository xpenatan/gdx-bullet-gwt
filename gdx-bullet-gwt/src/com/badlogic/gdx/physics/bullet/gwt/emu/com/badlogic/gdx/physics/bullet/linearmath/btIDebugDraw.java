package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
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
	Vector3 tmp3 = new Vector3();
	Vector3 tmp4 = new Vector3();
	Vector3 tmp5 = new Vector3();
	Vector3 tmp6 = new Vector3();
	Vector3 tmp7 = new Vector3();
	Vector3 tmp8 = new Vector3();
	Vector3 tmp9 = new Vector3();

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
	
	Vector3 tmp11 = new Vector3();
	Vector3 tmp22 = new Vector3();
	Vector3 tmp33 = new Vector3();
	Vector3 tmp44 = new Vector3();
	
	public void drawSphere(float radius, Matrix4 transform, Vector3 color)
	{
		
		Vector3 center = transform.getTranslation(tmp11);
//		Vector3 up = transform.getBasis().getColumn(1);
		Vector3 up = tmp22.set(transform.val[Matrix4.M10], transform.val[Matrix4.M11], transform.val[Matrix4.M12]);

		//		Vector3 axis = transform.getBasis().getColumn(0);
		Vector3 axis = tmp33.set(transform.val[Matrix4.M00], transform.val[Matrix4.M01], transform.val[Matrix4.M02]);
		float minTh = -SIMD_HALF_PI;
		float maxTh = SIMD_HALF_PI;
		float minPs = -SIMD_HALF_PI;
		float maxPs = SIMD_HALF_PI;
		float stepDegrees = 30.f;
		
		
		drawSpherePatch(center, up, axis, radius,minTh, maxTh, minPs, maxPs, color, stepDegrees ,false);
		drawSpherePatch(center, up, tmp44.set(axis).scl(-1), radius,minTh, maxTh, minPs, maxPs, color, stepDegrees,false );
	}
	
	Matrix4 tmpM1 = new Matrix4();
	public void	drawSphere (Vector3 p, float radius, Vector3 color)
	{
		Matrix4 tr = tmpM1;
		tr.idt();
		tr.setTranslation(p);
		drawSphere(radius,tr,color);
	}

	float SIMD_PI = 3.1415926535897932384626433832795029f;
	float SIMD_2_PI = (2.0f * SIMD_PI);
	float SIMD_HALF_PI = (SIMD_PI * 0.5f);
	float SIMD_RADS_PER_DEG = (SIMD_2_PI / 360.0f);
	
	
	Vector3 [] array1 = new Vector3[74];
	Vector3 [] array2 = new Vector3[74];
	
	private void initVectors()
	{
		for(int i = 0; i < 74;i++)
		{
			array1[i] = new Vector3();
			array2[i] = new Vector3();
		}
	}
	
	void drawSpherePatch(Vector3 center, Vector3 up, Vector3 axis, float radius, float minTh, float maxTh, float minPs, float maxPs, Vector3 color, float stepDegrees, boolean drawCenter)
	{
		if(array1[0] == null)
			initVectors();
		
		Vector3 tmpUp = tmp1.set(up);
		Vector3 tmpcenter = tmp2.set(center);
		Vector3 tmpAxis = tmp3.set(axis);

		stepDegrees = 10.f;
		drawCenter = true;
		Vector3 [] pvA = array1;
		Vector3 [] pvB = array2;
		Vector3 [] pT = null; 

		tmpUp.scl(radius);
		Vector3 npole = tmp7;
		npole = npole.set(center).add(tmpUp);
		Vector3 spole = tmp8;
		spole = spole.set(center).sub(tmpUp);
		Vector3 arcStart = null;
		float step = stepDegrees * SIMD_RADS_PER_DEG;
		Vector3 kv = up;
		Vector3 iv = axis;
		Vector3 jv =  tmp9.set(kv).crs(iv);
		boolean drawN = false;
		boolean drawS = false;
		if (minTh <= -SIMD_HALF_PI)
		{
			minTh = -SIMD_HALF_PI + step;
			drawN = true;
		}
		if (maxTh >= SIMD_HALF_PI)
		{
			maxTh = SIMD_HALF_PI - step;
			drawS = true;
		}
		if (minTh > maxTh)
		{
			minTh = -SIMD_HALF_PI + step;
			maxTh = SIMD_HALF_PI - step;
			drawN = drawS = true;
		}
		int n_hor = (int) ((maxTh - minTh) / step) + 1;
		if (n_hor < 2)
			n_hor = 2;
		float step_h = (maxTh - minTh) / (n_hor - 1f);
		boolean isClosed = false;
		if (minPs > maxPs)
		{
			minPs = -SIMD_PI + step;
			maxPs = SIMD_PI;
			isClosed = true;
		}
		else if ((maxPs - minPs) >= SIMD_PI * 2.f)
		{
			isClosed = true;
		}
		else
		{
			isClosed = false;
		}
		int n_vert = (int) ((maxPs - minPs) / step) + 1;
		if (n_vert < 2)
			n_vert = 2;
		float step_v = (maxPs - minPs) / (n_vert - 1f);
		for (int i = 0; i < n_hor; i++)
		{
			float th = minTh + i * step_h;
			float sth = radius * MathUtils.sin(th);
			float cth = radius * MathUtils.cos(th);
			for (int j = 0; j < n_vert; j++)
			{
				float psi = minPs + j * step_v;
				float sps = MathUtils.sin(psi);
				float cps = MathUtils.cos(psi);
//				pvB[j] = center + cth * cps * iv + cth * sps * jv + sth * kv;
				
				pvB[j].set(center);
				
				tmp4.set(iv).scl(cps).scl(cth);
				pvB[j].add(tmp4);
				tmp4.set(jv).scl(sps).scl(cth);
				pvB[j].add(tmp4);
				tmp4.set(kv).scl(sth);
				pvB[j].add(tmp4);
				if (i != 0)
				{
					drawLine(pvA[j], pvB[j], color);
				}
				else if (drawS)
				{
					drawLine(spole, pvB[j], color);
				}
				if (j != 0)
				{
					drawLine(pvB[j - 1], pvB[j], color);
				}
				else
				{
					arcStart = pvB[j];
				}
				if ((i == (n_hor - 1)) && drawN)
				{
					drawLine(npole, pvB[j], color);
				}

				if (drawCenter)
				{
					if (isClosed)
					{
						if (j == (n_vert - 1))
						{
							drawLine(arcStart, pvB[j], color);
						}
					}
					else
					{
						if (((i == 0) || (i == (n_hor - 1))) && ((j == 0) || (j == (n_vert - 1))))
						{
							drawLine(center, pvB[j], color);
						}
					}
				}
			}
			pT = pvA;
			pvA = pvB;
			pvB = pT;
		}
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
