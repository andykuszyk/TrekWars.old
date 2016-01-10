/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Bases;

import TrekWars.Interfaces.IGameContext;
import TrekWars.Ships.ShipType;
import com.jme3.math.Vector3f;

/**
 *
 * @author andy
 */
public abstract class ShipBase extends TrekWarsSpatialBase {
    
    private ShipType _shipType;
    protected float _acceleration = 1;
    protected float _speed = 0;
    private float _yRotation = 0;
    private Vector3f _location = new Vector3f(0,0,0);
    
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
        _speed = _speed + (tpf * _acceleration);
    }
            
    public void decreaseSpeed(float tpf) {
        _speed = _speed - (tpf * _acceleration);
    }
    
    public void turnLeft(float tpf) {
        setYRotation(appendRotation(_yRotation, - (tpf * _acceleration / Math.PI)));
    }
    
    public void turnRight(float tpf) {
        setYRotation(appendRotation(_yRotation,(tpf * _acceleration / Math.PI)));
    }
    
    public float getYRotation() {
        return getSpatials().get(0).getLocalRotation().getY();
        
        //TODO
        //return _yRotation;
    }
    
    private float appendRotation(float rotation, double delta) {
        double newRotation = rotation + delta;
        if(newRotation >= 0 && newRotation < (Math.PI * 2)) {
            return (float) newRotation;
        }
        else if(newRotation < 0) {
            return (float) (newRotation + (2 * Math.PI));
        }
        else {
            return (float) (newRotation - (2 * Math.PI));
        }
    }
    
    protected void setYRotation(float yRotation) {
        float oldYRotation = _yRotation;
        _yRotation = yRotation;
        onYRotationChanged(oldYRotation, yRotation);
    }
    
    protected void onYRotationChanged(float oldValue, float newValue) {
        
    }
    
    public Vector3f getLocation() {
        return getSpatials().get(0).getLocalTranslation();
        
        // TODO
        //return _location;
    }
    
    protected void setLocation(Vector3f location) {
        Vector3f oldLocation = _location;
        _location = location;
        onLocationChanged(oldLocation, location);
    }
    
    protected void onLocationChanged(Vector3f oldLocation, Vector3f newLocation) {
        
    }
            
}
