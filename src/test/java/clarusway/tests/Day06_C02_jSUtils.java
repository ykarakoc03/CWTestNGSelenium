package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import clarusway.utilities.JSUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day06_C02_jSUtils extends BaseCrossBrowserTest {


    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        JSUtils.driver = driver;

        JSUtils.scrollIntoViewJS(driver.findElement(By.partialLinkText("Amazon Ignite")));

        Thread.sleep(3000);

        JSUtils.scrollAllUpByJS();

        Thread.sleep(3000);

        JSUtils.flash(driver.findElement(By.id("twotabsearchtextbox")));
    }
}