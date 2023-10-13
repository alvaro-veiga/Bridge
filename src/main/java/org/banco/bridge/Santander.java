package main.java.org.banco.bridge;

public class Santander extends Banco {
    public Santander(float valorEmpretimo) {
        super(valorEmpretimo);
    }

    public float calcularJuros() {
        return (this.valorEmpretimo * (1 + this.emprestimo.realizarEmpretimo())) * 1.3f;
    }
    
}
