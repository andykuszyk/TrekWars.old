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
        
        _gameContext = new GameContext();
        
        Sphere sphere = new Sphere(100, 100, 100);
        sphere.scaleTextureCoordinates(new Vector2f(10,10));
        Geometry starSphere = new Geometry("StarSphere", sphere);
        starSphere.scale(-1);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        Texture starTexture = assetManager.loadTexture("Textures/starscape.jpg");
        starTexture.setWrap(WrapMode.Repeat);
        mat.setTexture("ColorMap", starTexture);
        starSphere.setMaterial(mat);
        
        _voyager = assetManager.loadModel("Models/Voyager Prototype.obj");
        Material mat_default = new Material(assetManager, "Common/MatDefs/Misc/ShowNormals.j3md");
        _voyager.setMaterial(mat_default);
        _voyager.setLocalTranslation(0, 0, -10);
        _voyager.setLocalScale(1);
        
        rootNode.attachChild(starSphere);
        rootNode.attachChild(_voyager);
    }
    
    private Spatial _voyager;

    @Override
    public void simpleUpdate(float tpf) {
        switch(_gameContext.getStatus())
        {
            case Playing:
                break;
                
            case Paused:
                break;
                
            case MainMenu:
                break;
        }
        
        //TODO: add update code
        _voyager.rotate(tpf /10, tpf/10, tpf/10);
        Vector3f voyagerTranslation = _voyager.getWorldTranslation();
        
        Quaternion cameraRotation = new Quaternion(_voyager.getLocalRotation());
        
        float separation = -10;
        float newCamX = (float)(voyagerTranslation.x + separation * Math.sin(cameraRotation.getY()));
        float newCamY = (float)(voyagerTranslation.y + separation * Math.tan(cameraRotation.getX()));
        float newCamZ = (float)(voyagerTranslation.x + separation * Math.cos(cameraRotation.getY()));
        
        Vector3f cameraLocation = new Vector3f(newCamX, newCamY, newCamZ);

        cam.setLocation(cameraLocation);
        cam.setRotation(cameraRotation);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
