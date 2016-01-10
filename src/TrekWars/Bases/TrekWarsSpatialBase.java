/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Bases;

import TrekWars.Interfaces.IGameContext;
import com.jme3.scene.Spatial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andy.Kuszyk
 */
public class TrekWarsSpatialBase {
    protected List<Spatial> _spatials;
    protected IGameContext _gameContext;
    
    public TrekWarsSpatialBase(IGameContext gameContext) {
        _spatials = new ArrayList<Spatial>();
        _gameContext = gameContext;
    }
    
    public List<Spatial> getSpatials() {
        return _spatials;
    }
}
