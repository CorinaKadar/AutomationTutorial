package tests;

import helperMethods.AlertMethods;
import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.AlertsWindowsPage;
import pages.HomePage;
import sharedData.SharedData;

public class AlertTest extends SharedData {

    //public WebDriver driver;

    @Test
    public void metodaTest() {

        //deschidem un browser
        //driver = new ChromeDriver();

        //accesam un anumit URL
        //driver.get("https://demoqa.com");

        //Maximize browser
        //driver.manage().window().maximize();

        //Wait implicit (de ex dupa ce maresti browserul)
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //definim un obiect de tip alertMethods ca sa apelam metodele generale din clasa
        AlertMethods alertMethods = new AlertMethods(getDriver());
        ElementMethods elementMethods = new ElementMethods(getDriver());
        PageMethods pageMethods = new PageMethods(getDriver());

        //facem un scroll la pagina pt vizibilitate
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,350)", "");
        //pageMethods.scrollPage(0,350);

        //interactionam cu meniul/submeniul de pe site
        //WebElement alertMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        //alertMenu.click();
        //elementMethods.clickElement(alertMenu);

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToAlertsMenu();

        //WebElement alertsSubmenu = driver.findElement(By.xpath("//span[text()='Alerts']"));
        //alertsSubmenu.click();
        //elementMethods.clickElement(alertsSubmenu);

        AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage(getDriver());
        alertsWindowsPage.navigateToAlertsPage();

        //Interactionam cu o alerta
        // 1.Click me - alertButton
        //WebElement alertButtonElement = driver.findElement(By.id("alertButton"));
        //alertButtonElement.click();
        //elementMethods.clickElement(alertButtonElement);

        AlertsPage alertsPage = new AlertsPage(getDriver());
        alertsPage.interactWithAlertButton();

        //Alert alertOK = driver.switchTo().alert();
        //System.out.println(alertOK.getText()); // dovedim ca interactioneaza cu alerta
        //alertOK.accept();

        //Apelam alertMethods pt a simplifica
        //alertMethods.acceptAlert();

        //Interactionam cu o alerta care trebuie sa astepte putin
        // 2.Click me - timerAlertButton
        //wait implicit - cel mai des folosit, specific pe o problema sau structura, are rol sa vegheze asupra tuturor linilor cu aceasi structura, de mai jos de tip findElement ex: WebElement alertMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        //wait explicit - explicit in zona respectiva e o problema, fara a identifica exact problema, mai mult o exceptie
        //WebElement timerAlertButtonElement = driver.findElement(By.id("timerAlertButton"));
        //timerAlertButtonElement.click();
        //elementMethods.clickElement(timerAlertButtonElement);
        //implicit cel mai bine functoneaza pt identificare de elemente
        //Definim un Wait explicit - cel mai bine pt un timer
        //WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //webDriverWait.until(ExpectedConditions.alertIsPresent());

        //Apelam alertMethods pt a simplifica
        //alertMethods.waitForAlert();

        //Alert waitAlert = driver.switchTo().alert();
        //System.out.println(waitAlert.getText());
        //waitAlert.accept();

        //Apelam alertMethods pt a simplifica
        //alertMethods.acceptAlert();

        alertsPage.interactWithTimerAlertButton();

        // 3.Click me - confirmButton
        //WebElement confirmButtonElement = driver.findElement(By.id("confirmButton"));
        //confirmButtonElement.click();
        //elementMethods.clickElement(confirmButtonElement);

        //Alert alertConfirmButton = driver.switchTo().alert();
        //System.out.println(alertConfirmButton.getText());
        //alertConfirmButton.dismiss();

        //Apelam alertMethods pt a simplifica
        //alertMethods.dismissAlert();

        alertsPage.interactWithConfirmButton();

        // 4.Click me - promtButton
        //WebElement promtButtonElement = driver.findElement(By.id("promtButton"));
        //promtButtonElement.click();
        //elementMethods.clickElement(promtButtonElement);

        //Alert alertPromtButton = driver.switchTo().alert();
        //System.out.println(alertPromtButton.getText());
        //String promtButtonValue = "Corina";
        //alertPromtButton.sendKeys(promtButtonValue);
        //alertPromtButton.accept();

        //Apelam alertMethods pt a simplifica
        //alertMethods.fillAlert("Corina");

        alertsPage.interactWithPromtButton();

    }
}
