package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartSummaryPage {

    private WebDriver driver;
    private Waits wait;

    public ShoppingCartSummaryPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getProductNameList() {
        String tempXpath = "//*[@id=" + '"' + "product_1_1_0_0" + '"' + "]/td[2] / p / a ";
        WebElement linkProductNameList = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(linkProductNameList);
    }

    public WebElement getButtonProceedToCheckout() {
        String tempXpath = "";
        WebElement buttonProceedToCheckout = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(buttonProceedToCheckout);
    }

}
