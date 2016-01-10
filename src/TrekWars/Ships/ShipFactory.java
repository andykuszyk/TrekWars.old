/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Ships;

import TrekWars.Bases.ShipBase;
import TrekWars.Interfaces.IGameContext;

/**
 *
 * @author andy
 */
public class ShipFactory {
    public static ShipBase createShip(ShipType shipType, IGameContext gameContext){
        switch(shipType){
            
            case Voyager:
                return new Voyager(gameContext);
            
            default:
                return null;
        }
    }
}
