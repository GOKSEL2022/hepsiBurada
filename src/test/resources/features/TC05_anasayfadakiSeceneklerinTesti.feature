@bilgisayar
Feature: anasayfadaki_linklerin_testi
  Scenario: anasayfadaki_linklerin_dogrulama_testi
    Given kullanici url ye gider
    When kullanici anasayfanin acildigini dogrular
    And  kullanici iki saniye bekler
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici iki saniye bekler
    And  kullanici bilgisayar_tablet secenegine tiklar
    And  kullanici acilan sayfanin bilgisayar urunleri icerdigini dogrular
    #Then kullanici sayfayi

  @konum
  Scenario:konum_secilir
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