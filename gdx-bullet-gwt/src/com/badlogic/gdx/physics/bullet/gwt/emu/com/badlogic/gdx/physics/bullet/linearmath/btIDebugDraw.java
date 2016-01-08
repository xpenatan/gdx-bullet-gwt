package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btIDebugDraw extends BulletBase
{
	public btIDebugDraw()
	{
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.DebugDrawer();
		
		var self = this;
		obj.drawLine = function(vecFrom, vecTo, color) { 
			vecFrom = $wnd.Ammo.wrapPointer(vecFrom, $wnd.Ammo.btVector3);
			vecTo = $wnd.Ammo.wrapPointer(vecTo, $wnd.Ammo.btVector3);
			color = $wnd.Ammo.wrapPointer(color, $wnd.Ammo.btVector3);
			var vector3From = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			var vector3To = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_2;
			var vector3Color = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_3;
			vector3From.@com.badlogic.gdx.math.Vector3::x = vecFrom.x();
			vector3From.@com.badlogic.gdx.math.Vector3::y = vecFrom.y();
			vector3From.@com.badlogic.gdx.math.Vector3::z = vecFrom.z();
			vector3To.@com.badlogic.gdx.math.Vector3::x = vecTo.x();
			vector3To.@com.badlogic.gdx.math.Vector3::y = vecTo.y();
			vector3To.@com.badlogic.gdx.math.Vector3::z = vecTo.z();
			vector3Color.@com.badlogic.gdx.math.Vector3::x = color.x();
			vector3Color.@com.badlogic.gdx.math.Vector3::y = color.y();
			vector3Color.@com.badlogic.gdx.math.Vector3::z = color.z();
			self.@com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw::drawLine(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)(
			vector3From, vector3To, vector3Color);
		};
		
		obj.drawContactPoint = function(pointOnB, normalOnB, distance, lifeTime, color) {
			pointOnB = $wnd.Ammo.wrapPointer(pointOnB, $wnd.Ammo.btVector3);
			normalOnB = $wnd.Ammo.wrapPointer(normalOnB, $wnd.Ammo.btVector3);
			color = $wnd.Ammo.wrapPointer(color, $wnd.Ammo.btVector3);
			var vector3pointOnB = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			var vector3normalOnB = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_2;
			var vector3Color = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_3;
			vector3pointOnB.@com.badlogic.gdx.math.Vector3::x = pointOnB.x();
			vector3pointOnB.@com.badlogic.gdx.math.Vector3::y = pointOnB.y();
			vector3pointOnB.@com.badlogic.gdx.math.Vector3::z = pointOnB.z();
			vector3normalOnB.@com.badlogic.gdx.math.Vector3::x = normalOnB.x();
			vector3normalOnB.@com.badlogic.gdx.math.Vector3::y = normalOnB.y();
			vector3normalOnB.@com.badlogic.gdx.math.Vector3::z = normalOnB.z();
			vector3Color.@com.badlogic.gdx.math.Vector3::x = color.x();
			vector3Color.@com.badlogic.gdx.math.Vector3::y = color.y();
			vector3Color.@com.badlogic.gdx.math.Vector3::z = color.z();
			self.@com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw::drawContactPoint(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;FILcom/badlogic/gdx/math/Vector3;)(
			vector3pointOnB, vector3normalOnB, distance, lifeTime, vector3Color);
		};
		
		obj.drawTriangle = function(v0, v1, v2, color, alpha) { 
			v0 = $wnd.Ammo.wrapPointer(v0, $wnd.Ammo.btVector3);
			v1 = $wnd.Ammo.wrapPointer(v1, $wnd.Ammo.btVector3);
			v2 = $wnd.Ammo.wrapPointer(v2, $wnd.Ammo.btVector3);
			color = $wnd.Ammo.wrapPointer(color, $wnd.Ammo.btVector3);
			var vector3v0 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			var vector3v1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_2;
			var vector3v2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_3;
			var vector3Color = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_4;
			vector3v0.@com.badlogic.gdx.math.Vector3::x = v0.x();
			vector3v0.@com.badlogic.gdx.math.Vector3::y = v0.y();
			vector3v0.@com.badlogic.gdx.math.Vector3::z = v0.z();
			vector3v1.@com.badlogic.gdx.math.Vector3::x = v1.x();
			vector3v1.@com.badlogic.gdx.math.Vector3::y = v1.y();
			vector3v1.@com.badlogic.gdx.math.Vector3::z = v1.z();
			vector3v2.@com.badlogic.gdx.math.Vector3::x = v2.x();
			vector3v2.@com.badlogic.gdx.math.Vector3::y = v2.y();
			vector3v2.@com.badlogic.gdx.math.Vector3::z = v2.z();
			vector3Color.@com.badlogic.gdx.math.Vector3::x = color.x();
			vector3Color.@com.badlogic.gdx.math.Vector3::y = color.y();
			vector3Color.@com.badlogic.gdx.math.Vector3::z = color.z();
			self.@com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw::drawTriangle(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;F) (
				vector3v0, vector3v1, vector3v2, vector3Color, alpha
			)
		};
		
		obj.draw3dText = function(location, textString) { 
			location = $wnd.Ammo.wrapPointer(location, $wnd.Ammo.btVector3);
			var vector3location = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			vector3location.@com.badlogic.gdx.math.Vector3::x = location.x();
			vector3location.@com.badlogic.gdx.math.Vector3::y = location.y();
			vector3location.@com.badlogic.gdx.math.Vector3::z = location.z();
			self.@com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw::draw3dText(Lcom/badlogic/gdx/math/Vector3;Ljava/lang/String;)(location, textString);
		};
		obj.getDebugMode = function() { 
			return self.@com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw::getDebugMode()();
		};
		
		return obj;
	}-*/;
	
	public void drawLine (Vector3 from, Vector3 to, Vector3 color) {
	}

	public void drawContactPoint (Vector3 pointOnB, Vector3 normalOnB, float distance, int lifeTime, Vector3 color) {
	}

	public void drawTriangle (Vector3 v0, Vector3 v1, Vector3 v2, Vector3 color, float arg4) {
	}

	public void reportErrorWarning (String warningString) {
	}

	public void draw3dText (Vector3 location, String textString) {
	}

	public void setDebugMode (int debugMode){
	}

	public int getDebugMode () {
		return -1;
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
