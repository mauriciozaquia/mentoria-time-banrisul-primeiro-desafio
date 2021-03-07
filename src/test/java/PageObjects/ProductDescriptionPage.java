package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDescriptionPage {

    private WebDriver driver;
    private Waits wait;

    public ProductDescriptionPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getButtonAddToCart() {
        String tempId = "add_to_cart";
        WebElement linkProductName = driver.findElement(By.id(tempId));
        return wait.loadElement(linkProductName);
    }

    public WebElement getButtonProceedToCheckout() {
        String tempXpath = "//*[@id=" + '"' + "layer_cart" + '"' + "]/div[1]/div[2]/div[4]/a";
        System.out.println(tempXpath);
        WebElement buttonProceedToCheckout = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(buttonProceedToCheckout);
    }

}
