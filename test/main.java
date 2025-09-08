package test;

import java.util.Scanner;

class User {
    private int saldo;

    public User(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    public int getSaldo() {
        return saldo;
    }

    public void isiSaldo(int jumlah) {
        saldo += jumlah;
        System.out.println("Saldo berhasil diisi. Saldo sekarang: Rp" + saldo);
    }

    public boolean tapIn(int tarif) {
        if (saldo >= tarif) {
            saldo -= tarif;
            System.out.println("Tap in berhasil! Saldo tersisa: Rp" + saldo);
            return true;
        } else {
            System.out.println("Saldo tidak cukup! Silakan isi ulang.");
            return false;
        }
    }
}

class Tarif {
    public static int getTarif(String gerbangAwal, String tujuan) {
        if (gerbangAwal.equalsIgnoreCase("Manggar")) {
            if (tujuan.equalsIgnoreCase("Palaran"))
                return 28000;
            if (tujuan.equalsIgnoreCase("Mahkota"))
                return 35000;
        } else if (gerbangAwal.equalsIgnoreCase("Kilo13")) {
            if (tujuan.equalsIgnoreCase("Palaran"))
                return 20000;
            if (tujuan.equalsIgnoreCase("Mahkota"))
                return 28000;
        }
        return 0;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user = new User(50000);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tap In");
            System.out.println("2. Isi Saldo");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nPilih Gerbang Awal:");
                    System.out.println("1. Gerbang Manggar");
                    System.out.println("2. Gerbang Kilo 13");
                    System.out.print("Pilihan: ");
                    int gerbangPilihan = input.nextInt();
                    String gerbangAwal = (gerbangPilihan == 1) ? "Manggar" : "Kilo13";

                    System.out.println("\nPilih Tujuan:");
                    System.out.println("1. Gerbang Palaran");
                    System.out.println("2. Gerbang Mahkota");
                    System.out.print("Pilihan: ");
                    int tujuanPilihan = input.nextInt();
                    String tujuan = (tujuanPilihan == 1) ? "Palaran" : "Mahkota";

                    int tarif = Tarif.getTarif(gerbangAwal, tujuan);
                    System.out.println("Tarif: Rp" + tarif);
                    user.tapIn(tarif);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah isi saldo: Rp");
                    int isi = input.nextInt();
                    user.isiSaldo(isi);
                    break;

                case 3:
                    System.out.println("Saldo Anda: Rp" + user.getSaldo());
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        input.close();
    }
}
