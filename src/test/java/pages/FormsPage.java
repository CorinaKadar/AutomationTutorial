package pages;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;


    //Constructor
    public FormsPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    public WebElement practiceFormSubmenu;

    public void navigateToPracticeFormPage(){
        elementMethods.clickElement(practiceFormSubmenu);
    }

}
