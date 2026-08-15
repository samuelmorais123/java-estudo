package Exercicio0808;

public class EX23 {
    
    class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        saldo -= valor;
    }

    void mostrarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }
}
}
