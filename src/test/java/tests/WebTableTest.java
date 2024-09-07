package tests;

import objectData.WebTableObject;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;
import sharedData.SharedData;

public class WebTableTest extends SharedData {

    @Test
    public void metodaTest(){

        // Pregatim datele de test specifice
        WebTableObject testData = new WebTableObject("src/test/resources/testData/WebTableData.json");

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToElementsMenu();

        ElementsPage elementsPage = new ElementsPage(getDriver());
        elementsPage.navigateToWebTablesPage();

        WebTablesPage webTablesPage = new WebTablesPage(getDriver());
        webTablesPage.addEntry(testData);
        webTablesPage.editEntry(testData);
        webTablesPage.deleteEntry();
    }
}