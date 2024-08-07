package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.HomePage;
import pages.WindowsPage;

public class WindowTest {

    public WebDriver driver;

    @Test
    public void metodaTest() {

        //deschidem un browser
        driver = new ChromeDriver();

        //accesam un anumit URL
        driver.get("https://demoqa.com");

        //Maximize browser
        driver.manage().window().maximize();

        //Definim un obiect de tipul Window Methods
        //WindowMethods windowMethods = new WindowMethods(driver);
        //ElementMethods elementMethods = new ElementMethods(driver);
        //PageMethods pageMethods = new PageMethods(driver);

        HomePage homePage = new HomePage(driver);
        homePage.navigateToAlertsMenu();

        AlertsWindowsPage alertsWindows = new AlertsWindowsPage(driver);
        alertsWindows.navigateToWindowPage();

        WindowsPage windowsPage = new WindowsPage(driver);
        windowsPage.interactWithNewTab();
        windowsPage.interactWithNewWindow();

        //facem un scroll la pagina pt vizibilitate
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,350)", "");
        //pageMethods.scrollPage(0, 350);

        //interactionam cu meniul/submeniul de pe site
        //WebElement alertMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        //alertMenu.click();
        //elementMethods.clickElement(alertMenu);

        //WebElement browserSubmenu = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        //browserSubmenu.click();
        //elementMethods.clickElement(browserSubmenu);

        //New Tab button
        //WebElement newTabButton = driver.findElement(By.id("tabButton"));
        //newTabButton.click();
        //elementMethods.clickElement(newTabButton);

        //Interactionam cu un tab/window nou
        //System.out.println(driver.getTitle()); // getTitle() - afisam in consola titlul paginii curente / pe care ne aflam
        //System.out.println(driver.getCurrentUrl());
        //List<String> tabs = new ArrayList<>(driver.getWindowHandles()); // getWindowHandles() - metoda ce returneaza cate taburi sunt deschise in momentul definirii
        // Ne mutan cu focusul pe un anumit tab
        //driver.switchTo().window(tabs.get(1));
        //windowMethods.switchSpecificTab(1);
        //System.out.println(driver.getCurrentUrl()); // getCurrentUrl() - afisam in consola url-ul paginii curente / pe care ne aflam

        //Inchidem tab-ul curent
        //driver.close(); // incide tab-ul curent iar .quit() inchide browserl cu toate tab-urile (inchide tot)
        //windowMethods.closeCurrentTab();

        //Redirectionam focusul pe un alt tab dupa ce il inchide pe cel anterior
        //driver.switchTo().window(tabs.get(0)); // (0) primul tab
        //windowMethods.switchSpecificTab(0);

        // New Window button
        //WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        //newWindowButton.click();
        //elementMethods.clickElement(newWindowButton);
        //System.out.println(driver.getCurrentUrl());

        //List<String> window = new ArrayList<>(driver.getWindowHandles());
        //driver.switchTo().window(window.get(1));
        //windowMethods.switchSpecificTab(1);
        //System.out.println(driver.getCurrentUrl());

        //Inchidem browserul
        //driver.close();
        //windowMethods.closeCurrentTab();

        driver.quit();
    }
}
