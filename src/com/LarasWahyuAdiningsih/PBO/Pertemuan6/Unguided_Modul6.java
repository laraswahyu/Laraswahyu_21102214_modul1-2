package com.LarasWahyuAdiningsih.PBO.Pertemuan6;
import java.security.spec.ECField;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Unguided_Modul6 {
    public static int jumlahBilangan (int bilangan1, int bilangan2) throws Exception {
        if (bilangan2 == 0) {
            throw new Exception("Penambahan dengan nol tidak diperbolehkan.");
        }
        return bilangan1 + bilangan2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try {
            System.out.printf("Masukkan Bilangan Pertama : ");
            int bilangan1 = scanner.nextInt();
            System.out.printf("Masukkan Bilangan Kedua : ");
            int bilangan2 = scanner.nextInt();
            int hasil = jumlahBilangan(bilangan1,bilangan2);
            System.out.println("Hasil Penjumlahan : " + hasil);
        }
        catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan : Input tidak valid, Harap masukkan bilangan bulat.");
        }
        catch (Exception e) {
            System.out.println("Terjadi kesalahan : " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
