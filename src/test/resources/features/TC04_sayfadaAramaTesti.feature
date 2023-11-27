Feature:Arama_alani
  Scenario:arama_alani_testi
    Given kullanici url ye gider
    When kullanici anasayfanin acildigini dogrular
    And  kullanici arama alanina tiklar
    And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
    Then kullanici sayfayi kapatir