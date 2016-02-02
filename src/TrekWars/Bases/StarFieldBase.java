/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Bases;

import TrekWars.Interfaces.IGameContext;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

/**
 *
 * @author Andy.Kuszyk
 */
public class StarFieldBase extends TrekWarsSpatialBase  {
    
    public StarFieldBase(IGameContext gameContext) {
        super(gameContext);
        
        Material mat = new Material(_gameContext.getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");
        
        for(int i = 1; i<=100; i++){
            Box starBox = new Box(1,1,1);
            Geometry starGeo = new Geometry("star", starBox);
            starGeo.setMaterial(mat);
            _spatials.add(starGeo);
            starGeo.setLocalTranslation(
                    (float)(Math.random()*100 - 50), 
                    (float)(Math.random()*100 - 50), 
                    (float)(Math.random()*100 - 50));
        }
    }
    
}
