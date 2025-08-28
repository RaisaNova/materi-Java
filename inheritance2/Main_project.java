package inheritance2;

import java.util.Scanner;

public class Main_project {

    public static void main(String[] args) {

        // membuat sebuah object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID Pegawai: ");
        int inputId = scanner.nextInt();

        pegawai Pegawai = new pegawai();

        manager Manager = new manager();

        kasir Kasir = new kasir();

        koki Koki = new koki();

        pelayan Pelayan = new pelayan();

        satpam Satpam = new satpam();

        // memasukkan nilai variabel menggunakan objek.

        Manager.nama = "sifa";

        Manager.id_pegawai = 1;

        Manager.gaji = "7 Juta";

        Kasir.nama = "Aldi";

        Kasir.id_pegawai = 2;

        Kasir.gaji = "1,2 Juta";

        Koki.nama = "Reza";

        Koki.id_pegawai = 3;

        Koki.gaji = "2 Juta";

        Pelayan.nama = "Dean";

        Pelayan.id_pegawai = 4;

        Pelayan.gaji = "1,2 Juta";

        Satpam.nama = "Aldi";

        Satpam.id_pegawai = 2;

        Satpam.gaji = "1 Juta";
        // tempat menampilkan inputan
        boolean found = false;

        if (Manager.id_pegawai == inputId) {
            Manager.menampilkan();
            Manager.tugas();
            found = true;
        }
        if (Kasir.id_pegawai == inputId) {
            Kasir.menampilkan();
            Kasir.tugas();
            found = true;
        }
        if (Koki.id_pegawai == inputId) {
            Koki.menampilkan();
            Koki.tugas();
            found = true;
        }
        if (Pelayan.id_pegawai == inputId) {
            Pelayan.menampilkan();
            Pelayan.tugas();
            found = true;
        }
        if (Satpam.id_pegawai == inputId) {
            Satpam.menampilkan();
            Satpam.tugas();
            found = true;
        }

        // If no employee is found with the input ID
        if (!found) {
            System.out.println("Tidak ada pegawai dengan ID " + inputId);
        }

        // Close the scanner
        scanner.close();
    }

}
