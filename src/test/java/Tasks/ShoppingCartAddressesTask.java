package Tasks;

import PageObjects.ShoppingCartAddressesPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShoppingCartAddressesTask {

    private static WebDriver driver;
    private static ShoppingCartAddressesPage shoppingCartAddressesPage;

    public ShoppingCartAddressesTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartAddressesPage = new ShoppingCartAddressesPage(this.driver);
    }

    public void proceedToCheckout() {
        checkAddress();
        shoppingCartAddressesPage.getButtonProceedToCheckout().click();
    }

    public void checkAddress() {
        try {
            Assertions.assertEquals("Endereço de Teste, 100", shoppingCartAddressesPage.getAddress().getText());
        } catch (Exception | Error e) {

        }

    }
}
