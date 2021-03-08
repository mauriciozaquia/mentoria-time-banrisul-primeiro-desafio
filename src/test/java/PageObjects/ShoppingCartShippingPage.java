package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartShippingPage {

    private WebDriver driver;
    private Waits wait;

    public ShoppingCartShippingPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getCheckboxCgv() {
        String tempString = "//*[@id=" + '"' + "uniform-cgv" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempString));
        return wait.loadElement(element);
    }

    public WebElement getButtonProceedToCheckout() {
        String tempXpath = "//*[@id=" + '"' + "form" + '"' + "]/p/button";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

}
