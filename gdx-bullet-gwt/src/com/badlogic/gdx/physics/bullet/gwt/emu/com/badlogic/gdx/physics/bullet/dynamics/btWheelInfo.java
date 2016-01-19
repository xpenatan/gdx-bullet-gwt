package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btTransform;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;

public class btWheelInfo extends BulletBase {
	
	public btWheelInfo() {
		
	}
	
	public native void setRaycastInfo(btWheelInfo.RaycastInfo value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var infoJS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_raycastInfo(infoJS);
	}-*/;

	public native btWheelInfo.RaycastInfo getRaycastInfo() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tempInfo = @com.badlogic.gdx.physics.bullet.Bullet::TMP_RaycastInfo_1;
		tempInfo.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = wheelInfoJS.get_m_raycastInfo();
		return tempInfo;
	}-*/;

	public native void setWorldTransform(btTransform value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var transformJS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_worldTransform(transformJS);
	}-*/;

	public native btTransform getWorldTransform() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpTransform = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btTransform_1;
		tmpTransform.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = wheelInfoJS.get_m_worldTransform();
		return tmpTransform;
	}-*/;

	public native void setChassisConnectionPointCS(btVector3 value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector1 = wheelInfoJS.get_m_chassisConnectionPointCS(); // FIXME dont know if this will work because its a value and not a ref.
		tmpbtVector1.setValue(value.@com.badlogic.gdx.math.Vector3::x, value.@com.badlogic.gdx.math.Vector3::y, value.@com.badlogic.gdx.math.Vector3::z);
	}-*/;

	public native btVector3 getChassisConnectionPointCS() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vectorJS = wheelInfoJS.get_m_chassisConnectionPointCS();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = vectorJS.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = vectorJS.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = vectorJS.z();
		return tmpVector3;
	}-*/;

	public native void setWheelDirectionCS(btVector3 value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector1 = wheelInfoJS.get_m_wheelDirectionCS(); // FIXME dont know if this will work because its a value and not a ref.
		tmpbtVector1.setValue(value.@com.badlogic.gdx.math.Vector3::x, value.@com.badlogic.gdx.math.Vector3::y, value.@com.badlogic.gdx.math.Vector3::z);
	}-*/;

	public native btVector3 getWheelDirectionCS() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vectorJS = wheelInfoJS.get_m_wheelDirectionCS();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = vectorJS.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = vectorJS.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = vectorJS.z();
		return tmpVector3;
	}-*/;

	public native void setWheelAxleCS(btVector3 value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpbtVector1 = wheelInfoJS.get_m_wheelAxleCS(); // FIXME dont know if this will work because its a value and not a ref.
		tmpbtVector1.setValue(value.@com.badlogic.gdx.math.Vector3::x, value.@com.badlogic.gdx.math.Vector3::y, value.@com.badlogic.gdx.math.Vector3::z);
	}-*/;

	public native btVector3 getWheelAxleCS() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vectorJS = wheelInfoJS.get_m_wheelAxleCS();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = vectorJS.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = vectorJS.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = vectorJS.z();
		return tmpVector3;
	}-*/;

	public native void setMaxSuspensionTravelCm(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_maxSuspensionTravelCm(value);
	}-*/;

	public native float getMaxSuspensionTravelCm() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_maxSuspensionTravelCm();
	}-*/;

	public native void setSuspensionRestLength1(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_suspensionRestLength1(value);
	}-*/;
	
	public native float getSuspensionRestLength1() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_suspensionRestLength1();
	}-*/;
	
//	public native float getSuspensionRestLength() /*-{
//		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
//		return wheelInfoJS.get_m_suspensionRestLength1();
//	}-*/;

	public native void setWheelsRadius(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_wheelsRadius(value);
	}-*/;

	public native float getWheelsRadius() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_wheelsRadius();
	}-*/;

	public native void setSuspensionStiffness(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_suspensionStiffness(value);
	}-*/;

	public native float getSuspensionStiffness() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_suspensionStiffness();
	}-*/;

	public native void setWheelsDampingCompression(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_wheelsDampingCompression(value);
	}-*/;

	public native float getWheelsDampingCompression() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_wheelsDampingCompression();
	}-*/;

	public native void setWheelsDampingRelaxation(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_wheelsDampingRelaxation(value);
	}-*/;

	public native float getWheelsDampingRelaxation() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_wheelsDampingRelaxation();
	}-*/;

	public native void setFrictionSlip(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_frictionSlip(value);
	}-*/;

	public native float getFrictionSlip() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_frictionSlip();
	}-*/;

	public native void setSteering(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_steering(value);
	}-*/;

	public native float getSteering() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_steering();
	}-*/;

	public native void setRotation(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_rotation(value);
	}-*/;

	public native float getRotation() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_rotation();
	}-*/;

	public native void setDeltaRotation(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_deltaRotation(value);
	}-*/;

	public native float getDeltaRotation() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_deltaRotation();
	}-*/;

	public native void setRollInfluence(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_rollInfluence(value);
	}-*/;

	public native float getRollInfluence() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_rollInfluence();
	}-*/;

	public native void setMaxSuspensionForce(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_maxSuspensionForce(value);
	}-*/;

	public native float getMaxSuspensionForce() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_maxSuspensionForce();
	}-*/;

	public native void setEngineForce(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_engineForce(value);
	}-*/;

	public native float getEngineForce() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_engineForce();
	}-*/;

	public native void setBrake(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_brake(value);
	}-*/;

	public native float getBrake() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_brake();
	}-*/;

	public native void setBIsFrontWheel(boolean value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_bIsFrontWheel(value);
	}-*/;

	public native boolean getBIsFrontWheel() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_bIsFrontWheel();
	}-*/;

	public native void setClientInfo(int value) /*-{
	}-*/;

	public native int getClientInfo() /*-{
		return null;
	}-*/;

	public native void updateWheel(btRigidBody chassis, btWheelInfo.RaycastInfo raycastInfo) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var chassisJS = chassis.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var raycastInfoJS = raycastInfo.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.updateWheel(chassisJS, raycastInfoJS);
	}-*/;

	public native void setClippedInvContactDotSuspension(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_clippedInvContactDotSuspension(value);
	}-*/;

	public native float getClippedInvContactDotSuspension() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_clippedInvContactDotSuspension();
	}-*/;

	public native void setSuspensionRelativeVelocity(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_suspensionRelativeVelocity(value);
	}-*/;

	public native float getSuspensionRelativeVelocity() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_suspensionRelativeVelocity();
	}-*/;

	public native void setWheelsSuspensionForce(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_wheelsSuspensionForce(value);
	}-*/;

	public native float getWheelsSuspensionForce() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_wheelsSuspensionForce();
	}-*/;

	public native void setSkidInfo(float value) /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		wheelInfoJS.set_m_skidInfo(value);
	}-*/;

	public native float getSkidInfo() /*-{
		var wheelInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return wheelInfoJS.get_m_skidInfo();
	}-*/;
	
	
	static public class RaycastInfo extends BulletBase
	{
		public RaycastInfo(){
		}
		
		public native void setContactNormalWS(btVector3 value) /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var tmpbtVector1 = rayInfoJs.get_m_contactNormalWS(); // FIXME dont know if this will work because its a value and not a ref.
			tmpbtVector1.setValue(value.@com.badlogic.gdx.math.Vector3::x, value.@com.badlogic.gdx.math.Vector3::y, value.@com.badlogic.gdx.math.Vector3::z);
		}-*/;

		public native btVector3 getContactNormalWS() /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var vectorJS = rayInfoJs.get_m_contactNormalWS();
			var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			tmpVector3.@com.badlogic.gdx.math.Vector3::x = vectorJS.x();
			tmpVector3.@com.badlogic.gdx.math.Vector3::y = vectorJS.y();
			tmpVector3.@com.badlogic.gdx.math.Vector3::z = vectorJS.z();
			return tmpVector3;
		}-*/;

		public native void setContactPointWS(btVector3 value) /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var tmpbtVector1 = rayInfoJs.get_m_contactPointWS();
			tmpbtVector1.setValue(value.@com.badlogic.gdx.math.Vector3::x, value.@com.badlogic.gdx.math.Vector3::y, value.@com.badlogic.gdx.math.Vector3::z);
		}-*/;

		public native btVector3 getContactPointWS() /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var vectorJS = rayInfoJs.get_m_contactPointWS();
			var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			tmpVector3.@com.badlogic.gdx.math.Vector3::x = vectorJS.x();
			tmpVector3.@com.badlogic.gdx.math.Vector3::y = vectorJS.y();
			tmpVector3.@com.badlogic.gdx.math.Vector3::z = vectorJS.z();
			return tmpVector3;
		}-*/;

		public native void setSuspensionLength(float value) /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			rayInfoJS.set_m_suspensionLength(value);
		}-*/;

		public native float getSuspensionLength() /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return rayInfoJS.get_m_suspensionLength();
		}-*/;

		public native void setHardPointWS(btVector3 value) /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var tmpbtVector1 = rayInfoJs.get_m_hardPointWS();
			tmpbtVector1.setValue(value.@com.badlogic.gdx.math.Vector3::x, value.@com.badlogic.gdx.math.Vector3::y, value.@com.badlogic.gdx.math.Vector3::z);
		}-*/;

		public native btVector3 getHardPointWS() /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var vectorJS = rayInfoJs.get_m_hardPointWS();
			var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			tmpVector3.@com.badlogic.gdx.math.Vector3::x = vectorJS.x();
			tmpVector3.@com.badlogic.gdx.math.Vector3::y = vectorJS.y();
			tmpVector3.@com.badlogic.gdx.math.Vector3::z = vectorJS.z();
			return tmpVector3;
		}-*/;

		public native void setWheelDirectionWS(btVector3 value) /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var tmpbtVector1 = rayInfoJs.get_m_wheelDirectionWS();
			tmpbtVector1.setValue(value.@com.badlogic.gdx.math.Vector3::x, value.@com.badlogic.gdx.math.Vector3::y, value.@com.badlogic.gdx.math.Vector3::z);
		}-*/;

		public native btVector3 getWheelDirectionWS() /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var vectorJS = rayInfoJs.get_m_wheelDirectionWS();
			var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			tmpVector3.@com.badlogic.gdx.math.Vector3::x = vectorJS.x();
			tmpVector3.@com.badlogic.gdx.math.Vector3::y = vectorJS.y();
			tmpVector3.@com.badlogic.gdx.math.Vector3::z = vectorJS.z();
			return tmpVector3;
		}-*/;

		public native void setWheelAxleWS(btVector3 value) /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var tmpbtVector1 = rayInfoJs.get_m_wheelDirectionWS();
			tmpbtVector1.setValue(value.@com.badlogic.gdx.math.Vector3::x, value.@com.badlogic.gdx.math.Vector3::y, value.@com.badlogic.gdx.math.Vector3::z);
		}-*/;

		public native btVector3 getWheelAxleWS() /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			var vectorJS = rayInfoJs.get_m_wheelAxleWS();
			var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
			tmpVector3.@com.badlogic.gdx.math.Vector3::x = vectorJS.x();
			tmpVector3.@com.badlogic.gdx.math.Vector3::y = vectorJS.y();
			tmpVector3.@com.badlogic.gdx.math.Vector3::z = vectorJS.z();
			return tmpVector3;
		}-*/;

		public native void setIsInContact(boolean value) /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			rayInfoJs.set_m_isInContact(value);
		}-*/;

		public native boolean getIsInContact() /*-{
			var rayInfoJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
			return rayInfoJs.get_m_isInContact();
		}-*/;

		public native void setGroundObject(int value) /*-{
		}-*/;

		public native int getGroundObject() /*-{
			return 0;
		}-*/;
	}
}
