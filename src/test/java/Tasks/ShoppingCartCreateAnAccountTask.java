package Tasks;

import PageObjects.ShoppingCartCreateAnAccountPage;
import Utilitarios.FakersGenerator;
import Utilitarios.FixedWait;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class ShoppingCartCreateAnAccountTask {

    private static WebDriver driver;
    private static ShoppingCartCreateAnAccountPage shoppingCartCreateAnAccountPage;
    private static FakersGenerator faker = new FakersGenerator();

    public ShoppingCartCreateAnAccountTask(WebDriver driver) {
        this.driver = driver;
        shoppingCartCreateAnAccountPage = new ShoppingCartCreateAnAccountPage(this.driver);
    }

    public void selectGenreMr() {
        shoppingCartCreateAnAccountPage.getInputRadioGender().click();
    }

    public void completeFields() {
        FixedWait.waitInSeconds(5); // verificar o motivo de estar quebrando o teste se retirar essa linha

        verificaTituloCarregado();
        selectGenreMr();

        //fields
        String firstName = faker.pegaPrimeiroNome();
        String lastName = faker.pegaUltimoNome();
        String password = "12345";
        String day = "19";
        Integer month = 6;
        String year = "1994";
        String company = "Company";
        String address1 = "Address1";
        String address2 = "Address2";
        String city = "Cachoeirinha";
        String state = "California";
        String zipCode = "94130";
        String country = "United States";
        String additionalInformation = "Informações Adicionais";
        String homePhone = "(51)99999999";
        String mobilePhone = "(51)99999999";
        String adressAlias = "Adress Alias";

        // actions
        shoppingCartCreateAnAccountPage.getInputCustomerFirstName().sendKeys(firstName);
        shoppingCartCreateAnAccountPage.getInputCustomerLastName().sendKeys(lastName);
        shoppingCartCreateAnAccountPage.getInputPassword().sendKeys(password);
        shoppingCartCreateAnAccountPage.dropdownDayOfDateOfBirth().selectByValue(day);
        shoppingCartCreateAnAccountPage.dropdownMonthOfDateOfBirth().selectByIndex(month);
        shoppingCartCreateAnAccountPage.dropdownYearOfDateOfBirth().selectByValue(year);
        shoppingCartCreateAnAccountPage.getInputFirstName().sendKeys(firstName);
        shoppingCartCreateAnAccountPage.getInputLastName().sendKeys(lastName);
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
        Assertions.assertTrue(shoppingCartCreateAnAccountPage.getTitleYourPersonInformation().isDisplayed());
    }

    public void submitAccount() {
        shoppingCartCreateAnAccountPage.getButtonSubmitAccount().click();
    }

}

