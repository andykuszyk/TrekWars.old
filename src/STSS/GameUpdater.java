/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STSS;

import STSS.Interfaces.IGameContext;
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
        
        float separation = -10;
        float newCamX = (float)(voyagerTranslation.x + separation * Math.sin(cameraRotation.getY()));
        float newCamY = (float)(voyagerTranslation.y + separation * Math.tan(cameraRotation.getX()));
        float newCamZ = (float)(voyagerTranslation.x + separation * Math.cos(cameraRotation.getY()));
        
        Vector3f cameraLocation = new Vector3f(newCamX, newCamY, newCamZ);

        cam.setLocation(cameraLocation);
        cam.setRotation(cameraRotation);
    }
    
    private void processPausedUpdate(float tpf) {
        
    }
    
    private void processMainMenuUpdate(float tpf) {
        
    }
}
