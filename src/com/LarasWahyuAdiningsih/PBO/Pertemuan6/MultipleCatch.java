package com.LarasWahyuAdiningsih.PBO.Pertemuan6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Masukkan angka : ");
            int angka1 = input.nextInt();

            System.out.println("Masukkan angka pembagi : ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println(angka1 + "/" + angka2 + "=" + hasil +" (Dibulatkan) ");
        }
//        Multiple Exception
//        catch (ArithmeticException | InputMismatchException e) {
//            System.out.println("Error :" + e);
//        }

        //Multiple Catch
        catch (ArithmeticException e){
            System.out.println("Error : Kesalahan dalam perhitungan!");
        }
        catch (InputMismatchException e){
            System.out.println("Error : Kesalahan dalam input!");
        }
        finally {
            System.out.println(
                    "finally akan selalu dijalankan"
            );
        }
    }
}
