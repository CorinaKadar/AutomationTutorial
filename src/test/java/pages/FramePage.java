package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage{

    //Constructor
    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sampleHeading")
    private WebElement iFrame1Text;

    @FindBy(id = "sampleHeading")
    private WebElement iFrame2Text;

    @FindBy(xpath = "//span[text()='Nested Frames']")
    private WebElement nestedFramesSubmenu;

    public void interactWithBigIFrame(){
        frameMethods.switchToFrame("frame1");
        LoggerUtility.info("The user switches to a specific frame");
        System.out.println(iFrame1Text.getText());
        LoggerUtility.info("The user interacts with an element inside the frame");
        frameMethods.defaultContentMethod();
        LoggerUtility.info("The user switches to primary frame");
    }

    public void interactWithSmallIFrame(){
        frameMethods.switchToFrame("frame2");
        LoggerUtility.info("The user switches to a specific frame");
        System.out.println(iFrame2Text.getText());
        LoggerUtility.info("The user interacts with an element inside the frame");
        frameMethods.defaultContentMethod();
        LoggerUtility.info("The user switches to primary frame");
    }

    public void navigateToNestedFrame(){
        pageMethods.scrollPage(0, 350);
        LoggerUtility.info("The user scrolled down the page");
        elementMethods.clickElement(nestedFramesSubmenu);
        LoggerUtility.info("The user interacts with a nested frame");
    }
}