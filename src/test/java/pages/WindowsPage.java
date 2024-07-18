package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsPage extends BasePage {

    //public WebDriver driver;
    //public ElementMethods elementMethods;
    //public PageMethods pageMethods;
    //public WindowMethods windowMethods;

    //Constructor
    public WindowsPage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
        //elementMethods = new ElementMethods(driver);
        //pageMethods = new PageMethods(driver);
        //windowMethods = new WindowMethods(driver);
        //PageFactory.initElements(driver, this);
    }

    @FindBy(id= "tabButton")
    private WebElement newTabButton;

    @FindBy(id= "windowButton")
    private WebElement newWindowButton;

    public void interactWithNewTab(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(newTabButton);
        System.out.println(driver.getCurrentUrl());
        windowMethods.switchSpecificTab(1);
        System.out.println(driver.getCurrentUrl());
        windowMethods.closeCurrentTab();
        windowMethods.switchSpecificTab(0);
    }

    public void interactWithNewWindow(){
        pageMethods.scrollPage(0, 350);
        elementMethods.clickElement(newWindowButton);
        System.out.println(driver.getCurrentUrl());
        windowMethods.switchSpecificTab(1);
        System.out.println(driver.getCurrentUrl());
        windowMethods.closeCurrentTab();
    }
}
