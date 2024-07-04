import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaBancariaTest {

    private ContaBancaria conta;

    @Before
    public void setUp() {
        conta = new ContaBancaria(1000.0);  // Inicializa a conta com saldo inicial de 1000.0
    }

    @Test
    public void testDepositar() {
        conta.depositar(500.0);
        Assert.assertEquals(1500.0, conta.getSaldo(), 0);
    }

    @Test
    public void testSacar() {
        conta.sacar(200.0);
        Assert.assertEquals(800.0, conta.getSaldo(), 0);
    }

    @Test
    public void testSacarSemSaldoSuficiente() {
        conta.sacar(2000.0);
        Assert.assertEquals(1000.0, conta.getSaldo(), 0);
    }

    @Test
    public void testDepositarQuantiaNegativa() {
        conta.depositar(-100.0);
        Assert.assertEquals(1000.0, conta.getSaldo(), 0);
    }

    @Test
    public void testSacarQuantiaNegativa() {
        conta.sacar(-100.0);
        Assert.assertEquals(1000.0, conta.getSaldo(), 0);
    }
}
