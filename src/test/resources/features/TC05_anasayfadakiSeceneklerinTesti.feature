@anasayfadaki_linkler
Feature: anasayfadaki_linklerin_testi

  Background:
    Given kullanici url ye gider
    When kullanici anasayfanin acildigini dogrular
    And  kullanici iki saniye bekler

  @konum
  Scenario:konum_secimi_test
    And   kullanici konum sec linke tiklar
    And   kullanici iki saniye bekler
    And   kullanici bir il secer
    And   kullanici iki saniye bekler
    And   kullanici bir ilce secer
    And   kullanici iki saniye bekler
    And   kullanici bir mahalle secer
    And   kullanici kaydet butonuna tiklar
    When  kullanici konum degistirildi alerti goruntuler
    Then  kullanici sayfayi kapatir

  Scenario: elektronik_link_seceneklerinin_dogrulama_testi
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici bilgisayar_tablet secenegine tiklar
    And  kullanici acilan sayfanin bilgisayar urunleri icerdigini dogrular
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici yazicilar_projeksiyon secenegine tiklar
    And  kullanici acilan sayfanin yazici model ve fiyatlari icerdigini dogrular
    And  kullanici iki saniye bekler
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici telefon_telefon aksesuarlari secenegine tiklar
    And  kullanici acilan sayfanin telefon ile ilgili oldugunu dogrular
    And  kullanici iki saniye bekler
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici tv_goruntu ve ses secenegini tiklar
    And  kullanici acilan sayfanin ses ve goruntu urunleri icerdigini dogrular
    And  kullanici iki saniye bekler
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici beyaz esya secenegini tiklar
    And  kullanici acilan sayfanin beyaz esya urunleri icerdigini dogrular
    And  kullanici iki saniye bekler
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici klima ve isiticilar secenegini tiklar
    And  kullanici acilan sayfanin isitme_sogutma urunleri icerdigini dogrular
    And  kullanici iki saniye bekler
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici elektrikli ev aletleri secenegini tiklar
    And  kullanici acilan sayfanin elektrikli ev aletleri urunleri icerdigini dogrular
    And  kullanici iki saniye bekler
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici foto_kamera secenegini tiklar
    And  kullanici acilan sayfanin foto_kamera urunleri icerdigini dogrular
    And  kullanici iki saniye bekler
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici oyun_oyun konsollari secenegini tiklar
    And  kullanici acilan sayfanin oyun_oyun konsollari icerdigini dogrular
    Then kullanici sayfayi kapatir

    @moda_link
  Scenario: moda_link_seceneklerinin_dogrulama_testi
      Given kullanici moda linke gelir
      When  kullanici iki saniye bekler
      And   kullanici kadin basligina tiklar
      And   kullanici acilan sayfanin kadin urunleri icerdigini dogrular
      And   kullanici moda linke gelir
      And   kullanici iki saniye bekler
      And   kullanici moda anasayfa basligina tiklar
      And   kullanici acilan sayfanin moda ile ilgili oldugunu dogrular
      And   kullanici moda linke gelir
      And   kullanici iki saniye bekler
      And   kullanici erkek basligina tiklar
      And   kullanici acilan sayfanin erkek urunleri icerdigini dogrular
      And   kullanici moda linke gelir
      And   kullanici iki saniye bekler
      And   kullanici ayakkabi_canta basligina tiklar
      And   kullanici acilan sayfanin ayakkabi_canta urunleri icerdigini dogrular
      And   kullanici hepsiBuradaTitle a tiklar
      And   kullanici moda linke gelir
      And   kullanici iki saniye bekler
      And   kullanici kadin_aksesuar_taki basligina tiklar
      And   kullanici acilan sayfanin kadin aksesuarlari icerdigini dogrular
      And   kullanici moda linke gelir
      And   kullanici iki saniye bekler
      And   kullanici erkek_aksesuar_taki basligina tiklar
      And   kullanici acilan sayfanin erkek aksesuarlari icerdigini dogrular
      And   kullanici moda linke gelir
      And   kullanici iki saniye bekler
      And   kullanici altin basligina tiklar
      And   kullanici acilan sayfanin altin urunleri icerdigini dogrular
      And   kullanici moda linke gelir
      And   kullanici iki saniye bekler
      And   kullanici cocuk basligina tiklar
      And   kullanici acilan sayfanin cocuk urunleri icerdigini dogrular
      And   kullanici moda linke gelir
      And   kullanici iki saniye bekler
      And   kullanici outdoor giyim_ayakkabi basligina tiklar
      And   kullanici outdoor giyim_ayakkabi sayfasina yonlendirildigini dogrular
      And   kullanici moda linke gelir
      And   kullanici iki saniye bekler
      And   kullanici yurt disindan basligina tiklar
      When  kullanici yurdisi urunleri sayfasina yonlendirildigini dogrular
      Then  kullanici sayfayi kapatir





