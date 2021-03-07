package Tasks;

import PageObjects.ProductDescriptionPage;
import org.openqa.selenium.WebDriver;

public class ProductDescriptionTask {

    private static WebDriver driver;
    private static ProductDescriptionPage productDescriptionPage;

    public ProductDescriptionTask(WebDriver driver) {
        this.driver = driver;
        productDescriptionPage = new ProductDescriptionPage(this.driver);
    }

    public void addProductToCart() {
        productDescriptionPage.getButtonAddToCart().click();
    }

    public void proceedToCheckout(){
        productDescriptionPage.getButtonProceedToCheckout().click();
    }
}
