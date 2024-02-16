Feature: Urun eklenir ve fiyat karsilastirmasi yapilir
  Background:
    Given kullanici url ye gider
    When  kullanici anasayfanin acildigini dogrular

  Scenario: urun_adedi_ve_fiyat_uyum_testi
    And   kullanici premium firsatlardan bir urunu sepete ekler
    And   kullanici urunun sepete eklendigi uyarisini gorur
    And   kullanici sepete git butonuna tiklar
    And   kullanici ekledigi urunun sepet sayfasinda oldugunu dogrular
    And   kullanici secilen urunler textinin altinda odemesi gereken toplam ucreti goruntuler
    And   kullanici urunlerin ucretini goruntuler
    And   kullanici kargo ucretini goruntuler
    When  kullanici urunler ve kargo ucretlerinin secilen urunlerin toplam fiyatina esit oldugunu dogrular
    Then  kullanici sayfayi kapatir

    Scenario: filtreleyerek_urun_dogrulama
      Given kullanici ev_yasam_kirtasiye_ofis linke gelir
      When  kullanici ev tekstili secenegine tiklar
      And   kullanici ev tekstili sayfasinin acildigini dogrular


