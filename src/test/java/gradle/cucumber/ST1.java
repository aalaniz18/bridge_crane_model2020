package gradle.cucumber;

import static org.junit.Assert.assertArrayEquals;
import bridge_crane_project.Controller.*;
import bridge_crane_project.Model.*;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ST1 {
    ControllerInterface controller;
    BridgeCraneModel bridgeCraneModel;
    int [][] pos_inicial;
    int [][] pos_final;

    @Given("test drive ejecutado")
    public void test_drive_ejecutado() {
        System.out.println("----------------------- Empieza el System Test -------------------------------------");
        bridgeCraneModel = new BridgeCraneModel();
        controller = new BridgeCraneController(bridgeCraneModel, 1);
    }

    @When("mover grua 1")
    public void mover_grua_1() {
        controller.decreaseBPM();
        pos_inicial = bridgeCraneModel.getMatriz();
    }

    @When("ingresa contrasenia")
    public void ingresa_contrasenia() {
        controller.setBPM(1234);
    }

    @When("mover la grua 2")
    public void mover_la_grua_2() {
        controller.down();
        pos_final=bridgeCraneModel.getMatriz();
    }

    @Then("misma posicion")
    public void misma_posicion() {
        assertArrayEquals(pos_inicial, pos_final);
    }

    @After
    public void end() {
        System.out.println("----------------------- Termina el System Test -------------------------------------");
    }

}