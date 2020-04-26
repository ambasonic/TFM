package e2eTests.stepdefinitions.milesRia;

import Pages.milesRiaTabs.VehicleOrderTab;
import net.thucydides.core.annotations.Step;

public class VehicleOrderMRSteps {

    VehicleOrderTab vehicleOrderTab;

    @Step("The dealer set the delivery date")
    public void setRequestDeliveryDate() {
        vehicleOrderTab.getVehicleOrderInfComponent().setRequestDeliveryDate();
    }
}
