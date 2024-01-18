package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GiyimAyakkabiPage {
    public GiyimAyakkabiPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[.='Giyim Ürünleri ve Moda & Aksesuar'])[1]")
    public WebElement modaAksesuarTitleGiyimAyakkabi;
}
