/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Environments;

import TrekWars.Bases.EnvironmentBase;

/**
 *
 * @author Andy.Kuszyk
 */
public class EnvironmentFactory {
    public static EnvironmentBase createEnvironment(EnvironmentType environmentType) {
        switch(environmentType){
            case SimpleStarField:
                return new SimpleStarField();
            default:
                return null;
        }
    }
}
