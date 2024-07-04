package tests;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;

public class WebTableTest {

    public WebDriver driver;

    @Test
    public void metodaTest(){

        //deschidem un browser
        driver = new ChromeDriver();

        //accesam un anumit URL
        driver.get("https://demoqa.com");

        //Maximize browser
        driver.manage().window().maximize();

        //Close browser
        //driver.quit();

        //Obiecte
        PageMethods pageMethods = new PageMethods(driver);
        ElementMethods elementMethods = new ElementMethods(driver);

        //facem un scroll la pagina pt vizibilitate
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,350)", "");
        //pageMethods.scrollPage(0, 350);

        //interactionam cu meniul/submeniul de pe site
        //WebElement elementsMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        //elementsmenu.click();
        //elementMethods.clickElement(elementsMenu);

        HomePage homePage = new HomePage(driver);
        homePage.navigateToElementsMenu();

        //WebElement webTableSubmenu = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        //webtablesubmenu.click();
        //elementMethods.clickElement(webTableSubmenu);

        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.navigateToWebTablesPage();

        //Test1 - Adaugam un nou entry
        //Definim un element dupa id -->Cream o variabila locala (addElement) pt path-ul elementului (dupa id)
        //WebElement addElement = driver.findElement(By.id("addNewRecordButton"));
        //addElement.click();
        //elementMethods.clickElement(addElement);

        //First Name field
        //WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstNameValue = "Corina"; //am creat o variabila ce detine valoarea ce o vreau inserata in First Name
        //firstNameElement.sendKeys(firstNameValue); //introduce variabila creata anterior
        //elementMethods.fillElement(firstNameElement, firstNameValue);

        //Last Name field
        //WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastNameValue = "K";
        //lastNameElement.sendKeys(lastNameValue);
        //elementMethods.fillElement(lastNameElement, lastNameValue);

        //Email field
        //WebElement userEmailElement = driver.findElement(By.id("userEmail"));
        String userEmailValue = "a@gmail.com";
        //userEmailElement.sendKeys(userEmailValue);
        //elementMethods.fillElement(userEmailElement, userEmailValue);

        //Age field
        //WebElement ageElement = driver.findElement(By.id("age"));
        String ageValue = "30";
        //ageElement.sendKeys(ageValue);
        //elementMethods.fillElement(ageElement, ageValue);

        //Salary field
        //WebElement salaryElement = driver.findElement(By.id("salary"));
        String salaryValue = "10000";
        //salaryElement.sendKeys(salaryValue);
        //elementMethods.fillElement(salaryElement, salaryValue);

        //Department field
        //WebElement departmentElement = driver.findElement(By.id("department"));
        String departmentValue = "Testing";
        //departmentElement.sendKeys(departmentValue);
        //elementMethods.fillElement(departmentElement, departmentValue);

        //Click Submit button
        //WebElement submitElement = driver.findElement(By.id("submit"));
        //submitElement.click();
        //elementMethods.clickElement(submitElement);

        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.addEntry(firstNameValue, lastNameValue, userEmailValue, ageValue, salaryValue, departmentValue);

        //Test2 - Modificam un entry existent
        //WebElement editElement = driver.findElement(By.id("edit-record-4"));
        //editElement.click();
        //elementMethods.clickElement(editElement);

        //First Name field - EDIT
        //WebElement firstNameEditElement = driver.findElement(By.id("firstName"));
        String firstNameEditValue = "EditCorina";
        //firstNameEditElement.clear();
        //elementMethods.clearFillElement(firstNameEditElement, firstNameEditValue);
        //firstNameEditElement.sendKeys(firstNameEditValue);
        //elementMethods.fillElement(firstNameEditElement, firstNameEditValue);

        //Last Name field - EDIT
        //WebElement lastNameEditElement = driver.findElement(By.id("lastName"));
        String lastNameEditValue = "EditK";
        //lastNameEditElement.clear();
        //elementMethods.clearFillElement(lastNameEditElement, lastNameEditValue);
        //lastNameEditElement.sendKeys(lastNameEditValue);
        //elementMethods.fillElement(lastNameEditElement, lastNameEditValue);

        //Click Submit button
        //WebElement submitEditElement = driver.findElement(By.id("submit"));
        //submitEditElement.click();
        //elementMethods.clickElement(submitEditElement);

        webTablesPage.editEntry(firstNameEditValue, lastNameEditValue);

        //Test3 - Stergem un entry existent
        //WebElement deleteElement = driver.findElement(By.id("delete-record-4"));
        //deleteElement.click();
        //elementMethods.clickElement(deleteElement);

        webTablesPage.deleteEntry();

        //Close browser
        driver.quit();

    }

}
