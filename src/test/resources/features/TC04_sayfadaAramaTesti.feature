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

     @urunu_sepetten_silme
   Scenario: sepete_eklenen_urunun_sepetten_silinme_testi
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

  Scenario:urunle_ilgili_saticiya_soru_sorabilmeli
    Given kullanici arama alaninda "iphone 11" aratir
    When  kullanici acilan sayfada "iphone 11" ile ilgili sonuc bulundugunu dogrular
    And   kullanici sayfadaki ilk urune tiklar
    And   kullanici saticiya sor linkine tiklar
    And   kullanici daha once sorulan sorulari ve cevaplari goruntuler
    And   kullanici soru ve cevaplarda ara alaninda "garanti" aratir
    When  kullanici goruntulenen sonuclarin garanti ile ilgili oldugunu dogrular
    Then  kullanici sayfayi kapatir

  Scenario: urunle_ilgili_filtreleme_testi
    Given kullanici arama alaninda "iphone 11" aratir
    When  kullanici acilan sayfada "iphone 11" ile ilgili sonuc bulundugunu dogrular
    And   kullanici sayfadaki ilk urune tiklar
    And   kullanici kategori basligini goruntuler
    And   kullanici cep telefonu aksesuarlarini isaretler
    And   kullanici seceneklerden akilli saatlere tiklar
    And   kullanici sayfada ilk urun olarak akilli saati goruntuler
    And   kullanici urunun uzerindesaticilardan seyu teknolojiyi secer
    When  kullanici ekranda filtrelenen urunlerin syu teknolojiye ait oldugunu dogrular
    Then  kullanici sayfayi kapatir

  Scenario:  alan_testi
    Given kullanici url ye gider



















        



