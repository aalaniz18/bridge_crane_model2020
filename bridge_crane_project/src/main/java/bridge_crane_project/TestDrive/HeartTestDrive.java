package bridge_crane_project.TestDrive;

import bridge_crane_project.Controller.ControllerInterface;
import bridge_crane_project.Controller.HeartController;
import bridge_crane_project.Model.HeartModel;
  
public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = HeartModel.getInstance();
        ControllerInterface model = new HeartController(heartModel,1);
    }
}
