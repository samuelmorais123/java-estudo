package Aula2908.DesafioIntegrado;

public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {

    this.nome = nome;

    if (salarioBase >= 0) {
        this.salarioBase = salarioBase;
    } else {
        this.salarioBase = 0;
        System.out.println("Salário-base inválido. Valor definido como R$ 0,00.");
    }
    
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f%n", calcularSalario());
    }
}
