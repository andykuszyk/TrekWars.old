/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STSS;

import java.util.List;

/**
 *
 * @author andy
 */
public class GameContext {
    
    private List<Ship> _enemies;
    private List<Ship> _friends;
    private Ship _player;
    private GameStatusType _status;
    
    public GameContext()
    {
        _status = GameStatusType.MainMenu;
    }
    
    public GameStatusType getStatus()
    {
        return _status;
    }
    
    public void setStatus(GameStatusType newStatus)
    {
        _status = newStatus;
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
