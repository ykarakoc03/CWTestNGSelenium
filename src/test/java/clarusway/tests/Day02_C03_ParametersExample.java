package clarusway.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_C03_ParametersExample {
String driver;
/*
parametreler ilşe ilgili sonra yapacagımız browser değiştirme örnegi

10_BrowserParameters.xml
 */
    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browserName) {
        // Driver konfig. yapılıyor
        if(browserName.equals("chrome")){
            driver="chrome";
            //chromekonf. yapılıyor

        }else if(browserName.equals("firefox")){
            driver="firefox";
            //firefox konf. yapılıyor
        }else if(browserName.equals("opera")) {
            driver = "opera";
            //opera konf. yapılıyor
        }
        System.out.println("Driver objesi oluşturuldu " + driver);
    }

    @AfterMethod
    public void tearDown() {
        driver="-";
        System.out.println("driver sonlandırıldı " + driver);
//kapatıldı
    }

    @Test
    public void testName() {
        System.out.println("browser acılıyor " + driver);
    }
}
