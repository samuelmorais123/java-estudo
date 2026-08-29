package Aula2908.Herança;

public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    // Método específico
    public void programar() {
        System.out.println("O desenvolvedor está programando em " + linguagem + ".");
    }

    public String getLinguagem() {
        return linguagem;
    }
}
