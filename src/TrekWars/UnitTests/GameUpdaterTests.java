///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package TrekWars.UnitTests;
//
//import TrekWars.GameUpdater;
//import TrekWars.Interfaces.IGameContext;
//import org.junit.Test;
//import org.jmock.Mockery;
//
///**
// *
// * @author Andy.Kuszyk
// */
//public class GameUpdaterTests {
//    
//    private Mockery _context = new Mockery();
//    private final float _tpf = 1f;
//    
//    @Test
//    public void processUpdate_correctlyPositionsCamera() {
//        IGameContext gameContextMock = _context.mock(IGameContext.class);
//        allowing(gameContextMock).getPlayer(); will(returnValue(null));
//        
//        GameUpdater gameUpdater = new GameUpdater(gameContextMock); 
//        
//        gameUpdater.processUpdate(_tpf);
//    }
//}
