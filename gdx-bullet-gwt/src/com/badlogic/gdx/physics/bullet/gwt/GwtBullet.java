package com.badlogic.gdx.physics.bullet.gwt;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

public class GwtBullet
{
	static boolean init;
	
	public static void init()
	{
		if(init)
			return;
		init = true;
		
		String javaScript = "ammo.js";
		
		final String js = GWT.getModuleBaseForStaticFiles() + javaScript;

		ScriptInjector.fromUrl(js).setCallback(new Callback<Void, Exception>()
		{
			@Override
			public void onFailure(Exception e)
			{
				GWT.log("inject " + js + " failure " + e);
			}

			@Override
			public void onSuccess(Void ok)
			{
			}
		}).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}
}
