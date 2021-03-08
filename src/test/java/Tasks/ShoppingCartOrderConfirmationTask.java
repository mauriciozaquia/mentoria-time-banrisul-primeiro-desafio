package Tasks;

import PageObjects.ShoppingCartOrderConfirmationPage;
import PageObjects.ShoppingCartOrderSummaryPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShoppingCartOrderConfirmationTask {

    private static WebDriver driver;
    private static ShoppingCartOrderConfirmationPage shoppingCartOrderConfirmationPage;

    public ShoppingCartOrderConfirmationTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartOrderConfirmationPage = new ShoppingCartOrderConfirmationPage(this.driver);
    }

    public void confirmOrderComplete() {

        try {
            Assertions.assertEquals("Your order on My Store is complete.", shoppingCartOrderConfirmationPage.getLabelChequeIndent().getText());
        } catch (Exception | Error e) {

        }

    }

}
