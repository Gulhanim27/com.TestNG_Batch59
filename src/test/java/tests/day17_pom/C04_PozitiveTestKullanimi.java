package tests.day17_pom;

import org.testng.annotations.Test;
import pages.PozitivePage;
import utilities.Driver;

public class C04_PozitiveTestKullanimi {
    @Test
    public void test01() {

        PozitivePage pozitiveLoginTest=new PozitivePage();
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");

        // login butonuna bas
  PozitivePage.loginKutusu.click();
        // test data username: manager ,
        pozitiveLoginTest.userName.sendKeys("manager");
        // test data password : Manager1!
        pozitiveLoginTest.password.sendKeys("Manager1");
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
    }
}
