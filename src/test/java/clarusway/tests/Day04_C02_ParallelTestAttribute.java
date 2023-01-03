package clarusway.tests;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {

    @Test(                      //işlem için ayırdığımız thread  miktarı
            threadPoolSize = 4, //testimizin kaç çekirdekte paralelolarak çalışacağını belirtiler
            invocationCount = 7 //testimizin kaç defa çalıştığını belirler
    )
    public void test() {
        System.out.println("Current theread Id = "+Thread.currentThread().getId());
    }
}
