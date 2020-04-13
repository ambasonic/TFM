package e2eTests.cukeStepDefinitions.sale;


import e2eTests.stepdefinitions.SalePageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SalePageCucumberSteps {

    @Steps
    SalePageSteps salePageSteps;

    @When("he selects a vehicle {string}")
    public void he_selects_a_vehicle(String manufacturer) {
//        salePageSteps.openMakeSelectionBox(); //Only use if the box is not activated
        salePageSteps.selectCarManufacturer(manufacturer);

    }

    @And("he selects a model {string}")
    public void he_selects_a_model(String model) {
        salePageSteps.selectCarModel("model");
    }

    @And("he selects the type {string}")
    public void he_selects_the_type(String type) {
        salePageSteps.selectCarType(type);
    }

    @And("he go to the next page")
    public void he_go_to_the_next_page() {
        salePageSteps.clickOnNext();
    }

    @Then("he can selects vehicle options")
    public void he_can_selects_vehicle_options() {
    }

    @Then("he chooses color {string} and upholstery {string}")
    public void he_chooses_color_and_upholstery(String colorName, String upholstery) {
        salePageSteps.setCarColor(colorName);
        salePageSteps.setUpholstery(upholstery);
    }

    @And("he selects an option {string}")
    public void he_selects_an_option(String option) {
        salePageSteps.setOption(option);
    }

    @Then("he search a customer")
    public void he_search_a_customer(){ //TODO maybe define a customer in test data
        salePageSteps.clickOnSearch();
        salePageSteps.switchToOrganizationSearch();
        salePageSteps.selectOrganization();
    }

    @Then("he accept the condition")
    public void he_accept_the_condition() {
        salePageSteps.acceptAndConfirmConditions();

    }
}
