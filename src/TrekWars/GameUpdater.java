/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars;

import TrekWars.Bases.Axis;
import TrekWars.Interfaces.IGameContext;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;

/**
 *
 * @author andy
 */
public class GameUpdater {
    private IGameContext _gameContext;
    
    public GameUpdater(IGameContext gameContext){
        _gameContext = gameContext;
    }
    
    public void processUpdate(float tpf) {
        switch(_gameContext.getStatus())
        {
            case Playing:
                processPlayingUpdate(tpf);
                break;
                
            case Paused:
                processPausedUpdate(tpf);
                break;
                
            case MainMenu:
                processMainMenuUpdate(tpf);
                break;
        }
    }
    
    private void processPlayingUpdate(float tpf) {
        _gameContext.getPlayer().update(tpf);
        
        _gameContext.getCamera().setLocation(calculateCameraVector());
        _gameContext.getCamera().setRotation(calculateCameraQuaternion());
    }
    
    private Vector3f calculateCameraVector() {
        float playerYRotation = _gameContext.getPlayer().getYRotation();
        Vector3f playerLocation = _gameContext.getPlayer().getLocation();
        float distance = -_gameContext.getCameraHorizontalDistance();
        
        double cameraZ = playerLocation.getZ() + (distance * Math.cos(playerYRotation));
        double cameraX = playerLocation.getX() + (distance * Math.sin(playerYRotation));
        double cameraY = _gameContext.getCameraVerticalDistance();
        
        return new Vector3f((float)cameraX, (float)cameraY, (float)cameraZ);
    }
    
    private Quaternion calculateCameraQuaternion(){
        Vector3f cameraLocation = _gameContext.getCamera().getLocation();
        Vector3f playerLocation = _gameContext.getPlayer().getLocation();
        
        double cameraZ;
        double cameraX;
        double cameraY;
        
        float deltaX = Math.abs(cameraLocation.getX() - playerLocation.getX());
        float deltaY = Math.abs(cameraLocation.getY() - playerLocation.getY());
        float deltaZ = Math.abs(cameraLocation.getZ() - playerLocation.getZ());
        
        double theta = Math.atan(deltaX / deltaY);
        
        boolean cameraXGreaterThanPlayer = cameraLocation.getX() > playerLocation.getX();
        boolean cameraYGreaterThanPlayer = cameraLocation.getY() > playerLocation.getY();
        boolean cameraZGreaterThanPlayer = cameraLocation.getZ() > playerLocation.getZ();
        
        if(cameraXGreaterThanPlayer && cameraYGreaterThanPlayer) {
            cameraZ = Math.PI + theta;
        }
        else if(cameraXGreaterThanPlayer && !cameraYGreaterThanPlayer) {
            
        }
        else if(!cameraXGreaterThanPlayer && cameraYGreaterThanPlayer) {
            
        }
        else {
            // !cameraXGreaterThanPlayer && !cameraYGreaterThanPlayer
            
        }
        
        
        return new Quaternion(
                (float)cameraX, 
                (float)cameraY, 
                (float)cameraZ, 
                _gameContext.getCamera().getRotation().getW());
    }
    
    private float calculateCameraRotation(
            float ) {
        
        
    }
    
    private void processPausedUpdate(float tpf) {
        
    }
    
    private void processMainMenuUpdate(float tpf) {
        
    }
}
