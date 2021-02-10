package selenium.pages.frontpage;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import selenium.selectors.frontpage.FrontPageSelectors;

import static selenium.browser.Browser.driver;


public class AccountPage{

    private FrontPageSelectors frontPageSelectors;

    public AccountPage(FrontPageSelectors frontPageSelectors){
        this.frontPageSelectors = frontPageSelectors;
    }

    public void myProfileSideBarOption() {

        WebElement myProfileOption = driver.findElement(By.xpath(frontPageSelectors.accountPageMyProfileOptionXPATH));
        myProfileOption.sendKeys(Keys.ENTER);
    }

    public void firstNameField() {

        WebElement firstNameField = driver.findElement(By.xpath(frontPageSelectors.accountPageFirstNameFieldXPATH));

    }

    public void lastNameField() {
        WebElement lastNameField = driver.findElement(By.xpath(frontPageSelectors.accountPageLastNameXPATH));
    }

    public String firstNameValue() {
        WebElement element = driver.findElement(By.xpath(frontPageSelectors.accountPageFirstNameFieldXPATH));
        return element.getAttribute("value");
    }

    public String lastNameValue(){

        WebElement lastNameValue = driver.findElement(By.xpath(frontPageSelectors.accountPageLastNameXPATH));
        return lastNameValue.getAttribute("value");

    }
}