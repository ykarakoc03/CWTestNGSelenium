package clarusway.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class D01_H02_DependsOnHomework {

//    Create tests that depend on each other
//    Create beforeClass and set up settings.
//    By creating interdependent tests;
//    First go to Facebook.
//    Then go to Google depending on Facebook,
//    Then go to Amazon depending on Google
//    Close the driver.

    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
       driver.close();
    }

    @Test
    public void testFecebook() {
        driver.get("https://www.facebook.com/");
        Assert.assertTrue(driver.getTitle().contains("Facebook"));

    }

    @Test(dependsOnMethods ={"testFecebook"} )
    public void testGoogle() {
        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @Test(dependsOnMethods = {"testGoogle"})
    public void testAmazon() {
        driver.get("https://www.amazon.com/");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
    }
}
