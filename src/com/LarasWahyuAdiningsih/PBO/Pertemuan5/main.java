package com.LarasWahyuAdiningsih.PBO.Pertemuan5;

public class main {
    public static void main(String[] args) {
        Barang[] keranjang = new Barang[10];

        Barang[] etalase = {
                new Barang("Indomie", 2000),
                new Barang("Mie Sedap", 2000),
                new Barang("Beras", 12000),
                new Barang("Gula", 15000),
        };

        //Melihat panjang array
        System.out.println(
                "Banyak Barang di Etalase : "
                + etalase.length
        );

        //Menampilkan daftar barang dalam array
        System.out.println("Daftar Barang di Etalase : ");

//        int i = 1;
//        for(Barang barang : etalase) {
//            System.out.println("Barang ke-" + i);
//            barang.showInfo();
//            i++;
//        }

        for (int j=0;j<etalase.length; j++){
            System.out.println("Barang ke-" + (j+1));
            etalase[j].showInfo();
        }

        // Masukkan barang ke keranjang
        keranjang[0] = etalase[0];
        System.out.println("Barang di keranjang : ");
        keranjang[0].showInfo();
    }
}
