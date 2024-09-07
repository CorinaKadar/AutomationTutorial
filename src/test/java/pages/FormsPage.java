package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{

    //Constructor
    public FormsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceFormSubmenu;

    public void navigateToPracticeFormPage(){
        elementMethods.clickElement(practiceFormSubmenu);
        LoggerUtility.info("The user clicks on the Practice Form submenu");
    }
}