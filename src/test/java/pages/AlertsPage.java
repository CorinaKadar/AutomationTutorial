package pages;

import loggerUtility.LoggerUtility;
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
        LoggerUtility.info("The user clicks on the 1st 'Click me' button from the page");
        alertMethods.acceptAlert();
        LoggerUtility.info("The user click on the 'OK' button from the displayed alert");
    }

    public void interactWithTimerAlertButton(){
        elementMethods.clickElement(timerAlertButtonElement);
        LoggerUtility.info("The user clicks on the 2nd 'Click me' button from the page");
        alertMethods.waitForAlert();
        alertMethods.acceptAlert();
        LoggerUtility.info("The user click on the 'OK' button from the displayed alert");
    }

    public void interactWithConfirmButton(){
        elementMethods.clickElement(confirmButtonElement);
        LoggerUtility.info("The user clicks on the 3rd 'Click me' button from the page");
        alertMethods.dismissAlert();
        LoggerUtility.info("The user click on the 'Cancel' button from the displayed alert");
    }

    public void interactWithPromtButton(){
        elementMethods.clickElement(promtButtonElement);
        LoggerUtility.info("The user clicks on the 4th 'Click me' button from the page");
        alertMethods.fillAlert("Corina");
        LoggerUtility.info("The user submits the text in the prompt");
    }
}