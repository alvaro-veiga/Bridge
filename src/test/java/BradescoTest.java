package test.java;

import main.java.org.banco.bridge.Bradesco;
import main.java.org.banco.bridge.Consignado;
import main.java.org.banco.bridge.Emprestimo;
import main.java.org.banco.bridge.Pessoal;
import main.java.org.banco.bridge.CartaoDeCredito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BradescoTest {

   @Test

    public void deveRetornarEmprestimoBradescoConsignado() {
        Emprestimo emprestimo = new Consignado();
        Bradesco bradesco = new Bradesco(1000);
        bradesco.setEmprestimo(emprestimo);
        assertEquals(2200, bradesco.calcularJuros());
    }

    public void deveRetornarEmprestimoBradescoPessoal() {
        Emprestimo emprestimo = new Pessoal();
        Bradesco bradesco = new Bradesco(1000);
        bradesco.setEmprestimo(emprestimo);
        assertEquals(3300, bradesco.calcularJuros());
    }

    public void deveRetornarEmprestimoBradescoCartaoDeCredito() {
        Emprestimo emprestimo = new CartaoDeCredito();
        Bradesco bradesco = new Bradesco(1000);
        bradesco.setEmprestimo(emprestimo);
        assertEquals(4400, bradesco.calcularJuros());
    }


}
