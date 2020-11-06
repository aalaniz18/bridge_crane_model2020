package bridge_crane_project.UnitTest;

import bridge_crane_project.Controller.HeartController;
import bridge_crane_project.Model.HeartModel;
import bridge_crane_project.View.BPMObserver;
import bridge_crane_project.View.BeatObserver;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 * 
 */
public class HeartModelTest {

	@Test
	public void singletonTest() {
		HeartModel h1 = HeartModel.getInstance();
		HeartModel h2 = HeartModel.getInstance();
		assertEquals(h1, h2);
	}
	
	@Test
	public void instancesTest() {
		HeartModel h1 = HeartModel.getInstance();
		int inicial = h1.getCuenta();
		HeartModel.getInstance();	
		int fin = h1.getCuenta();
		assertEquals(inicial + 1, fin);
	}

	@Test
	public void removeBPMObserver() {
		HeartModel model = HeartModel.getInstance();
		HeartController controller = new HeartController(model,1);		
        ArrayList<BPMObserver> observers = model.getBPMObserver();
        
        int sizeInicial = observers.size();
		model.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
	}
	
	@Test
	public void removeBPMObserverView2() {
		HeartModel model = HeartModel.getInstance();
		HeartController controller = new HeartController(model,2);		
        ArrayList<BPMObserver> observers = model.getBPMObserver();
        
        int sizeInicial = observers.size();
		model.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
	}
	
	@Test
	public void removeBeatObserver() {
		HeartModel model = HeartModel.getInstance();
		HeartController controller = new HeartController(model,1);		
        ArrayList<BeatObserver> observers = model.getbeatObservers();
        
		int sizeInicial = observers.size();
		model.notifyBeatObservers();
		model.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
    }

    @Test
	public void removeBeatObserverView2() {
        HeartModel model = HeartModel.getInstance();
		HeartController controller = new HeartController(model,2);	
        ArrayList<BeatObserver> observers = model.getbeatObservers();
        
        int sizeInicial = observers.size();
		model.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
    }

}
