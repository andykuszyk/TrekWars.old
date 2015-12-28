/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STSS;

import STSS.Ships.Ship;
import STSS.Interfaces.IGameContext;
import com.jme3.asset.AssetManager;
import com.jme3.scene.Node;
import java.util.List;

/**
 *
 * @author andy
 */
public class GameContext implements IGameContext {
    
    private List<Ship> _enemies;
    private List<Ship> _friends;
    private Ship _player;
    private GameStatusType _status;
    private AssetManager _assetManager;
    private Node _rootNode;
    private GameStatusChanger _gameStatusChanger;
    private GameUpdater _gameUpdater;
    
    public GameContext(
            AssetManager assetManager,
            Node rootNode) {
        _rootNode = rootNode;
        _assetManager = assetManager;
        _status = null;
        _gameStatusChanger = new GameStatusChanger(this);
        _gameUpdater = new GameUpdater(this);
    }
    
    public void processUpdate(float tpf) {
        _gameUpdater.processUpdate(tpf);
    }
    
    public Node getRootNode() {
        return _rootNode;
    }
    
    public AssetManager getAssetManager() {
        return _assetManager;
    }
    
    public GameStatusType getStatus()
    {
        return _status;
    }
    
    public void setStatus(GameStatusType newStatus)
    {
        _status = newStatus;
        _gameStatusChanger.processGameStatusChange();
    }
    
    public List<Ship> getEnemies()
    {
        return _enemies;
    }

    public List<Ship> getFriends()
    {
        return _friends;
    }
    
    public Ship getPlayer()
    {
        return player;
    }
}
