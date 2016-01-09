/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars;

import TrekWars.Ships.ShipType;
import STSS.Ships.Ship;
import static TrekWars.GameStatusType.MainMenu;
import static TrekWars.GameStatusType.Paused;
import static TrekWars.GameStatusType.Playing;
import TrekWars.Interfaces.IGameContext;
import com.jme3.material.Material;
import com.jme3.math.Vector2f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Sphere;
import com.jme3.texture.Texture;

/**
 *
 * @author andy
 */
public class GameStatusChanger {
    
    private IGameContext _gameContext;
    private GameStatusType _previousStatus;
    private GameStatusType _currentStatus;
    
    public GameStatusChanger(IGameContext gameContext) {
        _gameContext = gameContext;
        _previousStatus = null;
        _currentStatus = _gameContext.getStatus();
    }
    
    public void processGameStatusChange(){
        _previousStatus = _currentStatus;
        _currentStatus = _gameContext.getStatus();
        if(_previousStatus == null && _currentStatus == null) return;
        
        if(_previousStatus == null){
            loadCurrentStatus();
            return;
        }
        
        unloadPreviousStatus();
        loadCurrentStatus();
    }
    
    private void loadCurrentStatus() {
        switch(_currentStatus){
            case MainMenu:
                loadMainMenu();
                break;
            case Paused:
                loadPaused();
                break;
            case Playing:
                loadPlaying();
                break;
        }
    }
    
    private void unloadPreviousStatus() {
        switch(_previousStatus){
            case MainMenu:
                unloadMainMenu();
                break;
            case Paused:
                unloadPaused();
                break;
            case Playing:
                unloadPlaying();
                break;
        }
    }
    
    private void loadMainMenu(){
        
    }
    
    private void loadPaused(){
        
    }
    
    private void loadPlaying(){
        Sphere sphere = new Sphere(100, 100, 100);
        sphere.scaleTextureCoordinates(new Vector2f(10,10));
        Geometry starSphere = new Geometry("StarSphere", sphere);
        starSphere.scale(-1);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Texture starTexture = assetManager.loadTexture("Textures/starscape.jpg");
        starTexture.setWrap(Texture.WrapMode.Repeat);
        mat.setTexture("ColorMap", starTexture);
        starSphere.setMaterial(mat);
        
        _gameContext.setPlayer(new Ship(ShipType.Voyager));
        
        _voyager = assetManager.loadModel("Models/Voyager Prototype.obj");
        Material mat_default = new Material(assetManager, "Common/MatDefs/Misc/ShowNormals.j3md");
        _voyager.setMaterial(mat_default);
        _voyager.setLocalTranslation(0, 0, -10);
        _voyager.setLocalScale(1);
        
        rootNode.attachChild(starSphere);
        rootNode.attachChild(_voyager);
        
    }
    
    private void unloadMainMenu(){
        
    }
    
    private void unloadPaused(){
        
    }
    
    private void unloadPlaying(){
        
    }
}
 