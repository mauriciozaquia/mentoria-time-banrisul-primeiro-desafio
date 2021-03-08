package Tasks;

import PageObjects.ShoppingCartAuthenticationPage;
import Utilitarios.FakersGeneratorPtBr;
import org.openqa.selenium.WebDriver;

public class ShoppingCartAuthenticationTask {

    private static WebDriver driver;
    private static ShoppingCartAuthenticationPage shoppingCartAuthenticationPage;
    private static FakersGeneratorPtBr faker = new FakersGeneratorPtBr();

    public ShoppingCartAuthenticationTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartAuthenticationPage = new ShoppingCartAuthenticationPage(this.driver);
    }

    public void typeEmail() {
        shoppingCartAuthenticationPage.getInputEmailAdress().sendKeys(faker.getRandomEmail());
    }

    public void continueRegister() {
        shoppingCartAuthenticationPage.getButtonCreateAnAccount().click();
    }

}
