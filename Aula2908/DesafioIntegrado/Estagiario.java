package Aula2908.DesafioIntegrado;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public void mostrarDados() {
        System.out.println("=== ESTAGIÁRIO ===");
        System.out.println("Nome: " + getNome());
        System.out.printf("Bolsa: R$ %.2f%n", calcularSalario());
    }
}
