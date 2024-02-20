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
      And   kullanici kategorilerden haliyi secer
      And   kullanici marka olarak merinos haliyi secer
      And   kullanici fiyat araligi olarak en az bin girer
      And   kullanici fiyat olarak en cok bes bin girer
      And   kullanici search butona tiklar
      And   kullanici aralik olarak bin ve bes bin secildigini dogrular
      And   kullanici renk olarak yesil secer
      And   kullanici hav yuksekligi 10 mm secer
      And   kullanici taban olarak dokuma taban secer
      And   kullanici iplik turu olarak akrilik_pamuk_polyester secer
      And   kullanici renk olarak yesil secili oldugunu dogrular
      And   kullanici tema olarak desenli secer
      And   kullanici filtrelenen urune tiklar
      And   kullanici acilan sayfada sectigi urunun oldugunu dogrular
      And   kullanici urunun altinda filtreledigi ozellikleri goruntuler
      And   kullanici tum ozellikler linke tiklar
      And   kullanici urunle ilgili ozellikleri goruntuler
      Then  kullanici sayfayi kapatir













