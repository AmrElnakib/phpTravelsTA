package selenium.browser;


import base.WaitTool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

    public static WebDriver driver;
    private WaitTool waitTool;

    public Browser(WaitTool waitTool){
        this.waitTool = waitTool;
    }

    public void openBrowser(String browser){

        switch(browser.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            default:
            driver = new ChromeDriver();
            break;
        }
        System.out.println(browser + " is launched");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public void goToUrl(String url){
        driver.get(url);
        waitTool.implicitlyWaitForPage(Browser.driver);
    }

    public void goToAnotherUrl(String url){
        driver.get(url);
        waitTool.implicitlyWaitForPage(driver);
    }

    public void closeBrowser(){
        driver.quit();
    }
}
