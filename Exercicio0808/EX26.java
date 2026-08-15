package Exercicio0808;

public class EX26 {
    public static void main(String[] args) {

         class ContaBancaria {
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

        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(1000);
        conta1.sacar(200);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.depositar(500);
        conta2.sacar(50);

        System.out.print("Conta 1 -> ");
        conta1.mostrarSaldo();

        System.out.print("Conta 2 -> ");
        conta2.mostrarSaldo();
    }
}
