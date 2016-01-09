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
    }
    
    private void processPausedUpdate(float tpf) {
        
    }
    
    private void processMainMenuUpdate(float tpf) {
        
    }
}
