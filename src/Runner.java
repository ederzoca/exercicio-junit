import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
    public static void main(String[] args) { // Executa os testes da classe ContaBancariaTest
        Result result = JUnitCore.runClasses(ContaBancariaTest.class);

        for (Failure failure : result.getFailures()) { // Percorre as falhas (se houver) e indica quais foram no console
            System.out.println(failure.toString());
        }

        if (result.wasSuccessful()) { // Dá um retorno sobre o status geral dos testes
            System.out.println("Todos os testes passaram com sucesso.");
        } else {
            System.out.println("Alguns testes falharam.");
        }
    }
}
