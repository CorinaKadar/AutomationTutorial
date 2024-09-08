package helperMethods;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@AllArgsConstructor
public class AlertMethods {
    public WebDriver driver;

    //Definim metode generale pt interactiunea cu alerte
    //wait
    public void waitForAlert(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.alertIsPresent());
    }

    //accept
    public void acceptAlert (){
        waitForAlert();
        Alert alertOK = driver.switchTo().alert();
        System.out.println(alertOK.getText());
        alertOK.accept();
    }

    //dismiss
    public void dismissAlert (){
        waitForAlert();
        Alert alertConfirmButton = driver.switchTo().alert();
        System.out.println(alertConfirmButton.getText());
        alertConfirmButton.dismiss();
    }

    //input in alerta
    public void fillAlert(String value){
        Alert alertPromtButton = driver.switchTo().alert();
        System.out.println(alertPromtButton.getText());
        alertPromtButton.sendKeys(value);
        alertPromtButton.accept();
    }
}