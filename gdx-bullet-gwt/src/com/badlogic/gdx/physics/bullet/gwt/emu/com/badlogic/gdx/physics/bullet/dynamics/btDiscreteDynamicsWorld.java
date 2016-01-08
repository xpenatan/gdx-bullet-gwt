package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.collision.btBroadphaseInterface;
import com.badlogic.gdx.physics.bullet.collision.btCollisionConfiguration;
import com.badlogic.gdx.physics.bullet.collision.btDispatcher;
import com.google.gwt.core.client.JavaScriptObject;

public class btDiscreteDynamicsWorld extends btDynamicsWorld
{
	public btDiscreteDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration)
	{
		this.m_dispatcher = dispatcher;
		m_dispatcher.manifold.m_collisionObjects = this.objectArray.m_collisionObjects; // pass the list to manifold so it can get java bodies.
		jsObject = createObj(dispatcher.jsObject, pairCache.jsObject, constraintSolver.jsObject, collisionConfiguration.jsObject);
	}
	
	private native JavaScriptObject createObj(JavaScriptObject dispatcher, JavaScriptObject pairCache, JavaScriptObject solver, JavaScriptObject config) /*-{
	  var obj = new $wnd.Ammo.btDiscreteDynamicsWorld(dispatcher, pairCache, solver, config);
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
