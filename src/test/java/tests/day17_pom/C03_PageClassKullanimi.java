package tests.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanimi {
    @Test
    public void test01() {
        FacebookPage facebookPAge=new FacebookPage();
        //facebook ana sayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");

        // kullanici mail kutsuna rastgele bir isim yazidirn

        Faker faker=new Faker();
        facebookPAge.mailKutusu.sendKeys(faker.internet().emailAddress());
        // kullanici sifre kutusuna rastgele bir password yazdirin
        facebookPAge.sifreKutusu.sendKeys(faker.internet().password());
        // login butonuna basin
        facebookPAge.loginTusu.click();
        // giris yapilamadigni test edin
        Assert.assertTrue(facebookPAge.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
