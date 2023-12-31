package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AraPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.UrunPage;
import utilities.Driver;
import utilities.ReusableMethods;
import static utilities.ReusableMethods.*;
public class TC04_sayfadaAramaTestiStepDefs {
    //SearchContext shadowRootElement;
    HomePage homePage=new HomePage();  AraPage araPage=new AraPage();
    UrunPage urunPage=new UrunPage(); CheckoutPage checkoutPage=new CheckoutPage();
    Actions actions=new Actions(Driver.getDriver()); char harf='a';   byte rakam=1;  char sembol='*';
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
        scrollIntoViewJS(araPage.iphone11IlkUrunGbBilgisiAra);
        assert araPage.iphone11IlkUrunGbBilgisiAra.isDisplayed();
    }
    @And("kullanici urunun altinda fiyat bilgisini goruntuler")
    public void kullaniciUrununAltindaFiyatBilgisiniGoruntuler() {
        assert araPage.iphone11IlkUrunFiyatBilgisiAra.isDisplayed();
    }
    @And("kullanici sayfadaki ilk urune tiklar")
    public void kullaniciSayfadakiIlkUruneTiklar() {
       clickByJS(araPage.iphone11IlkUrunAra);
    }
    @And("kullanici sepete eklenecek urun sayisinin artirilip azaltilabilecegini dogrular")
    public void kullaniciSepeteEklenecekUrunSayisininArtirilipAzaltilabileceginiDogrular() throws InterruptedException {
        ReusableMethods.switchToWindow(1);
        Thread.sleep(1000);
        scrollIntoViewJS(urunPage.sepeteEkleButonUrun);
        for (int i=0;i<3;i++){
            clickByJS(urunPage.arttirIsaretiUrun);
        }
        Thread.sleep(1000);
        for (int i=0;i<3;i++){
            clickByJS(urunPage.azaltIsaretiUrun);
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
        scrollIntoViewJS(urunPage.sepeteEkleButonUrun);
        clickByJS(urunPage.sepeteEkleButonUrun);
        Thread.sleep(6000);
    }
    @And("kullanici urunun sepete eklendigi uyarisini gorur")
    public void kullaniciUrununSepeteEklendigiUyarisiniGorur() throws InterruptedException {
        Thread.sleep(3000);
        assert urunPage.urunSepetinizdeAlertUrun.isDisplayed();
    }
    @And("kullanici sepete git butonuna tiklar")
    public void kullaniciSepeteGitButonunaTiklar() {
        clickByJS(urunPage.sepeteGitUrun);
    }
    @When("kullanici sepete ekledigi urunun sepetinde oldugunu dogrular")
    public void kullaniciSepeteEkledigiUrununSepetindeOldugunuDogrular() {
        assert checkoutPage.sepeteEklenenUrunCheckout.isDisplayed();
    }
    @And("kullanici ekledigi urunu sepetten siler")
    public void kullaniciEkledigiUrunuSepettenSiler() {
        clickByJS(checkoutPage.deleteButonIphone11Checkout);
    }
    @When("kullanici urunun sepetten kaldirildigini belirten alerti gorur")
    public void kullaniciUrununSepettenKaldirildiginiBelirtenAlertiGorur() {
        assert checkoutPage.urunSepetinizdenKaldirildiAlertCheckout.isDisplayed();
    }
    @And("kullanici cep telefonu aksesuarlarini isaretler")
    public void kullaniciCepTelefonuAksesuarlariniIsaretler() {
       clickByJS(araPage.cepTelefonuAksesuarleriKategoriTitleAra);
    }
    @And("kullanici seceneklerden akilli saatlere tiklar")
    public void kullaniciSeceneklerdenAkilliSaatlereTiklar() {
        clickWithTimeOut(araPage.akilliSaatlerCepTelefonuAksesuarleriKategoriAra,4);
    }
    @And("kullanici sayfada ilk urun olarak akilli saati goruntuler")
    public void kullaniciSayfadaIlkUrunOlarakAkilliSaatiGoruntuler() {
        assert araPage.sayfadakiIlkUrunAkilliSattlerAra.isDisplayed();
    }
    @And("kullanici urunun uzerindesaticilardan seyu teknolojiyi secer")
    public void kullaniciUrununUzerindesaticilardanSeyuTeknolojiyiSecer() {
        clickWithTimeOut(araPage.seyuTechUrunlerAilliSaatlerAra,2);
    }
    @When("kullanici ekranda filtrelenen urunlerin syu teknolojiye ait oldugunu dogrular")
    public void kullaniciEkrandaFiltrelenenUrunlerinSyuTeknolojiyeAitOldugunuDogrular() {
        assert araPage.sayfadakiIlkUrunAkilliSattlerAra.isDisplayed();
    }
    @And("kullanici saticiya sor linke tiklar")
    public void kullaniciSaticiyaSorLinkeTiklar() throws InterruptedException {
        //switchToWindow(1);
        /*
        SearchContext shadowRootElement =
                Driver.getDriver().findElement(By.cssSelector(".cst-asktoseller-button")).getShadowRoot();
        WebElement saticiyaSor =
                shadowRootElement.findElement(By.cssSelector("button"));
        saticiyaSor.click();

         */
        clickByJS(urunPage.saticiyaSorLinkShadowRoot1Urun);
        Thread.sleep(1000);
        clickByJS(urunPage.saticiyaSorLinkShadowRoo2Urun);
    }
}
