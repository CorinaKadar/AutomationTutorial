package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage{

    //Constructor
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "alertButton")
    private  WebElement alertButtonElement;

    @FindBy(id = "timerAlertButton")
    private  WebElement timerAlertButtonElement;

    @FindBy(id = "confirmButton")
    private  WebElement confirmButtonElement;

    @FindBy(id = "promtButton")
    private  WebElement promtButtonElement;

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
