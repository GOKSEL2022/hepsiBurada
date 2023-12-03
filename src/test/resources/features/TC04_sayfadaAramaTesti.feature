@arama
Feature:Arama_alani
  Background:
    Given kullanici url ye gider
    When kullanici anasayfanin acildigini dogrular
    And  kullanici arama alanina tiklar

    @sinir_deger_testi
    Scenario: arama_alani_sinir_deger_testi_1
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina bir adet harf  girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina bir adet rakam  girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina bir adet sembol  girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina bir bosluk girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina iki adet bosluk girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina uc bosluk girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      Then kullanici sayfayi kapatir

      Scenario Outline: arama_alani_sinir_deger_testi_2
        And   kullanici arama alanina gecerli deger "<iki veya uc karakter>" girer
        When  kullanici kategori basligini goruntuler
        Then  kullanici sayfayi kapatir
        Examples:
          | iki veya uc karakter |
          | aa                   |
          | 11                   |
          | aaa                  |
          | 111                  |

        



