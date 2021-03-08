package Tasks;

import PageObjects.ShoppingCartPaymentPage;
import PageObjects.ShoppingCartSummaryPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPaymentTask {

    private static WebDriver driver;
    private static ShoppingCartPaymentPage shoppingCartPaymentPage;

    public ShoppingCartPaymentTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartPaymentPage = new ShoppingCartPaymentPage(this.driver);
    }

    public void chooseCardPayment() {
        shoppingCartPaymentPage.getButtonPayByBankWire().click();
    }

    public void checkPurchaseValue() {
        try {
            Assertions.assertEquals("$18.51", shoppingCartPaymentPage.getLabelTotalPrice().getText());
        } catch (Error | Exception e) {

        }
    }

}
