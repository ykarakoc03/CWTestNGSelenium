package clarusway.tests;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Driver;

public class N11CerezCözüm_shadow_root extends BaseTest {


    @Test
    public void test01() {
        driver.get("https://www.n11.com/");
        //SearchContext webdriver ın extend ettiği bir class//Shadow root çok çok nadir bir olay
        SearchContext sc = driver.findElement(By.cssSelector(".efilli-layout-n11")).getShadowRoot();

        WebElement rejectButton = sc.findElement(By.cssSelector(".banner__reject-button"));

        rejectButton.click();
    }
}
