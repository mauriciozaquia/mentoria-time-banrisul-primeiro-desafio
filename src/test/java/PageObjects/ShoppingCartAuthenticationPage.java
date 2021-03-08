package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartAuthenticationPage {

    private WebDriver driver;
    private Waits wait;

    public ShoppingCartAuthenticationPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getInputEmailAdress() {
        String tempXpath = "//*[@id=" + '"' + "email_create" + '"' + "]";
        WebElement inputEmailAdress = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(inputEmailAdress);
    }

    public WebElement getButtonCreateAnAccount() {
        String tempXpath = "//*[@id=" + '"' + "SubmitCreate" + '"' + "]";
        WebElement buttonCreateAnAccount = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(buttonCreateAnAccount);

    }
}
