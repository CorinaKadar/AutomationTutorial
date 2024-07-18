package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage{

    //public WebDriver driver;
    //public ElementMethods elementMethods;
    //public PageMethods pageMethods;

    //Constructor
    public ElementsPage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
        //elementMethods = new ElementMethods(driver);
        //pageMethods = new PageMethods(driver);
        //PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    private WebElement webTableSubmenu;

    public void navigateToWebTablesPage(){
        elementMethods.clickElement(webTableSubmenu);
    }
}
