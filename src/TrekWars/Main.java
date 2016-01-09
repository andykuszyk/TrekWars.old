package TrekWars;

import TrekWars.Environments.EnvironmentType;
import TrekWars.Ships.ShipType;
import com.jme3.app.SimpleApplication;
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
        _gameContext = new GameContext(assetManager,rootNode);
        _gameContext.setEnvironmentType(EnvironmentType.SimpleStarField);
        _gameContext.setPlayerType(ShipType.Voyager);
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
