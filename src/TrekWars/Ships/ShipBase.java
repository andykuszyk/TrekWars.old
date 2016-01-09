/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Ships;

import com.jme3.scene.Spatial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andy
 */
public abstract class ShipBase {
    
    protected List<Spatial> _spatials;
    private ShipType _shipType;
    
    public ShipBase(ShipType shipType) {
        _spatials = new ArrayList<Spatial>();
        _shipType = shipType;
    }
    
    public ShipType getShipType(){
        return _shipType;
    }
    
    public void update(float tpf) {
        
    }
    
    public void increaseSpeed(float tpf) {
        
    }
            
    public void decreaseSpeed(float tpf) {
        
    }
    
    public void turnLeft(float tpf) {
        
    }
    
    public void turnRight(float tpf) {
        
    }
}
