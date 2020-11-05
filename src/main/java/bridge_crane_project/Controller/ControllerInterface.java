package bridge_crane_project.Controller;
  
/**
 * 
*/
public interface ControllerInterface {
	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
 	void setBPM(int bpm);
 	void up();
 	void down();
}
