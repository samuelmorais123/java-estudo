public class Main {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho("Viagem");

        cofrinho.depositar(500);
        cofrinho.depositar(200);
        cofrinho.retirar(150);

        // Operações inválidas: não alteram o saldo.
        cofrinho.retirar(1000);
        cofrinho.depositar(-50);

        cofrinho.mostrarResumo();
        // Saída esperada:
        // Retirada inválida.
        // Depósito inválido.
        // Objetivo: Viagem
        // Saldo: R$ 550.0

        // cofrinho.saldo = 1000; // Não compila: saldo é privado.
    }
}
