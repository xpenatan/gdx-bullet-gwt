package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.collision.btBroadphaseInterface;
import com.badlogic.gdx.physics.bullet.collision.btCollisionConfiguration;
import com.badlogic.gdx.physics.bullet.collision.btDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class btDiscreteDynamicsWorld extends btDynamicsWorld
{
	public btDiscreteDynamicsWorld()
	{
		
	}
	public btDiscreteDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration)
	{
		this.m_dispatcher = dispatcher;
		jsObject = createObj(dispatcher, pairCache, constraintSolver, collisionConfiguration);
	}
	
	private native JavaScriptObject createObj(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) /*-{
		var dispatcherJS = dispatcher.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	  	var broadphasePairCacheJS = pairCache.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var constraintSolverJS = constraintSolver.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var collisionConfigurationJS = collisionConfiguration.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	  	var obj = new $wnd.Ammo.btDiscreteDynamicsWorld(dispatcherJS, broadphasePairCacheJS, constraintSolverJS, collisionConfigurationJS);
	  	obj.javaObject = this;
		return obj;
	}-*/;
	
	public native int stepSimulation(float timeStep, int maxSubSteps, float fixedTimeStep) /*-{
		var world = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var val =  world.stepSimulation(timeStep, maxSubSteps, fixedTimeStep);
		return val;
	}-*/;

	public native int stepSimulation(float timeStep, int maxSubSteps) /*-{
		var world = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var val = world.stepSimulation(timeStep, maxSubSteps);
		return val;
	}-*/;

	public native int stepSimulation(float timeStep) /*-{
		var world = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var val = world.stepSimulation(timeStep);
		return val;
	}-*/;
	
}
