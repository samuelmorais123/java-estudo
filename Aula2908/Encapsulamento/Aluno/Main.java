package Aula2908.Encapsulamento.Aluno;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Samuel");

        // Notas válidas
        aluno.setNota1(8.0);
        aluno.setNota2(7.5);

        // Notas inválidas
        aluno.setNota1(11.0);
        aluno.setNota2(-2.0);

        // Mostrar dados
        aluno.mostrarDados();
    }
}