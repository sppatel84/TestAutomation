package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;  // initialize WebDriver


    private String executeToBrowser= "chrome";

    public TestBase(){
        PageFactory.initElements(driver,this);
    }  // initialize pageFactory

    public void openBrowser() {
        // open browser with chrome and firefox
        if ("chrome".equals(executeToBrowser)) {
            System.setProperty("webdriver.chrome.driver", "/Users/sudippatel/Desktop/chromedriver");
            driver = new ChromeDriver();

        }
        else {
            System.setProperty("webdriver.gecko.driver", "/Users/sudippatel/Desktop/geckodriver");
            driver = new FirefoxDriver();
        }
    }

    public void getUrl(String url){
        driver.get(url);   // get the url
    }

    public void maximizeBrowser(){
        driver.manage().window().maximize();  // maximize the window
    }

    public void impWaits(){
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); // apply implicit waits
    }

    public void closeBrowser(){
        driver.quit(); // close the browser after test
    }


}
