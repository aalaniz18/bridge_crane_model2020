package bridge_crane_project.View;
  
// import java.awt.*;
// import java.awt.event.*;
import javax.swing.*;

/**
 * 
*/
public class BeatBar extends JProgressBar implements Runnable { 
    JProgressBar progressBar;
	Thread thread;
	boolean run = true;

	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);
		thread.start();
	}

	public void run() {
		while (run) {
			int value = getValue();
			value = (int) (value * .75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {
			}
		}
	}
}
