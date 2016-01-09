/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Interfaces;

import TrekWars.Bases.EnvironmentBase;
import TrekWars.Environments.EnvironmentType;
import TrekWars.GameStatusType;
import TrekWars.Bases.ShipBase;
import TrekWars.Ships.ShipType;
import com.jme3.asset.AssetManager;
import com.jme3.renderer.Camera;
import com.jme3.scene.Node;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author andy
 */

public interface IGameContext {

    AssetManager getAssetManager();

    List<ShipBase> getEnemies();

    EnvironmentBase getEnvironment();

    EnvironmentType getEnvironmentType();

    List<ShipBase> getFriends();

    ShipBase getPlayer();

    ShipType getPlayerType();

    Node getRootNode();

    GameStatusType getStatus();
    
    Camera getCamera();

    void processUpdate(float tpf);

    void setEnemies(Collection<ShipBase> enemies);

    void setEnvironment(EnvironmentBase environment);

    void setEnvironmentType(EnvironmentType environmentType);

    void setFriends(Collection<ShipBase> friends);

    void setPlayer(ShipBase player);

    void setPlayerType(ShipType shipType);

    void setStatus(GameStatusType newStatus);
    
}
