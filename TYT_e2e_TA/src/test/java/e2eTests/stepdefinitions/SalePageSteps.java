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

    @Step("The dealer selects '{0}' as model")
    public void selectCarModel(String model) {
        salePage.getVehicleComponent().selectCarModel();
    }

    @Step("The dealer selects '{0}' as type")
    public void selectCarType(String type) { salePage.getVehicleComponent().selCarType();
    }

    @Step("The dealer clicks on next")
    public void clickOnNext() {
        salePage.clickOnNext();
    }

    @Step("The dealer selects the car color: {0}")
    public void setCarColor(String colorName) {
        salePage.getOptionsComponent().setCarColor();
    }
    @Step("The dealer selects the car upholstery: {0}")
    public void setUpholstery(String upholstery) {
        salePage.getOptionsComponent().setUpholstery();
    }

    @Step("The dealer validates the option: {0} from pop menu")
    public void setOption(String option) {
        salePage.getOptionsComponent().setOption();
    }

    @Step("The dealer click on the search button")
    public void clickOnSearch() {
        salePage.getCustomerComponent().clickOnSearch();
    }

    @Step("The dealer switch to organization search menu")
    public void switchToOrganizationSearch(){
        salePage.getCustomerComponent().switchToOrganizationSearch();
    }

    @Step("The dealer select a organization")
    public void selectOrganization(){
        salePage.getCustomerComponent().selectOrganization();
    }

    public void acceptAndConfirmConditions() {
        salePage.getCustomerComponent().acceptAndConfirmConditions();
    }
}

