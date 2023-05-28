package Login;

import common.TestContrants;
import function.Login;
import function.Navigation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvalidLogin {

    Navigation navigation=new Navigation();

    Login login=new Login();

    @BeforeClass
    public void preCondition(){
        //navigate into given URL
        navigation.navigate(TestContrants.BASE_URL,TestContrants.BROWSER);
    }

    @Test
    public void invalidUserNameValidPassword(){
        //enter valid credential
        login.login("standard_user","secret_sauce");
    }

    @Test
    public void ValidUserNameInvalidPassword(){
        //enter valid credential
        login.login("standard_user","secret_sauce");
    }

    @Test
    public void InvalidUserEmptyPassword(){
        //enter valid credential
        login.login("standard_user","secret_sauce");
    }

    @Test
    public void EmptyUsernameInvalidPassword(){
        //enter valid credential
        login.login("","secret_sauce");
    }

    @Test
    public void testLogin(){
        //enter valid credential
        login.login("standard_user","secret_sauce");
    }

    @AfterClass
    public void postCondition(){
        //Close the browser
        navigation.closeBrowser();
    }
}
