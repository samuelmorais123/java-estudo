package Exercicio0808;

class Produto {
    String nome;
    double preco;
    int quantidade;

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void mostrarDados() {
        System.out.println(nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Estoque: " + calcularValorEstoque());
    }
}
public class EX21 {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Mouse";
        p1.preco = 50;
        p1.quantidade = 10;

        Produto p2 = new Produto();
        p2.nome = "Teclado";
        p2.preco = 100;
        p2.quantidade = 5;

        p1.mostrarDados();
        p2.mostrarDados();
    }
}
