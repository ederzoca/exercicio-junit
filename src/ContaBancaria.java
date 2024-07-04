public class ContaBancaria {

    private double saldo; // Armazena o saldo da conta

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial; // Inicia a conta com um saldo inicial
    }

    public double getSaldo() {
        return saldo;  // Retorna o saldo inicial da conta
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        } // Adiciona uma quantia ao saldo, desde que a quantia seja positiva
    }

    public void sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) {
            saldo -= quantia;
        } // Subtrai uma quantia do saldo, desde que a quantia seja positiva e não exceda o saldo disponível
    }
}
