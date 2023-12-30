package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BilgisayarlarPage {
    public BilgisayarlarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css= "h1[class='gQjF21piuOrwYvanqai8']")
    public WebElement bilgisayarFiyatlariVeModelleriTextBilgisayarlar;
}
