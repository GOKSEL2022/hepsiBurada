@giris_yap
Feature: sayfaya_kayit_olusturulur
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris_yapHome alanina gelir
    And   kullanici uye ol linkini secer

  Scenario: email_girerek_uye_ol
    And   kullanici ePosta veya telefon alanina gecerli bir email adresi girer
    And   kullanici devam et butonuna tiklar
    And   kullanici dogrulama maili gonderildi uyarisini goruntuler
    Then  kullanici sayfayi kapatir

  Scenario:telefon_girerek_uye_ol
      And   kullanici ePosta veya telefon alanina gecerli bir telefon numarasi girer
      And   kullanici devam et butonuna tiklar
      When  kullanici son birkac adim kaldi uyarisini goruntuler
    #  Then  kullanici sayfayi kapatir

  Scenario: google_apple_facebbok_ile_giris
    And  kullanici google ile giris yap alanina tiklar
    And  kullanici google ile oturum acin yazisini goruntuler
    And  kullanici bir onceki sayfaya doner
    And  kullanici apple ile giris yap alanina tiklar
    And  kullanici apple kimligi yazisini goruntuler
    And  kullanici bir onceki sayfaya doner
    And  kullanici facebook ile giris yap alanina tiklar
    And  kullanici facebooka giris yap yazisini goruntuler
    And  kullanici bir onceki sayfaya doner
    When kullanici uye_olKayit butonu goruntuler
    Then kullanici sayfayi kapatir








