package function;

import webBase.LoginPage;

public class CssFunctions {
    LoginPage loginPage=new LoginPage();
    public String loginCssVal(){
        return loginPage.getfontSize();
    }
}
