package bridge_crane_project.UnitTest;

import bridge_crane_project.Model.BridgeCraneModel;
import bridge_crane_project.Controller.BridgeCraneController;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 */
public class PasswordTest {

	@Test
	public void rightPassWordTest() {
 		BridgeCraneModel model = new BridgeCraneModel();
		BridgeCraneController controller = new BridgeCraneController(model,1);
		
		int rightPassword = 1234;
		int expected = -20;
		
		controller.setBPM(rightPassword);

		assertEquals(expected,model.getBPM()); 
//		assertTrue("Pass Test", true);
	}

	@Test
	public void rightPassWordTest_view2() {
 		BridgeCraneModel model = new BridgeCraneModel();
		BridgeCraneController controller = new BridgeCraneController(model,2);
		
		int rightPassword = 1234;
		int expected = -20;
		
		controller.setBPM(rightPassword);

		assertEquals(expected,model.getBPM()); 
//		assertTrue("Pass Test", true);
	}
	
	@Test
	public void wrongPasswordTest() {
 		BridgeCraneModel model = new BridgeCraneModel();
		BridgeCraneController controller = new BridgeCraneController(model,1);
		
		int wrongPassword = 5554;
		int expected = -10;
		
		controller.setBPM(wrongPassword);
		assertEquals(expected,model.getBPM()); 
//		assertTrue("Pass Test", true);
	}

	@Test
	public void wrongPasswordTest_view2() {
 		BridgeCraneModel model = new BridgeCraneModel();
		BridgeCraneController controller = new BridgeCraneController(model,2);
		
		int wrongPassword = 5554;
		int expected = -10;
		
		controller.setBPM(wrongPassword);
		assertEquals(expected,model.getBPM()); 
//		assertTrue("Pass Test", true);
	}
}
