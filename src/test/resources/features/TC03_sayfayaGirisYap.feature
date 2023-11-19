Feature: kullanici_sayfaya_giris_yapar
  Background:feature_file icin ortak adimlar
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris_yapHome alanina gelir
    And   kullanici girisYapLinkGiris_yapHome linkini tiklar

  Scenario: invalid_giris_testi
    Given kullanici girisYapButonOnaylamaGiris e tiklar
    When  kullanici gecerli bir eposta adresi girmelisiniz uyarisini gorur
    Then  kullanici sayfayi kapatir

    Scenario:
      Given kullanici girisYapButonOnaylamaGiris e tiklar
      When  kullanici ePosta veya telefon alanina kayitli email girer
      And   kullanici giris Yap butona tiklar
      And   kullanici sifre alanina kayitli sifresini girer
      And   kullanici giris Yap butona tiklar
      When  kullanici kayitli hesap ile sayfaya giris yaptigini dogrular
      Then  kullanici sayfayi kapatir