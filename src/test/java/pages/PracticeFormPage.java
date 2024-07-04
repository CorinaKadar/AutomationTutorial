package pages;

import helperMethods.AlertMethods;
import helperMethods.ElementMethods;
import helperMethods.FrameMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class PracticeFormPage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public PageMethods pageMethods;


    //Constructor
    public PracticeFormPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        pageMethods = new PageMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement firstNameElement;

    @FindBy(id = "lastName")
    public WebElement lastNameElement;

    @FindBy(id = "userEmail")
    public WebElement emailElement;

    @FindBy(xpath = "//div[@id='genterWrapper']/div/div/label[@class='custom-control-label']")
    public List<WebElement> genderElements;

    @FindBy(id = "userNumber")
    public WebElement mobileNumberElement;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthElement;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement dateOfBirthMonthElement;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement dateOfBirthYearElement;

    @FindBy(xpath = "//div[@class='react-datepicker__month']//div[not(contains(@class,'--outside-month')) and @role='option']")
    public List<WebElement> dateOfBirthDaysElement;

    @FindBy(id = "subjectsInput")
    public WebElement subjectInputElement;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']/div/div/label[@class='custom-control-label']")
    public List<WebElement> hobbiesElements;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPictureElement;

    @FindBy(id = "currentAddress")
    public WebElement addressElement;

    @FindBy(id = "state")
    public WebElement stateElement;

    @FindBy(id = "react-select-3-input")
    public WebElement stateInputElement;

    @FindBy(id = "city")
    public WebElement cityElement;

    @FindBy(id = "react-select-4-input")
    public WebElement cityInputElement;

    @FindBy(id = "submit")
    public WebElement submitButtonElement;

    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElement thankYouMessageElement;

    @FindBy(xpath = "//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr")
    public List<WebElement> tableValues;

    @FindBy(id = "closeLargeModal")
    public WebElement closeButtonElement;

    public void fillEntireForm(String firstNameValue, String lastNameValue, String emailValue, String genderValue,
                               String mobileNumberValue, String dateOfBirthDaysValue, String subjectInputValue,
                               List<String> hobbiesValue, String picturePathValue, String addressValue,
                               String stateInputValue, String cityInputValue){

        elementMethods.fillElement(firstNameElement, firstNameValue);

        elementMethods.fillElement(lastNameElement, lastNameValue);

        elementMethods.fillElement(emailElement, emailValue);

        switch (genderValue) {
            case "Male":
                elementMethods.clickElement(genderElements.get(0));
                break;
            case "Female":
                elementMethods.clickElement(genderElements.get(1));
                break;
            case "Other":
                elementMethods.clickElement(genderElements.get(2));
                break;
        }

        elementMethods.fillElement(mobileNumberElement, mobileNumberValue);

        elementMethods.clickElement(dateOfBirthElement);

        elementMethods.selectByTextElement(dateOfBirthMonthElement, "August");

        elementMethods.selectByValue(dateOfBirthYearElement, "1993");

        for (Integer index = 0; index < dateOfBirthDaysElement.size(); index++) {
            if (dateOfBirthDaysElement.get(index).getText().equals(dateOfBirthDaysValue)) {
                elementMethods.clickElement(dateOfBirthDaysElement.get(index));
                break;
            }
        }

        elementMethods.fillElement(subjectInputElement, subjectInputValue);
        elementMethods.pressElement(subjectInputElement, Keys.ENTER);

        for (Integer index = 0; index < hobbiesElements.size(); index++) {
            String hobbieText = hobbiesElements.get(index).getText();
            if (hobbiesValue.contains(hobbieText)) {
                elementMethods.clickJSElement(hobbiesElements.get(index));

            }
        }

        File file = new File("src/test/resources/" + picturePathValue);
        elementMethods.fillElement(uploadPictureElement, file.getAbsolutePath());

        elementMethods.fillElement(addressElement, addressValue);

        elementMethods.clickElement(stateElement);

        elementMethods.fillElement(stateInputElement, stateInputValue);
        elementMethods.pressElement(stateInputElement, Keys.ENTER);

        elementMethods.clickElement(cityElement);
        elementMethods.fillElement(cityInputElement, cityInputValue);
        elementMethods.pressElement(cityInputElement, Keys.ENTER);

        elementMethods.clickElement(submitButtonElement);
    }

    public void validateEntireForm(String firstNameValue, String lastNameValue, String emailValue, String genderValue,
                                   String mobileNumberValue, String dateOfBirthDaysValue, String subjectInputValue,
                                   List<String> hobbiesValue, String picturePathValue, String addressValue,
                                   String stateInputValue, String cityInputValue){

        Assert.assertEquals(thankYouMessageElement.getText(),"Thanks for submitting the form");
        Assert.assertEquals(tableValues.get(0).getText(),"Student Name " + firstNameValue + " " + lastNameValue);
        Assert.assertEquals(tableValues.get(1).getText(),"Student Email " + emailValue);
        Assert.assertEquals(tableValues.get(2).getText(),"Gender " + genderValue);
        Assert.assertEquals(tableValues.get(3).getText(),"Mobile " + mobileNumberValue);

        String actualDate = tableValues.get(4).getText();
        String expectedDate = "Date of Birth 05 August,1993";
        Assert.assertEquals(actualDate, expectedDate);

        Assert.assertEquals(tableValues.get(5).getText(),"Subjects " + subjectInputValue);

        String expectedHobbiesText = "Hobbies " + String.join(", ", hobbiesValue);
        Assert.assertEquals(tableValues.get(6).getText(), expectedHobbiesText);

        Assert.assertEquals(tableValues.get(7).getText(),"Picture " + picturePathValue);
        Assert.assertEquals(tableValues.get(8).getText(),"Address " + addressValue);
        Assert.assertEquals(tableValues.get(9).getText(),"State and City " + stateInputValue + " " + cityInputValue);

        elementMethods.clickElement(closeButtonElement);

    }

}
