package e2eTests.cukeStepDefinitions.milesRia;

import e2eTests.stepdefinitions.milesRia.VehicleOrderMRSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class VehicleOrderCucumberSteps {

    @Steps
    VehicleOrderMRSteps vehicleOrderMRSteps;


    @And("he update the delivery date")
    public void heUpdateTheDeliveryDate() {
        int numBerOfDaysInTheFuture = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
        String futureDate = getFutureDate(numBerOfDaysInTheFuture); // TODO pour pouvoir r?utiliser une quote je dois au moins changer la date
        vehicleOrderMRSteps.setRequestDeliveryDate(futureDate);
        vehicleOrderMRSteps.setEstimatedDeliveryDate(futureDate);
        vehicleOrderMRSteps.setActualDeliveryDate(futureDate);
    }

    @And("he set the supplier name to {string}")
    public void setSupplierName(String name) {
        vehicleOrderMRSteps.setSupplierName(name);
    }

    private String getFutureDate(int numBerOfDaysInTheFuture) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, numBerOfDaysInTheFuture);
        DateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );
        return formatter.format(calendar.getTime());
    }
}
