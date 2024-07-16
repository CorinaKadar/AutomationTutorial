package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NestedFramePage extends BasePage{

    //public WebDriver driver;
    //public ElementMethods elementMethods;
    //public PageMethods pageMethods;
    //public FrameMethods frameMethods;

    //Constructor
    public NestedFramePage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
        //elementMethods = new ElementMethods(driver);
        //pageMethods = new PageMethods(driver);
        //frameMethods = new FrameMethods(driver);
        //PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//iframe[@srcdoc='<p>Child Iframe</p>']")
    public WebElement childFrame;

    @FindBy(xpath = "//p")
    public  WebElement textChildFrame;

    public void interactWithNestedFrame() {
        frameMethods.switchToFrame("frame1");
        frameMethods.switchToChildFrame(childFrame);
        System.out.println(textChildFrame.getText());
    }
}
