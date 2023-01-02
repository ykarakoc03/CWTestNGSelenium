package clarusway.tests;

import org.testng.annotations.Test;

public class Day03_C03_DataProviderClassTest {


    @Test(
            dataProvider = "testData",
            dataProviderClass = Day03_C03_DataProviderClass.class
    )
    public void dataProviderTest(String eng,String tr) {

        System.out.println(eng);
        System.out.println(tr);
        System.out.println();

    }
}
