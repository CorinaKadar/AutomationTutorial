package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage{

    //public WebDriver driver;
    //public ElementMethods elementMethods;
    //public PageMethods pageMethods;
    //public AlertMethods alertMethods;

    //Constructor
    public AlertsPage(WebDriver driver) {
        super(driver);

        //this.driver = driver;
        //elementMethods = new ElementMethods(driver);
        //pageMethods = new PageMethods(driver);
        //alertMethods = new AlertMethods(driver);
        //PageFactory.initElements(driver, this);
    }

    @FindBy(id = "alertButton")
    public  WebElement alertButtonElement;

    @FindBy(id = "timerAlertButton")
    public  WebElement timerAlertButtonElement;

    @FindBy(id = "confirmButton")
    public  WebElement confirmButtonElement;

    @FindBy(id = "promtButton")
    public  WebElement promtButtonElement;

    public void interactWithAlertButton(){
        elementMethods.clickElement(alertButtonElement);
        alertMethods.acceptAlert();
    }

    public void interactWithTimerAlertButton(){
        elementMethods.clickElement(timerAlertButtonElement);
        alertMethods.waitForAlert();
        alertMethods.acceptAlert();
    }

    public void interactWithConfirmButton(){
        elementMethods.clickElement(confirmButtonElement);
        alertMethods.dismissAlert();
    }

    public void interactWithPromtButton(){
        elementMethods.clickElement(promtButtonElement);
        alertMethods.fillAlert("Corina");
    }

}
