package pages;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;

    //Constructor
    public ElementsPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Web Tables']")
    public WebElement webTableSubmenu;

    public void navigateToWebTablesPage(){
        elementMethods.clickElement(webTableSubmenu);
    }
}
