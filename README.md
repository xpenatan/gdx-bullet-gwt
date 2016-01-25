# gdx-bullet-gwt
Bullet extension for libgdx html5

This extension emulate java bullet extension to use ammo.js instead of c++ jni. If a error pops in its because the class/method is not yet emulated. Any optimization and adding missing implementation is welcome. 

If you going to help try to keep js calls as low as possible because there is a weird error "Maximum call stack size exceeded" that can occur. 

You will need to work with Gdx sources.

**Ammo source have been changed to work with libgdx. Going to upload it soon.**

# Instructions
1 - GwtBullet.init() needs to be called before return ApplicationListener at getApplicationListener().  
2 - Have to place bullet.gwt.xml file in gdx-bullet project at com.badlogic.gdx.physics.  
3 - Have to include \<inherits name="com.badlogic.gdx.physics.bullet.bullet-gwt"/> in gwt.xml file.  
4 - For gdx-tests-gwt to work you need to remove System.load from BaseBulletTest.java.

# Demos
* [XpeEngine](https://xpenatan.github.io/XpeEngine/) ([link](https://www.youtube.com/watch?v=TAwMsJMaEC0))
* [gdx-tests](http://xpenatan.github.io/gdx-bullet-gwt/gdx-tests/) ([link](https://github.com/libgdx/libgdx)) (ImportTest and SoftMeshTest not included becuase it crash)
* [GdxDemo3D](http://xpenatan.github.io/gdx-bullet-gwt/GdxDemo3D/) ([link](https://github.com/jsjolund/GdxDemo3D)) (Experimental. FPS increase if you change house level view)


