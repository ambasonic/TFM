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

    @Step("The dealer set the customer name: {0} into the search field and click on search ")
    public void searchCustomerByName(String customerName) {
        salePage.getCustomerComponent().searchCustomerByName(customerName);
    }

    @Step("The dealer switch to organization search menu")
    public void switchToOrganizationSearch(){
        salePage.getCustomerComponent().switchToOrganizationSearch();
    }

    @Step("The dealer select a organization")
    public void selectOrganization(){
        salePage.getCustomerComponent().selectOrganization();
    }

    public void acceptProspectAgreement() {
        salePage.getCustomerComponent().acceptProspectAgreement();
    }

    @Step("The dealer click on the burger menu Kinto one")
    public void clickOnTheBurgerMenu() {
        salePage.clickOnTheBurgerMenu();
    }

    @Step("The dealer click on sale button")
    public void clickOnSale() {
        salePage.clickOnSale();
    }

    @Step("The dealer click on pending quotation")
    public void clickOnPendingQuotations() {
        salePage.clickOnPendingQuotations();
    }

    @Step("The dealer select the quote to duplicate")
    public void selectQuote() {
        salePage.getQuotationSearchComponent().selectQuote();
    }

    @Step("The dealer open the quote action menu")
    public void openQuoteActionsMenu() {
        salePage.getQuotationSearchComponent().openQuoteActionsMenu();
    }

    @Step("The dealer click on copy")
    public void copyQuote() {
        salePage.getQuotationSearchComponent().copyQuote();
    }

    @Step("The dealer update the duration to {0} ")
    public void setDuration(int duration) {
        salePage.getFinancesServicesComponent().setDuration(duration);
    }

    @Step("The dealer update the distance to {0} ")
    public void setDistance(int distance) {
        salePage.getFinancesServicesComponent().setDistance(distance);
    }

    @Step("The dealer select the payment method: {1}")
    public void selectPaymentMethod(int paymentIndex, String paymentName) {
        salePage.getFinancesServicesComponent().selectPaymentMethod(paymentIndex, paymentName);
    }

    @Step("The dealer set the relief vehicle to: {0}")
    public void setReliefVehicle(String option) {
        if(option.equalsIgnoreCase("yes")){
            salePage.getFinancesServicesComponent().setReliefVehicle(true);
        }else {
            salePage.getFinancesServicesComponent().setReliefVehicle(false);
        }
    }

    @Step("The dealer selects the tires type {1}")
    public void selectTireType(int tiresIndex, String tiresType) {
        salePage.getFinancesServicesComponent().selectTires(tiresIndex, tiresType);
    }

    @Step("The dealer adds {0} tires")
    public void addTires(int tiresNumber) {
        salePage.getFinancesServicesComponent().setTiresNumber(tiresNumber);
    }

    @Step("The dealer calculates the quote")
    public void calculateQuote() {
        salePage.getFinancesServicesComponent().quoteCalculation();
    }

    @Step("the dealer saved it")
    public void save() {
        salePage.getFinancesServicesComponent().saveQuote();
    }
}

