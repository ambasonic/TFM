package Pages.customer;

import Components.customer.IndividualComponent;
import Components.customer.OrganizationComponent;
import Components.customer.SoleTraderComponent;
import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage extends ReusableViewElements {

    private final String start = "prospectdetail:prospectView:main:legalentitygroup";
    //div[@id='prospectdetail:prospectView:main:legalentitygroup']/div[2]/span

    public IndividualComponent getIndividualComponent(){return new IndividualComponent (getDriver());}
    public OrganizationComponent getOrganizationComponent(){return new OrganizationComponent(getDriver());}
    public SoleTraderComponent getSoleTraderComponent(){return new SoleTraderComponent(getDriver());}

    public CustomerPage(WebDriver driver) {
        super(driver);
    }

    public void chooseTab(int index){
        System.out.println(findAll(By.id(start)).size());
        findAll(By.id(start)).get(1).click();
        waitABit(2000);
        //element(By.id(start+index)).click();
    }
}
