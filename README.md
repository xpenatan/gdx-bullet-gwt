# gdx-bullet-gwt
Bullet extension for libgdx html5

First of all it would be nice if you help building ammo.js from source by adding missing implementation.  

This extension emulate java bullet extension to use ammo.js instead of c++ jni. If a error pops in its because the class/method is not yet implemented or ammo.js dont have the class/methods. Any optimization and adding missing implementation is welcome. 

If you going to help try to keep js calls as low as possible because there is a weird error "Maximum call stack size exceeded" that can occur. 

You will need to work with Gdx sources.

# Instructions
1 - GwtBullet.init() needs to be called before return ApplicationListener at getApplicationListener().  
2 - Have to place bullet.gwt.xml file in gdx-bullet project at com.badlogic.gdx.physics.  
3 - Have to include \<inherits name="com.badlogic.gdx.physics.bullet.bullet-gwt"/> in gwt.xml file.  
4 - For gdx-tests-gwt to work you need to remove System.load and LinearMath.btGetVersion() from BaseBulletTest.java.

# Gdx-test-demo
https://xpenatan.github.io/gdx-bullet-gwt/
