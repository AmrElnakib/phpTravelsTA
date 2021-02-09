package selenium.pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.selectors.admin.AdminSelectors;

import static selenium.browser.Browser.driver;

public class AdminDashboardPage {

    private AdminSelectors adminSelectors;

    public AdminDashboardPage(AdminSelectors adminSelectors){ this.adminSelectors = adminSelectors; }

    public void clickOnSidebarMenuHotelsOption(){

        WebElement sidebarMenuHotelsOption = driver.findElement(By.xpath(adminSelectors.sidebarMenuHotelsOptionXPATH));
        sidebarMenuHotelsOption.click();
    }

    public void clickOnHotelsMenuRoomsOption(){

        WebElement roomsOption = driver.findElement(By.xpath(adminSelectors.hotelsMenuRoomsLinkXPATH));
        roomsOption.click();
    }

    public void clickOnTripleRoomsTypeInRendezvousHotelsHotel(){

        WebElement tripleRoomsTypeInRendezvousHotelsHotel = driver.findElement(By.xpath(adminSelectors.tripleRoomRendezvousHotelsLinkXPATH));
        tripleRoomsTypeInRendezvousHotelsHotel.click();
    }

    public void editValueOfUpdatePagePriceField(){

        WebElement valueOfUpdatePagePriceField = driver.findElement(By.xpath(adminSelectors.updatePagePriceFieldXPATH));
        String value = valueOfUpdatePagePriceField.getAttribute("value");
        String update = "200";
        if(update.equals(value)) {
            valueOfUpdatePagePriceField.clear();
            valueOfUpdatePagePriceField.sendKeys("100");
        }
        else{
            valueOfUpdatePagePriceField.clear();
            valueOfUpdatePagePriceField.sendKeys("200");
        }
    }

    public void clickOnUpdatePageSubmitButton(){

        WebElement updatePageSubmitButton = driver.findElement(By.xpath(adminSelectors.updatePageSubmitButtonXPATH));
        updatePageSubmitButton.click();
    }
}
