package com.badlogic.gdx.physics.bullet.collision;

import com.google.gwt.core.client.JavaScriptObject;

public class btHeightfieldTerrainShape extends btConcaveShape
{ // FIXME needs finish implementation.
	public btHeightfieldTerrainShape(int heightStickWidth, int heightStickLength, java.nio.FloatBuffer heightfieldData, float heightScale, float minHeight, float maxHeight, int upAxis, boolean flipQuadEdges)
	{
//		this(btHeightfieldTerrainShape.SwigConstructbtHeightfieldTerrainShape(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, flipQuadEdges), true);
	}

	public btHeightfieldTerrainShape(int heightStickWidth, int heightStickLength, java.nio.ShortBuffer heightfieldData, float heightScale, float minHeight, float maxHeight, int upAxis, boolean flipQuadEdges)
	{
//		this(btHeightfieldTerrainShape.SwigConstructbtHeightfieldTerrainShape(heightStickWidth, heightStickLength, heightfieldData, heightScale, minHeight, maxHeight, upAxis, flipQuadEdges), true);
	}
	
	public native JavaScriptObject createAndCopyHeightData (float terrainWidth, float terrainDepth, JavaScriptObject heightData) /*-{ 
		// Creates height data buffer in Ammo heap
		var ammoHeightFieldData = $wnd.Ammo._malloc( 4 * terrainWidth * terrainDepth );
		
		// Copy the javascript height data array to the Ammo one.
		var p = 0;
		var p2 = 0;
		for ( var j = 0; j < terrainDepth; j ++ ) {
			for ( var i = 0; i < terrainWidth; i ++ ) {
				// write 32-bit float data to memory
				$wnd.Ammo.HEAPF32[ammoHeightFieldData + p2 >> 2] = heightData[ p ];
				p ++;
				// 4 bytes/float
				p2 += 4;
			}
		}
		return ammoHeightFieldData;
	}-*/;
	
	public native JavaScriptObject createAmmoHeightShape (int heightStickWidth, int heightStickLength, JavaScriptObject heightfieldData, float heightScale, float minHeight, float maxHeight, long upAxis, String PHY_ScalarType, boolean flipQuadEdges) /*-{ 
		// Creates the heightfield physics shape
		var heightFieldShape = new $wnd.Ammo.btHeightfieldTerrainShape(
			terrainWidth,
			terrainDepth,
			heightfieldData,
			heightScale,
			terrainMinHeight,
			terrainMaxHeight,
			upAxis,
			PHY_ScalarType,
			flipQuadEdges
		);
		return heightFieldShape;
	}-*/;
}
