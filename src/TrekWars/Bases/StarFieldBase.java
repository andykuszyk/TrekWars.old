/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Bases;

import TrekWars.Interfaces.IGameContext;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Quad;

/**
 *
 * @author Andy.Kuszyk
 */
public class StarFieldBase extends TrekWarsSpatialBase  {
    
    private final int _starCount = 10000;
    private final float _starSize = 50;
    private final int _maxStarDistance = 10000;
    private final int _minStarDistance = 1000;
    
    public StarFieldBase(IGameContext gameContext) {
        super(gameContext);
        
        Material mat = new Material(_gameContext.getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");
        
        for(int i = 1; i<=_starCount; i++){
            Quad starBox = new Quad(_starSize,_starSize);
            Geometry starGeo = new Geometry("star", starBox);
            starGeo.setMaterial(mat);
            _spatials.add(starGeo);
            starGeo.setLocalTranslation(
                    calculateRandomStarCoordinate(), 
                    calculateRandomStarCoordinate(), 
                    calculateRandomStarCoordinate());
            starGeo.lookAt(Vector3f.ZERO, Vector3f.ZERO);
        }
    }
    
    private float calculateRandomStarCoordinate() {
        float distanceMultiplier = _maxStarDistance - _minStarDistance;
        float randomisedCoord = (float)(
                (Math.random() * distanceMultiplier) - 
                (distanceMultiplier / 2));
        if(randomisedCoord > 0){
            return randomisedCoord + _minStarDistance;
        }
        else {
            return randomisedCoord - _minStarDistance;
        }
    }
}
