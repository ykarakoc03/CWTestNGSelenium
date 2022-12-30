package clarusway.tests.homework;


import org.testng.annotations.*;

public class D01_H01_TestNgAnnotations {

//    Create a class.
//    Create 2 test methods.
//    Use TestNG annotations that can be used in the class.
//    Interpret output in console.

    @Test
    public void test01() {
        System.out.println(">>>>>test01 çalışıyor");
    }

    @Test
    public void test02() {
        System.out.println(">>>>>test02 çalışıyor");
    }


    @BeforeSuite
    public void beforeSuite() {
        System.out.println(">before Suite çalışıyor");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(">After Suite çalışıyor");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(">>before Test çalışıyor");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(">>After Test çalışıyor");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(">>>before class çalışıyor");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(">>>After class çalışıyor");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println(">>>>before Medhod çalışıyor");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(">>>>After Method çalışıyor");
    }


}
