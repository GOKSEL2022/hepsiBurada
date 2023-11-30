Feature:Arama_alani
  Scenario:arama_alani_testi
    Given kullanici url ye gider
    When kullanici anasayfanin acildigini dogrular
    And  kullanici arama alanina tiklar
    And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
    Then kullanici sayfayi kapatir

    Scenario Outline: arama_alani_valid_deger_testi
      Given kullanici url ye gider
      When kullanici anasayfanin acildigini dogrular
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina invalid deger "<invalid deger>" girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      Then kullanici sayfayi kapatir
      Examples:
        | invalid deger |
        | a             |
        | 1             |
        | *             |
