/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Bases;

import com.jme3.scene.Spatial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andy.Kuszyk
 */
public class TrekWarsSpatialBase {
    protected List<Spatial> _spatials;
    
    public TrekWarsSpatialBase() {
        _spatials = new ArrayList<Spatial>();
    }
    
    public List<Spatial> getSpatials() {
        return _spatials;
    }
}
