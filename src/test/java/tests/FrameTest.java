package tests;

import helperMethods.AlertMethods;
import helperMethods.ElementMethods;
import helperMethods.FrameMethods;
import helperMethods.PageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FrameTest {

    public WebDriver driver;

    @Test
    public void metodaTest() {

        //deschidem un browser
        driver = new ChromeDriver();

        //accesam un anumit URL
        driver.get("https://demoqa.com");

        //Maximize browser
        driver.manage().window().maximize();

        //Wait implicit (de ex dupa ce maresti browserul)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //definim un obiect de tip alertMethods ca sa apelam metodele generale din clasa
        AlertMethods alertMethods = new AlertMethods(driver);
        ElementMethods elementMethods = new ElementMethods(driver);
        PageMethods pageMethods = new PageMethods(driver);
        FrameMethods frameMethods = new FrameMethods(driver);

        //facem un scroll la pagina pt vizibilitate
        pageMethods.scrollPage(0, 350);

        //interactionam cu meniul/submeniul de pe site
        WebElement alertMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementMethods.clickElement(alertMenu);

        WebElement framesSubmenu = driver.findElement(By.xpath("//span[text()='Frames']"));
        elementMethods.clickElement(framesSubmenu);

        //Ne mutam cu focusul pe un iFrame (nr. 1)
        //driver.switchTo().frame("frame1");
        frameMethods.switchToFrame("frame1");

        WebElement iFrame1Text = driver.findElement(By.id("sampleHeading"));
        System.out.println(iFrame1Text.getText());

        //Ne intoarcem cu focusul la frame-ul default
        //driver.switchTo().defaultContent();
        frameMethods.defaultContentMethod();

        //Ne mutam cu focusul pe un iFrame-ul nr. 2
        //driver.switchTo().frame("frame2");
        frameMethods.switchToFrame("frame2");

        WebElement iFrame2Text = driver.findElement(By.id("sampleHeading"));
        System.out.println(iFrame2Text.getText());

        //Ne intoarcem cu focusul la frame-ul default
        //driver.switchTo().defaultContent();
        frameMethods.defaultContentMethod();

        WebElement nestedFramesSubmenu = driver.findElement(By.xpath("//span[text()='Nested Frames']"));
        elementMethods.clickElement(nestedFramesSubmenu);

        // Interactionam cu iFrame in iFrame (Nested Frames)
        //driver.switchTo().frame("frame1"); // focusul ii in Parent Frame
        frameMethods.switchToFrame("frame1");

        WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        //driver.switchTo().frame(childFrame);
        frameMethods.switchToChildFrame(childFrame);

        WebElement textChildFrame = driver.findElement(By.xpath("//p"));
        System.out.println(textChildFrame.getText());

    }

}
