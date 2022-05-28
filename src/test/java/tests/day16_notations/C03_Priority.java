package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {

    /*
    TestNG test method larini isim sirasina gore calistirir
    eger isim siralamasinin disinda bir siralama ile calsimasini isterseniz
     o zaman test methodlarini oncelik (Priority) tanimlayabiliriz.
    Priority kucukten buyuge gore calisir
    eger bir test methoduna priority degeri atanmamis ise default olarak priority=0 olarak
    kabul edilir.
     */
    @Test(priority=-5)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test(priority=-2)
    public void test02() {

        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
