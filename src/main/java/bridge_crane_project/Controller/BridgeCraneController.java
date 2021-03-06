package bridge_crane_project.Controller;

import bridge_crane_project.Model.BridgeCraneAdapter;
import bridge_crane_project.Model.BridgeCraneModel;
import bridge_crane_project.Model.BridgeCraneModelInterface;
import bridge_crane_project.View.BridgeCraneView;
import bridge_crane_project.View.ExchangeDJView;
import javax.swing.JOptionPane;

/**
 * 
*/
public class BridgeCraneController implements ControllerInterface {
	BridgeCraneModelInterface model;
	BridgeCraneView view;
	ExchangeDJView exchangeView;

	public BridgeCraneController(BridgeCraneModelInterface model, int tipo) {
		this.model = model;
		
		if (tipo == 1) {
			view = new BridgeCraneView(this, new BridgeCraneAdapter(model));
			view.createView();		
			view.createControls();
			view.disableStopMenuItem();
			view.disableStartMenuItem();
			view.createView2();
		} else {
			exchangeView = new ExchangeDJView(this, new BridgeCraneAdapter(model));
			exchangeView.createView();		
			exchangeView.createControls();
			exchangeView.disableStopMenuItem();
			exchangeView.disableStartMenuItem();
			exchangeView.createView2();
		}
	} //la implementacion de los metodos va a depender del modelo
  
	public void start() {}
 
	public void stop() {}
    
	public void increaseBPM() {
		((BridgeCraneModel) model).irDerecha();
	}
    
	public void decreaseBPM() {
		((BridgeCraneModel) model).irIzquierda();
	}
  
 	
 	public void up() {
 		((BridgeCraneModel) model).irArriba();
 	}
 	
 	public void down() {
 		((BridgeCraneModel) model).irAbajo();
 	}

 	public void setBPM(int bpm) {
		if (bpm == 1234) {
			if (model.getBPM() == -10) {
				model.setBPM(-20);
			} else {
				model.setBPM(-10);
			}
 		} else {
			//JOptionPane.showMessageDialog(null, "Contasenia incorrecta");			
 		}
 	}
}
