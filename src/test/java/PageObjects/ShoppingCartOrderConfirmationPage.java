package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartOrderConfirmationPage {

    private WebDriver driver;
    private Waits wait;

    public ShoppingCartOrderConfirmationPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getLabelChequeIndent() {
        String tempXpath = "//*[@id=" + '"' + "center_column" + '"' + "]/div/p/strong";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

}
