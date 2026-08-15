package Exercicio0808;
import java.util.Scanner;

public class EX1a4 {
    public static void main(String[] args) {
        String nome;
        String turma;
        String curso;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();

        System.out.print("Digite a turma do aluno: ");
        turma = sc.nextLine();

        System.out.print("Digite o curso do aluno: ");
        curso = sc.nextLine(); 

        System.out.println("Nome: " + nome);
        System.out.println("Turma: " + turma);
        System.out.println("Curso: " + curso);
        sc.close();
    }
}