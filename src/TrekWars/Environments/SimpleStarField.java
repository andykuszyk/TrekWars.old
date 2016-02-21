/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Environments;

import TrekWars.Bases.EnvironmentBase;
import TrekWars.Interfaces.IGameContext;
import com.jme3.material.Material;
import com.jme3.math.Vector2f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Sphere;
import com.jme3.texture.Texture;

/**
 *
 * @author Andy.Kuszyk
 */
public class SimpleStarField extends EnvironmentBase {
    
    public SimpleStarField(IGameContext gameContext) {
        super(EnvironmentType.SimpleStarField, gameContext);
        
        
        
//        Sphere sphere = new Sphere(100, 100, 100);
//        sphere.scaleTextureCoordinates(new Vector2f(10,10));
//        Geometry starSphere = new Geometry("StarSphere", sphere);
//        starSphere.scale(-1);
//        Material mat = new Material(_gameContext.getAssetManager(), "Common/MatDefs/Misc/Unshaded.j3md");
//        Texture starTexture = _gameContext.getAssetManager().loadTexture("Textures/starscape.jpg");
//        starTexture.setWrap(Texture.WrapMode.Repeat);
//        mat.setTexture("ColorMap", starTexture);
//        starSphere.setMaterial(mat);
//        
//        _spatials.add(starSphere);
    }
}
