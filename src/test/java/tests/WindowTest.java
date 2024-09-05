package tests;

import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.HomePage;
import pages.WindowsPage;
import sharedData.SharedData;

public class WindowTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToAlertsMenu();

        AlertsWindowsPage alertsWindows = new AlertsWindowsPage(getDriver());
        alertsWindows.navigateToWindowPage();

        WindowsPage windowsPage = new WindowsPage(getDriver());
        windowsPage.interactWithNewTab();
        windowsPage.interactWithNewWindow();
    }
}
