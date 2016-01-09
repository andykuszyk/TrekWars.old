/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Bases;

import TrekWars.Environments.EnvironmentType;
import com.jme3.scene.Spatial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andy.Kuszyk
 */
public class EnvironmentBase {
    private StarFieldBase _starField;
    private EnvironmentType _environmentType;
    
    public EnvironmentBase(EnvironmentType environmentType) {
        _starField = new StarFieldBase();
        _environmentType = environmentType;
    }
    
    public EnvironmentType getEnvironmentType() {
        return _environmentType;
    }
    
    public StarFieldBase getStarField() {
        return _starField;
    }
    
    public List<Spatial> getSpatials() {
        ArrayList<Spatial> spatials = new ArrayList<Spatial>();
        
        spatials.addAll(_starField.getSpatials());
        
        return spatials;
    }
}
