Feature: Anasayfa_alt_seceneklerin_testi
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir

  Scenario:
    And   kullanici bilgisayar linke tiklar
    And   kullanici bilgisayar sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici tablet linke tiklar
    And   kullanici tablet sayfasinin acildigini dogrular