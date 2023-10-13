package test.java;

import main.java.org.banco.bridge.Santander;
import main.java.org.banco.bridge.Consignado;
import main.java.org.banco.bridge.Emprestimo;
import main.java.org.banco.bridge.Pessoal;
import main.java.org.banco.bridge.CartaoDeCredito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SantanderTest {
    @Test
    public void deveRetornarEmprestimoSantanderConsignado() {
        Emprestimo emprestimo = new Consignado();
        Santander santander = new Santander(1000);
        santander.setEmprestimo(emprestimo);
        assertEquals(2200, santander.calcularJuros());
    }

    @Test
    public void deveRetornarEmprestimoSantanderPessoal() {
        Emprestimo emprestimo = new Pessoal();
        Santander santander = new Santander(1000);
        santander.setEmprestimo(emprestimo);
        assertEquals(3300, santander.calcularJuros());
    }

    @Test
    public void deveRetornarEmprestimoSantanderCartaoDeCredito() {
        Emprestimo emprestimo = new CartaoDeCredito();
        Santander santander = new Santander(1000);
        santander.setEmprestimo(emprestimo);
        assertEquals(4400, santander.calcularJuros());
    }
}
