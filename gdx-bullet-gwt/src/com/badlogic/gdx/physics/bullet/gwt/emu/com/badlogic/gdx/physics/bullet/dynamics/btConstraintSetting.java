package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.google.gwt.core.client.JavaScriptObject;

public class btConstraintSetting extends BulletBase
{
	public btConstraintSetting()
	{
		jsObject = createObj();
	}
	
	private native JavaScriptObject createObj() /*-{
		var obj = new $wnd.Ammo.btConstraintSetting();
		return obj;
	}-*/;

	public native void setTau(float value) /*-{
		var conSettingsJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		conSettingsJS.set_m_tau(value);
	}-*/;

	public native float getTau() /*-{
		var conSettingsJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		conSettingsJS.get_m_tau();
	}-*/;

	public native void setDamping(float value) /*-{
		var conSettingsJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		conSettingsJS.set_m_damping(value);
	}-*/;

	public native float getDamping() /*-{
		var conSettingsJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		conSettingsJS.get_m_damping();
	}-*/;

	public native void setImpulseClamp(float value) /*-{
		var conSettingsJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		conSettingsJS.set_m_impulseClamp(value);
	}-*/;

	public native float getImpulseClamp() /*-{
		var conSettingsJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		conSettingsJS.get_m_impulseClamp();
	}-*/;
}
