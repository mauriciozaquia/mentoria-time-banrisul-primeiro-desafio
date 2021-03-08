package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartAddressesPage {

    private WebDriver driver;
    private Waits wait;

    public ShoppingCartAddressesPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getAddress() {
        String tempXpath = "//*[@id=" + '"' + "address_delivery" + '"' + "]/li[4]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getButtonProceedToCheckout() {
        String tempXpath = "//*[@id=" + '"' + "center_column" + '"' + "]/form/p/button";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }


}
