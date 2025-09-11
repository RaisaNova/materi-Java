package tugas_bank;

import java.util.Scanner;

public class MainBank {
    static Scanner input = new Scanner(System.in);    

    public static void main(String[] args) {
        System.out.println("Masukkan Nomer Rekening: ");
        String noRekening = input.nextLine();

        System.out.println("Masukkan Saldo: ");
        double saldo = input.nextDouble();
        input.nextLine(); 

        System.out.println("Pilih Jenis Rekening (1: Tabungan, 2: Giro, 3: Deposito): ");
        int jenisRekening = input.nextInt();


        Rekening Rekening;

        if (jenisRekening == 1) {
            Rekening = new RekeningTabungan(noRekening, saldo);
        } else if (jenisRekening == 2) {
            Rekening = new RekeningTabungan(noRekening, saldo);
        } else if (jenisRekening == 3) {
            Rekening = new RekeningTabungan(noRekening, saldo);
        } else {
            System.out.println("Jenis rekening tidak valid.");
            return;
        }
        System.out.println("\nInformasi Rekening:");
        Rekening.tampilkanInfo(Rekening.noRekening, Rekening.saldo);
        System.out.println("Bunga: " + Rekening.hitungBunga(0));
    }
}
