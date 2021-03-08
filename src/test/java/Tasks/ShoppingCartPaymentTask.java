package Tasks;

import PageObjects.ShoppingCartPaymentPage;
import PageObjects.ShoppingCartSummaryPage;
import Suporte.CapturaDeTela;
import Suporte.Relatorio;
import com.aventstack.extentreports.Status;
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
            Relatorio.log(Status.PASS, "Preço correto!", CapturaDeTela.fullPageBase64(driver));
        } catch (Error | Exception e) {
            Relatorio.log(Status.FAIL, "Preço diferente do inicial!", CapturaDeTela.fullPageBase64(driver));
        }
    }

}
