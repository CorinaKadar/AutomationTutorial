package pages;

import loggerUtility.LoggerUtility;
import objectData.PracticeFormObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.io.File;
import java.util.List;

public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement emailElement;

    @FindBy(xpath = "//div[@id='genterWrapper']/div/div/label[@class='custom-control-label']")
    private List<WebElement> genderElements;

    @FindBy(id = "userNumber")
    private WebElement mobileNumberElement;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthElement;

    @FindBy(className = "react-datepicker__month-select")
    private WebElement dateOfBirthMonthElement;

    @FindBy(className = "react-datepicker__year-select")
    private WebElement dateOfBirthYearElement;

    @FindBy(xpath = "//div[@class='react-datepicker__month']//div[not(contains(@class,'--outside-month')) and @role='option']")
    private List<WebElement> dateOfBirthDaysElement;

    @FindBy(id = "subjectsInput")
    private WebElement subjectInputElement;

    @FindBy(xpath = "//div[@id='hobbiesWrapper']/div/div/label[@class='custom-control-label']")
    private List<WebElement> hobbiesElements;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPictureElement;

    @FindBy(id = "currentAddress")
    private WebElement addressElement;

    @FindBy(id = "state")
    private WebElement stateElement;

    @FindBy(id = "react-select-3-input")
    private WebElement stateInputElement;

    @FindBy(id = "city")
    private WebElement cityElement;

    @FindBy(id = "react-select-4-input")
    private WebElement cityInputElement;

    @FindBy(id = "submit")
    private WebElement submitButtonElement;

    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement thankYouMessageElement;

    @FindBy(xpath = "//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr")
    private List<WebElement> tableValues;

    @FindBy(id = "closeLargeModal")
    private WebElement closeButtonElement;

    public void fillEntireForm(PracticeFormObject testData){

        elementMethods.fillElement(firstNameElement, testData.getFirstNameValue());
        LoggerUtility.info("The user filled in the firstnameelement with the value: " + testData.getFirstNameValue());

        elementMethods.fillElement(lastNameElement, testData.getLastNameValue());
        LoggerUtility.info("The user filled in the lastnameelement with the value: " + testData.getLastNameValue());

        elementMethods.fillElement(emailElement, testData.getEmailValue());
        LoggerUtility.info("The user filled in the emailelement with the value: " + testData.getEmailValue());

        switch (testData.getGenderValue()) {
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
        LoggerUtility.info("The user selected the gender: " + testData.getGenderValue());

        elementMethods.fillElement(mobileNumberElement, testData.getMobileNumberValue());
        LoggerUtility.info("The user filled in the usernumberelement with the value: " + testData.getMobileNumberValue());

        elementMethods.clickElement(dateOfBirthElement);
        LoggerUtility.info("The user clicked to select the birthdate");

        elementMethods.selectByTextElement(dateOfBirthMonthElement, "August");
        LoggerUtility.info("The user selected the month August");

        elementMethods.selectByValue(dateOfBirthYearElement, "1993");
        LoggerUtility.info("The user selected the year 1993");

        for (Integer index = 0; index < dateOfBirthDaysElement.size(); index++) {
            if (dateOfBirthDaysElement.get(index).getText().equals(testData.getDateOfBirthDaysValue())) {
                elementMethods.clickElement(dateOfBirthDaysElement.get(index));
                break;
            }
        }
        LoggerUtility.info("The user submitted the birthdate of: " + testData.getDateOfBirthDaysValue());

        elementMethods.fillElement(subjectInputElement, testData.getSubjectInputValue());
        LoggerUtility.info("The user selected the subjects: " + testData.getSubjectInputValue());

        elementMethods.pressElement(subjectInputElement, Keys.ENTER);
        LoggerUtility.info("The user submitted their chosen subjects");

        for (Integer index = 0; index < hobbiesElements.size(); index++) {
            String hobbieText = hobbiesElements.get(index).getText();
            if (testData.getHobbiesValue().contains(hobbieText)) {
                elementMethods.clickJSElement(hobbiesElements.get(index));
            }
        }
        LoggerUtility.info("The user selected the hobbies: " + testData.getHobbiesValue());

        File file = new File("src/test/resources/" + testData.getPicturePathValue());
        elementMethods.fillElement(uploadPictureElement, file.getAbsolutePath());
        LoggerUtility.info("The user uploaded a file");

        elementMethods.fillElement(addressElement, testData.getAddressValue());
        LoggerUtility.info("The user submitted for currentaddress element the value: " + testData.getAddressValue());

        elementMethods.clickElement(stateElement);
        LoggerUtility.info("The user clicked to select the State");

        elementMethods.fillElement(stateInputElement, testData.getStateInputValue());
        LoggerUtility.info("The user chose the following state: " + testData.getStateInputValue());

        elementMethods.pressElement(stateInputElement, Keys.ENTER);
        LoggerUtility.info("The user submitted their chosen state");

        elementMethods.clickElement(cityElement);
        elementMethods.fillElement(cityInputElement, testData.getCityInputValue());
        LoggerUtility.info("The user chose the following city: " + testData.getCityInputValue());
        elementMethods.pressElement(cityInputElement, Keys.ENTER);
        LoggerUtility.info("The user submitted their chosen city");

        elementMethods.clickElement(submitButtonElement);
        LoggerUtility.info("The user submitted the form");
    }

    public void validateEntireForm(PracticeFormObject testData){

        Assert.assertEquals(thankYouMessageElement.getText(),"Thanks for submitting the form");
        LoggerUtility.info("The user validates the presence of " + thankYouMessageElement.getText());
        Assert.assertEquals(tableValues.get(0).getText(),"Student Name " + testData.getFirstNameValue() + " " + testData.getLastNameValue());
        LoggerUtility.info("The user validates the presence of " + testData.getFirstNameValue() + " " + testData.getLastNameValue());
        Assert.assertEquals(tableValues.get(1).getText(),"Student Email " + testData.getEmailValue());
        LoggerUtility.info("The user validates the presence of " + testData.getEmailValue());
        Assert.assertEquals(tableValues.get(2).getText(),"Gender " + testData.getGenderValue());
        LoggerUtility.info("The user validates the presence of " + testData.getGenderValue());
        Assert.assertEquals(tableValues.get(3).getText(),"Mobile " + testData.getMobileNumberValue());
        LoggerUtility.info("The user validates the presence of " + testData.getMobileNumberValue());

        String actualDate = tableValues.get(4).getText();
        String expectedDate = "Date of Birth 05 August,1993";
        Assert.assertEquals(actualDate, expectedDate);

        Assert.assertEquals(tableValues.get(5).getText(),"Subjects " + testData.getSubjectInputValue());
        LoggerUtility.info("The user validates the presence of " + testData.getSubjectInputValue());

        String expectedHobbiesText = "Hobbies " + String.join(", ", testData.getHobbiesValue());
        Assert.assertEquals(tableValues.get(6).getText(), expectedHobbiesText);
        LoggerUtility.info("The user validates the presence of " + expectedHobbiesText);

        Assert.assertEquals(tableValues.get(7).getText(),"Picture " + testData.getPicturePathValue());
        LoggerUtility.info("The user validates the presence of " + testData.getPicturePathValue());
        Assert.assertEquals(tableValues.get(8).getText(),"Address " + testData.getAddressValue());
        LoggerUtility.info("The user validates the presence of " + testData.getAddressValue());
        Assert.assertEquals(tableValues.get(9).getText(),"State and City " + testData.getStateInputValue() + " " + testData.getCityInputValue());
        LoggerUtility.info("The user validates the presence of " + testData.getStateInputValue() + testData.getCityInputValue());

        elementMethods.clickElement(closeButtonElement);
    }
}