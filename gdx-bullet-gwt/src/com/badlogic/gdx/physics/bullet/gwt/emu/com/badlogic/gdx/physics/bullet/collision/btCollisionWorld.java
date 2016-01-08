package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.bullet.Bullet;
import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.btIDebugDraw;
import com.badlogic.gdx.physics.bullet.linearmath.btMatrix3x3;
import com.badlogic.gdx.physics.bullet.linearmath.btQuaternion;
import com.badlogic.gdx.physics.bullet.linearmath.btTransform;
import com.badlogic.gdx.physics.bullet.linearmath.btVector3;

public class btCollisionWorld extends BulletBase
{
	
	
	protected btDispatcher m_dispatcher;
	btIDebugDraw debugDrawer;
	
	protected btCollisionObjectArray objectArray = new btCollisionObjectArray();
	
	public btCollisionWorld()
	{
		if(Bullet.TMP_btVector3js_1 == null)
			Bullet.TMP_btVector3js_1 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btVector3js_2 == null)
			Bullet.TMP_btVector3js_2 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btVector3js_3 == null)
			Bullet.TMP_btVector3js_3 = btVector3.createObj(0, 0, 0);
		if(Bullet.TMP_btTransformjs_1 == null)
			Bullet.TMP_btTransformjs_1 = btTransform.createObj();
		if(Bullet.TMP_btQuaternionjs_1 == null)
			Bullet.TMP_btQuaternionjs_1 = btQuaternion.createObj(0, 0, 0, 1);
		if(Bullet.TMP_btMatrix3x3JS_1 == null)
			Bullet.TMP_btMatrix3x3JS_1 = btMatrix3x3.createObj();
			
	}
	
	protected void addObject(btCollisionObject body)
	{
		objectArray.m_collisionObjects.put(body.jsObject, body);
	}

	protected boolean removeObject(btCollisionObject body)
	{
		return objectArray.m_collisionObjects.removeValue(body, true);
	}
	
	public native void addCollisionObject(btCollisionObject collisionObject) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::addObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(body);
		worldJS.addCollisionObject(bodyJS);
	}-*/;
	
	public native void removeCollisionObject(btCollisionObject collisionObject) /*-{
		var worldJS = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var bodyJS = body.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		this.@com.badlogic.gdx.physics.bullet.collision.btCollisionWorld::removeObject(Lcom/badlogic/gdx/physics/bullet/collision/btCollisionObject;)(body);
		worldJS.removeCollisionObject(bodyJS); 
	}-*/;
	
	public btCollisionObjectArray getCollisionObjectArray()
	{
		return objectArray;
	}
	
	public void setDebugDrawer(btIDebugDraw debugDrawer)
	{
		this.debugDrawer = debugDrawer;
	}

	public btDispatcher getDispatcher()
	{
		return m_dispatcher;
	}

	Vector3 defaultColor = new Vector3();

	public void debugDrawWorld()
	{
		if (debugDrawer != null && m_dispatcher != null)
		{
			//			DefaultColors defaultColors = debugDrawer.getDefaultColors();
			if ((debugDrawer.getDebugMode() & btIDebugDraw.DebugDrawModes.DBG_DrawContactPoints) == 1)
			{

				int numManifolds = m_dispatcher.getNumManifolds();
				for (int i = 0; i < numManifolds; i++)
				{
					btPersistentManifold contactManifold = m_dispatcher.getManifoldByIndexInternal(i);

					int numContacts = contactManifold.getNumContacts();
					for (int j = 0; j < numContacts; j++)
					{
						btManifoldPoint cp = contactManifold.getContactPoint(j);
						Vector3 pointOnB = new Vector3();
						cp.getPositionWorldOnB(pointOnB);
						Vector3 normalOnB = new Vector3();
						cp.getNormalWorldOnB(normalOnB);
						Vector3 color = new Vector3(1, 1, 1);
						debugDrawer.drawContactPoint(pointOnB, normalOnB, cp.getDistance(), cp.getLifeTime(), color);
					}
				}
			}

			for (int i = 0; i < objectArray.m_collisionObjects.size; i++)
			{
				btCollisionObject colObj = objectArray.m_collisionObjects.getValueAt(i);

				int collisionFlags = colObj.getCollisionFlags();
				int visualizeObject = btCollisionObject.CollisionFlags.CF_DISABLE_VISUALIZE_OBJECT;
				int result1 = collisionFlags & visualizeObject;

				if ((colObj.getCollisionFlags() & btCollisionObject.CollisionFlags.CF_DISABLE_VISUALIZE_OBJECT) == 0)
				{
					int debugMode = debugDrawer.getDebugMode();
					int wireFrameMode = btIDebugDraw.DebugDrawModes.DBG_DrawWireframe;
					int result2 = debugMode & wireFrameMode;

					if ((debugMode & wireFrameMode) == 1)
					{
						////						btVector3 color(btScalar(0.4),btScalar(0.4),btScalar(0.4));

						Vector3 color = defaultColor;

						defaultColor.set(1, 1, 1);

						//						switch (colObj.getActivationState())
						//						{
						//							case Collision.ACTIVE_TAG:
						//								color = defaultColors.getActiveObject();
						//								break;
						//							case Collision.ISLAND_SLEEPING:
						//								color = defaultColors.getDeactivatedObject();
						//								break;
						//							case Collision.WANTS_DEACTIVATION:
						//								color = defaultColors.getWantsDeactivationObject();
						//								break;
						//							case Collision.DISABLE_DEACTIVATION:
						//								color = defaultColors.getDisabledDeactivationObject();
						//								break;
						//							case Collision.DISABLE_SIMULATION:
						//								color = defaultColors.getDisabledSimulationObject();
						//								break;
						//							default:
						//							{
						//								color = btVector3(btScalar(.3), btScalar(0.3), btScalar(0.3));
						//							}
						//						};

						debugDrawObject(colObj.getWorldTransform(), colObj.getCollisionShape(), color);
					}
					if ((debugDrawer.getDebugMode() & btIDebugDraw.DebugDrawModes.DBG_DrawAabb) == 0)
					{
						//						btVector3 minAabb,maxAabb;
						//						btVector3 colorvec = defaultColors.m_aabb;
						//						colObj->getCollisionShape()->getAabb(colObj->getWorldTransform(), minAabb,maxAabb);
						//						btVector3 contactThreshold(gContactBreakingThreshold,gContactBreakingThreshold,gContactBreakingThreshold);
						//						minAabb -= contactThreshold;
						//						maxAabb += contactThreshold;
						//	
						//						btVector3 minAabb2,maxAabb2;
						//	
						//						if(getDispatchInfo().m_useContinuous && colObj->getInternalType()==btCollisionObject::CO_RIGID_BODY && !colObj->isStaticOrKinematicObject())
						//						{
						//							colObj->getCollisionShape()->getAabb(colObj->getInterpolationWorldTransform(),minAabb2,maxAabb2);
						//							minAabb2 -= contactThreshold;
						//							maxAabb2 += contactThreshold;
						//							minAabb.setMin(minAabb2);
						//							maxAabb.setMax(maxAabb2);
						//						}
						//	
						//						m_debugDrawer->drawAabb(minAabb,maxAabb,colorvec);
					}
				}
			}
		}
	}

	Vector3 tmp = new Vector3();

	public void debugDrawObject(Matrix4 worldTransform, btCollisionShape shape, Vector3 color)
	{
		// Draw a small simplex at the center of the object
		if (debugDrawer != null && (debugDrawer.getDebugMode() & btIDebugDraw.DebugDrawModes.DBG_DrawFrames) == 0)
		{
			debugDrawer.drawTransform(worldTransform, 1);
		}

		if (shape.getShapeType() == BroadphaseNativeTypes.COMPOUND_SHAPE_PROXYTYPE)
		{ // FIXME FINISH COMPOUND IMPLEMENTATION.
			//			btCompoundShape compoundShape = (btCompoundShape)shape;
			//			for (int i=compoundShape.getNumChildShapes()-1;i>=0;i--)
			//			{
			//				btTransform childTrans = compoundShape.getChildTransform(i);
			//				const btCollisionShape* colShape = compoundShape->getChildShape(i);
			//				debugDrawObject(worldTransform*childTrans,colShape,color);
			//			}

		}
		else
		{

			switch (shape.getShapeType())
			{
				
				case -1:
				{
					
					break;
				}
				case BroadphaseNativeTypes.BOX_SHAPE_PROXYTYPE:
				{
					btBoxShape boxShape = (btBoxShape) shape;
					Vector3 halfExtents = boxShape.getHalfExtentsWithMargin();
					tmp.set(halfExtents);
					tmp.x *= -1;
					tmp.y *= -1;
					tmp.z *= -1;
					debugDrawer.drawBox(tmp, halfExtents, worldTransform, color);
					break;
				}

				case BroadphaseNativeTypes.SPHERE_SHAPE_PROXYTYPE:
				{
					btSphereShape sphereShape = (btSphereShape)shape;
					float radius = sphereShape.getMargin();//radius doesn't include the margin, so draw with margin
					debugDrawer.drawSphere(radius, worldTransform, color);
					break;
				}
				case BroadphaseNativeTypes.MULTI_SPHERE_SHAPE_PROXYTYPE:
				{
					//	                const btMultiSphereShape* multiSphereShape = static_cast<const btMultiSphereShape*>(shape);
					//
					//	                btTransform childTransform;
					//	                childTransform.setIdentity();
					//
					//	                for (int i = multiSphereShape->getSphereCount()-1; i>=0;i--)
					//	                {
					//	                    childTransform.setOrigin(multiSphereShape->getSpherePosition(i));
					//	                    getDebugDrawer()->drawSphere(multiSphereShape->getSphereRadius(i), worldTransform*childTransform, color);
					//	                }
					//
					break;
				}
				case BroadphaseNativeTypes.CAPSULE_SHAPE_PROXYTYPE:
				{
					//	                const btCapsuleShape* capsuleShape = static_cast<const btCapsuleShape*>(shape);
					//
					//	                btScalar radius = capsuleShape->getRadius();
					//	                btScalar halfHeight = capsuleShape->getHalfHeight();
					//
					//	                int upAxis = capsuleShape->getUpAxis();
					//	                getDebugDrawer()->drawCapsule(radius, halfHeight, upAxis, worldTransform, color);
					break;
				}
				case BroadphaseNativeTypes.CONE_SHAPE_PROXYTYPE:
				{
					//	                const btConeShape* coneShape = static_cast<const btConeShape*>(shape);
					//	                btScalar radius = coneShape->getRadius();//+coneShape->getMargin();
					//	                btScalar height = coneShape->getHeight();//+coneShape->getMargin();
					//
					//	                int upAxis= coneShape->getConeUpIndex();
					//	                getDebugDrawer()->drawCone(radius, height, upAxis, worldTransform, color);
					break;
					//
				}
				case BroadphaseNativeTypes.CYLINDER_SHAPE_PROXYTYPE:
				{
					//	                const btCylinderShape* cylinder = static_cast<const btCylinderShape*>(shape);
					//	                int upAxis = cylinder->getUpAxis();
					//	                btScalar radius = cylinder->getRadius();
					//	                btScalar halfHeight = cylinder->getHalfExtentsWithMargin()[upAxis];
					//	                getDebugDrawer()->drawCylinder(radius, halfHeight, upAxis, worldTransform, color);
					break;
				}
				//
				case BroadphaseNativeTypes.STATIC_PLANE_PROXYTYPE:
				{
					//	                const btStaticPlaneShape* staticPlaneShape = static_cast<const btStaticPlaneShape*>(shape);
					//	                btScalar planeConst = staticPlaneShape->getPlaneConstant();
					//	                const btVector3& planeNormal = staticPlaneShape->getPlaneNormal();
					//	                getDebugDrawer()->drawPlane(planeNormal, planeConst,worldTransform, color);
					break;
				}
				default:
				{
					//
					//	                /// for polyhedral shapes
					//	                if (shape->isPolyhedral())
					//	                {
					//	                    btPolyhedralConvexShape* polyshape = (btPolyhedralConvexShape*) shape;
					//	                    
					//	                    int i;
					//	                    if (polyshape->getConvexPolyhedron())
					//	                    {
					//	                        const btConvexPolyhedron* poly = polyshape->getConvexPolyhedron();
					//	                        for (i=0;i<poly->m_faces.size();i++)
					//	                        {
					//	                            btVector3 centroid(0,0,0);
					//	                            int numVerts = poly->m_faces[i].m_indices.size();
					//	                            if (numVerts)
					//	                            {
					//	                                int lastV = poly->m_faces[i].m_indices[numVerts-1];
					//	                                for (int v=0;v<poly->m_faces[i].m_indices.size();v++)
					//	                                {
					//	                                    int curVert = poly->m_faces[i].m_indices[v];
					//	                                    centroid+=poly->m_vertices[curVert];
					//	                                    getDebugDrawer()->drawLine(worldTransform*poly->m_vertices[lastV],worldTransform*poly->m_vertices[curVert],color);
					//	                                    lastV = curVert;
					//	                                }
					//	                            }
					//	                            centroid*= btScalar(1.f)/btScalar(numVerts);
					//	                            if (getDebugDrawer()->getDebugMode() & btIDebugDraw::DBG_DrawNormals)
					//	                            {
					//	                                btVector3 normalColor(1,1,0);
					//	                                btVector3 faceNormal(poly->m_faces[i].m_plane[0],poly->m_faces[i].m_plane[1],poly->m_faces[i].m_plane[2]);
					//	                                getDebugDrawer()->drawLine(worldTransform*centroid,worldTransform*(centroid+faceNormal),normalColor);
					//	                            }
					//	                            
					//	                        }
					//	                        
					//	                        
					//	                    } else
					//	                    {
					//	                        for (i=0;i<polyshape->getNumEdges();i++)
					//	                        {
					//	                            btVector3 a,b;
					//	                            polyshape->getEdge(i,a,b);
					//	                            btVector3 wa = worldTransform * a;
					//	                            btVector3 wb = worldTransform * b;
					//	                            getDebugDrawer()->drawLine(wa,wb,color);
					//	                        }
					//	                    }
					//	                    
					//	                    
					//	                }
					//	                    
					//	                if (shape->isConcave())
					//	                {
					//	                    btConcaveShape* concaveMesh = (btConcaveShape*) shape;
					//
					//	                    ///@todo pass camera, for some culling? no -> we are not a graphics lib
					//	                    btVector3 aabbMax(btScalar(BT_LARGE_FLOAT),btScalar(BT_LARGE_FLOAT),btScalar(BT_LARGE_FLOAT));
					//	                    btVector3 aabbMin(btScalar(-BT_LARGE_FLOAT),btScalar(-BT_LARGE_FLOAT),btScalar(-BT_LARGE_FLOAT));
					//
					//	                    DebugDrawcallback drawCallback(getDebugDrawer(),worldTransform,color);
					//	                    concaveMesh->processAllTriangles(&drawCallback,aabbMin,aabbMax);
					//
					//	                }
					//
					//	                if (shape->getShapeType() == CONVEX_TRIANGLEMESH_SHAPE_PROXYTYPE)
					//	                {
					//	                    btConvexTriangleMeshShape* convexMesh = (btConvexTriangleMeshShape*) shape;
					//	                    //todo: pass camera for some culling			
					//	                    btVector3 aabbMax(btScalar(BT_LARGE_FLOAT),btScalar(BT_LARGE_FLOAT),btScalar(BT_LARGE_FLOAT));
					//	                    btVector3 aabbMin(btScalar(-BT_LARGE_FLOAT),btScalar(-BT_LARGE_FLOAT),btScalar(-BT_LARGE_FLOAT));
					//	                    //DebugDrawcallback drawCallback;
					//	                    DebugDrawcallback drawCallback(getDebugDrawer(),worldTransform,color);
					//	                    convexMesh->getMeshInterface()->InternalProcessAllTriangles(&drawCallback,aabbMin,aabbMax);
					//	                }
					//
					//
					//	                
				}

			}
		}
	}
}
