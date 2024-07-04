package pages;

import helperMethods.ElementMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    //Constructor
    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    public WebElement addElement;

    @FindBy(id = "firstName")
    public WebElement firstNameElement;

    @FindBy(id = "lastName")
    public WebElement lastNameElement;

    @FindBy(id = "userEmail")
    public WebElement userEmailElement;

    @FindBy(id = "age")
    public WebElement ageElement;

    @FindBy(id = "salary")
    public WebElement salaryElement;

    @FindBy(id = "department")
    public WebElement departmentElement;

    @FindBy(id = "submit")
    public WebElement submitElement;

    @FindBy(id = "edit-record-4")
    public WebElement editElement;

    @FindBy(id = "firstName")
    public WebElement firstNameEditElement;

    @FindBy(id = "lastName")
    public WebElement lastNameEditElement;

    @FindBy(id = "submit")
    public WebElement submitEditElement;

    @FindBy(id = "delete-record-4")
    public WebElement deleteElement;


    public void addEntry(String firstNameValue, String lastNameValue, String userEmailValue, String ageValue, String salaryValue,
                         String departmentValue){
        elementMethods.clickElement(addElement);
        elementMethods.fillElement(firstNameElement, firstNameValue);
        elementMethods.fillElement(lastNameElement, lastNameValue);
        elementMethods.fillElement(userEmailElement, userEmailValue);
        elementMethods.fillElement(ageElement, ageValue);
        elementMethods.fillElement(salaryElement, salaryValue);
        elementMethods.fillElement(departmentElement, departmentValue);
        elementMethods.clickElement(submitElement);
    }

    public void editEntry(String firstNameEditValue, String lastNameEditValue){
        elementMethods.clickElement(editElement);
        elementMethods.clearFillElement(firstNameEditElement, firstNameEditValue);
        elementMethods.clearFillElement(lastNameEditElement, lastNameEditValue);
        elementMethods.clickElement(submitEditElement);
    }

    public void deleteEntry(){
        elementMethods.clickElement(deleteElement);
    }

}
