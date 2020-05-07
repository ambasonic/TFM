package e2eTests.cukeStepDefinitions.milesRia;

import Utils.generatedTestData.TestDataGenerator;
import e2eTests.stepdefinitions.milesRia.VehicleOrderMRSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class VehicleOrderCucumberSteps extends TestDataGenerator {

    @Steps
    VehicleOrderMRSteps vehicleOrderMRSteps;


    @And("he update the delivery date")
    public void heUpdateTheDeliveryDate() {
        vehicleOrderMRSteps.setRequestDeliveryDate(getActualDate());
        vehicleOrderMRSteps.setEstimatedDeliveryDate(getActualDate());
        vehicleOrderMRSteps.setActualDeliveryDate(getActualDate());
    }

    @And("he set the supplier name to {string}")
    public void setSupplierName(String name) {
        vehicleOrderMRSteps.setSupplierName(name);
    }
}
