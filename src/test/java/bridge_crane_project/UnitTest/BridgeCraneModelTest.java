package bridge_crane_project.UnitTest;

import bridge_crane_project.Model.BridgeCraneModel;
import bridge_crane_project.Controller.BridgeCraneController;
import bridge_crane_project.View.BPMObserver;
import bridge_crane_project.View.BeatObserver;
import bridge_crane_project.View.MatrizObserver;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * 
 */
public class BridgeCraneModelTest {
    
    @Test
	public void clearObservers() {
        BridgeCraneModel bridge = new BridgeCraneModel();
        BridgeCraneController controller = new BridgeCraneController(bridge, 1);
        ArrayList<BPMObserver> observers = bridge.getBPMObserver();
        
		bridge.clear();
		int sizeFinal = observers.size();
		
		assertEquals(0, sizeFinal);
    }
    
    @Test
	public void clearObserversView2() {
        BridgeCraneModel bridge = new BridgeCraneModel();
        BridgeCraneController controller = new BridgeCraneController(bridge, 2);
        ArrayList<BPMObserver> observers = bridge.getBPMObserver();
        
		bridge.clear();
		int sizeFinal = observers.size();
		
		assertEquals(0, sizeFinal);
	}


    @Test
	public void removeBPMObserver() {
        BridgeCraneModel bridge = new BridgeCraneModel();
        BridgeCraneController controller = new BridgeCraneController(bridge, 1);
        ArrayList<BPMObserver> observers = bridge.getBPMObserver();
        
        int sizeInicial = observers.size();
		bridge.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
    }

    @Test
	public void removeBPMObserverView2() {
        BridgeCraneModel bridge = new BridgeCraneModel();
        BridgeCraneController controller = new BridgeCraneController(bridge, 2);
        ArrayList<BPMObserver> observers = bridge.getBPMObserver();
        
        int sizeInicial = observers.size();
		bridge.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
    }

    @Test
	public void removeBeatObserver() {
        BridgeCraneModel bridge = new BridgeCraneModel();
        BridgeCraneController controller = new BridgeCraneController(bridge, 1);
        ArrayList<BeatObserver> observers = bridge.getbeatObservers();
        
        int sizeInicial = observers.size();
		bridge.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
    }

    @Test
	public void removeBeatObserverView2() {
        BridgeCraneModel bridge = new BridgeCraneModel();
        BridgeCraneController controller = new BridgeCraneController(bridge, 2);
        ArrayList<BeatObserver> observers = bridge.getbeatObservers();
        
        int sizeInicial = observers.size();
		bridge.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
    }

    @Test
	public void removeMatrixObserver() {
        BridgeCraneModel bridge = new BridgeCraneModel();
        BridgeCraneController controller = new BridgeCraneController(bridge, 1);
        ArrayList<MatrizObserver> observers = bridge.getMatrizObserver();
        
        int sizeInicial = observers.size();
		bridge.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
	}

    @Test
	public void removeMatrixObserverView2() {
        BridgeCraneModel bridge = new BridgeCraneModel();
        BridgeCraneController controller = new BridgeCraneController(bridge, 2);
        ArrayList<MatrizObserver> observers = bridge.getMatrizObserver();
        
        int sizeInicial = observers.size();
		bridge.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
    }
    
    @Test
	public void goRightTestCorrect() {
		BridgeCraneModel bridge = new BridgeCraneModel();
		
		while (bridge.getColumnaActual() == 7)	{
			bridge = new BridgeCraneModel();
		}

		int columnaInicial = bridge.getColumnaActual();
		bridge.irDerecha();
		int columnaFinal = bridge.getColumnaActual();
		assertEquals(columnaInicial + 1, columnaFinal);
    }
    
    @Test
	public void goDownTestCorrect() {
		BridgeCraneModel bridge = new BridgeCraneModel();
		
		while (bridge.getFilaActual() == 7)	{
			bridge = new BridgeCraneModel();
		}

		int filaInicial = bridge.getFilaActual();
		bridge.irAbajo();
		int filaFinal = bridge.getFilaActual();
		assertEquals(filaInicial + 1, filaFinal);
    }
    
    @Test
	public void goLeftTestCorrect() {
		BridgeCraneModel bridge = new BridgeCraneModel();
		
		while (bridge.getColumnaActual() == 0)	{
			bridge = new BridgeCraneModel();
		}

		int columnaInicial = bridge.getColumnaActual();
		bridge.irIzquierda();
		int columnaFinal = bridge.getColumnaActual();
		assertEquals(columnaInicial - 1, columnaFinal);
    }
    
    @Test
	public void goUpTestCorrect() {
		BridgeCraneModel bridge = new BridgeCraneModel();
		
		while (bridge.getFilaActual() == 0)	{
			bridge = new BridgeCraneModel();
		}

		int filaInicial = bridge.getFilaActual();
		bridge.irArriba();
		int filaFinal = bridge.getFilaActual();
		assertEquals(filaInicial - 1, filaFinal);
	}
}
