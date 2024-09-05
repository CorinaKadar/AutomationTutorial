package tests;

import objectData.PracticeFormObject;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import sharedData.SharedData;

public class PracticeFormTest extends SharedData {

    @Test
    public void metodaTest() {

        // Pregatim datele de test specifice
        PracticeFormObject testData = new PracticeFormObject("src/test/resources/testData/PracticeFormData.json");

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToFormMenu();

        FormsPage formsPage = new FormsPage(getDriver());
        formsPage.navigateToPracticeFormPage();

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.fillEntireForm(testData);
        practiceFormPage.validateEntireForm(testData);
    }
}


