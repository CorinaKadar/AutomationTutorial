package tests;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import sharedData.SharedData;

import java.util.Arrays;
import java.util.List;

public class PracticeFormTest extends SharedData {

    //public WebDriver driver;

    @Test
    public void metodaTest() {

        //deschidem un browser
        //driver = new ChromeDriver();

        //accesam un anumit URL
        //driver.get("https://demoqa.com");

        //Maximize browser
        //driver.manage().window().maximize();

        //Close browser
        //driver.quit();

        //Obiecte
        ElementMethods elementMethods = new ElementMethods(getDriver());
        PageMethods pageMethods = new PageMethods(getDriver());


        //facem un scroll la pagina pt vizibilitate
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,350)", "");
        //pageMethods.scrollPage(0,350);

        //interactionam cu meniul/submeniul de pe site
        //WebElement formMenu = driver.findElement(By.xpath("//h5[text()='Forms']"));
        //formMenu.click();
        //elementMethods.clickElement(formMenu);

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToFormMenu();

        //WebElement practiceFormSubmenu = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        //practiceformsubmenu.click();
        //elementMethods.clickElement(practiceFormSubmenu);

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.navigateToPracticeFormPage();

        // ------- Completam form-ul
        //First Name
        //WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstNameValue = "Corina";
        //firstNameElement.sendKeys(firstNameValue);
        //elementMethods.fillElement(firstNameElement, firstNameValue);

        //Last Name
        //WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastNameValue = "K";
        //lastNameElement.sendKeys(lastNameValue);
        //elementMethods.fillElement(lastNameElement, lastNameValue);

        //Email
        //WebElement emailElement = driver.findElement(By.id("userEmail"));
        String emailValue = "ck@gmail.com";
        //emailElement.sendKeys(emailValue);
        //elementMethods.fillElement(emailElement, emailValue);

        //Gender - Radio button -  definim o logica generala pentru a selecta un element dintr-o lista
        //List<WebElement> genderElements = driver.findElements(By.xpath("//div[@id='genterWrapper']/div/div/label[@class='custom-control-label']"));  //definim intai lista din care alegem cu un locator comun name = gender
        String genderValue = "Female";
        //switch (genderValue) {
            //case "Male":
                //genderElements.get(0).click();
                //elementMethods.clickElement(genderElements.get(0));
                //break;
            //case "Female":
                //genderElements.get(1).click();
                //elementMethods.clickElement(genderElements.get(1));
                //break;
            //case "Other":
                //genderElements.get(2).click();
                //elementMethods.clickElement(genderElements.get(2));
                //break;
        //}
        //Mobile
        //WebElement mobileNumberElement = driver.findElement(By.id("userNumber"));
        String mobileNumberValue = "0741111111";
        //mobileNumberElement.sendKeys(mobileNumberValue);
        //elementMethods.fillElement(mobileNumberElement, mobileNumberValue);

        //Date of Birth
        //WebElement dateOfBirthElement = driver.findElement(By.id("dateOfBirthInput"));
        //dateOfBirthElement.click();
        //elementMethods.clickElement(dateOfBirthElement);

        //WebElement dateOfBirthMonthElement = driver.findElement(By.className("react-datepicker__month-select"));
        //Select monthSelect = new Select(dateOfBirthMonthElement);
        //monthSelect.selectByVisibleText("August");
        //elementMethods.selectByTextElement(dateOfBirthMonthElement, "August");

        //WebElement dateOfBirthYearElement = driver.findElement(By.className("react-datepicker__year-select"));
        //Select yearSelect = new Select(dateOfBirthYearElement);
        //yearSelect.selectByValue("1993");
        //elementMethods.selectByValue(dateOfBirthYearElement, "1993");

        //List<WebElement> dateOfBirthDaysElement = driver.findElements(By.xpath("//div[@class='react-datepicker__month']//div[not(contains(@class,'--outside-month')) and @role='option']"));
        String dateOfBirthDaysValue= "5";
        //for (Integer index = 0; index < dateOfBirthDaysElement.size(); index++) {
            //if (dateOfBirthDaysElement.get(index).getText().equals(dateOfBirthDaysValue)) {
                //dateOfBirthDaysElement.get(index).click();
                //elementMethods.clickElement(dateOfBirthDaysElement.get(index));
                //break;
            //}
       // }

        //Subjects - Element dinamic
        //WebElement subjectInputElement = driver.findElement(By.id("subjectsInput"));
        String subjectInputValue = "Accounting";
        //subjectInputElement.sendKeys(subjectInputValue);
        //elementMethods.fillElement(subjectInputElement, subjectInputValue);
        //subjectInputElement.sendKeys(Keys.ENTER); // apasam enter.. putem folosii si combinatii de taste ex: (Keys.ENTER+Keys.CLEAR)
        //elementMethods.pressElement(subjectInputElement, Keys.ENTER);

        //Hobbies - Checkbox - alegem mai multe valori
        //List<WebElement> hobbiesElements = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div/div/label[@class='custom-control-label']"));  //definim intai lista din care alegem cu un locator comun name = gender
        List<String> hobbiesValue = Arrays.asList("Sports", "Music"); // Nu comparam WebElement cu String - asa ca scoatem Stringul de pe WebElement ca sa putem compara
        //for (Integer index = 0; index < hobbiesElements.size(); index++) {
            //String hobbieText = hobbiesElements.get(index).getText();
            //if (hobbiesValue.contains(hobbieText)) {
                //elementMethods.clickJSElement(hobbiesElements.get(index));
                //JavascriptExecutor jsClick = (JavascriptExecutor) driver;
                //jsClick.executeScript("arguments[0].click();", hobbiesElements.get(index));
           // }
        //}

        //Interactionam cu adaugarea unui fisier - Picture field
        // pun fisierul de Resources in folderul meu de test
        //WebElement uploadPictureElement = driver.findElement(By.id("uploadPicture"));
        String picturePathValue = "TestFile.txt";
        //File file = new File("src/test/resources/" + picturePathValue);
        //uploadPictureElement.sendKeys(file.getAbsolutePath());
        //elementMethods.fillElement(uploadPictureElement, file.getAbsolutePath());

        //Address field
        //WebElement addressElement = driver.findElement(By.id("currentAddress"));
        String addressValue = "105 Coconut Lane";
        //addressElement.sendKeys(addressValue);
        //elementMethods.fillElement(addressElement, addressValue);

        //State and City fields
        //WebElement stateElement = driver.findElement(By.id("state"));
        //stateElement.click();
        //elementMethods.clickElement(stateElement);
        //WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
        String stateInputValue = "Uttar Pradesh";
        //stateInputElement.sendKeys(stateInputValue);
        //elementMethods.fillElement(stateInputElement, stateInputValue);
        //stateInputElement.sendKeys(Keys.ENTER);
        //elementMethods.pressElement(stateInputElement, Keys.ENTER);

        //WebElement cityElement = driver.findElement(By.id("city"));
        //cityElement.click();
        //elementMethods.clickElement(cityElement);
        //WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
        String cityInputValue = "Lucknow";
        //cityInputElement.sendKeys(cityInputValue);
        //elementMethods.fillElement(cityInputElement, cityInputValue);
        //cityInputElement.sendKeys(Keys.ENTER);
        //elementMethods.pressElement(cityInputElement, Keys.ENTER);

        //Click Submit button
        //WebElement submitButtonElement = driver.findElement(By.id("submit"));
        //submitButtonElement.click();
        //elementMethods.clickElement(submitButtonElement);

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.fillEntireForm(firstNameValue, lastNameValue, emailValue, genderValue, mobileNumberValue, dateOfBirthDaysValue,
                subjectInputValue, hobbiesValue, picturePathValue,addressValue, stateInputValue, cityInputValue);

        //Validam tabelul cu valorile introduse
        //In validari folosim assert-uri
        //WebElement thankYouMessageElement = driver.findElement(By.id("example-modal-sizes-title-lg"));
        //Assert.assertEquals(thankYouMessageElement.getText(),"Thanks for submitting the form");
        //Facem o lista de web elements si le identificam cu elements
        //List<WebElement> tableValues = driver.findElements(By.xpath("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr"));
        //Assert.assertEquals(tableValues.get(0).getText(),"Student Name " + firstNameValue + " " + lastNameValue);
        //Assert.assertEquals(tableValues.get(1).getText(),"Student Email " + emailValue);
        //Assert.assertEquals(tableValues.get(2).getText(),"Gender " + genderValue);
        //Assert.assertEquals(tableValues.get(3).getText(),"Mobile " + mobileNumberValue);

        //Date of Birth
        //String actualDate = tableValues.get(4).getText();
        //String expectedDate = "Date of Birth 05 August,1993";
        //Assert.assertEquals(actualDate, expectedDate);

        //Assert.assertEquals(tableValues.get(5).getText(),"Subjects " + subjectInputValue);

        //Varianta 1 - Hobbies
        // Obține valoarea din tabel
        // String actualHobbiesText = tableValues.get(6).getText();
        // Formatează lista de valori așteptate pentru hobby-uri
        //String expectedHobbiesText = "Hobbies " + String.join(", ", hobbiesValue);
        // Compara valorile
        //Assert.assertEquals(actualHobbiesText, expectedHobbiesText);

        //Varianta2 - Hobbies
        //String expectedHobbiesText = "Hobbies " + String.join(", ", hobbiesValue);
        //Assert.assertEquals(tableValues.get(6).getText(), expectedHobbiesText);

        //Assert.assertEquals(tableValues.get(7).getText(),"Picture " + picturePathValue);
        //Assert.assertEquals(tableValues.get(8).getText(),"Address " + addressValue);
        //Assert.assertEquals(tableValues.get(9).getText(),"State and City " + stateInputValue + " " + cityInputValue);

        //Click Close button
        //WebElement closeButtonElement = driver.findElement(By.id("closeLargeModal"));
        //closeButtonElement.click();
        //elementMethods.clickElement(closeButtonElement);

        practiceFormPage.validateEntireForm(firstNameValue, lastNameValue, emailValue, genderValue, mobileNumberValue, dateOfBirthDaysValue,
                subjectInputValue, hobbiesValue, picturePathValue,addressValue, stateInputValue, cityInputValue);

    }
}


