

import org.banco.bridge.Bradesco;
import org.banco.bridge.Consignado;
import org.banco.bridge.Emprestimo;
import org.banco.bridge.Pessoal;
import org.banco.bridge.CartaoDeCredito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BradescoTest {

   @Test

    public void deveRetornarEmprestimoBradescoConsignado() {
        Emprestimo emprestimo = new Consignado();
        Bradesco bradesco = new Bradesco(1000f);
        bradesco.setEmprestimo(emprestimo);
        assertEquals(1320.0f, bradesco.calcularJuros());
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
