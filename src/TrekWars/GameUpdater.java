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
        _gameContext.getCamera().setRotation(calculateCameraQuaternion());
    }
    
    private Vector3f calculateCameraVector() {
        return _gameContext.getCamera().getLocation();
    }
    
    private Quaternion calculateCameraQuaternion(){
        return _gameContext.getCamera().getRotation();
    }
    
    private void processPausedUpdate(float tpf) {
        
    }
    
    private void processMainMenuUpdate(float tpf) {
        
    }
}
