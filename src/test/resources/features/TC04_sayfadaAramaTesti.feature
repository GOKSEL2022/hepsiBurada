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

        Scenario Outline: arama_alani_sinir_deger_testi_3
          And   kullanici arama alanina gecerli sembol "<iki veya uc karakterli sembol>" girer
          When  kullanici arama ile ilgili sonuc bulunamamistir yazisini goruntuler
          Then  kullanici sayfayi kapatir
          Examples:
            | iki veya uc karakterli sembol |
            | **                            |
            | ***                           |

          @urun
        Scenario: kayitsiz_kullanici_olarak_urun_satin_alma_testi
          Given kullanici arama alaninda "iphone 11" aratir
          When  kullanici acilan sayfada "iphone 11" ile ilgili sonuc bulundugunu dogrular
          And   kullanici sayfadaki ilk urunun uzerine gelir
          And   kullanici urunun altinda GByte bilgisini goruntuler
          And   kullanici urunun altinda fiyat bilgisini goruntuler
          And   kullanici sayfadaki ilk urune tiklar
          And   kullanici sepete eklenecek urun sayisinin artirilip azaltilabilecegini dogrular
          And   kullanici satin alacagi urunun altinda ozelliklerini gorur
          And   kullanici sepete ekle butonuna tiklar
          And   kullanici urunun sepete eklendigi uyarisini gorur
          And   kullanici sepete git butonuna tiklar
          When  kullanici sepete ekledigi urunun sepetinde oldugunu dogrular
          Then  kullanici sayfayi kapatir


   Scenario: sepete_eklenen_urunun_sepetten_silinme_testi_persembe_icin
    Given kullanici arama alaninda "iphone 11" aratir
    When  kullanici acilan sayfada "iphone 11" ile ilgili sonuc bulundugunu dogrular
    And   kullanici sayfadaki ilk urune tiklar
    And   kullanici sepete ekle butonuna tiklar
    And   kullanici urunun sepete eklendigi uyarisini gorur
    And   kullanici sepete git butonuna tiklar
    And   kullanici sepete ekledigi urunun sepetinde oldugunu dogrular
    And   kullanici ekledigi urunu sepetten siler
    When  kullanici urunun sepetten kaldirildigini belirten alerti gorur
    Then  kullanici sayfayi kapatir

















        



