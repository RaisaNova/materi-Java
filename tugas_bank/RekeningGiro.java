package tugas_bank;

public class RekeningGiro extends Rekening {
    public RekeningGiro(String noRekening, double saldo) {
            super(noRekening, saldo);
        }
    @Override
    public double hitungBunga(double persenBunga) {
        return saldo * 0.01;
    }

}
