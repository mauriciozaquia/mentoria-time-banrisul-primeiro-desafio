package Utilitarios;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FakersGenerator {

    private Faker faker;

    public FakersGenerator() {
        faker = new Faker(new Locale("pt-BR"));
    }

    public String pegaPrimeiroNome() {
        return faker.name().firstName();
    }

    public String pegaUltimoNome() {
        return faker.name().lastName();
    }

    public String pegaCodigoDeArea() {
        return faker.address().zipCode();
    }

    public String pegaEmailAleatorio() {
        String email = faker.bothify("????##@gmail.com");
        //Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);
        return email;
    }

}
