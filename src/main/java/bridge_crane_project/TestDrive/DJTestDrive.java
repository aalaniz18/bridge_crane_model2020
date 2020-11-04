package bridge_crane_project.TestDrive;

//package bridge_crane_project.TestDrive;

import bridge_crane_project.Controller.BeatController;
import bridge_crane_project.Controller.ControllerInterface;
import bridge_crane_project.Model.BeatModel;
import bridge_crane_project.Model.BeatModelInterface;
  
public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model,1);
    }
}
