package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPaymentPage {

    private WebDriver driver;
    private Waits wait;

    public ShoppingCartPaymentPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getLabelTotalPrice() {
        String tempString = "//*[@id=" + '"' + "total_price" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempString));
        return wait.loadElement(element);
    }

    public WebElement getButtonPayByBankWire() {
        String tempString = "//*[@id=" + '"' + "HOOK_PAYMENT" + '"' + "]/div[1]/div";
        WebElement element = driver.findElement(By.xpath(tempString));
        return wait.loadElement(element);

    }

}
