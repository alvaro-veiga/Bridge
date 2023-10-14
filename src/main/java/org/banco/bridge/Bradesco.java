package org.banco.bridge;

public class Bradesco extends Banco {
    public Bradesco(float valorEmpretimo) {
        super(valorEmpretimo);
    }

    public float calcularJuros() {
        return (this.valorEmpretimo * (1 + this.emprestimo.realizarEmpretimo())) * 1.1f;
    }
}