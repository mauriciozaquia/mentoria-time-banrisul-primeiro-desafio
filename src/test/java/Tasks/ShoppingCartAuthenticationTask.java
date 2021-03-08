package Tasks;

import PageObjects.ShoppingCartAuthenticationPage;
import Utilitarios.FakersGenerator;
import org.openqa.selenium.WebDriver;

public class ShoppingCartAuthenticationTask {

    private static WebDriver driver;
    private static ShoppingCartAuthenticationPage shoppingCartAuthenticationPage;
    private static FakersGenerator faker = new FakersGenerator();

    public ShoppingCartAuthenticationTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartAuthenticationPage = new ShoppingCartAuthenticationPage(this.driver);
    }

    public void typeEmail() {
        shoppingCartAuthenticationPage.getInputEmailAdress().sendKeys(faker.pegaEmailAleatorio());
    }

    public void continueRegister() {
        shoppingCartAuthenticationPage.getButtonCreateAnAccount().click();
    }

}
