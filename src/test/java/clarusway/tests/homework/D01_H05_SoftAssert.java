package clarusway.tests.homework;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D01_H05_SoftAssert extends BaseTest {
//    Test Case3: Negative Password Test
//    Open page https://practicetestautomation.com/practice-test-login/
//    Type username student into Username field.
//    Type password incorrectPassword into Password field.
//    Puch Submit button.
//    Verify error message is displayed.
//    Verify error message text is Your password is invalid!


    @Test
    public void testCase02() {
        //    Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //    Type username student into Username field.
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("student");

        //    Type password incorrectPassword into Password field
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("incorrectPassword");

        //    Puch Submit button.
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        //    Verify error message is displayed.
        SoftAssert softAssert = new SoftAssert();
        WebElement area = driver.findElement(By.xpath("//div[@id='error']"));
        softAssert.assertTrue(area.isDisplayed(),"Beklenen alan görüntülenemedi");

        //     Verify error message text is Your password is invalid!
        softAssert.assertTrue(area.getText().contains("Your password is invalid!"),"Beklenen mesaj yazmıyor");


    }
}
