package Aula2908.DesafioIntegrado;

public class Supervisor extends Funcionario {

    private double adicional;

    public Supervisor(String nome, double salarioBase, double adicional) {
        super(nome, salarioBase);
        this.adicional = adicional;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + adicional;
    }
    
    @Override
    public void mostrarDados() {
        System.out.println("=== SUPERVISOR ===");
        System.out.println("Nome: " + getNome());
        System.out.printf("Salário-base: R$ %.2f%n", getSalarioBase());
        System.out.printf("Adicional: R$ %.2f%n", adicional);
        System.out.printf("Salário final: R$ %.2f%n", calcularSalario());
    }
}
