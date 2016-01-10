/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TrekWars.Bases;

import com.jme3.math.Vector3f;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andy.Kuszyk
 */
public enum Axis {
    X,
    Y,
    Z;
    
    public List<Axis> getNormals() {
        ArrayList<Axis> normals = new ArrayList<Axis>();
        
        switch(this) {
            case X:
                normals.add(Axis.Y);
                normals.add(Axis.Z);
            case Y:
                normals.add(Axis.Z);
                normals.add(Axis.X);
            default:
                normals.add(Axis.X);
                normals.add(Axis.Y);
        }
        
        return normals;
    }
    
    public float getCoordinate(Vector3f vector) {
        switch(this) {
            case X:
                return vector.getX();
            case Y:
                return vector.getY();
            default:
                return vector.getZ();
        }
    }
}
