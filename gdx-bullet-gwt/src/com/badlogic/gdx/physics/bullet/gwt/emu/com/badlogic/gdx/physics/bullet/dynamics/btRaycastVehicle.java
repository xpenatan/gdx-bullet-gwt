package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btRaycastVehicle extends btActionInterface
{

	public btRaycastVehicle(btRaycastVehicle.btVehicleTuning tuning, btRigidBody chassis, btVehicleRaycaster raycaster) {
		jsObject = createObj(tuning, chassis, raycaster);
	}
	
	private native JavaScriptObject createObj(btRaycastVehicle.btVehicleTuning tuning, btRigidBody chassis, btVehicleRaycaster raycaster) /*-{
		var tuningJS = tuning.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var chassisJS = chassis.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var btVehicleRaycasterJS = raycaster.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var obj = new $wnd.Ammo.btRaycastVehicle(tuningJS, chassisJS, btVehicleRaycasterJS);
		obj.javaObject = this;
		return obj;
	}-*/;

	public native Matrix4 getChassisWorldTransform() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var transformJS = vehicleJS.getChassisWorldTransform();
		var tmpMatrix4 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Matrix4_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::getTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(transformJS, tmpMatrix4);
		return tmpMatrix4;
	}-*/;

	public native float rayCast(btWheelInfo wheel) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var wheelJS = wheel.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vehicleJS.updateVehicle(wheelJS);
	}-*/;

	public native void updateVehicle(float step) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.updateVehicle(step);
	}-*/;

	public native void resetSuspension() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	}-*/;

	public native float getSteeringValue(int wheel) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vehicleJS.getSteeringValue(wheel);
	}-*/;

	public native void setSteeringValue(float steering, int wheel) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.setSteeringValue(steering, wheel);
	}-*/;

	public native void applyEngineForce(float force, int wheel) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.applyEngineForce(force, wheel);
	}-*/;

	public native Matrix4 getWheelTransformWS(int wheelIndex) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var transformJS = vehicleJS.getWheelTransformWS(wheelIndex);
		var tmpMatrix4 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Matrix4_1;
		@com.badlogic.gdx.physics.bullet.linearmath.btTransform::getTransform(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/badlogic/gdx/math/Matrix4;)(transformJS, tmpMatrix4);
		return tmpMatrix4;
	}-*/;

	public native void updateWheelTransform(int wheelIndex, boolean interpolatedTransform) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.updateWheelTransform(wheelIndex, interpolatedTransform);
	}-*/;

	public native void updateWheelTransform(int wheelIndex) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.updateWheelTransform(wheelIndex);
	}-*/;

	public native btWheelInfo addWheel(Vector3 connectionPointCS0, Vector3 wheelDirectionCS0, Vector3 wheelAxleCS, float suspensionRestLength, float wheelRadius, btRaycastVehicle.btVehicleTuning tuning, boolean isFrontWheel) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tuningJS = tuning.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(connectionPointCS0.@com.badlogic.gdx.math.Vector3::x, connectionPointCS0.@com.badlogic.gdx.math.Vector3::y, connectionPointCS0.@com.badlogic.gdx.math.Vector3::z);
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(wheelDirectionCS0.@com.badlogic.gdx.math.Vector3::x, wheelDirectionCS0.@com.badlogic.gdx.math.Vector3::y, wheelDirectionCS0.@com.badlogic.gdx.math.Vector3::z);
		var tmpbtVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_3;
		tmpbtVector3.setValue(wheelAxleCS.@com.badlogic.gdx.math.Vector3::x, wheelAxleCS.@com.badlogic.gdx.math.Vector3::y, wheelAxleCS.@com.badlogic.gdx.math.Vector3::z);
		var wheelInfoJS = vehicleJS.addWheel(tmpbtVector1, tmpbtVector2, tmpbtVector3, suspensionRestLength, wheelRadius, tuningJS, isFrontWheel);
		var tempInfo = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btWheelInfo_1;
		tempInfo.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = wheelInfoJS;
		return tempInfo;
	}-*/;

	public native int getNumWheels() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vehicleJS.getNumWheels();
	}-*/;

	public native btWheelInfo getWheelInfo(int index) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var btWheelInfoJS = vehicleJS.getWheelInfo(index);
		var tempInfo = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btWheelInfo_1;
		tempInfo.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = btWheelInfoJS;
		return tempInfo;
	}-*/;

	public native void updateWheelTransformsWS(btWheelInfo wheel, boolean interpolatedTransform) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var wheelJS = wheel.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.updateWheelTransformsWS(wheelJS, interpolatedTransform);
	}-*/;

	public native void updateWheelTransformsWS(btWheelInfo wheel) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var wheelJS = wheel.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.updateWheelTransformsWS(wheelJS);
	}-*/;

	public native void setBrake(float brake, int wheelIndex) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.setBrake(brake, wheelIndex);
	}-*/;

	public native void setPitchControl(float pitch) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.setPitchControl(pitch);
	}-*/;

	public native void updateSuspension(float deltaTime) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.updateSuspension(deltaTime);
	}-*/;

	public native void updateFriction(float timeStep) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.updateFriction(timeStep);
	}-*/;

	public native btRigidBody getRigidBody() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = vehicleJS.getRigidBody();
		bodyJS = @com.badlogic.gdx.physics.bullet.Bullet::getJavaBody(I)(bodyJS.ptr)
		return bodyJS;
	}-*/;

	public native int getRightAxis() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vehicleJS.getRightAxis();
	}-*/;

	public native int getUpAxis() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vehicleJS.getUpAxis();
	}-*/;

	public native int getForwardAxis() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vehicleJS.getForwardAxis();
	}-*/;

	public native Vector3 getForwardVector() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vectorJS = vehicleJS.getForwardVector();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = vectorJS.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = vectorJS.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = vectorJS.z();
		return tmpVector3;
	}-*/;

	public native float getCurrentSpeedKmHour() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vehicleJS.getCurrentSpeedKmHour();
	}-*/;

	public native void setCoordinateSystem(int rightIndex, int upIndex, int forwardIndex) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.setCoordinateSystem(rightIndex, upIndex, forwardIndex);
	}-*/;

	public native int getUserConstraintType() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vehicleJS.getUserConstraintType();
	}-*/;

	public native void setUserConstraintType(int userConstraintType) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.setUserConstraintType(userConstraintType);
	}-*/;

	public native void setUserConstraintId(int uid) /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		vehicleJS.setUserConstraintId(uid);
	}-*/;

	public native int getUserConstraintId() /*-{
		var vehicleJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return vehicleJS.getUserConstraintId();
	}-*/;
	
	static public class btVehicleTuning extends BulletBase {
		public btVehicleTuning() {
			jsObject = createObj();
		}
		
		private native JavaScriptObject createObj() /*-{
			var obj = new $wnd.Ammo.btVehicleTuning();
			obj.javaObject = this;
			return obj;
		}-*/;

		public native void setSuspensionStiffness(float value) /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			tuningJS.set_m_suspensionStiffness(value);
		}-*/;

		public native float getSuspensionStiffness() /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return tuningJS.get_m_suspensionStiffness();
		}-*/;

		public native void setSuspensionCompression(float value) /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			tuningJS.set_m_suspensionCompression(value);
		}-*/;

		public native float getSuspensionCompression() /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return tuningJS.get_m_suspensionCompression();
		}-*/;

		public native void setSuspensionDamping(float value) /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			tuningJS.set_m_suspensionDamping(value);
		}-*/;

		public native float getSuspensionDamping() /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return tuningJS.get_m_suspensionDamping();
		}-*/;

		public native void setMaxSuspensionTravelCm(float value) /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			tuningJS.set_m_maxSuspensionTravelCm(value);
		}-*/;

		public native float getMaxSuspensionTravelCm() /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return tuningJS.get_m_maxSuspensionTravelCm();
		}-*/;

		public native void setFrictionSlip(float value) /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			tuningJS.set_m_frictionSlip(value);
		}-*/;

		public native float getFrictionSlip() /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return tuningJS.get_m_frictionSlip();
		}-*/;

		public native void setMaxSuspensionForce(float value) /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			tuningJS.set_m_maxSuspensionForce(value);
		}-*/;

		public native float getMaxSuspensionForce() /*-{
			var tuningJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return tuningJS.get_m_maxSuspensionForce();
		}-*/;
	}
}
