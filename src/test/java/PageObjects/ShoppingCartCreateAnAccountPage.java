package PageObjects;

import Suporte.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartCreateAnAccountPage {

    private WebDriver driver;
    private Waits wait;

    public ShoppingCartCreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
        wait = new Waits(driver);
    }

    public WebElement getLabelRadioGenderVisibility() {
        String tempXpath = "//*[@id=" + '"' + "account-creation_form" + '"' + "]/div[1]/div[1]/div[1]/label";
        return wait.visibilityOfElement(By.xpath(tempXpath));
    }

    public WebElement getInputRadioGender() {
        String tempXpath = "//*[@id=" + '"' + "id_gender1" + '"' + "]";
        WebElement inputRadioGender = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(inputRadioGender);
    }

    public WebElement getLabelRadioGender() {
        String tempXpath = "//*[@id=" + '"' + "account-creation_form" + '"' + "]/div[1]/div[1]/div[1]/label";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getTitleYourPersonInformation() {
        String tempXpath = "//*[@id=" + '"' + "account-creation_form" + '"' + "]/div[1]/h3";
        WebElement inputTitleYourPersonInformation = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(inputTitleYourPersonInformation);
    }

    public WebElement getInputCustomerFirstName() {
        String tempXpath = "//*[@id=" + '"' + "customer_firstname" + '"' + "]";
        WebElement inputFirstName = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(inputFirstName);
    }

    public WebElement getInputCustomerLastName() {
        String tempXpath = "//*[@id=" + '"' + "customer_lastname" + '"' + "]";
        WebElement inputLastName = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(inputLastName);
    }

    public WebElement getInputPassword() {
        String tempXpath = "//*[@id=" + '"' + "passwd" + '"' + "]";
        WebElement inputPassword = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(inputPassword);
    }

    public Select dropdownDayOfDateOfBirth() {
        String tempXpath = "//*[@id=" + '"' + "days" + '"' + "]";
        Select dropdown = new Select(driver.findElement(By.xpath(tempXpath)));
        return dropdown;
    }

    public Select dropdownMonthOfDateOfBirth() {
        String tempXpath = "//*[@id=" + '"' + "months" + '"' + "]";
        Select dropdown = new Select(driver.findElement(By.xpath(tempXpath)));
        return dropdown;
    }

    public Select dropdownYearOfDateOfBirth() {
        String tempXpath = "//*[@id=" + '"' + "years" + '"' + "]";
        Select dropdown = new Select(driver.findElement(By.xpath(tempXpath)));
        return dropdown;
    }

    public WebElement getInputFirstName() {
        String tempXpath = "//*[@id=" + '"' + "firstname" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getInputLastName() {
        String tempXpath = "//*[@id=" + '"' + "lastname" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getInputCompany() {
        String tempXpath = "//*[@id=" + '"' + "company" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getInputAddress1() {
        String tempXpath = "//*[@id=" + '"' + "address1" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getInputAddress2() {
        String tempXpath = "//*[@id=" + '"' + "address2" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getInputCity() {
        String tempXpath = "//*[@id=" + '"' + "city" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public Select getInputState() {
        String tempXpath = "//*[@id=" + '"' + "id_state" + '"' + "]";
        Select dropdown = new Select(driver.findElement(By.xpath(tempXpath)));
        return dropdown;
    }

    public WebElement getInputZipPostalCode() {
        String tempXpath = "//*[@id=" + '"' + "postcode" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public Select getInputCountry() {
        String tempXpath = "//*[@id=" + '"' + "id_country" + '"' + "]";
        Select dropdown = new Select(driver.findElement(By.xpath(tempXpath)));
        return dropdown;
    }

    public WebElement getAdditionalInformations() {
        String tempXpath = "//*[@id=" + '"' + "other" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getHomePhone() {
        String tempXpath = "//*[@id=" + '"' + "phone" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getMobilePhone() {
        String tempXpath = "//*[@id=" + '"' + "phone_mobile" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getAssignAnAddress() {
        String tempXpath = "//*[@id=" + '"' + "alias" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

    public WebElement getButtonSubmitAccount() {
        String tempXpath = "//*[@id=" + '"' + "submitAccount" + '"' + "]";
        WebElement element = driver.findElement(By.xpath(tempXpath));
        return wait.loadElement(element);
    }

}
