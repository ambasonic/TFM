package e2eTests.cukeStepDefinitions.milesRia;

import e2eTests.stepdefinitions.milesRia.VehicleOrderMRSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class VehicleOrderCucumberSteps {

    @Steps
    VehicleOrderMRSteps vehicleOrderMRSteps;


    @And("he update the delivery date")
    public void heUpdateTheDeliveryDate() {
        vehicleOrderMRSteps.setRequestDeliveryDate();
    }
}
