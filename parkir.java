import java.util.Scanner;

class parkir {
    public static int hitungBiaya(String jenisKendaraan, int lamaParkir, boolean isMember) {
        int biaya = 0;
        if (jenisKendaraan.equalsIgnoreCase("Mobil")) {
            biaya = 5000;
            lamaParkir--;
            biaya += lamaParkir * 3000;
        } else if (jenisKendaraan.equalsIgnoreCase("Motor")) {
            biaya = 3000;
            lamaParkir--;
            biaya += lamaParkir * 2000;
        }

        if (isMember) {
            biaya = (int) (biaya * 0.9);
        }
        return biaya;
    }

    // Bagian Tampilan Program
    public static void tampilanProgram(String jenisKendaraan, int lamaParkir, int biaya, boolean isMember) {
        int biayaSebelumDiskon = 0;
        if (jenisKendaraan.equalsIgnoreCase("Mobil")) {
            biayaSebelumDiskon = 5000 + (lamaParkir - 1) * 3000;
        } else if (jenisKendaraan.equalsIgnoreCase("Motor")) {
            biayaSebelumDiskon = 3000 + (lamaParkir - 1) * 2000;
        }
        int nominalDiskon = isMember ? (biayaSebelumDiskon - biaya) : 0;

        System.out.println();
        System.out.println("Rincian Parkir");
        System.out.println("===========================");
        System.out.println("Jenis Kendaraan\t: " + jenisKendaraan);
        System.out.println("Lama Parkir\t: " + lamaParkir + " jam");
        System.out.println("Status Member\t: " + (isMember ? "Ya" : "Tidak"));
        System.out.println("===========================");
        System.out.println("Besar Nominal Diskon\t: Rp " + nominalDiskon);
        System.out.println("Total Biaya\t: Rp " + biaya);
        System.out.println("===========================");
        if (isMember) {
            System.out.println("Anda Mendapat Diskon 10%");
        }
    }

    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukkan Jenis Kendaraan (Mobil/Motor): ");
        String jenisKendaraan = masukkan.nextLine();

        System.out.print("Lama Parkir (jam): ");
        int lamaParkir = masukkan.nextInt();

        System.out.print("Apakah Member (Ya/Tidak): ");
        String userMember = masukkan.next();
        boolean isMember = userMember.equalsIgnoreCase("Ya");

        int biayaParkir = hitungBiaya(jenisKendaraan, lamaParkir, isMember);
        tampilanProgram(jenisKendaraan, lamaParkir, biayaParkir, isMember);

        masukkan.close();
    }
}