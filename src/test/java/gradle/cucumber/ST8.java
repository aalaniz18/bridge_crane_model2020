package gradle.cucumber;

import static org.junit.Assert.assertArrayEquals;
import bridge_crane_project.Controller.*;
import bridge_crane_project.Model.*;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ST8 {
    ControllerInterface controller;
    BridgeCraneModel bridgeCraneModel;
    int [][] pos_inicial;
    int [][] pos_final;

    @Given("test drive ejecutado2")
    public void test_drive_ejecutado2() {
        System.out.println("----------------------- Empieza el System Test -------------------------------------");
        bridgeCraneModel = new BridgeCraneModel();
        controller = new BridgeCraneController(bridgeCraneModel, 1);
    }

    @When("posicionar grua en un limite")
    public void posicionar_grua_en_un_limite() {
        while (bridgeCraneModel.getColumnaActual() != 7)	{
            bridgeCraneModel = new BridgeCraneModel();
            controller = new BridgeCraneController(bridgeCraneModel, 1);
		}
        pos_inicial = bridgeCraneModel.getMatriz();
    }

    @When("mover grua mas alla del limite")
    public void mover_grua_mas_alla_del_limite() {
        controller.increaseBPM();
        pos_final = bridgeCraneModel.getMatriz();
    }

    @Then("check misma posicion")
    public void check_misma_posicion() {
        assertArrayEquals(pos_inicial, pos_final);
    }
}