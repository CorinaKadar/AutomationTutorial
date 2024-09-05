package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    //Constructor
    public HomePage(WebDriver driver){
         super(driver);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertMenu; // identificarea elementului se salveaza in variabila alertMenu

    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formMenu;

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsMenu;

    public void navigateToAlertsMenu(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(alertMenu);
    }

    public void navigateToFormMenu(){
        pageMethods.scrollPage(0,350);
        elementMethods.clickElement(formMenu);
    }

    public void navigateToElementsMenu(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(elementsMenu);
    }
}
