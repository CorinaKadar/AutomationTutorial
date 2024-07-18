package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsWindowsPage extends BasePage {

    //public WebDriver driver;
    //public ElementMethods elementMethods;
    //public PageMethods pageMethods;

    //Constructor
    public AlertsWindowsPage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
        //elementMethods = new ElementMethods(driver);
        //pageMethods = new PageMethods(driver);
        //PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserSubmenu;

    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesSubmenu;

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alertsSubmenu;

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
