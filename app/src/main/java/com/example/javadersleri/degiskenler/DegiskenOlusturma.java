package com.example.javadersleri.degiskenler;

public class DegiskenOlusturma {
    public static void main(String[] args) {
        String ogrenciAdi = "Ahmet"; // referans tip
        //primitif Tip
        int ogrenciYas = 23;
        double ogrenciBoy = 1.78;
        char ogrenciBasharf = 'A';
        boolean ogrenciDevamEdiyorMu = true;

        System.out.println(ogrenciAdi);
        System.out.println(ogrenciYas);
        System.out.println(ogrenciBoy);
        System.out.println(ogrenciBasharf);
        System.out.println(ogrenciDevamEdiyorMu);

        int urun_id =  34145;
        String urun_adi = "Kol Saati";
        int urun_adet = 100;
        double urun_fiyati = 149.99;
        String urun_tedarikcisi = "Rolex";

        System.out.println("Ürün id : " +urun_id);
        System.out.println("Ürün Adı : " +urun_adi);
        System.out.println("Ürün Adet : " + urun_adet);
        System.out.println("Ürün Fiyatı : " +urun_fiyati);
        System.out.println("Ürün Tedarikçisi : "+urun_tedarikcisi);

        //Sabit : Constant
        //final(java) , let(swift), val (kotlin), dart(final-const)

        final int number = 40; // değer değiştirilemez
        System.out.println(number);

        //tür dönüşümü - type casting
        //1.Sayısaldan Sayısala
        int  i = 67;
        double d = 35.98;
        int sonuc1 = (int)d; //explicit
        double sonuc2 = i; //unexplicit
        System.out.println(sonuc1);
        System.out.println(sonuc2);

        // 2.Sayılsaldan Metine
        String sonuc3 = String.valueOf(d);
        String sonuc4 = String.valueOf(i);
        System.out.println(sonuc3);
        System.out.println(sonuc4);

        //3.Metinden Sayısala
        String yazi1 = "89";
        String yazi2 = "43.91";
         int sonuc5 = Integer.parseInt(yazi1);
         double sonuc6 = Double.parseDouble(yazi2);
        System.out.println(sonuc5);
        System.out.println(sonuc6);
    }
}
