package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.browser.Browser;

import java.util.concurrent.TimeUnit;

public class WaitTool {

    private static final int DEFAULT_WAIT_FOR_PAGE = 10;
    private static final int DEFAULT_WAIT_FOR_ELEMENT = 10;

    public void implicitlyWaitForPage(WebDriver driver) {

        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_FOR_PAGE, TimeUnit.SECONDS);
    }

    public void implicitlyWaitForElement(String elementXPATH) {

        WebDriverWait wait = new WebDriverWait(Browser.driver, DEFAULT_WAIT_FOR_ELEMENT);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementXPATH)));
    }
}
