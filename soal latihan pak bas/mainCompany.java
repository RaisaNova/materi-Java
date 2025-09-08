class MainCompany {
    public static void main(String[] args) {
      
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Masukkan Nama Pegawai: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan ID Pegawai: ");
        int idPegawai = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Masukkan Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Apakah pegawai ini seorang Manajer? (y/n): ");
        String isManajer = scanner.nextLine();

        pegawai pegawai;
        if (isManajer.equalsIgnoreCase("y")) {
            System.out.println("Masukkan Divisi: ");
            String divisi = scanner.nextLine();
            pegawai = new Manajer(nama, idPegawai, gajiPokok, divisi);
        } else {
            pegawai = new pegawai(nama, idPegawai, gajiPokok);
        }

        // Panggil method tampilkanData
        System.out.println("\nInformasi Pegawai:");
        pegawai.tampilkanData();

        scanner.close();
    }
}