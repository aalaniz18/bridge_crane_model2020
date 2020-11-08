package gradle.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SystemTest1 {

    @Given("step1")
    public void step1() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Open Google");
    }

    @When("step2")
    public void step2() {
        System.out.println("First " + " Second ");
    }

    @Then("step3")
    public void step3() {
        System.out.println("Result " );
        System.out.println("============================================================");
    }

    @After
    public void end() {
        System.out.println("Process End");
    }

}
