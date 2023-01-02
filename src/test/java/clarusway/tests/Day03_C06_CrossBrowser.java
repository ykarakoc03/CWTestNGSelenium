package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day03_C06_CrossBrowser extends BaseCrossBrowserTest {

   //browser bilgisi xml dosyasından alınacagı için kod aşamasında  herhangi bir değişiklik görüntülenmeyecektir

    @Test
    public void crossBrowserTest() {
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
    }
}
