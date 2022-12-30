package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C04_Enabled {


    @Test(enabled = true)
    public void testEnabled() {
        System.out.println("Enamled çalışyı");
    }

    @Test(enabled = false)
    public void testDisabled() {
        System.out.println("disabled çalışıyor");
    }
}
