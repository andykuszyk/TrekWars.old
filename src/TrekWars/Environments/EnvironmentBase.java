/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Environments;

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
    
}
