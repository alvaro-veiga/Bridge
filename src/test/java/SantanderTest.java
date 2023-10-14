
import org.banco.bridge.Santander;
import org.banco.bridge.Consignado;
import org.banco.bridge.Emprestimo;
import org.banco.bridge.Pessoal;
import org.banco.bridge.CartaoDeCredito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SantanderTest {
    @Test
    public void deveRetornarEmprestimoSantanderConsignado() {
        Emprestimo emprestimo = new Consignado();
        Santander santander = new Santander(1000f);
        santander.setEmprestimo(emprestimo);
        assertEquals(1560f, santander.calcularJuros());
    }

    @Test
    public void deveRetornarEmprestimoSantanderPessoal() {
        Emprestimo emprestimo = new Pessoal();
        Santander santander = new Santander(1000f);
        santander.setEmprestimo(emprestimo);
        assertEquals(1689.9999f, santander.calcularJuros());
    }

    @Test
    public void deveRetornarEmprestimoSantanderCartaoDeCredito() {
        Emprestimo emprestimo = new CartaoDeCredito();
        Santander santander = new Santander(1000);
        santander.setEmprestimo(emprestimo);
        assertEquals(1819.9999f, santander.calcularJuros());
    }
}
