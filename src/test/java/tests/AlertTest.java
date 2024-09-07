package tests;

import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.AlertsWindowsPage;
import pages.HomePage;
import sharedData.SharedData;

public class AlertTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToAlertsMenu();

        AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage(getDriver());
        alertsWindowsPage.navigateToAlertsPage();

        AlertsPage alertsPage = new AlertsPage(getDriver());
        alertsPage.interactWithAlertButton();
        alertsPage.interactWithTimerAlertButton();
        alertsPage.interactWithConfirmButton();
        alertsPage.interactWithPromtButton();
    }
}