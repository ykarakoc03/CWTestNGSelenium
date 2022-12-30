package clarusway.tests.homework;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D01_H03_HardSoftAssert extends BaseTest {


//    Test Case1: Positive Login Test
//    Open page https://practicetestautomation.com/practice-test-login/
//    Type username student into Username field
//    Type password Password123 into Password field
//    Puch Submit button.
//            Verify new page URL contains practicetestautomation.com/logged-in-successfully/
//    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
//    Verify button Log out is displayed on the new page.


    @Test
    public void testCase01() {


        //    Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //    Type username student into Username field
        WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
        //Sayfadaki kullanıcı adı yazdırılıyor
        username.sendKeys(driver.findElement(By.xpath("//section[@id='main-container']//li//b[1]")).getText());

        //    Type password Password123 into Password field
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        //sayfadaki pasaport yazdırılıyor
        password.sendKeys(driver.findElement(By.xpath("//section[@id='main-container']//li//b[2]")).getText());

        //    Puch Submit button.
        driver.findElement(By.xpath("//button[@id='submit']")).click();


        //    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"),"beklenen URL bulunamadı");

        //    Verify new page contains expected text ('Congratulations' or 'successfully logged in')

        WebElement area=driver.findElement(By.xpath("//div[@id='loop-container']//p"));
        Assert.assertTrue(area.getText().contains("Congratulations"),"Alanda 'Congratulations' yazmıyor");
        Assert.assertTrue(area.getText().contains("successfully logged in"),"Alanda 'successfully logged in' yazmıyor");

        //    Verify button Log out is displayed on the new page.
        WebElement button= driver.findElement(By.xpath("//a[.='Log out']"));
        Assert.assertTrue(button.isDisplayed(),"Beklenen Button görüntülenmedi");
    }
}
