@giris_yap
Feature: sayfaya_kayit_olusturulur
  Background:feature_file icin ortak adimlar
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
      Then  kullanici sayfayi kapatir

  @sosyal_medya_girisi
  Scenario: sosyal_medya(google_apple_facebbok) ile_giris
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

    @gecersiz_numara
  Scenario: telefon_alani_gecersiz_numara_girisi
    Given kullanici ePosta veya telefon alanina bosluk karakteri girer ve enter a basar
    When  kullanici eposta adresinizi veya telefon numaranizi girmelisiniz uyarisini gorur
    And   kullanici ePosta veya telefon alanina sembol girer
    And   kullanici gecerli bir cep telefonu girmelisiniz uyarisini gorur
    And   kullanici ePosta veya telefon alanina son hanesi harf iceren bir telefon no girer
    When  kullanici gecerli bir eposta adresi girmelisiniz uyarisini gorur
    Then  kullanici sayfayi kapatir

        #BUG:kullanici ePosta veya telefon alanina son hanesi + (arti) SEMBOLÜ iceren bir telefon no girdiginde (546507525+ gibi)
        # hata mesaji gorunmez ve devam et butonuna basildiginda son birkaç adim kaldi uyarisi
        # goruntulenerek ilgili numaraya dogrulama kodu gonderildigi gorulur.
  @telefon_numarasi
  Scenario Outline: telefon_alani_gecerli_turk_telekom_numara_girisi
    Given kullanici ePosta veya telefon alanina turk telekom"<telefon numarasi>" girer
    When  kullanici devam et butonuna tiklar
    And   kullanici son birkac adim kaldi uyarisini goruntuler
    When  kullanici sayfayi yeniler
    Then  kullanici sayfayi kapatir
    Examples:
      | telefon numarasi |
      | 5015015151       |
      | 5055015151       |
      | 5065015151       |
      | 5075015151       |
      | 5515015151       |
      | 5525015151       |
      | 5535015151       |
      | 5545015151       |
      | 5555015151       |
      | 5595015151       |
      | 5615015151       |

    Scenario: telefon_alani_gecerli_turkcell_vodafone_numara_girisi
      Given kullanici ePosta veya telefon alanina turkcell_vodafone numarasi girer
      When  kullanici devam et butonuna tiklar
      And   kullanici son birkac adim kaldi uyarisini goruntuler
      When  kullanici sayfayi yeniler
      Then  kullanici sayfayi kapatir

    Scenario Outline:  eposta_alani_gecersiz_giris
      And   kullanici ePosta veya telefon alanina "<invalid email>" girer
      And   kullanici devam et butonuna tiklar
      And   kullanici gecerli bir eposta adresi girmelisiniz uyarisini gorur
      And   kullanici sayfayi kapatir
        Examples:
          | invalid email        |
          | admingmail.com       |
          | admin@gmailcom       |
          | @gmail.com           |
          | ++@gmail.com         |
          | admingmail.comabcdef |
          | admingmail.com1      |
          | admingmail.com//     |
          | @gmail.com           |
          | abcdefgh             |
          | 123456               |
          | ahmet@qwer.zxcv      |

  @gecersiz_eposta
  Scenario: eposta_alani_gecersiz_giris
    Given kullanici ePosta veya telefon alanina bosluk karakteri girer ve enter a basar
    When  kullanici eposta adresinizi veya telefon numaranizi girmelisiniz uyarisini gorur
    And   kullanici sayfayi yeniler
    And   kullanici ePosta veya telefon alanina tiklar
    And   kullanici devam et butonuna tiklar
    And   kullanici eposta adresinizi veya telefon numaranizi girmelisiniz uyarisini gorur
    And   kullanici sayfayi kapatir

  @gecerli_email
    Scenario Outline: eposta_alani_gecerli_giris
      Given kullanici ePosta veya telefon alanina "<gecerli bir email adresi>" girer
      When  kullanici devam et butonuna tiklar
      When  kullanici dogrulama maili gonderildi uyarisini goruntuler
      And   kullanici iki saniye bekler
      And   kullanici sayfayi yeniler
      Then  kullanici sayfayi kapatir

      Examples:
        | gecerli bir email adresi |
        | abc489@gmail.com         |
        | abc_123@gmail.com        |
        | abc-123@gmail.com        |
        | abc.123@gmail.com        |

    Scenario: eposta_alani_alfabetik_harf_girisi
        Given kullanici ePosta veya telefon alanina alfabetik harfler girer ve enter a basar
        When  kullanici dogrulama maili gonderildi uyarisini goruntuler
        Then  kullanici sayfayi kapatir

    Scenario: kayitli_mail_ile_uyelik_testi
      Given kullanici ePosta veya telefon alanina kayitli email girer
      When  kullanici devam et butonuna tiklar
      And   kullanici buEpostaAdresineAitHesapOldugunuFarkEttik uyarisini gorur
      Then  kullanici sayfayi kapatir









