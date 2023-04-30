import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = scanner.nextLine();

        System.out.println("Selamat Pagi " + nama );
    }
}
