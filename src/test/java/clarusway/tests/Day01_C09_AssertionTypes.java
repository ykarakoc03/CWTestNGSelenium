package clarusway.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day01_C09_AssertionTypes {


    @Test
    public void hardAssertion() {
        //hart assertte hata alınca direk keser ve diger kalanları çalıştırmaz
        System.out.println("assert öncesi çalışıyor");
        Assert.assertEquals(1,2);
        System.out.println("assert sonrası çalışıyor");

    }

    @Test
    public void softAssertion() {
        //Çalışmaya devam eder assert sonrası da çalışır sonra faild verir
        System.out.println("Soft assert öncesi çalışıyor");

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(1,2);
        softAssert.assertTrue(true);
        System.out.println("soft assert sonrası çalışıyor");

        //..All() sonrası birşey yazarsak çalıştırmaz. Hart assertion olark düşünülebilir
        softAssert.assertAll();//Method sonrası kesinlikle çagırılması
    }
}
