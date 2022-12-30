package clarusway.tests.homework;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D01_H04_SoftAssert extends BaseTest {

//    Test Case2: Negative Username Test
//    Open page https://practicetestautomation.com/practice-test-login/
//    Type username incorrectUser into Username field.
//    Type password Password123 into Password field.
//    Puch Submit button.
//    Verify error message is displayed.
//    Verify error message text is Your username is invalid!


    @Test
    public void testCase02() {

        //    Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //    Type username incorrectUser into Username field.
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("incorrectUser");

        //    Type password Password123 into Password field.
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password123");

        //    Puch Submit button.
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        //    Verify error message is displayed.
        SoftAssert softAssert = new SoftAssert();
        WebElement area = driver.findElement(By.xpath("//div[@id='error']"));
        softAssert.assertTrue(area.isDisplayed(),"Beklenen alan görüntülenemedi");

        //    Verify error message text is Your username is invalid!
        softAssert.assertTrue(area.getText().contains("Your username is invalid!"),"Beklenen mesaj yazmıyor");


    }
}
