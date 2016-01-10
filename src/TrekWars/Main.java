package TrekWars;

import TrekWars.Environments.EnvironmentType;
import TrekWars.Ships.ShipType;
import com.jme3.app.SimpleApplication;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.renderer.RenderManager;

public class Main extends SimpleApplication {

    private GameContext _gameContext;
    
    public static void main(String[] args) {
        Main app = new Main();
        app.setShowSettings(false);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setEnabled(false);
        _gameContext = new GameContext(assetManager,rootNode, cam);
        _gameContext.setEnvironmentType(EnvironmentType.SimpleStarField);
        _gameContext.setPlayerType(ShipType.Voyager);
        _gameContext.setStatus(GameStatusType.Playing);
        
        inputManager.addMapping(InputMappings.left, new KeyTrigger(KeyInput.KEY_LEFT));
        inputManager.addMapping(InputMappings.right, new KeyTrigger(KeyInput.KEY_RIGHT));
        inputManager.addMapping(InputMappings.accelerate, new KeyTrigger(KeyInput.KEY_UP));
        inputManager.addMapping(InputMappings.decelerate, new KeyTrigger(KeyInput.KEY_DOWN));
        inputManager.addMapping(InputMappings.fire, new KeyTrigger(KeyInput.KEY_SPACE));
        
        inputManager.addListener(
                actionListener, 
                InputMappings.left,
                InputMappings.right,
                InputMappings.accelerate,
                InputMappings.decelerate,
                InputMappings.fire);
    }
    
    private ActionListener actionListener = new ActionListener() {
        public void onAction(String name, boolean keyPressed, float tpf) {
            _gameContext.getUpdate().onAction(name, keyPressed, tpf);
        }
    };
    
    @Override
    public void simpleUpdate(float tpf) {
        _gameContext.processUpdate(tpf);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
