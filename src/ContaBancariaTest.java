import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaBancariaTest {

    private ContaBancaria conta; // Instância da classe ContaBancaria usada nos testes

    @Before // Executado a anotação antes de cada teste.
    public void setUp() {
        conta = new ContaBancaria(1000.0);  // Inicializa a conta com saldo inicial de 1000.0
    }

    @Test
    public void testDepositar() {
        conta.depositar(500.0);
        Assert.assertEquals(1500.0, conta.getSaldo(), 0); // Verifica se o depósito de 500 resulta em um saldo de 1500
    }                                                                   // assertEquals: Verifica se dois valores são iguais
                                                                        // expected: Valor experado
                                                                        // actual: Valor real obtido pelo método "conta.getSaldo()"
                                                                        // delta (opcional): Margem de erro aceitável

    @Test
    public void testSacar() {
        conta.sacar(200.0);
        Assert.assertEquals(800.0, conta.getSaldo(), 0); // Verifica se o saque de 200 resulta em um saldo de 800
    }

    @Test
    public void testSacarSemSaldoSuficiente() {
        conta.sacar(2000.0);
        Assert.assertEquals(1000.0, conta.getSaldo(), 0); // Verifica se o saldo permanece 1000 ao tentar sacar 2000
    }

    @Test
    public void testDepositarQuantiaNegativa() {
        conta.depositar(-100.0);
        Assert.assertEquals(1000.0, conta.getSaldo(), 0); // Verifica se o saldo permanece 1000 ao tentar depositar -100
    }

    @Test
    public void testSacarQuantiaNegativa() {
        conta.sacar(-100.0);
        Assert.assertEquals(1000.0, conta.getSaldo(), 0); // Verifica se o saldo permanece 1000.0 ao tentar sacar -100
    }
}
