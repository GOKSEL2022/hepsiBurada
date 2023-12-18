package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AraPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.UrunPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC04_sayfadaAramaTestiStepDefs {
    HomePage homePage=new HomePage();
    AraPage araPage=new AraPage();
    UrunPage urunPage=new UrunPage();
    CheckoutPage checkoutPage=new CheckoutPage();
    Actions actions=new Actions(Driver.getDriver());
    char harf='a';   byte rakam=1;  char sembol='*';
    @And("kullanici arama alanina tiklar")
    public void kullaniciAramaAlaninaTiklar() throws InterruptedException {
        homePage.searchBoxHome.click();
        Thread.sleep(2000);
    }
    @And("kullanici arama alanina en az iki karakter girmesi gerektigini gorur")
    public void kullaniciAramaAlaninaEnAzIkiKarakterGirmesiGerektiginiGorur() {
        assert homePage.aramayaBaslamakIcinEnAz2KarakterYazmalisinizTextHome.getText().contains("en az 2 karakter");
        Driver.getDriver().navigate().refresh();
    }
    @And("kullanici arama alanina bir adet harf  girer")
    public void kullaniciAramaAlaninaBirAdetHarfGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(""+harf).perform();
    }
    @And("kullanici arama alanina bir adet rakam  girer")
    public void kullaniciAramaAlaninaBirAdetRakamGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(""+rakam).perform();
    }
    @And("kullanici arama alanina bir adet sembol  girer")
    public void kullaniciAramaAlaninaBirAdetSembolGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(""+sembol).perform();
    }
    @And("kullanici arama alanina bir bosluk girer")
    public void kullaniciAramaAlaninaBirBoslukGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(Keys.SPACE).perform();
    }
    @And("kullanici arama alanina iki adet bosluk girer")
    public void kullaniciAramaAlaninaIkiAdetBoslukGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(Keys.SPACE,Keys.SPACE).perform();
    }
    @And("kullanici arama alanina uc bosluk girer")
    public void kullaniciAramaAlaninaUcBoslukGirer() {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE).perform();
    }
    @And("kullanici arama alanina gecerli deger {string} girer")
    public void kullaniciAramaAlaninaGecerliDegerGirer(String string) {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(string,Keys.ENTER).perform();
    }
    @When("kullanici kategori basligini goruntuler")
    public void kullaniciKategoriBasliginiGoruntuler() {
        assert araPage.kategoriTextAra.isDisplayed();
    }
    @And("kullanici arama alanina gecerli sembol {string} girer")
    public void kullaniciAramaAlaninaGecerliSembolGirer(String string) {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(string,Keys.ENTER).perform();
    }
    @When("kullanici arama ile ilgili sonuc bulunamamistir yazisini goruntuler")
    public void kullaniciAramaIleIlgiliSonucBulunamamistirYazisiniGoruntuler() {
        assert araPage.sembolIleIlgiliSonucBulunamamistirTextAra.isDisplayed();
    }

    @Given("kullanici arama alaninda {string} aratir")
    public void kullaniciAramaAlanindaAratir(String string) {
        actions.sendKeys(homePage.searchBoxHome).sendKeys(string,Keys.ENTER).perform();
    }
    @When("kullanici acilan sayfada {string} ile ilgili sonuc bulundugunu dogrular")
    public void kullaniciAcilanSayfadaIleIlgiliSonucBulundugunuDogrular(String string) {
        assert araPage.iphone11IleIlgiliUrunBuldukTextAra.getText().contains("iphone 11");
    }
    @And("kullanici sayfadaki ilk urunun uzerine gelir")
    public void kullaniciSayfadakiIlkUrununUzerineGelir() {
        actions.moveToElement(araPage.iphone11IlkUrunAra).perform();
    }

    @And("kullanici urunun altinda GByte bilgisini goruntuler")
    public void kullaniciUrununAltindaGByteBilgisiniGoruntuler() {
        ReusableMethods.scrollIntoViewJS(araPage.iphone11IlkUrunGbBilgisiAra);
        assert araPage.iphone11IlkUrunGbBilgisiAra.isDisplayed();
    }

    @And("kullanici urunun altinda fiyat bilgisini goruntuler")
    public void kullaniciUrununAltindaFiyatBilgisiniGoruntuler() {
        assert araPage.iphone11IlkUrunFiyatBilgisiAra.isDisplayed();
    }

    @And("kullanici sayfadaki ilk urune tiklar")
    public void kullaniciSayfadakiIlkUruneTiklar() {
       ReusableMethods.clickByJS(araPage.iphone11IlkUrunAra);
    }
    @And("kullanici sepete eklenecek urun sayisinin artirilip azaltilabilecegini dogrular")
    public void kullaniciSepeteEklenecekUrunSayisininArtirilipAzaltilabileceginiDogrular() throws InterruptedException {
        ReusableMethods.switchToWindow(1);
        Thread.sleep(1000);
        ReusableMethods.scrollIntoViewJS(urunPage.sepeteEkleButonUrun);
        for (int i=0;i<3;i++){
            ReusableMethods.clickByJS(urunPage.arttirIsaretiUrun);
        }
        Thread.sleep(1000);
        for (int i=0;i<3;i++){
            ReusableMethods.clickByJS(urunPage.azaltIsaretiUrun);
        }
        }
    @And("kullanici satin alacagi urunun altinda ozelliklerini gorur")
    public void kullaniciSatinAlacagiUrununAltindaOzellikleriniGorur() {
        assert urunPage.urunOzellikleriUrun.isDisplayed();
    }
    @And("kullanici sepete ekle butonuna tiklar")
    public void kullaniciSepeteEkleButonunaTiklar() throws InterruptedException {
        ReusableMethods.switchToWindow(1);
        Thread.sleep(1000);
        ReusableMethods.scrollIntoViewJS(urunPage.sepeteEkleButonUrun);
        ReusableMethods.clickByJS(urunPage.sepeteEkleButonUrun);
        Thread.sleep(6000);
    }

    @And("kullanici urunun sepete eklendigi uyarisini gorur")
    public void kullaniciUrununSepeteEklendigiUyarisiniGorur() throws InterruptedException {
        Thread.sleep(3000);
        assert urunPage.urunSepetinizdeAlertUrun.isDisplayed();
    }
    @And("kullanici sepete git butonuna tiklar")
    public void kullaniciSepeteGitButonunaTiklar() {
        ReusableMethods.clickByJS(urunPage.sepeteGitUrun);
    }
    @When("kullanici sepete ekledigi urunun sepetinde oldugunu dogrular")
    public void kullaniciSepeteEkledigiUrununSepetindeOldugunuDogrular() {
        assert checkoutPage.sepeteEklenenUrunCheckout.isDisplayed();
    }
    @And("kullanici ekledigi urunu sepetten siler")
    public void kullaniciEkledigiUrunuSepettenSiler() {
        ReusableMethods.clickByJS(checkoutPage.deleteButonIphone11Checkout);
    }
    @When("kullanici urunun sepetten kaldirildigini belirten alerti gorur")
    public void kullaniciUrununSepettenKaldirildiginiBelirtenAlertiGorur() {
        assert checkoutPage.urunSepetinizdenKaldirildiAlertCheckout.isDisplayed();
    }
}
