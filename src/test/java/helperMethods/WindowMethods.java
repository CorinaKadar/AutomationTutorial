package helperMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    public WebDriver driver;

    //Constructor
    public WindowMethods(WebDriver driver) {
        this.driver = driver;
    }

    //Metode generale pt interactiunea cu tab/window

    public void switchSpecificTab (Integer index){

        List<String> window = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(window.get(index));
    }

    public void closeCurrentTab(){
         driver.close();
    }
}
