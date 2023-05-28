package Login;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilClass.ExtentReportBuilder;

public class extentReportUsageClass {
    ExtentReportBuilder extentReportBuilder=new ExtentReportBuilder();
    @BeforeClass
    public void preCondition(){
        extentReportBuilder.addConfigValIntoReport();
    }
    @Test
    public void testMethod(){
        System.out.println("Test Method Tested");
        extentReportBuilder.addInfoReport("TestPass","info Test Method");
    }
    @AfterClass
    public void postCondition(){
        extentReportBuilder.flushReportVal();
    }
}
