package Aula2908.DesafioIntegrado;

public class Gerente extends Funcionario {

    private double bonus;


    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
    @Override
    public void mostrarDados() {
        System.out.println("=== GERENTE ===");
        System.out.println("Nome: " + getNome());
        System.out.printf("Salário-base: R$ %.2f%n", getSalarioBase());
        System.out.printf("Bônus: R$ %.2f%n", bonus);
        System.out.printf("Salário final: R$ %.2f%n", calcularSalario());
    }
}
