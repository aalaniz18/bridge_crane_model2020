package bridge_crane_project.UnitTest;

import bridge_crane_project.Model.BridgeCraneModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 */
public class BPMSetTest {

	@Test
	public void test() {
		int expected = 50;
		BridgeCraneModel bridge = new BridgeCraneModel();
		bridge.setBPM(expected);
		int real = bridge.getBPM();		
		assertEquals(expected, real);
	}

}
