package sharedData;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void prepareEnv(){
        driver = new EdgeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoggerUtility.info("The browser is opened with success");
    }

    @AfterMethod
    public void clearEnv(ITestResult result){
        if (!result.isSuccess()) { // Daca nu-i cu succes
            LoggerUtility.error(result.getThrowable().getMessage());
        }
        driver.quit();
        LoggerUtility.info("The browser is closed with success");
    }
}
