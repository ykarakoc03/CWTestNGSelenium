package clarusway.tests;

import org.testng.annotations.DataProvider;

public class Day03_C03_DataProviderClass {

@DataProvider(name="testData")//bu parametre nadiren kullanılır
public Object[][] data(){

    Object[][] returnData ={
            {"First ttest","birinci test"},
            {"Second ttest","ikinci test"},
            {"Third ttest","üçüncü test"},
    };
    return returnData;
}


}
