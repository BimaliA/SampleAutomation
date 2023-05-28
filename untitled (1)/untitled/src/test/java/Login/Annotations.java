package Login;

import Reports.TestListeners;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(TestListeners.class)
public class Annotations {

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }


    @BeforeMethod

    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }

    @Test(dependsOnMethods = "test3")
    public void test1(){
        System.out.println("Test1");
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("Test2");
        Assert.fail();
    }

    @Test(priority = 3)
    public void test3(){
        System.out.println("Test3");

    }


    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }


}
