package Aula2908.DesafioIntegrado;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 =
                new Gerente("Carlos", 5000.00, 1500.00);

        Funcionario funcionario2 =
                new Vendedor("João", 2000.00, 10000.00, 0.05);

        Funcionario funcionario3 =
                new Supervisor("Pedro", 4000.00, 800.00);

        Funcionario funcionario4 =
                new Estagiario("Maria", 1500.00);

        funcionario1.mostrarDados();

        System.out.println();
        funcionario2.mostrarDados();

        System.out.println();
        funcionario3.mostrarDados();

        System.out.println();
        funcionario4.mostrarDados();
    }
}
