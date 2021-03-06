package bridge_crane_project.Model;

import bridge_crane_project.View.BPMObserver;
import bridge_crane_project.View.BeatObserver;
import bridge_crane_project.View.MatrizObserver;
  
/**
 * 
*/
public interface BeatModelInterface {
	void initialize();
  
	void on();
  
	void off();
  
    void setBPM(int bpm);
  
	int getBPM();
  
	void registerObserver(BeatObserver o);
  
	void removeObserver(BeatObserver o);
  
	void registerObserver(BPMObserver o);
  
	void removeObserver(BPMObserver o);
	
	void registerObserver(MatrizObserver o);
	
	void removeObserver(MatrizObserver o);

	int[][] getMatriz();
}
