Feature: Anasayfa_alti_kategoriler_secenekleri_test_edilir
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir

  Scenario: sayfa_alti_kategoriler_ilk_satir_secenek_testi
    And   kullanici bilgisayar linke tiklar
    And   kullanici bilgisayar sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici tablet linke tiklar
    And   kullanici tablet sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici telefon linke tiklar
    And   kullanici telefon sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici laptop linke tiklar
    And   kullanici laptop sayfasinin acildigini dogrular
    And   kullanici sayfayi kapatir