package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;

public class btBroadphaseProxy extends BulletBase
{

	public final static class CollisionFilterGroups {
		public final static int DefaultFilter = 1;
		public final static int StaticFilter = 2;
		public final static int KinematicFilter = 4;
		public final static int DebrisFilter = 8;
		public final static int SensorTrigger = 16;
		public final static int CharacterFilter = 32;
		public final static int AllFilter = -1;
	}
}
