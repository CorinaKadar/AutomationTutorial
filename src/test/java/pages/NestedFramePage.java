package pages;

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
        frameMethods.switchToChildFrame(childFrame);
        System.out.println(textChildFrame.getText());
    }
}
