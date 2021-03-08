package TestCase;

import PageObjects.ShoppingCartAddressesPage;
import PageObjects.ShoppingCartOrderConfirmationPage;
import Suporte.TestBase;
import Tasks.*;
import Utilitarios.FixedWait;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class BuyItemSuccessfully extends TestBase {

    private WebDriver driver = this.getDriver();

    IndexTask indexTask = new IndexTask(driver);
    ProductDescriptionTask productDescriptionTask = new ProductDescriptionTask(driver);
    ShoppingCartSummaryTask shoppingCartSummaryTask = new ShoppingCartSummaryTask(driver);
    ShoppingCartAuthenticationTask shoppingCartAuthenticationTask = new ShoppingCartAuthenticationTask(driver);
    ShoppingCartCreateAnAccountTask shoppingCartCreateAnAccountTask = new ShoppingCartCreateAnAccountTask(driver);
    ShoppingCartAddressesTask shoppingCartAddressesTask = new ShoppingCartAddressesTask(driver);
    ShoppingCartShippingTask shoppingCartShippingTask = new ShoppingCartShippingTask(driver);
    ShoppingCartPaymentTask shoppingCartPaymentTask = new ShoppingCartPaymentTask(driver);
    ShoppingCartOrderSummaryTask shoppingCartOrderSummaryTask = new ShoppingCartOrderSummaryTask(driver);
    ShoppingCartOrderConfirmationTask shoppingCartOrderConfirmationTask = new ShoppingCartOrderConfirmationTask(driver);

    @Test
    public void BuyItemSucessfully() throws Exception {

        indexTask.selectProduct();

        productDescriptionTask.addProductToCart();
        productDescriptionTask.proceedToCheckout();

        shoppingCartSummaryTask.proceedToRegister();

        shoppingCartAuthenticationTask.typeEmail();
        shoppingCartAuthenticationTask.continueRegister();

        shoppingCartCreateAnAccountTask.completeFields();
        shoppingCartCreateAnAccountTask.submitAccount();

        shoppingCartAddressesTask.proceedToCheckout();

        shoppingCartShippingTask.proceedToPayment();

        shoppingCartPaymentTask.checkPurchaseValue();
        shoppingCartPaymentTask.chooseCardPayment();

        shoppingCartOrderSummaryTask.confirmOrder();

        shoppingCartOrderConfirmationTask.confirmOrderComplete();

        FixedWait.waitInSeconds(5);

    }

}
