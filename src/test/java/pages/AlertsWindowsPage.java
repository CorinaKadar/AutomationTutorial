package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsWindowsPage extends BasePage {

    //Constructor
    public AlertsWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserSubmenu;

    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesSubmenu;

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertsSubmenu;

    public void navigateToWindowPage(){
        pageMethods.scrollPage(0, 350);
        LoggerUtility.info("The user scrolls down the page");
        elementMethods.clickElement(browserSubmenu);
        LoggerUtility.info("The user clicks on Form submenu");

    }

    public void navigateToFramePage(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(framesSubmenu);
        LoggerUtility.info("The user clicks on Frame page");
    }

    public void navigateToAlertsPage(){
        elementMethods.clickElement(alertsSubmenu);
        LoggerUtility.info("The user clicks on alerts form");
    }
}
