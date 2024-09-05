package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NestedFramePage extends BasePage{

    //Constructor
    public NestedFramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//iframe[@srcdoc='<p>Child Iframe</p>']")
    private WebElement childFrame;

    @FindBy(xpath = "//p")
    private  WebElement textChildFrame;

    public void interactWithNestedFrame() {
        frameMethods.switchToFrame("frame1");
        LoggerUtility.info("The user switches to a specific frame");
        frameMethods.switchToChildFrame(childFrame);
        LoggerUtility.info("The user switches to a child frame");
        System.out.println(textChildFrame.getText());
        LoggerUtility.info("The user interacts with an element inside the child frame");
        frameMethods.defaultContentMethod();
        LoggerUtility.info("The user switches to primary frame");
    }
}
