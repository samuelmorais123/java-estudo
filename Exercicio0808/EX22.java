package Exercicio0808;

public class EX22 {
    
    class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + calcularMedia());
    }
}
}
