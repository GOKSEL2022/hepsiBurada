package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.scrollIntoViewJS;
import static utilities.ReusableMethods.waitFor;

public class TC06_AnasayfadakiLinklerinTesti_2_StepDefs {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    @Given("kullanici ev_yasam_kirtasiye_ofis linke gelir")
    public void kullaniciEv_yasam_kirtasiye_ofisLinkeGelir() {
        actions.moveToElement(homePage.evYasamKirtasiyeOfisLinkiHome).perform();
    }
    @And("kullanici ev_yasam_kirtasiye_ofis seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciEv_yasam_kirtasiye_ofisSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(homePage.yurtDisindanSecenegiEvYasamKirtasiyeOfisLinkiHome);
        waitFor(2);
        scrollIntoViewJS(homePage.evTekstiliSecenegiEvYasamKirtasiyeOfisLinkiHome);

    }
    @And("kullanici oto_bahce_yapi_market linke gelir")
    public void kullaniciOto_bahce_yapi_marketLinkeGelir() {
        actions.moveToElement(homePage.otoBahceYapiMarketLinkiHome).perform();
        waitFor(2);
    }

    @And("kullanici oto_bahce_yapi_market seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciOto_bahce_yapi_marketSeceneklerininIlkiniVeSonOlaniGoruntuler() {
        scrollIntoViewJS(homePage.bahceSecenegiotoBahceYapiMarketLinkiHome);
        waitFor(2);
        scrollIntoViewJS(homePage.banyoMutfakSecenegiotoBahceYapiMarketLinkiHome);
    }

    @And("kullanici anne_bebek_oyuncak linke gelir")
    public void kullaniciAnne_bebek_oyuncakLinkeGelir() {
    }

    @And("kullanici anne_bebek_oyuncak seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciAnne_bebek_oyuncakSeceneklerininIlkiniVeSonOlaniGoruntuler() {
    }

    @And("kullanici spor_outdoor linke gelir")
    public void kullaniciSpor_outdoorLinkeGelir() {
    }

    @And("kullanici spor_outdoor seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciSpor_outdoorSeceneklerininIlkiniVeSonOlaniGoruntuler() {
    }

    @And("kullanici kozmetik_kisisel bakim linke gelir")
    public void kullaniciKozmetik_kisiselBakimLinkeGelir() {
    }

    @And("kullanici kozmetik_kisisel bakim seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciKozmetik_kisiselBakimSeceneklerininIlkiniVeSonOlaniGoruntuler() {
    }

    @And("kullanici supermarket_pet shop linke gelir")
    public void kullaniciSupermarket_petShopLinkeGelir() {
    }

    @And("kullanici supermarket_pet shop seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciSupermarket_petShopSeceneklerininIlkiniVeSonOlaniGoruntuler() {
    }

    @And("kullanici kitap_muzik_film_hobi linke gelir")
    public void kullaniciKitap_muzik_film_hobiLinkeGelir() {
    }

    @And("kullanici kitap_muzik_film_hobi seceneklerinin ilkini ve son olani goruntuler")
    public void kullaniciKitap_muzik_film_hobiSeceneklerininIlkiniVeSonOlaniGoruntuler() {
    }
}
