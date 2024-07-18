package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablesPage extends BasePage{

    //public WebDriver driver;
    //public ElementMethods elementMethods;

    //Constructor
    public WebTablesPage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
        //elementMethods = new ElementMethods(driver);
        //PageFactory.initElements(driver, this);
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
