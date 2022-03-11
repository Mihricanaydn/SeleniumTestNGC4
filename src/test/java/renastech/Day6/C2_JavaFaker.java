package renastech.Day6;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class C2_JavaFaker {

    @Test
    public void TC1_javaFaker(){
        Faker faker = new Faker(Locale.CANADA);
        System.out.println("faker.name().fullName()=" + faker.name().fullName());
        System.out.println(faker.name().firstName());
        System.out.println(faker.address().cityName());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.lordOfTheRings().character());


    }
}
