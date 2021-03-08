package Tasks;

import PageObjects.ShoppingCartAddressesPage;
import Suporte.CapturaDeTela;
import Suporte.Relatorio;
import com.aventstack.extentreports.Status;
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
            Assertions.assertEquals("Endereço de teste, 100", shoppingCartAddressesPage.getAddress().getText());
            Relatorio.log(Status.PASS, "Endereço correto!", CapturaDeTela.fullPageBase64(driver));
        } catch (Error | Exception e) {
            Relatorio.log(Status.FAIL, "Endereço diferente do cadastrado!", CapturaDeTela.fullPageBase64(driver));
        }

    }
}
