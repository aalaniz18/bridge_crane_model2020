package bridge_crane_project.UnitTest;

import bridge_crane_project.Model.BeatModel;
import bridge_crane_project.Model.BeatModelInterface;
import bridge_crane_project.Controller.BeatController;
import bridge_crane_project.View.BPMObserver;
import bridge_crane_project.View.BeatObserver;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 * 
 */
public class BeatTest {
	@Test
	public void negativeSetTest() {
 		BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,1);		
		int inicial = model.getBPM();
		controller.setBPM(-15);
		int fin = model.getBPM();		
		assertEquals(inicial,fin);	 
//		assertTrue("Pass Test", true);
	}
	
	@Test
	public void negativeSetTest_view2() {
 		BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,2);		
		int inicial = model.getBPM();
		controller.setBPM(-15);
		int fin = model.getBPM();		
		assertEquals(inicial,fin);	 
//		assertTrue("Pass Test", true);
	}

	@Test
	public void negativeDecreaseTest() {
		BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,1);		
		controller.setBPM(0);
		controller.decreaseBPM();	
		assertEquals(0,model.getBPM());	 
//		assertTrue("Pass Test", true);
	}

	@Test
	public void negativeDecreaseTest_view2() {
		BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,2);		
		controller.setBPM(0);
		controller.decreaseBPM();	
		assertEquals(0,model.getBPM());	 
//		assertTrue("Pass Test", true);
	}

	@Test
	public void increaseTest() {
		BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,1);		
		controller.setBPM(0);
		controller.increaseBPM();	
		assertEquals(1,model.getBPM());	 
//		assertTrue("Pass Test", true);
	}

	@Test
	public void increaseTest_view2() {
		BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,2);		
		controller.setBPM(0);
		controller.increaseBPM();	
		assertEquals(1,model.getBPM());	 
//		assertTrue("Pass Test", true);
	}

	@Test
	public void decreaseTest() {
		BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,1);		
		controller.setBPM(1);
		controller.decreaseBPM();	
		assertEquals(0,model.getBPM());	 
//		assertTrue("Pass Test", true);
	}

	@Test
	public void decreaseTest_view2() {
		BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,2);		
		controller.setBPM(1);
		controller.decreaseBPM();	
		assertEquals(0,model.getBPM());	 
//		assertTrue("Pass Test", true);
	}


    @Test
	public void removeBPMObserver() {
		BeatModel model = new BeatModel();
		BeatController controller = new BeatController(model,1);		
        ArrayList<BPMObserver> observers = model.getBPMObserver();
        
        int sizeInicial = observers.size();
		model.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
	}
	
	@Test
	public void removeBPMObserverView2() {
		BeatModel model = new BeatModel();
		BeatController controller = new BeatController(model,2);		
        ArrayList<BPMObserver> observers = model.getBPMObserver();
        
        int sizeInicial = observers.size();
		model.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
	}
	
	@Test
	public void removeBeatObserver() {
        BeatModel model = new BeatModel();
		BeatController controller = new BeatController(model,2);
        ArrayList<BeatObserver> observers = model.getbeatObservers();
        
		int sizeInicial = observers.size();
		model.notifyBeatObservers();
		model.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
    }

    @Test
	public void removeBeatObserverView2() {
        BeatModel model = new BeatModel();
		BeatController controller = new BeatController(model,2);
        ArrayList<BeatObserver> observers = model.getbeatObservers();
        
        int sizeInicial = observers.size();
		model.removeObserver(observers.get(0));
		int sizeFinal = observers.size();
		
		assertEquals(sizeInicial-1, sizeFinal);
    }

	@Test
	public void offBeatModel() {
        BeatModel model = new BeatModel();
		BeatController controller = new BeatController(model,1);

		boolean isRunningInicial = model.getIsRunning();
		model.on();
		model.off();
		boolean isRunningFinal = model.getIsRunning();
		
		assertEquals(isRunningInicial, isRunningFinal);
	}				
}
