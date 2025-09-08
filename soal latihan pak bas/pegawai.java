class pegawai {
    public String nama;
    protected int idPegawai;
    private double gajiPokok;
    
    public pegawai(String nama, int idPegawai, double gajiPokok) {
        this.nama = nama;
        this.idPegawai = idPegawai;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

