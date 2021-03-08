package Tasks;

import PageObjects.ShoppingCartOrderSummaryPage;
import org.openqa.selenium.WebDriver;

public class ShoppingCartOrderSummaryTask {

    private static WebDriver driver;
    private static ShoppingCartOrderSummaryPage shoppingCartOrderSummaryPage;

    public ShoppingCartOrderSummaryTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartOrderSummaryPage = new ShoppingCartOrderSummaryPage(this.driver);
    }

    public void confirmOrder() {
        shoppingCartOrderSummaryPage.getButtonConfirmOrder().click();
    }

}
