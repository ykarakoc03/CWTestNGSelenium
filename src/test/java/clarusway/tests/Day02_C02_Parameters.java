package clarusway.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_C02_Parameters {

//09_parameters.xml ile birlikte çalıştık
/*
@Parameters({"isim","yas"})
public void test01(String name, int yas) {}

.xml hali
<parameter name="isim" value="Abuzittin"></parameter>
<parameter name="yas" value="25"></parameter>

 */
    @Test
    @Parameters("isim")
    public void test01(String name) {
        System.out.println("Hello " + name);


    }
}
