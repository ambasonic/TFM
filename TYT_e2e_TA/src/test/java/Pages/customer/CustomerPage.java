package Pages.customer;

import Components.customer.IndividualComponent;
import Components.customer.OrganizationComponent;
import Components.customer.SoleTraderComponent;
import Pages.ReusableViewElements;
import org.openqa.selenium.WebDriver;

public class CustomerPage extends ReusableViewElements {

    public IndividualComponent getIndividualComponent(){return new IndividualComponent (getDriver());}
    public OrganizationComponent getOrganizationComponent(){return new OrganizationComponent(getDriver());}
    public SoleTraderComponent getSoleTraderComponent(){return new SoleTraderComponent(getDriver());}

    public CustomerPage(WebDriver driver) {
        super(driver);
    }
}
