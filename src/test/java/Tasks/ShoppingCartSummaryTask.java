package Tasks;

import PageObjects.ShoppingCartSummaryPage;
import Suporte.CapturaDeTela;
import Suporte.Relatorio;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSummaryTask {

    private static WebDriver driver;
    private static ShoppingCartSummaryPage shoppingCartSummaryPage;

    public ShoppingCartSummaryTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartSummaryPage = new ShoppingCartSummaryPage(this.driver);
    }

    public void proceedToRegister() {

        checkSelectedProduct();
        shoppingCartSummaryPage.getButtonProceedToCheckout().click();

    }

    public void checkSelectedProduct() {
        try {
            String productName = shoppingCartSummaryPage.getProductNameList().getText();
            Assertions.assertEquals("Faded Short Sleeve T-shirts", productName);
            Relatorio.log(Status.PASS, "Produto Selecionado com Sucesso", CapturaDeTela.fullPageBase64(driver));
        } catch (Error | Exception e) {
            Relatorio.log(Status.FAIL, "Produto Não Foi Selecionado com Sucesso", CapturaDeTela.fullPageBase64(driver));
        }
    }
}
