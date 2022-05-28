package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PozitivePage {
    public PozitivePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath="(//a[@class='nav-link'])[7]")
    public static WebElement loginKutusu;
    @FindBy(xpath="//input[@id='UserName']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

}
