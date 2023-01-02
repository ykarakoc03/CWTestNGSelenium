package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C01_DataProvider {

    @Test(dataProvider = "dataProvider")
    public void test01(String name) {//parametre aşagıda tek deger verdiğimiz için tek parametre tanımladık
        //verileri dataProvider methodundan alarak çalışacak olan test
        System.out.println(name);

    }


    @DataProvider
    public Object[][] dataProvider(){
        //verileri teste sağlayacak olan method
        Object[][] data={
                {"Karl"},{"Ortis"},{"Clarusway"}
        };
        return data;
    }





}
