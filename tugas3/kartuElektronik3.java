package tugas3;

import java.util.Scanner;

public class kartuElektronik3 {
    private double saldo;

    public kartuElektronik3() {
        this.saldo = 10000;
    }

    public String tapIn() {
        double biaya = 3000;
        if (saldo >= biaya) {
            saldo -= biaya;
            return "Tap In Berhasil! Saldo Sekarang Rp" + saldo;
        } else {
            return "Saldo Tidak Cukup. Silakan isi ulang terlebih dahulu.";
        }
    }

    public void isiUlang(double jumlah) {
        saldo += jumlah;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        kartuElektronik3 kartu = new kartuElektronik3();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tap In");
            System.out.println("2. Isi Ulang");
            System.out.println("3. Melihat Saldo");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    if (kartu.getSaldo() < 3000) {
                        System.out.println(kartu.tapIn());
                        System.out.println("Mengalihkan ke menu isi ulang...");
                        System.out.print("Masukkan jumlah isi ulang: Rp");
                        double jumlah = input.nextDouble();
                        kartu.isiUlang(jumlah);
                        System.out.println("Isi ulang berhasil! Saldo sekarang: Rp" + kartu.getSaldo());
                    } else {
                        System.out.println(kartu.tapIn());
                    }
                    break;
                case 2:
                    System.out.print("Masukkan jumlah isi ulang: Rp");
                    double jumlah = input.nextDouble();
                    kartu.isiUlang(jumlah);
                    System.out.println("Isi ulang berhasil! Saldo sekarang: Rp" + kartu.getSaldo());
                    break;
                case 3:
                    kartu.getSaldo();
                    System.out.println("Saldo Anda Adalah: Rp" + kartu.getSaldo());
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }
}
