package bridge_crane_project.TestDrive;

import bridge_crane_project.Controller.BridgeCraneController;
import bridge_crane_project.Controller.ControllerInterface;
import bridge_crane_project.Model.BridgeCraneModel;

/**
 * 
*/
public class ExchangableTestDrive {
	public static void main (String[] args) {
		BridgeCraneModel bridgeCraneModel = new BridgeCraneModel();
        ControllerInterface model = new BridgeCraneController(bridgeCraneModel, 2);
	}

}
