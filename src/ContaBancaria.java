public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        }
    }

    public void sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
        }
    }
}
