/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Ships;

import TrekWars.Bases.ShipBase;
import TrekWars.Interfaces.IGameContext;
import com.jme3.material.Material;
import com.jme3.math.Quaternion;
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
        Quaternion rot = _spatials.get(0).getLocalRotation();
        
        _spatials.get(0).setLocalRotation(new Quaternion(
                (float)(rot.getX() + 0.001), (float)(rot.getY() + 0.001), (float)(rot.getZ() + 0.001), rot.getW()));
        System.out.println(rot);
        //turnLeft(tpf);
    }
    
    @Override
    protected void onYRotationChanged(float oldValue, float newValue) {
        Spatial voyager = _spatials.get(0);
        Quaternion currentRotation = voyager.getLocalRotation();
        voyager.setLocalRotation(new Quaternion(
                0,//currentRotation.getX(),
                0,//currentRotation.getZ(),
                getYRotation(),
                
                0//currentRotation.getW()
                ));
        System.out.println(getYRotation());
    }
}
