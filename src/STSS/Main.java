package STSS;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Sphere;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture.WrapMode;

/**
 * test
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    private GameContext _gameContext;
    
    public static void main(String[] args) {
        Main app = new Main();
        app.setShowSettings(false);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        
        _gameContext = new GameContext(assetManager,rootNode);
        _gameContext.setStatus(GameStatusType.Playing);
    }
    
    @Override
    public void simpleUpdate(float tpf) {
        _gameContext.processUpdate(tpf);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
