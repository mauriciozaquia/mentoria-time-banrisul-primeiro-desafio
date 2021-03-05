package TestCase;

import Suporte.TestBase;
import Utilitarios.FixedWait;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class BuyItemSuccessfully extends TestBase {

    private WebDriver driver = this.getDriver();

    @Test
    public void BuyItemSucessfully() throws Exception {
        FixedWait.waitInSeconds(2);
    }

}
