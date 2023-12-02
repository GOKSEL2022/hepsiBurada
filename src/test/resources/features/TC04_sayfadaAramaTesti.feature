@arama
Feature:Arama_alani
    Scenario: arama_alani_sinir_deger_testi_1
      Given kullanici url ye gider
      When kullanici anasayfanin acildigini dogrular
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici sayfayi yeniler
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina bir adet harf  girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici sayfayi yeniler
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina bir adet rakam  girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici sayfayi yeniler
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina bir adet sembol  girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina bir bosluk girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici sayfayi yeniler
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina iki adet bosluk girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      And  kullanici sayfayi yeniler
      And  kullanici arama alanina tiklar
      And  kullanici arama alanina uc bocluk girer
      And  kullanici arama alanina en az iki karakter girmesi gerektigini gorur
      Then kullanici sayfayi kapatir



