package Aula2908.Encapsulamento.Produto;

public class Main {
 public static void main(String[] args) {

    Produto produto = new Produto("Notebook", 3500.00, 25);
    produto.mostrarDados();


    //Operação Válida - Alteração do preço do produto
    System.out.println("\nAlterando o preço do produto para R$ 4000.00");
    produto.alterarPreco(4000.00);

    //Operação Inválida - Alteração do preço do produto
    System.out.println("\nAlterando o preço do produto para R$ -500.00");
    produto.alterarPreco(-500.00);


    //Operação Válida - Inclusão de estoque
    System.out.println("\nAdicionando 25 unidades do produto ao estoque");
    produto.incluirEstoque(25);


    //Operação Inválida - Inclusão de estoque
    System.out.println("\nAdicionando -10 unidades do produto ao estoque");
    produto.incluirEstoque(-10);


    //Operação Válida - Diminuição de estoque
    System.out.println("\nRemovendo 5 unidades do produto ao estoque");
    produto.incluirEstoque(5);


    //Operação Inválida - Diminuição de estoque
    System.out.println("\nRemovendo 150 unidades do produto ao estoque");
    produto.incluirEstoque(-150);
    produto.mostrarDados();
 }
}