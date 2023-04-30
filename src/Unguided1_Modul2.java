import java.util.Scanner;
public class Unguided1_Modul2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.println("Input batas bilangan :");
        bilangan = input.nextInt();

        System.out.println("-- Program menampilkan Bilangan genap --");
        for (int i = 1; i <= bilangan; i++) { //perulangan
            if (i % 2 == 0) { //percabangan apabila genap akan berjalan
                System.out.println("Angka-" + i); //mencetak hasil
            }
        }
        input.close();
    }
}
