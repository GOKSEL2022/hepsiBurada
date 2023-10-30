@giris_yap
Feature: sayfaya_kayit_olusturulur
  Scenario: kayit_sayfasi_test_edilir
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris_yapHome alanina gelir
    And   kullanici uye ol linkini secer
    And   kullanici ePosta veya telefon alanina gecerli bir email adresi girer
    And   kullanici devam et butonuna tiklar
    And   kullanici dogrulama maili gonderildi uyarisini goruntuler
    And   kullanici uye_olKayit butona tiklar
    And   kullanici ePosta veya telefon alanini temizler
    And   kullanici ePosta veya telefon alanina gecerli bir telefon numarasi girer
    And   kullanici uye_olKayit butona tiklar
    When  kullanici son birkac adim kaldi uyarisini goruntuler
   # Then  kullanici sayfayi kapatir



