Feature: Anasayfa_alti_kategoriler_secenekleri_test_edilir
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir

  Scenario: sayfa_alti_kategoriler_ilk_satir_secenek_testi
    And   kullanici bilgisayar linke tiklar
    And   kullanici bilgisayar sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici tablet linke tiklar
    And   kullanici tablet sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici telefon linke tiklar
    And   kullanici telefon sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici laptop linke tiklar
    And   kullanici laptop sayfasinin acildigini dogrular
    And   kullanici sayfayi kapatir

    @kombi
    Scenario: sayfa_alti_kategoriler_ikinci_satir_secenek_testi
      And   kullanici kombi linke tiklar
      And   kullanici kombi sayfasinin acildigini dogrular
      And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
      And   kullanici bir saniye bekler
      And   kullanici klimalar linke tiklar
      And   kullanici klimalar sayfasinin acildigini dogrular
      And   kullanici sayfayi kapatir

      @camasir_makinesi
  Scenario: sayfa_alti_kategoriler_ucuncu_satir_secenek_testi
    And   kullanici camasir makinesi linke tiklar
    And   kullanici camasir makinesi sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici bulasik makinesi linke tiklar
    And   kullanici bulasik makinesi sayfasinin acildigini dogrular
    And   kullanici sayfayi kapatir

        @altin
    Scenario: sayfa_alti_kategoriler_ucuncu_satir_secenek_testi
      And   kullanici gram altin linke tiklar
      And   kullanici gram altin sayfasinin acildigini dogrular
      And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
      And   kullanici bir saniye bekler
      And   kullanici resat altin linke tiklar
      And   kullanici resat altin sayfasinin acildigini dogrular
      And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
      And   kullanici bir saniye bekler
      And   kullanici yarim altin linke tiklar
      And   kullanici yarim altin sayfasinin acildigini dogrular
      And   kullanici sayfayi kapatir

     Scenario:  sayfa_alti_kategoriler_dorduncu_satir_secenek_testi
       And   kullanici aycicek yagi linke tiklar
       And   kullanici aycicek yagi sayfasinin acildigini dogrular
       And   kullanici sayfayi kapatir

     Scenario:  sayfa_alti_kategoriler_besinci_satir_secenek_testi
       And   kullanici supurgeler linke tiklar
       And   kullanici supurgeler sayfasinin acildigini dogrular
       And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
       And   kullanici bir saniye bekler
       And   kullanici robot supurge linke tiklar
       And   kullanici robot supurge sayfasinin acildigini dogrular
       And   kullanici sayfayi kapatir

    Scenario: sayfa_alti_kategoriler_altinci_satir_secenek_testi
    And   kullanici airsoft linke tiklar
    And   kullanici airsoft sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici fritozler linke tiklar
    And   kullanici fritozler sayfasinin acildigini dogrular
    And   kullanici sayfayi kapatir


  Scenario: sayfa_alti_kategoriler_yedinci_satir_secenek_testi
    And   kullanici kitap linke tiklar
    And   kullanici kitap sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici film linke tiklar
    And   kullanici film sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici muzik linke tiklar
    And   kullanici muzik sayfasinin acildigini dogrular
    And   kullanici sayfayi kapatir

   Scenario: sayfa_alti_kategoriler_sekizinci_satir_secenek_testi
    And   kullanici kis lastigi linke tiklar
    And   kullanici kis lastigi sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici oto aksesuar linke tiklar
    And   kullanici oto aksesuar sayfasinin acildigini dogrular
    And   kullanici sayfayi kapatir

  Scenario: sayfa_alti_kategoriler_dokuzuncu_satir_secenek_testi
    And   kullanici mobilyalar linke tiklar
    And   kullanici mobilyalar sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici mutfak masa takimlari linke tiklar
    And   kullanici mutfak masa takimlari sayfasinin acildigini dogrular
    And   kullanici sayfayi kapatir

  Scenario:  sayfa_alti_kategoriler_onuncu_satir_secenek_testi
    And   kullanici kahve makinesi linke tiklar
    And   kullanici kahve makinesi sayfasinin acildigini dogrular
    And   kullanici anasayfanin altinda bulunan kategoriler basligina gelir
    And   kullanici bir saniye bekler
    And   kullanici cay makinesi linke tiklar
    And   kullanici cay makinesi sayfasinin acildigini dogrular
    And   kullanici sayfayi kapatir

