/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STSS.Interfaces;

import STSS.GameStatusType;
import STSS.Ships.ShipBase;

/**
 *
 * @author andy
 */
public interface IGameContext {
    GameStatusType getStatus();
    ShipBase getPlayer();
}
