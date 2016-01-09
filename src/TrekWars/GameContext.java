package TrekWars;

import TrekWars.Environments.EnvironmentBase;
import TrekWars.Environments.EnvironmentType;
import TrekWars.Ships.ShipBase;
import TrekWars.Interfaces.IGameContext;
import TrekWars.Ships.ShipType;
import com.jme3.asset.AssetManager;
import com.jme3.scene.Node;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GameContext implements IGameContext {
    private List<ShipBase> _enemies;
    private List<ShipBase> _friends;
    private ShipBase _player;
    private GameStatusType _status;
    private AssetManager _assetManager;
    private Node _rootNode;
    private GameStatusChanger _gameStatusChanger;
    private GameUpdater _gameUpdater;
    private EnvironmentBase _environment;
    private ShipType _playerType;    
    private EnvironmentType _environmentType;
    
    public GameContext(AssetManager assetManager,Node rootNode) {
        _rootNode = rootNode;
        _assetManager = assetManager;
        _status = null;
        _gameStatusChanger = new GameStatusChanger(this);
        _gameUpdater = new GameUpdater(this);
        _enemies = new ArrayList<ShipBase>();
        _friends = new ArrayList<ShipBase>();
    }
    
    @Override
    public void processUpdate(float tpf) {
        _gameUpdater.processUpdate(tpf);
    }
    
    @Override
    public Node getRootNode() {
        return _rootNode;
    }
    
    @Override
    public AssetManager getAssetManager() {
        return _assetManager;
    }
    
    @Override
    public GameStatusType getStatus() {
        return _status;
    }
    
    @Override
    public void setStatus(GameStatusType newStatus) {
        _status = newStatus;
        _gameStatusChanger.processGameStatusChange();
    }
    
    @Override
    public List<ShipBase> getEnemies() {
        return _enemies;
    }
    
    @Override
    public void setEnemies(Collection<ShipBase> enemies) {
        _enemies.clear();
        _enemies.addAll(enemies);
    }

    @Override
    public List<ShipBase> getFriends() {
        return _friends;
    }
    
    @Override
    public void setFriends(Collection<ShipBase> friends) {
        _friends.clear();
        _friends.addAll(friends);
    }
    
    @Override
    public ShipBase getPlayer() {
        return _player;
    }
    
    @Override
    public void setPlayer(ShipBase player) {
        _player = player;
    }
    
    @Override
    public EnvironmentBase getEnvironment() {
        return _environment;
    }
    
    @Override
    public void setEnvironment(EnvironmentBase environment) {
        _environment = environment;
    }
    
    @Override
    public EnvironmentType getEnvironmentType() {
        return _environmentType;
    }
    
    @Override
    public void setEnvironmentType(EnvironmentType environmentType) {
        _environmentType = environmentType;
    }
    
    @Override
    public ShipType getPlayerType() {
        return _playerType;
    }
    
    @Override
    public void setPlayerType(ShipType shipType) {
        _playerType = shipType;
    }
}
