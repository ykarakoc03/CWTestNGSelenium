package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C02_Priority {

    // TestNG (default) olarak @Test annotationları alfabetik sıraya göre execute eder
    // TestNG prioritysinin sayi degeri en az olan testi ilk once calistirir
    // Priporty attribute u icin negatif degerler kullanilabilir
    //TestNG default(varsayılan) priority degeri 0 dır yazılmazsa 0 alınır ve bu şekilde sıralanır

    @Test(priority = -10)
    public void test02() {
    }

    @Test(priority = 1001)
    public void test04() {
    }

    @Test(priority = 1500)
    public void test01() {

    }


    @Test(priority = 2000)
    public void test03() {

    }



}
