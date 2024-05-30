package stepdefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import utilities.Driver;
import static utilities.Driver.getDriver;
import static utilities.ReusableMethods.*;
public class TC04_sayfadaAramaTestiStepDefs {
    //SearchContext shadowRootElement;
    AllPages allPages=new AllPages();
    Actions actions=new Actions(getDriver());
    char harf='a';   byte rakam=1;  char sembol='*';
    @And("kullanici arama alanina tiklar")
    public void kullaniciAramaAlaninaTiklar() throws InterruptedException {
        allPages.homePage().searchBoxHome.click();
        Thread.sleep(2000);
    }
    @And("kullanici arama alanina en az iki karakter girmesi gerektigini gorur")
    public void kullaniciAramaAlaninaEnAzIkiKarakterGirmesiGerektiginiGorur() {
        assert allPages.homePage().aramayaBaslamakIcinEnAz2KarakterYazmalisinizTextHome.getText().contains("en az 2 karakter");
        getDriver().navigate().refresh();
    }
    @And("kullanici arama alanina bir adet harf  girer")
    public void kullaniciAramaAlaninaBirAdetHarfGirer() {
        actions.sendKeys(allPages.homePage().searchBoxHome).sendKeys(""+harf).perform();
    }
    @And("kullanici arama alanina bir adet rakam  girer")
    public void kullaniciAramaAlaninaBirAdetRakamGirer() {
        actions.sendKeys(allPages.homePage().searchBoxHome).sendKeys(""+rakam).perform();
    }
    @And("kullanici arama alanina bir adet sembol  girer")
    public void kullaniciAramaAlaninaBirAdetSembolGirer() {
        actions.sendKeys(allPages.homePage().searchBoxHome).sendKeys(""+sembol).perform();
    }
    @And("kullanici arama alanina bir bosluk girer")
    public void kullaniciAramaAlaninaBirBoslukGirer() {
        actions.sendKeys(allPages.homePage().searchBoxHome).sendKeys(Keys.SPACE).perform();
    }
    @And("kullanici arama alanina iki adet bosluk girer")
    public void kullaniciAramaAlaninaIkiAdetBoslukGirer() {
        actions.sendKeys(allPages.homePage().searchBoxHome).sendKeys(Keys.SPACE,Keys.SPACE).perform();
    }
    @And("kullanici arama alanina uc bosluk girer")
    public void kullaniciAramaAlaninaUcBoslukGirer() {
        actions.sendKeys(allPages.homePage().searchBoxHome).sendKeys(Keys.SPACE,Keys.SPACE,Keys.SPACE).perform();
    }
    @And("kullanici arama alanina gecerli deger {string} girer")
    public void kullaniciAramaAlaninaGecerliDegerGirer(String string) {
        actions.sendKeys(allPages.homePage().searchBoxHome).sendKeys(string,Keys.ENTER).perform();
    }
    @When("kullanici kategori basligini goruntuler")
    public void kullaniciKategoriBasliginiGoruntuler() {
        assert allPages.araPage().kategoriTextAra.isDisplayed();
    }
    @And("kullanici arama alanina gecerli sembol {string} girer")
    public void kullaniciAramaAlaninaGecerliSembolGirer(String string) {
        actions.sendKeys(allPages.homePage().searchBoxHome).sendKeys(string,Keys.ENTER).perform();
    }
    @When("kullanici arama ile ilgili sonuc bulunamamistir yazisini goruntuler")
    public void kullaniciAramaIleIlgiliSonucBulunamamistirYazisiniGoruntuler() {
        assert allPages.araPage().sembolIleIlgiliSonucBulunamamistirTextAra.isDisplayed();
    }
    @Given("kullanici arama alaninda {string} aratir")
    public void kullaniciAramaAlanindaAratir(String string) {
        actions.sendKeys(allPages.homePage().searchBoxHome).sendKeys(string,Keys.ENTER).perform();
    }
    @When("kullanici acilan sayfada {string} ile ilgili sonuc bulundugunu dogrular")
    public void kullaniciAcilanSayfadaIleIlgiliSonucBulundugunuDogrular(String string) {
        assert allPages.araPage().iphone11IleIlgiliUrunBuldukTextAra.getText().contains("iphone 11");
    }
    @And("kullanici sayfadaki ilk urunun uzerine gelir")
    public void kullaniciSayfadakiIlkUrununUzerineGelir() {
        actions.moveToElement(allPages.araPage().iphone11IlkUrunAra).perform();
    }
    @And("kullanici urunun altinda GByte bilgisini goruntuler")
    public void kullaniciUrununAltindaGByteBilgisiniGoruntuler() {
        scrollIntoViewJS(allPages.araPage().iphone11IlkUrunGbBilgisiAra);
        assert allPages.araPage().iphone11IlkUrunGbBilgisiAra.isDisplayed();
    }
    @And("kullanici urunun altinda fiyat bilgisini goruntuler")
    public void kullaniciUrununAltindaFiyatBilgisiniGoruntuler() {
        assert allPages.araPage().iphone11IlkUrunFiyatBilgisiAra.isDisplayed();
    }
    @And("kullanici sayfadaki ilk urune tiklar")
    public void kullaniciSayfadakiIlkUruneTiklar() {
       clickByJS(allPages.araPage().iphone11IlkUrunAra);
    }
    @And("kullanici sepete eklenecek urun sayisinin artirilip azaltilabilecegini dogrular")
    public void kullaniciSepeteEklenecekUrunSayisininArtirilipAzaltilabileceginiDogrular() throws InterruptedException {
        switchToWindow(1);
        Thread.sleep(1000);
        scrollIntoViewJS(allPages.urunPage().sepeteEkleButonUrun);
        for (int i=0;i<3;i++){
            clickByJS(allPages.urunPage().arttirIsaretiUrun);
        }
        Thread.sleep(1000);
        for (int i=0;i<3;i++){
            clickByJS(allPages.urunPage().azaltIsaretiUrun);
        }
        }
    @And("kullanici satin alacagi urunun altinda ozelliklerini gorur")
    public void kullaniciSatinAlacagiUrununAltindaOzellikleriniGorur() {
        assert allPages.urunPage().urunOzellikleriUrun.isDisplayed();
    }
    @And("kullanici sepete ekle butonuna tiklar")
    public void kullaniciSepeteEkleButonunaTiklar() throws InterruptedException {
        switchToWindow(1);
        Thread.sleep(1000);
        scrollIntoViewJS(allPages.urunPage().sepeteEkleButonUrun);
        clickByJS(allPages.urunPage().sepeteEkleButonUrun);
        Thread.sleep(6000);
    }
    @And("kullanici urunun sepete eklendigi uyarisini gorur")
    public void kullaniciUrununSepeteEklendigiUyarisiniGorur() throws InterruptedException {
        Thread.sleep(3000);
        assert allPages.urunPage().urunSepetinizdeAlertUrun.isDisplayed();
    }
    @And("kullanici sepete git butonuna tiklar")
    public void kullaniciSepeteGitButonunaTiklar() {
        clickByJS(allPages.urunPage().sepeteGitUrun);
    }
    @When("kullanici sepete ekledigi urunun sepetinde oldugunu dogrular")
    public void kullaniciSepeteEkledigiUrununSepetindeOldugunuDogrular() {
        assert allPages.checkoutPage().sepeteEklenenUrunCheckout.isDisplayed();
    }
    @And("kullanici ekledigi urunu sepetten siler")
    public void kullaniciEkledigiUrunuSepettenSiler() {
        clickByJS(allPages.checkoutPage().deleteButonIphone11Checkout);
    }
    @When("kullanici urunun sepetten kaldirildigini belirten alerti gorur")
    public void kullaniciUrununSepettenKaldirildiginiBelirtenAlertiGorur() {
        assert allPages.checkoutPage().urunSepetinizdenKaldirildiAlertCheckout.isDisplayed();
    }
    @And("kullanici cep telefonu aksesuarlarini isaretler")
    public void kullaniciCepTelefonuAksesuarlariniIsaretler() {
       clickByJS(allPages.araPage().cepTelefonuAksesuarleriKategoriTitleAra);
    }
    @And("kullanici seceneklerden akilli saatlere tiklar")
    public void kullaniciSeceneklerdenAkilliSaatlereTiklar() {
        clickWithTimeOut(allPages.araPage().akilliSaatlerCepTelefonuAksesuarleriKategoriAra,4);
    }
    @And("kullanici sayfada ilk urun olarak akilli saati goruntuler")
    public void kullaniciSayfadaIlkUrunOlarakAkilliSaatiGoruntuler() {
        assert allPages.araPage().sayfadakiIlkUrunAkilliSattlerAra.isDisplayed();
    }
    @And("kullanici urunun uzerindesaticilardan seyu teknolojiyi secer")
    public void kullaniciUrununUzerindesaticilardanSeyuTeknolojiyiSecer() {
        clickWithTimeOut(allPages.araPage().seyuTechUrunlerAilliSaatlerAra,2);
    }
    @When("kullanici ekranda filtrelenen urunlerin syu teknolojiye ait oldugunu dogrular")
    public void kullaniciEkrandaFiltrelenenUrunlerinSyuTeknolojiyeAitOldugunuDogrular() {
        assert allPages.araPage().sayfadakiIlkUrunAkilliSattlerAra.isDisplayed();
    }
    @And("kullanici saticiya sor linke tiklar")
    public void kullaniciSaticiyaSorLinkeTiklar(){
        switchToWindow(1);
        SearchContext context=Driver.getDriver().findElement(By.cssSelector("#voltran-fragment")).getShadowRoot();
        WebElement saticiyaSorLink=context.findElement(By.cssSelector("#buybox"));
        saticiyaSorLink.click();
    }
}
