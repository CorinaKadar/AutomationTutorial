package helperMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameMethods {

    public WebDriver driver;

    //Constructor
    public FrameMethods(WebDriver driver) {
        this.driver = driver;
    }

    //Metode generale pt interactiunea cu iFrame-uri

    public void switchToFrame(String text){
        driver.switchTo().frame(text);
    }

    public void switchToChildFrame(WebElement element){
        driver.switchTo().frame(element);
    }

    public void defaultContentMethod(){
        driver.switchTo().defaultContent();
    }

}
