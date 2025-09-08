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
        super.tampilkanData(); 
        System.out.println("Divisi: " + divisi); 
    }
}