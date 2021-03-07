package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {

    private WebDriver driver;
    private Waits wait;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getLinkProductName() {
        String tempXpath = "//*[@id=" + '"' + "homefeatured" + '"' + "]/li[1]/div/div[2]/h5/a";
        WebElement linkProductName = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(linkProductName);
    }

    public WebElement getButtonAddCart() {
        String tempXpath = "//*[@id=" + '"' + "homefeatured" + '"' + "]/li[1] / div / div[2] / div[2] / a[1] ";
        WebElement buttonAddCart = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(buttonAddCart);
    }
}
