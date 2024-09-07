package pages;

import loggerUtility.LoggerUtility;
import objectData.WebTableObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage{

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addElement;

    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement userEmailElement;

    @FindBy(id = "age")
    private WebElement ageElement;

    @FindBy(id = "salary")
    private WebElement salaryElement;

    @FindBy(id = "department")
    private WebElement departmentElement;

    @FindBy(id = "submit")
    private WebElement submitElement;

    @FindBy(id = "edit-record-4")
    private WebElement editElement;

    @FindBy(id = "firstName")
    private WebElement firstNameEditElement;

    @FindBy(id = "lastName")
    private WebElement lastNameEditElement;

    @FindBy(id = "submit")
    private WebElement submitEditElement;

    @FindBy(id = "delete-record-4")
    private WebElement deleteElement;

    public void addEntry(WebTableObject testData){
        elementMethods.clickElement(addElement);
        LoggerUtility.info("The user clicked to add a new entry");
        elementMethods.fillElement(firstNameElement, testData.getFirstNameValue());
        LoggerUtility.info("The user fills firstname element with the value: " + testData.getFirstNameValue());
        elementMethods.fillElement(lastNameElement, testData.getLastNameValue());
        LoggerUtility.info("The user fills in the lastname element with the value: " + testData.getLastNameValue());
        elementMethods.fillElement(userEmailElement, testData.getUserEmailValue());
        LoggerUtility.info("The user fills in the user email element with the value: " + testData.getUserEmailValue());
        elementMethods.fillElement(ageElement, testData.getAgeValue());
        LoggerUtility.info("The user fills in the age element with the value: " + testData.getAgeValue());
        elementMethods.fillElement(salaryElement, testData.getSalaryValue());
        LoggerUtility.info("The user fills in the salary element with the value: " + testData.getSalaryValue());
        elementMethods.fillElement(departmentElement, testData.getDepartmentValue());
        LoggerUtility.info("The user fills in the department element with the value: " + testData.getDepartmentValue());
        elementMethods.clickElement(submitElement);
        LoggerUtility.info("The user clicked to submit the form");
    }

    public void editEntry(WebTableObject testData){
        elementMethods.clickElement(editElement);
        LoggerUtility.info("The user clicked to edit an existing entry");
        elementMethods.clearFillElement(firstNameEditElement, testData.getFirstNameEditValue());
        LoggerUtility.info("The user edits the First Name element with the value: " + testData.getFirstNameEditValue());
        elementMethods.clearFillElement(lastNameEditElement, testData.getLastNameEditValue());
        LoggerUtility.info("The user edits the Last Name element  with the value: " + testData.getLastNameEditValue());
        elementMethods.clickElement(submitEditElement);
        LoggerUtility.info("The user clicked to submit the edited values");
    }

    public void deleteEntry(){
        elementMethods.clickElement(deleteElement);
        LoggerUtility.info("The user clicked to delete the entry");
    }
}