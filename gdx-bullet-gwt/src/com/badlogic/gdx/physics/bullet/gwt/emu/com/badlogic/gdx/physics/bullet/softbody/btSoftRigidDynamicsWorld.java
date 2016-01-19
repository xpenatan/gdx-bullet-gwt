package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.collision.btBroadphaseInterface;
import com.badlogic.gdx.physics.bullet.collision.btCollisionConfiguration;
import com.badlogic.gdx.physics.bullet.collision.btDispatcher;
import com.badlogic.gdx.physics.bullet.dynamics.btConstraintSolver;
import com.badlogic.gdx.physics.bullet.dynamics.btDiscreteDynamicsWorld;
import com.google.gwt.core.client.JavaScriptObject;

public class btSoftRigidDynamicsWorld extends btDiscreteDynamicsWorld
{
	public btSoftRigidDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration, btSoftBodySolver softBodySolver) {
		jsObject = createObj(dispatcher, pairCache, constraintSolver, collisionConfiguration, softBodySolver);
	}

	public btSoftRigidDynamicsWorld(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) {
		jsObject = createObj(dispatcher, pairCache, constraintSolver, collisionConfiguration);
	}

	private native JavaScriptObject createObj(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration,  btSoftBodySolver softBodySolver) /*-{
		var dispatcherJS = dispatcher.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	  	var broadphasePairCacheJS = pairCache.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var constraintSolverJS = constraintSolver.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var collisionConfigurationJS = collisionConfiguration.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var solverJS = softBodySolver.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	  	var obj = new $wnd.Ammo.btSoftRigidDynamicsWorld(dispatcherJS, broadphasePairCacheJS, constraintSolverJS, collisionConfigurationJS, solverJS);
	  	obj.javaObject = this;
		return obj;
	}-*/;
	private native JavaScriptObject createObj(btDispatcher dispatcher, btBroadphaseInterface pairCache, btConstraintSolver constraintSolver, btCollisionConfiguration collisionConfiguration) /*-{
		var dispatcherJS = dispatcher.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	  	var broadphasePairCacheJS = pairCache.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var constraintSolverJS = constraintSolver.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var collisionConfigurationJS = collisionConfiguration.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
	  	var obj = new $wnd.Ammo.btSoftRigidDynamicsWorld(dispatcherJS, broadphasePairCacheJS, constraintSolverJS);
	  	obj.javaObject = this;
		return obj;
	}-*/;
	
	public native void addSoftBody(btSoftBody body, short collisionFilterGroup, short collisionFilterMask) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.addSoftBody(bodyJS, collisionFilterGroup, collisionFilterMask);
	}-*/;
	public native void addSoftBody(btSoftBody body, short collisionFilterGroup) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.addSoftBody(bodyJS, collisionFilterGroup);
	}-*/;

	public native void addSoftBody(btSoftBody body) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.addSoftBody(bodyJS);
	}-*/;

	public native void removeSoftBody(btSoftBody body) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.removeSoftBody(bodyJS);
	}-*/;

	public native int getDrawFlags() /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		return worldJS.getDrawFlags();
	}-*/;

	public native void setDrawFlags(int f) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		worldJS.setDrawFlags(f);
	}-*/;

	public btSoftBodyWorldInfo getWorldInfo() {
		return new btSoftBodyWorldInfo();
	}
}
