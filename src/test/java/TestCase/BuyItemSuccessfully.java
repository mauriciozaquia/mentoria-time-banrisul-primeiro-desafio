package TestCase;

import Suporte.TestBase;
import Tasks.IndexTask;
import Tasks.ProductDescriptionTask;
import Tasks.ShoppingCartSummaryTask;
import Utilitarios.FixedWait;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class BuyItemSuccessfully extends TestBase {

    private WebDriver driver = this.getDriver();

    IndexTask indexTask = new IndexTask(driver);
    ProductDescriptionTask productDescriptionTask = new ProductDescriptionTask(driver);
    ShoppingCartSummaryTask shoppingCartSummaryTask = new ShoppingCartSummaryTask(driver);

    @Test
    public void BuyItemSucessfully() throws Exception {

        indexTask.selectProduct();
        productDescriptionTask.addProductToCart();
        productDescriptionTask.proceedToCheckout();
        shoppingCartSummaryTask.proceedToRegister();

        FixedWait.waitInSeconds(5);

    }

}
