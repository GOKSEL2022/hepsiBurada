@konum
Feature:konum_secme_testi
  Scenario:konum_secilir
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici konum sec linke tiklar
    And   kullanici rastgele bir il secer
    And   kullanici rastgele bir ilce secer
    And   kullanici rastgele bir mahalle secer
    And   kullanici kaydet butonuna tiklar
    When  kullanici konum degistirildi alerti goruntuler
    Then  kullanici sayfayi kapatir

