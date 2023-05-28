package function;

import webBase.BasePage;
import webBase.LoginPage;

public class Navigation {
    BasePage basePage=new BasePage();

    public void navigate(String url, String browser){
        basePage.navigation(url,browser);
    }


    public void closeBrowser(){
        basePage.closeBrowser();

    }
}
