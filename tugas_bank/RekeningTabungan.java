package tugas_bank;

public class RekeningTabungan extends Rekening {

    public RekeningTabungan(String noRekening, double saldo) {
        super(noRekening, saldo);
    }

    
    public void tampilkanInfo(String noRekening, double saldo) {
        System.out.println("Rekening Tabungan: "+ noRekening);
        System.out.println("Saldo: "+ saldo);
        
    }
    @Override 
    public double hitungBunga(double persenBunga) {
        return saldo * 0.02;
    }
}
