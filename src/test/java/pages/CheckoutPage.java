package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckoutPage {
    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='product_area_VUdcT']")
    public WebElement sepeteEklenenUrunCheckout;

    @FindBy(xpath = "//a[@class='delete_button_1lHhf']")
    public WebElement deleteButonIphone11Checkout;

    @FindBy(xpath = "//div[@class='hb-toast-text']")
    public WebElement urunSepetinizdenKaldirildiAlertCheckout;

    @FindBy(xpath = "//*[@class='payed_prices_1G2ue']")
    public WebElement secilenUrunlerToplamUcret;

    @FindBy(xpath = "//*[@class='products_2984E']")
    public WebElement urunlerFiyatCheckout;

    @FindBy(xpath = "//*[@class='cargo_1Nqun']")
    public WebElement kargoFiyatCheckout;
}
