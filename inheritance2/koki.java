package inheritance2;

public class koki extends pegawai {

    @Override

    public void menampilkan()

    {

        System.out.println("Nama : " + nama);

        System.out.println("Id Pegawai : " + id_pegawai);

        System.out.println("Gaji : " + gaji);

    }

    public void tugas() {

        System.out.println("Tugas : Memasak makanan dan Membuat minuman");

        System.out.println("----------------------------------------------");

    }

}
