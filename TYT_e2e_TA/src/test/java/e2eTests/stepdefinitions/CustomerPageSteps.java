package e2eTests.stepdefinitions;

import Pages.customer.CustomerPage;
import net.thucydides.core.annotations.Step;

public class CustomerPageSteps {
    CustomerPage customerPage;

    @Step("The do something ....")
    public void chooseTab(Integer tabNum) {
        customerPage.chooseTab(tabNum);
    }

    @Step()
    public void setCompany(String name) {
        customerPage.getOrganizationComponent().setCompany(name);
    }


    public void setTrader(String name) {
        customerPage.getSoleTraderComponent().setTrader(name);
    }
}
