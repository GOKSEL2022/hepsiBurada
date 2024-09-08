Feature: kullanici_sayfaya_giris_yapar
  Background:feature_file icin ortak adimlar
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici giris_yapHome alanina gelir
    And   kullanici girisYapLinkGiris_yapHome linkini tiklar

    @kayitli_mail_girisi
    Scenario:sayfaya_kayitli_mail_ile_giris
      Given kullanici girisYapButonOnaylamaGiris e tiklar
      When  kullanici ePosta veya telefon alanina kayitli email girer ve enter a tiklar
      And   kullanici sifre alanina kayitli sifresini girer ve enter a tiklar
      When  kullanici kayitli hesap ile sayfaya giris yaptigini dogrular
      Then  kullanici sayfayi kapatir

  Scenario: invalid_giris_testi
    Given kullanici girisYapButonOnaylamaGiris e tiklar
    When  kullanici gecerli bir eposta adresi girmelisiniz uyarisini gorur
    Then  kullanici sayfayi kapatir

    @invalid_email
   Scenario Outline: invalid_giris_testi_senaryolari
      Given kullanici girisYapButonOnaylamaGiris e tiklar
      When  kullanici ePosta veya telefon alanina invalid email "<email>" girer
      And   kullanici gecerli bir eposta adresi girmelisiniz uyarisini gorur
      Then  kullanici sayfayi yeniler
     Examples:
       | email                   |
       | yekparebiran@gmail.com+ |
       | yekparebiran@+gmail.com |
       | yekparebiran@gmailcom   |
       | yekparebirangmail.com   |
       | yekparebiran@gmail.     |
       | yekparebiran@gmail      |

     Scenario: giris_yap_dropdown_menu_testi
       Given kullanici url ye gider
       When  kullanici giris_yapHome alanina gelir
       And   kullanici dropdown menu basliklariini goruntuler
       And   kullanici siparislerim secenegine tiklar
       And   kullanici giris yap alanina yonlendirildigini dogrular
       And   kullanici uye olmadan verdiginiz siparisleri buradan takip edebilirsiniz uyarisini goruntuler
       And   kullanici giris islemi yapmadan siparis takibi basligina tiklar
       And  kullanici siparis icin girdigi eposta adresini girer


