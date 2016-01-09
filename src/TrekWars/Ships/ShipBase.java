/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Ships;

import com.jme3.scene.Spatial;
import java.util.List;

/**
 *
 * @author andy
 */
public abstract class ShipBase {
    
    protected List<Spatial> _spatials;
    
    public ShipBase() {
        _spatials = new List<Spatial>();
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
