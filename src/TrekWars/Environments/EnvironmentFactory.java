/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Environments;

import TrekWars.Bases.EnvironmentBase;
import TrekWars.Interfaces.IGameContext;

/**
 *
 * @author Andy.Kuszyk
 */
public class EnvironmentFactory {
    public static EnvironmentBase createEnvironment(EnvironmentType environmentType, IGameContext gameContext) {
        switch(environmentType){
            case SimpleStarField:
                return new SimpleStarField(gameContext);
            default:
                return null;
        }
    }
}
