package Aula2908.Encapsulamento.Produto;
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void alterarPreco(double novoPreco){
        if(novoPreco > 0){
            preco = novoPreco;
        }
        else{
        System.out.println("O Preço não pode ser negativo, digite um preço válido!");
        }
    }

    public void incluirEstoque(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
        }
        else{
            System.out.println("A quantidade não pode ser negativa, digite uma quantidade válida!");
        }
    }

    public void reduzirEstoque(int quantidade){
        if(quantidade > 0 && quantidade <= this.quantidade){
            this.quantidade -= quantidade;
        }
        else{
            System.out.println("A quantidade não pode ser negativa ou maior que o estoque, digite uma quantidade válida!");
        }
    }

    public double CalcularValorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void mostrarDados(){
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço do Produto: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidade);
        System.out.println("Valor Total em Estoque: R$" + CalcularValorTotalEmEstoque());
    }
}