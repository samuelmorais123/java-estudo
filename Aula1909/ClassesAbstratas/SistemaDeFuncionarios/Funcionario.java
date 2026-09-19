
public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void MostrarDados(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: " + salario);
    }

    public abstract double calcularBonus();
}
