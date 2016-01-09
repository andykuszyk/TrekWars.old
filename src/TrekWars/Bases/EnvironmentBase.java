/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Bases;

import TrekWars.Environments.EnvironmentType;
import TrekWars.Interfaces.IGameContext;
import com.jme3.scene.Spatial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andy.Kuszyk
 */
public class EnvironmentBase extends TrekWarsSpatialBase {
    private StarFieldBase _starField;
    private EnvironmentType _environmentType;
    
    public EnvironmentBase(EnvironmentType environmentType, IGameContext gameContext) {
        super(gameContext);
        _starField = new StarFieldBase(gameContext);
        _environmentType = environmentType;
    }
    
    public EnvironmentType getEnvironmentType() {
        return _environmentType;
    }
    
    public StarFieldBase getStarField() {
        return _starField;
    }
    
    @Override
    public List<Spatial> getSpatials() {
        ArrayList<Spatial> spatials = new ArrayList<Spatial>();
        
        spatials.addAll(_starField.getSpatials());
        spatials.addAll(super.getSpatials());
        
        return spatials;
    }
}
