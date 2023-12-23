Feature: anasayfadaki_linklerin_testi
  Scenario: anasayfadaki_linklerin_dogrulama_testi
    Given kullanici url ye gider
    When kullanici anasayfanin acildigini dogrular
    And  kullanici arama alaninin altinda elektronik sekmesinin uzerine gelir
    And  kullanici bilgisayar_tablet secenegine tiklar
    And  kullanici acilan sayfanin bilgisayar urunleri icerdigini dogrular
    Then kullanici sayfayi kapatir