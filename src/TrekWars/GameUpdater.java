/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars;

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
        _gameContext.getCamera().lookAt(_gameContext.getPlayer().getLocation(), Vector3f.UNIT_Y);
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
    
    private void processPausedUpdate(float tpf) {
        
    }
    
    private void processMainMenuUpdate(float tpf) {
        
    }
}
