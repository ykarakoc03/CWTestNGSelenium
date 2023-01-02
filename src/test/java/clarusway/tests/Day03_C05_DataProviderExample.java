package clarusway.tests;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C05_DataProviderExample extends BaseTest {

//    Open the site: https://www.amazon.com/
//    Do it with DataProvider for
//    Java
//            JavaScript
//    Phyton


    @Test(dataProvider = "keyData")
    public void amazonSearchTest(String key) {
        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(key, Keys.ENTER);

        WebElement searchResult = driver.findElement(By.className("a-color-state"));
        Assert.assertTrue(searchResult.getText().contains(key));


    }


    @DataProvider
    public Object[][] keyData(){
       return new Object[][]{
                {"java"},
                {"javascript"},
                {"python"}

        };

    }

}
