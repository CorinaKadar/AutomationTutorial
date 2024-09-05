package tests;

import org.testng.annotations.Test;
import pages.AlertsWindowsPage;
import pages.FramePage;
import pages.HomePage;
import pages.NestedFramePage;
import sharedData.SharedData;

public class FrameTest extends SharedData {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.navigateToAlertsMenu();

        AlertsWindowsPage alertsWindowsPage = new AlertsWindowsPage(getDriver());
        alertsWindowsPage.navigateToFramePage();

        FramePage framePage = new FramePage(getDriver());
        framePage.interactWithBigIFrame();
        framePage.interactWithSmallIFrame();
        framePage.navigateToNestedFrame();

        NestedFramePage nestedFramePage = new NestedFramePage(getDriver());
        nestedFramePage.interactWithNestedFrame();
    }

}
