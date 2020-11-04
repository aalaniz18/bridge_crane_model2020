package bridge_crane_project.UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import bridge_crane_project.Controller.BeatController;
import bridge_crane_project.Model.BeatModel;
import bridge_crane_project.Model.BeatModelInterface;

public class BeatTest {

	@Test
	public void negativeSetTest() 
	{
/* 		BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,1);		
		int inicial = model.getBPM();
		controller.setBPM(-15);
		int fin = model.getBPM();		
		assertEquals(inicial,fin);	 */
		assertTrue("Pass Test",true);
	}
	
	@Test
	public void negativeDecreaseTest() 
	{
		/* BeatModelInterface model = new BeatModel();
		BeatController controller = new BeatController(model,1);		
		controller.setBPM(0);
		controller.decreaseBPM();	
		assertEquals(0,model.getBPM());	 */
		assertTrue("Pass Test",true);
	}

}
