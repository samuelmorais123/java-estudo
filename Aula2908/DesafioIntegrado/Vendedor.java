package Aula2908.DesafioIntegrado;

public class Vendedor extends Funcionario {

    private double totalVendas;
    private double percentualComissao;

    public Vendedor(String nome, double salarioBase,
                    double totalVendas, double percentualComissao) {

        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()
                + (totalVendas * percentualComissao);
    }
    @Override
public void mostrarDados() {
    System.out.println("=== VENDEDOR ===");
    System.out.println("Nome: " + getNome());
    System.out.println("Total de vendas: R$ " + totalVendas);
    System.out.printf("Comissão: %.0f%%%n", percentualComissao * 100);
    System.out.printf("Salário: R$ %.2f%n", calcularSalario());
}
}
