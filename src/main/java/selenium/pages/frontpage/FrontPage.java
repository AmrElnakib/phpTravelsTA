package selenium.pages.frontpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.selectors.frontpage.FrontPageSelectors;

import static selenium.browser.Browser.driver;

public class FrontPage {

    private FrontPageSelectors frontPageSelectors;

    public FrontPage(FrontPageSelectors frontPageSelectors){

        this.frontPageSelectors = frontPageSelectors;
    }

    public void enterEmail(String userEmail) {

        WebElement emailField = driver.findElement(By.xpath(frontPageSelectors.emailFieldXPATH));
        emailField.sendKeys(userEmail);
    }

    public void enterPassword(String password){

        WebElement passwordField = driver.findElement(By.xpath(frontPageSelectors.passwordFieldXPATH));
        passwordField.sendKeys(password);
    }

    public void LoginButton(){

        WebElement theLoginButton = driver.findElement(By.xpath(frontPageSelectors.loginButtonXPATH));
        theLoginButton.sendKeys(Keys.ENTER);
    }

    public void clickOnLogoLink(){
        WebElement logoLink = driver.findElement(By.xpath(frontPageSelectors.logoLinkXPATH));
        logoLink.click();
    }

    public void clickOnHomeLink(){

        WebElement homeLink = driver.findElement(By.xpath(frontPageSelectors.homeLinkXPATH));
        homeLink.click();
    }

    public void clickingOnFeaturedHotelsRendezvousOption(){

        WebElement featuredHotelsRendezvousHotelsLink = driver.findElement(By.xpath(frontPageSelectors.featuredHotelsRendezvousHotelsLinkXPATH));
        new Actions(driver).moveToElement(featuredHotelsRendezvousHotelsLink).perform();
        featuredHotelsRendezvousHotelsLink.click();

    }

    public String hotelsRendezvousHotelsTripleRoomsPrice(){

        WebElement tripleRoomsPrice = driver.findElement((By.xpath(frontPageSelectors.hotelsRendezvousHotelsTripleRoomsPriceXPATH)));
        return tripleRoomsPrice.getText();
    }

    public void clickOnBlogLink(){
        WebElement blogLink = driver.findElement(By.xpath(frontPageSelectors.blogLinkXPATH));
        blogLink.click();
    }

    public void clickOnOffersLink() {
        WebElement offersLink = driver.findElement(By.xpath(frontPageSelectors.offersLinkXPATH));
        offersLink.click();
    }

    public void clickOnHotelsLink(){
        WebElement hotelsLink = driver.findElement(By.xpath(frontPageSelectors.hotelsLinkXPATH));
        hotelsLink.click();
    }

    public void clickOnFlightsLink(){
        WebElement flightsLink = driver.findElement(By.xpath(frontPageSelectors.flightsLinkXPATH));
        flightsLink.click();
    }

    public void clickOnToursLink(){
        WebElement toursLink = driver.findElement(By.xpath(frontPageSelectors.toursLinkXPATH));
        toursLink.click();
    }

    public void clickOnCarsLink(){
        WebElement carsLink = driver.findElement(By.xpath(frontPageSelectors.carsLinkXPATH));
        carsLink.click();
    }

    public void clickOnVisaLink(){
        WebElement visaLink = driver.findElement(By.xpath(frontPageSelectors.visaLinkXPATH));
        visaLink.click();
    }

    public void headerDropDownOpener(){

        WebElement dropDownOpener = driver.findElement(By.xpath(frontPageSelectors.headerDropDownMenuOpenerXPATH));
        dropDownOpener.sendKeys(Keys.ENTER);
    }

    public void clickOnHeaderAccountOption(){

        WebElement dropDownAccountOption = driver.findElement(By.xpath(frontPageSelectors.headerDropDownAccountOptionXPATH));
        dropDownAccountOption.sendKeys(Keys.ENTER);
    }
}
