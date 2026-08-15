package Exercicio0808;

public class EX24 {
    class Lampada {
    String cor;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Ligada");
        } else {
            System.out.println("Desligada");
        }
    }
}
}
