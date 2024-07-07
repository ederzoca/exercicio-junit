public class ContaBancaria {

    private double saldo; // Armazena o saldo da conta

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial; // Inicia a conta com um saldo inicial
    }

    public double getSaldo() {
        return saldo;  // Retorna o saldo inicial da conta
    }

    public void depositar(double quantia) {
        if (quantia > 0) { // Adiciona uma quantia ao saldo, desde que a quantia seja positiva
            saldo += quantia;
        } else {
            throw new IllegalArgumentException("O valor do depósito não pode ser negativo");
        }
    }

    public void sacar(double quantia) {
        if (quantia > 0 && quantia <= saldo) { // Subtrai uma quantia do saldo, desde que a quantia seja positiva e não exceda o saldo disponível
            saldo -= quantia;
        } else if (quantia < 0){
            throw new IllegalArgumentException("O valor do saque não pode ser negativo");
        } else if (quantia > saldo) {
            throw new IllegalArgumentException("O valor do saque não pode ser maior que o saldo");
        }
    }
}
