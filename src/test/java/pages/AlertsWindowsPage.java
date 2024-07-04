package pages;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import helperMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsWindowsPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    //Constructor
    public AlertsWindowsPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Browser Windows']")
    public WebElement browserSubmenu;

    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement framesSubmenu;

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertsSubmenu;

    public void navigateToWindowPage(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(browserSubmenu);
    }

    public void navigateToFramePage(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(framesSubmenu);
    }

    public void navigateToAlertsPage(){
        elementMethods.clickElement(alertsSubmenu);
    }
}
