import java.util.Scanner;
public class Unguided2_Modul2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== Program Form Pendaftaran Mahasiswa Baru ==");
        System.out.println("Masukkan Nama : ");
        String nama = scanner.nextLine();
        if(nama!="") {
            System.out.println("Masukkan Umur : ");
            int umur = scanner.nextInt();
            if(umur >= 17) {
                System.out.println("Pilihan Jurusan : ");
                System.out.println("1. Teknik Informatika");
                System.out.println("2. Sistem Informasi");
                System.out.println("3. Rekayasa Perangkat Lunak");
                System.out.println("Masukkan Pilihan : ");
                int pilihan = scanner.nextInt();
                if(pilihan == 1) {
                    System.out.println("== Data Pendaftaran ==");
                    System.out.println("Nama : " + nama);
                    System.out.println("Umur : " + umur);
                    System.out.println("Jurusan : Teknik Informatika");
                    System.out.println("== Data Pendaftaran ==");
                }else if (pilihan == 2) {
                    System.out.println("== Data Pendaftaran ==");
                    System.out.println("Nama : " + nama);
                    System.out.println("Umur : " + umur);
                    System.out.println("Jurusan : Sistem Informasi");
                    System.out.println("== Data Pendaftarn ==");
                }else if (pilihan == 3) {
                    System.out.println("== Data Pendaftaran ==");
                    System.out.println("Nama : " + nama);
                    System.out.println("Umur : " + umur);
                    System.out.println("Jurusan : Rekayasa Perangkat Lunak");
                    System.out.println("== Data Pendaftaran ==");

                }else{
                    System.out.println("Nama Tidak Boleh Kosong");
                }
            }else{
                System.out.println("Umur Anda Belum Cukup");
            }
        }else{
            System.out.println("Nama Tidak Boleh Kosong");
        }
    }

}

