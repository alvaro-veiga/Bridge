package org.banco.bridge;

public class Caixa extends Banco{
    public Caixa(float valorEmpretimo) {
        super(valorEmpretimo);
    }

    public float calcularJuros() {
        return (this.valorEmpretimo * (1 + this.emprestimo.realizarEmpretimo())) * 1.2f;
    }
    
}
