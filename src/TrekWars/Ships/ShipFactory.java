/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Ships;

import TrekWars.Bases.ShipBase;

/**
 *
 * @author andy
 */
public class ShipFactory {
    public static ShipBase createShip(ShipType shipType){
        switch(shipType){
            
            case Voyager:
                return new Voyager();
            
            default:
                return null;
        }
    }
}
