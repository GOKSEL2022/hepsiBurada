@anasayfadaki_linkler
Feature: anasayfadaki_linklerin_testi
  @konum
  Scenario:konum_secimi_test
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
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
    Given kullanici url ye gider
    When kullanici anasayfanin acildigini dogrular
    And  kullanici iki saniye bekler
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
    And  kullanici

    #Then kullanici sayfayi

