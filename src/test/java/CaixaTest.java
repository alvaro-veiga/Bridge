package test.java;

import main.java.org.banco.bridge.Caixa;
import main.java.org.banco.bridge.Consignado;
import main.java.org.banco.bridge.Emprestimo;
import main.java.org.banco.bridge.Pessoal;
import main.java.org.banco.bridge.CartaoDeCredito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaixaTest {

    @Test
    public void deveRetornarEmprestimoCaixaConsignado() {
        Emprestimo emprestimo = new Consignado();
        Caixa caixa = new Caixa(1000);
        caixa.setEmprestimo(emprestimo);
        assertEquals(2200, caixa.calcularJuros());
    }
    
    @Test
    public void deveRetornarEmprestimoCaixaPessoal() {
        Emprestimo emprestimo = new Pessoal();
        Caixa caixa = new Caixa(1000);
        caixa.setEmprestimo(emprestimo);
        assertEquals(3300, caixa.calcularJuros());
    }

    @Test
    public void deveRetornarEmprestimoCaixaCartaoDeCredito() {
        Emprestimo emprestimo = new CartaoDeCredito();
        Caixa caixa = new Caixa(1000);
        caixa.setEmprestimo(emprestimo);
        assertEquals(4400, caixa.calcularJuros());
    }
}
