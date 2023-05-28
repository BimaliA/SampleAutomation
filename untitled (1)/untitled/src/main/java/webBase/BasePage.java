package webBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    static WebDriver webDriver;
    public void navigation(String url,String browser){
        if (browser.trim().equals("chrome")){
           // WebDriverManager.chromedriver().setup();
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            webDriver=new ChromeDriver();
        }


            if(browser.trim().equals("edge")) {
               // WebDriverManager.edgedriver().setup();
                System.setProperty("webdriver.ie.driver","src/main/resources/msedgedriver.exe");

                webDriver = new EdgeDriver();
            }


        webDriver.navigate().to(url);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        webDriver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);




    }
    public void closeBrowser(){
        webDriver.quit();

    }

    public void refreshBrowser(){
        webDriver.navigate().refresh();
    }

}
