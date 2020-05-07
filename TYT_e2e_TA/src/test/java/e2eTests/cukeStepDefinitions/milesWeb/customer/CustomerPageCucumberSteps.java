package e2eTests.cukeStepDefinitions.milesWeb.customer;

import Pages.customer.CustomerPage;
import e2eTests.stepdefinitions.CustomerPageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CustomerPageCucumberSteps {

    CustomerPage customerPage;
    @Steps
    public CustomerPageSteps customerPageSteps;

    @When("navigate to organization {int}")
    public void navigate_to_organization(Integer int1) {
        customerPageSteps.chooseTab(int1);
    }

    @And("he gives a company name {string} in the company form")
    public void he_gives_a_company_name_in_the_company_form(String name) {
        customerPageSteps.setCompany(name);
    }

    @And("he gives the street name {string} in the contact data form")
    public void heGivesTheStreetNameStreet_nameInTheContactDataForm(String streetName) {
        customerPageSteps.setStreetName(streetName);
    }

    @And("he gives the street number {string} in the contact data form")
    public void heGivesTheStreetNumberStreet_numberInTheContactDataForm(String street_number) {
        customerPageSteps.setStreetNumber(street_number);
    }

    @And("he gives the city name {string} in the contact data form")
    public void heGivesTheCityNameCity_nameInTheContactDataForm(String city) {
        customerPage.getOrganizationComponent().setCity(city);
    }

    @And("he gives the zip code {string} in the contact data form")
    public void heGivesTheZipCodeZip_codeInTheContactDataForm(String zipCode) {
        customerPage.getOrganizationComponent().setZipCode(zipCode);
    }

    @And("he select the country {string} in the contact data form")
    public void heSelectTheCountryCountryInTheContactDataForm(String country) {
        customerPage.getOrganizationComponent().setCountry(country);
    }

    @And("he gives the phone number {string} in the contact data form")
    public void heGivesThePhoneNumberPhone_numberInTheContactDataForm(String phoneNumber) {
        customerPage.getOrganizationComponent().setPhoneNumber(phoneNumber);
    }

    @And("he selects the legal entity {string}")
    public void heSelectTheLegalEntityLegal_entity(String legalEntity) {
        customerPage.getOrganizationComponent().setLegal_entity(legalEntity);
    }

    @And("he click on the button save")
    public void heClickOnTheButtonSave() {
        customerPage.getOrganizationComponent().save();
    }

    @And("he choose the legal entity {string}")
    public void heChooseTheLegalEntityLegal(String legalEntity) {
        customerPage.getOrganizationComponent().setLegal_entity(legalEntity);
    }

    @And("he go to contact person and selects the title {string}")
    public void heGoToContactPersonAndSelectsTheTitleTitle(String title) {
        customerPage.getOrganizationComponent().setTitle(title);
    }

    @And("he gives the surname {string}")
    public void heGivesTheSurname(String surname) {
        customerPage.getOrganizationComponent().setSurname(surname);
    }

    @And("he gives the first name {string}")
    public void heGivesTheFirstName(String firstName) {
        customerPage.getOrganizationComponent().setName(firstName);
    }

    @And("he gives the email {string}")
    public void heGivesTheEmail(String email) {
        customerPage.getOrganizationComponent().setEmail(email);
    }

    @And("he gives the date of birth {string}")
    public void heGivesTheDateOfBirth(String birthDate) {
        customerPage.getOrganizationComponent().setBirthDate(birthDate);
    }
}
