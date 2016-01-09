/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Interfaces;

import TrekWars.GameStatusType;
import TrekWars.Ships.ShipBase;

/**
 *
 * @author andy
 */
public interface IGameContext {
    GameStatusType getStatus();
    ShipBase getPlayer();
}
