/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Ships;

import TrekWars.Bases.ShipBase;
import TrekWars.Interfaces.IGameContext;
import com.jme3.bounding.BoundingBox;
import com.jme3.bounding.BoundingVolume;
import com.jme3.material.Material;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;

/**
 *
 * @author andy
 */
public class Voyager extends ShipBase {
    
    private final float _length = 100;
    
    public Voyager(IGameContext gameContext) {
        super(ShipType.Voyager,gameContext);
        
        Spatial voyager = _gameContext.getAssetManager().loadModel("Models/Voyager Prototype.obj");
        Material mat_default = new Material(_gameContext.getAssetManager(), "Common/MatDefs/Misc/ShowNormals.j3md");
        voyager.setMaterial(mat_default);
        voyager.setLocalTranslation(0, 0, 0);
        
        float scale = 1.01f;
        while(((BoundingBox)voyager.getWorldBound()).getZExtent() < _length)
        {
            voyager.setLocalScale(scale);
            scale += 0.01f;
        }
        _spatials.add(voyager);
    }
    
    @Override
    public void update(float tpf) {
        Spatial voyager = getSpatials().get(0);
        Vector3f initialLocation = voyager.getLocalTranslation();
        //System.out.println(initialLocation.getZ());
        
        // Move player spatials
        double newX = initialLocation.getX() + (-_speed * Math.sin(getYRotation()));
        double newZ = initialLocation.getZ() + (-_speed * Math.cos(getYRotation()));
        voyager.setLocalTranslation(
                (float)newX, 
                initialLocation.getY(), 
                (float)newZ);
        setLocation(voyager.getWorldTranslation());
        
        // Rotate player spatials
        System.out.println(getYRotation());
        voyager.setLocalRotation(new Quaternion().fromAngleAxis(getYRotation(), new Vector3f(0,1,0)));
                
    }
}
