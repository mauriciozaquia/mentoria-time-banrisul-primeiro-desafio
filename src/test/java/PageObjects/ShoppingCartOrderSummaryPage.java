package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartOrderSummaryPage {

    private WebDriver driver;
    private Waits wait;

    public ShoppingCartOrderSummaryPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getButtonConfirmOrder() {
        String tempXpath = "//*[@id=" + '"' + "cart_navigation" + '"' + "]/button";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

}
