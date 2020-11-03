package bridge_crane_project.Model;

import bridge_crane_project.View.BPMObserver;
import bridge_crane_project.View.BeatObserver;

public interface HeartModelInterface {
	int getHeartRate();
	int	getCuenta();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
	
}
