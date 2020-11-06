package bridge_crane_project.UnitTest;

import bridge_crane_project.Model.HeartModel;
import bridge_crane_project.Controller.HeartController;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 */
public class HeartControllerTest {
	
	@Test
	public void newControllerTest() {
		HeartModel heartModel = HeartModel.getInstance();
        HeartController controller = new HeartController(heartModel,1);
        int inicial = heartModel.getCuenta();
		controller.increaseBPM();	
		int fin = heartModel.getCuenta();
		assertEquals(inicial + 1, fin);
	}

	@Test
	public void newControllerTest_view2() {
		HeartModel heartModel = HeartModel.getInstance();
        HeartController controller = new HeartController(heartModel,2);
        int inicial = heartModel.getCuenta();
		controller.increaseBPM();	
		int fin = heartModel.getCuenta();
		assertEquals(inicial + 1, fin);
	}

}
