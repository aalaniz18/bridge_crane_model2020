package bridge_crane_project.TestDrive;

import bridge_crane_project.Controller.BeatController;
import bridge_crane_project.Controller.BridgeCraneController;
import bridge_crane_project.Controller.ControllerInterface;
import bridge_crane_project.Controller.HeartController;
import bridge_crane_project.Model.BeatModel;
import bridge_crane_project.Model.BeatModelInterface;
import bridge_crane_project.Model.BridgeCraneModel;
import bridge_crane_project.Model.HeartModel;
  
/**
 * 
*/
public class SimultaneousTestDrive {

    public static void main (String[] args) {
    	
    	BridgeCraneModel bridgeCraneModel = new BridgeCraneModel();
        ControllerInterface model2 = new BridgeCraneController(bridgeCraneModel, 1);
		
    	HeartModel heartModel = HeartModel.getInstance();
        ControllerInterface model1 = new HeartController(heartModel, 1);
        
        BeatModelInterface beatModel = new BeatModel();
		ControllerInterface model3 = new BeatController(beatModel, 1);
        
    }
}
