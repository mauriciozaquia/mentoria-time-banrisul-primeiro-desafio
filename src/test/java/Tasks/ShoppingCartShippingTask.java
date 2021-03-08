package Tasks;

import PageObjects.ShoppingCartShippingPage;
import PageObjects.ShoppingCartSummaryPage;
import org.openqa.selenium.WebDriver;

public class ShoppingCartShippingTask {

    private static WebDriver driver;
    private static ShoppingCartShippingPage shoppingCartShippingPage;

    public ShoppingCartShippingTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartShippingPage = new ShoppingCartShippingPage(this.driver);
    }

    public void proceedToPayment() {
        shoppingCartShippingPage.getCheckboxCgv().click();
        shoppingCartShippingPage.getButtonProceedToCheckout().click();
    }

}
