package com.badlogic.gdx.physics.bullet.linearmath;

public class LinearMath implements LinearMathConstants
{

	public static native int btGetVersion() /*-{
		return $wnd.Ammo.myClassHelper.prototype.getBTVersion();
	}-*/;
}
