/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Bases;

import TrekWars.Interfaces.IGameContext;
import TrekWars.Ships.ShipType;

/**
 *
 * @author andy
 */
public abstract class ShipBase extends TrekWarsSpatialBase {
    
    
    private ShipType _shipType;
    
    public ShipBase(ShipType shipType, IGameContext gameContext) {
        super(gameContext);
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
