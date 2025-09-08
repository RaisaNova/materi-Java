class Manajer extends pegawai {
    String divisi; 

    // Constructor
    public Manajer(String nama, int idPegawai, double gajiPokok, String divisi) {
        super(nama, idPegawai, gajiPokok);
        this.divisi = divisi;
    }

    // Override method tampilkanData
    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama); 
        System.out.println("Id Pegawai:  " + idPegawai); 
        System.out.println("Divisi: " + divisi); 
    }
}