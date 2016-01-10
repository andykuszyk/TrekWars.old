/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Ships;

import TrekWars.Bases.ShipBase;
import TrekWars.Interfaces.IGameContext;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;

/**
 *
 * @author andy
 */
public class Voyager extends ShipBase {
    
    public Voyager(IGameContext gameContext) {
        super(ShipType.Voyager,gameContext);
        
        Spatial voyager = _gameContext.getAssetManager().loadModel("Models/Voyager Prototype.obj");
        Material mat_default = new Material(_gameContext.getAssetManager(), "Common/MatDefs/Misc/ShowNormals.j3md");
        voyager.setMaterial(mat_default);
        voyager.setLocalTranslation(0, 0, -10);
        voyager.setLocalScale(1);
        _spatials.add(voyager);
    }
    
    @Override
    public void update(float tpf) {
        Spatial voyager = getSpatials().get(0);
        Vector3f initialLocation = voyager.getLocalTranslation();
        System.out.println(initialLocation.getZ());
        // Move player
        voyager.setLocalTranslation(
                initialLocation.getX(), 
                initialLocation.getY(), 
                initialLocation.getZ() - _speed);
    }
}
