package Utilitarios;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FakersGeneratorPtBr {

    private Faker faker;

    public FakersGeneratorPtBr() {
        faker = new Faker(new Locale("pt-BR"));
    }

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getPostalCode() {
        return faker.address().zipCode();
    }

    public String getRandomEmail() {
        String email = faker.bothify("????##@gmail.com");
        //Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);
        return email;
    }

    public String getCompanyName() {
        String companyName = faker.company().name();
        return companyName;
    }

    public String getAddress() {
        String address = faker.address().fullAddress();
        return address;
    }

    public String getCity() {
        String city = faker.address().city();
        return city;
    }

    public String getMobilePhone() {
        String mobilePhone = faker.phoneNumber().cellPhone();
        return mobilePhone;
    }

    public String getPhone() {
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }

}
