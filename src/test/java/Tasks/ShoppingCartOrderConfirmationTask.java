package Tasks;

import PageObjects.ShoppingCartOrderConfirmationPage;
import PageObjects.ShoppingCartOrderSummaryPage;
import Suporte.CapturaDeTela;
import Suporte.Relatorio;
import com.aventstack.extentreports.Status;
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
            Relatorio.log(Status.PASS, "Compra efetuada com sucesso!", CapturaDeTela.fullPageBase64(driver));
        } catch (Error | Exception e) {
            Relatorio.log(Status.FAIL, "Problema para finalizar a compra!", CapturaDeTela.fullPageBase64(driver));
        }
    }

}
