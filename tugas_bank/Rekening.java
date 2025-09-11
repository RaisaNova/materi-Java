package tugas_bank;

public class Rekening {
    public String noRekening;
    protected double saldo;

    public Rekening(String noRekening, double saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public void tampilkanInfo(String noRekening, double saldo) {
        System.out.println("No Rekening: " + noRekening);
        System.out.println("Saldo: " + saldo);
    }
    
    public double hitungBunga(double persenBunga) {
        return 0;
    }


}
