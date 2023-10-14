
import org.banco.bridge.Caixa;
import org.banco.bridge.Consignado;
import org.banco.bridge.Emprestimo;
import org.banco.bridge.Pessoal;
import org.banco.bridge.CartaoDeCredito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaixaTest {

    @Test
    public void deveRetornarEmprestimoCaixaConsignado() {
        Emprestimo emprestimo = new Consignado();
        Caixa caixa = new Caixa(1000f);
        caixa.setEmprestimo(emprestimo);
        assertEquals(1440f, caixa.calcularJuros());
    }
    
    @Test
    public void deveRetornarEmprestimoCaixaPessoal() {
        Emprestimo emprestimo = new Pessoal();
        Caixa caixa = new Caixa(1000f);
        caixa.setEmprestimo(emprestimo);
        assertEquals(1560.0001f, caixa.calcularJuros());
    }

    @Test
    public void deveRetornarEmprestimoCaixaCartaoDeCredito() {
        Emprestimo emprestimo = new CartaoDeCredito();
        Caixa caixa = new Caixa(1000f);
        caixa.setEmprestimo(emprestimo);
        assertEquals(1680.0001220703125f, caixa.calcularJuros());
    }
}
