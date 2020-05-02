package e2eTests.cukeStepDefinitions.milesWeb.customer;

import Pages.customer.CustomerPage;
import e2eTests.stepdefinitions.CustomerPageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class CustomerPageCucumberSteps {

    @Steps
    public CustomerPageSteps customerPageSteps;

    @When("navigate to organization {int}")
    public void navigate_to_organization(Integer int1) {
        customerPageSteps.chooseTab(int1);
    }

    @And("he gives a company name {string} in the company form")
    public void heGivesACompanyNameCompany_nameInTheCompanyForm(String name) {
        customerPageSteps.setCompany(name);
    }

    @And("he gives the street name {string} in the contact data form")
    public void heGivesTheStreetNameStreet_nameInTheContactDataForm(String streetName) {
//        customerPage.getOrganizationComponent().setStreetName(streetName);
    }

    @And("he gives the street number {string} in the contact data form")
    public void heGivesTheStreetNumberStreet_numberInTheContactDataForm(String street_number) {
//        customerPage.getOrganizationComponent().setStreetNumber(street_number);
    }

    @And("he gives the city name {string} in the contact data form")
    public void heGivesTheCityNameCity_nameInTheContactDataForm(String city) {
//        customerPage.getOrganizationComponent().setCity(city);
    }

    @And("he gives the zip code {string} in the contact data form")
    public void heGivesTheZipCodeZip_codeInTheContactDataForm(String zipCode) {
//        customerPage.getOrganizationComponent().setZipCode(zipCode);
    }

    @And("he select the country {string} in the contact data form")
    public void heSelectTheCountryCountryInTheContactDataForm(String country) {
//        customerPage.getOrganizationComponent().setCountry(country);
    }

    @And("he gives the phone number {string} in the contact data form")
    public void heGivesThePhoneNumberPhone_numberInTheContactDataForm(String phoneNumber) {
//        customerPage.getOrganizationComponent().setPhoneNumber(phoneNumber);
    }
}
