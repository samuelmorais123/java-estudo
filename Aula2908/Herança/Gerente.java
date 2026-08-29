package Aula2908.Herança;

public class Gerente extends Funcionario {

    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    // Método específico
    public void realizarReuniao() {
        System.out.println("O gerente está realizando uma reunião.");
    }

    public String getSetor() {
        return setor;
    }
}
