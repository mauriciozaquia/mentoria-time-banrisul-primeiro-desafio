package Tasks;

import PageObjects.ShoppingCartCreateAnAccountPage;
import Suporte.CapturaDeTela;
import Suporte.Relatorio;
import Utilitarios.FakersGenerator;
import Utilitarios.FakersGeneratorPtBr;
import Utilitarios.FixedWait;
import com.aventstack.extentreports.Status;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShoppingCartCreateAnAccountTask {

    private static WebDriver driver;
    private static ShoppingCartCreateAnAccountPage shoppingCartCreateAnAccountPage;
    private static FakersGeneratorPtBr fakerPtBr = new FakersGeneratorPtBr();
    private static FakersGenerator faker = new FakersGenerator();

    public ShoppingCartCreateAnAccountTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartCreateAnAccountPage = new ShoppingCartCreateAnAccountPage(this.driver);
    }

    public void selectGenreMr() {
        //shoppingCartCreateAnAccountPage.getInputRadioGender().click();
        shoppingCartCreateAnAccountPage.getLabelRadioGender().click();
    }

    public void completeFields() {
        FixedWait.waitInSeconds(2); // verificar o motivo de estar quebrando o teste se retirar essa linha

        verificaTituloCarregado();

        selectGenreMr();

        //fields
        String firstName = fakerPtBr.getFirstName();
        String lastName = fakerPtBr.getLastName();
        String password = "12345";
        String day = "19";
        Integer month = 6;
        String year = "1980";
        String company = fakerPtBr.getCompanyName();
        String address1 = "Endereço de teste, 100";
        String address2 = "";
        String city = fakerPtBr.getCity();
        String state = "California";
        String zipCode = "91400";
        String country = "United States";
        String additionalInformation = "Informações Adicionais";
        String homePhone = fakerPtBr.getPhone();
        String mobilePhone = fakerPtBr.getMobilePhone();
        String adressAlias = "Endereço 1";

        // actions
        shoppingCartCreateAnAccountPage.getInputCustomerFirstName().sendKeys(firstName);
        shoppingCartCreateAnAccountPage.getInputCustomerLastName().sendKeys(lastName);
        shoppingCartCreateAnAccountPage.getInputPassword().sendKeys(password);
        shoppingCartCreateAnAccountPage.dropdownDayOfDateOfBirth().selectByValue(day);
        shoppingCartCreateAnAccountPage.dropdownMonthOfDateOfBirth().selectByIndex(month);
        shoppingCartCreateAnAccountPage.dropdownYearOfDateOfBirth().selectByValue(year);
        //shoppingCartCreateAnAccountPage.getInputFirstName().sendKeys(firstName); // não necessita pois o site completa
        //shoppingCartCreateAnAccountPage.getInputLastName().sendKeys(lastName); // não necessite pois o site completa
        shoppingCartCreateAnAccountPage.getInputCompany().sendKeys(company);
        shoppingCartCreateAnAccountPage.getInputAddress1().sendKeys(address1);
        shoppingCartCreateAnAccountPage.getInputAddress2().sendKeys(address2);
        shoppingCartCreateAnAccountPage.getInputCity().sendKeys(city);
        shoppingCartCreateAnAccountPage.getInputState().selectByVisibleText(state);
        shoppingCartCreateAnAccountPage.getInputZipPostalCode().sendKeys(zipCode);
        shoppingCartCreateAnAccountPage.getInputCountry().selectByVisibleText(country);
        shoppingCartCreateAnAccountPage.getAdditionalInformations().sendKeys(additionalInformation);
        shoppingCartCreateAnAccountPage.getHomePhone().sendKeys(homePhone);
        shoppingCartCreateAnAccountPage.getMobilePhone().sendKeys(mobilePhone);
        shoppingCartCreateAnAccountPage.getAssignAnAddress().sendKeys(adressAlias);
    }

    public void verificaTituloCarregado() {
        try {
            Assertions.assertTrue(shoppingCartCreateAnAccountPage.getTitleYourPersonInformation().isDisplayed());
            Relatorio.log(Status.PASS, "Título do formulário de cadastro carregou com sucesso", CapturaDeTela.fullPageBase64(driver));
        } catch (Error | Exception e) {
            Relatorio.log(Status.FAIL, "Título do formulário de cadastro NÃO carregou com sucesso", CapturaDeTela.fullPageBase64(driver));
        }

    }

    public void submitAccount() {
        shoppingCartCreateAnAccountPage.getButtonSubmitAccount().click();
    }

}

