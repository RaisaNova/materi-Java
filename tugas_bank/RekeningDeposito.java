package tugas_bank;

public class RekeningDeposito extends Rekening{
    public RekeningDeposito(String noRekening, double saldo) {
        super(noRekening, saldo);
    }

    @Override
    public double hitungBunga(double persenBunga) {
        return saldo * 0.0;
    }
}
