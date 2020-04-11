package e2eTests.stepdefinitions;

import Pages.sale.SalePage;
import net.thucydides.core.annotations.Step;

public class SalePageSteps {

    SalePage salePage;

    @Step("The dealer select the vehicle manufacturer: {0}")
    public void selectCarManufacturer(String manufacturer) {
        salePage.getVehicleComponent().selectCarManufacturer(manufacturer);
    }

    @Step("The dealer open the make field box")
    public void openMakeSelectionBox() {
        salePage.getVehicleComponent().openMakeSelectionBox();
    }

    @Step("The dealer selects a car model:{0}")
    public void selectCarModel(String model) {
        salePage.getVehicleComponent().selectCarModel();
    }
}
