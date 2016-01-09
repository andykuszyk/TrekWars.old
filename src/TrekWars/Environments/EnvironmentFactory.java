/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Environments;

/**
 *
 * @author Andy.Kuszyk
 */
public class EnvironmentFactory {
    public EnvironmentBase createEnvironment(EnvironmentType environmentType) {
        switch(environmentType){
            case SimpleStarField:
                return new SimpleStarField();
            default:
                return null;
        }
    }
}
