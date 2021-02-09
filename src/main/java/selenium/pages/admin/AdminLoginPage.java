package selenium.pages.admin;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import selenium.selectors.admin.AdminSelectors;

import static selenium.browser.Browser.driver;

public class AdminLoginPage {

    private AdminSelectors adminSelectors;

    public AdminLoginPage(AdminSelectors adminSelectors) {

        this.adminSelectors = adminSelectors;
    }

    public void enterEmail(String userEmail) {

        WebElement emailField = driver.findElement(By.xpath(adminSelectors.emailFieldXPATH));
        emailField.sendKeys(userEmail);
    }

    public void enterPassword(String password) {

        WebElement passwordField = driver.findElement(By.xpath(adminSelectors.passwordFieldXPATH));
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {

        WebElement loginButton = driver.findElement(By.xpath(adminSelectors.loginButtonXPATH));
        loginButton.sendKeys(Keys.ENTER);
    }

    public void clickRememberMeCheckBox(){

        WebElement rememberMeCheckBox = driver.findElement(By.xpath(adminSelectors.rememberMeCheckBoxXPATH));
        rememberMeCheckBox.click();
    }

    public void clickForgotPassword(){

        WebElement forgotPassword = driver.findElement(By.xpath(adminSelectors.forgotPasswordXPATH));
        forgotPassword.click();
    }
}
