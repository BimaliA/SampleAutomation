package Login;

import common.TestContrants;
import function.CssFunctions;
import function.Login;
import function.Navigation;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValidLogin {
    Navigation navigation =new Navigation();
CssFunctions cssFunctions=new CssFunctions();
    Login login=new Login();
@Parameters("myBrowser")
    @BeforeClass
    public void preCondition(String myBrowser){
        //navigate into given URL
        navigation.navigate(TestContrants.BASE_URL,myBrowser);

    }


    @Test
    public void testLogin(){
        //enter valid credential
        Assert.assertEquals(cssFunctions.loginCssVal(),"16px");
        login.login("standard_user","secret_sauce");

   }


    @AfterClass
    public void postCondition(){
        //Close the browser
        navigation.closeBrowser();
    }
}
