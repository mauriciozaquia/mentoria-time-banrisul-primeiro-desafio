package TestCase;

import Suporte.Relatorio;
import Suporte.TestBase;
import Suporte.TipoRelatorio;
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

        Relatorio.criaTeste("Realizar Compra com Sucesso", TipoRelatorio.SINGLE);

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
