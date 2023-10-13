package main.java.org.banco.bridge;

public abstract class Banco {
    
    protected Emprestimo emprestimo;

    protected float valorEmpretimo;

    public Banco(float valorEmpretimo) {
        this.valorEmpretimo = valorEmpretimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void setValorEmpretimo(float valorEmpretimo) {
        this.valorEmpretimo = valorEmpretimo;
    }

    public abstract float calcularJuros();
}
