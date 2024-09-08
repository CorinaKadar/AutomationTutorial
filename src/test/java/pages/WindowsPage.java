package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowsPage extends BasePage {

    //Constructor
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id= "tabButton")
    private WebElement newTabButton;

    @FindBy(id= "windowButton")
    private WebElement newWindowButton;

    public void interactWithNewTab(){
        pageMethods.scrollPage(0, 350);
        LoggerUtility.info("The user scrolled down the page");
        elementMethods.waitForElementToBeClickable(newTabButton);
        elementMethods.clickJSElement(newTabButton);
        System.out.println(driver.getCurrentUrl());
        LoggerUtility.info("The user clicked on new tab button");
        windowMethods.switchSpecificTab(1);
        System.out.println(driver.getCurrentUrl());
        LoggerUtility.info("The user switched on second tab");
        windowMethods.closeCurrentTab();
        LoggerUtility.info("The user closed the current tab");
        windowMethods.switchSpecificTab(0);
        LoggerUtility.info("The user switched back on the default tab");
    }

    public void interactWithNewWindow(){
        pageMethods.scrollPage(0, 350);
        LoggerUtility.info("The user scrolled down the page");
        elementMethods.clickElement(newWindowButton);
        System.out.println(driver.getCurrentUrl());
        LoggerUtility.info("The user performed a click");
        windowMethods.switchSpecificTab(1);
        System.out.println(driver.getCurrentUrl());
        LoggerUtility.info("The user switched to another tab");
        windowMethods.closeCurrentTab();
        LoggerUtility.info("The user closed the current tab");
    }
}