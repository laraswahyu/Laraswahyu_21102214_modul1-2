package com.LarasWahyuAdiningsih.PBO.Pertemuan6;

public class TryCatch {

    //membuat method main
    public static void main(String[] args) {
        //membuat array
        int[] angka = {
                1, 2, 3, 4, 5
        };
        System.out.println("Index ke 4 ada : ");
        try {
            //memanggil array berdasarkan index
            System.out.println(
                    angka[4]
            );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Index yang anda masukkan melebihi batas"
            );
        }
        System.out.println("Index ke 6 Tidak ada : ");
        try {
            //memanggil array berdasarkan index
            System.out.println(
                    angka[6]
            );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Index yang anda masukkan melebihi batas"
            );
        }
    }
}
