package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaticPage {
    public StaticPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@src='https://images.hepsiburada.net/assets/gif/hepsiburada/staticpages/2023/10/ayakkabicanta/images/header.jpg']")
    public WebElement ayakkabiCantaImageStatic;
}
