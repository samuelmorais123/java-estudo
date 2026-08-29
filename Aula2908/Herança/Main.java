package Aula2908.Herança;

public class Main {

    public static void main(String[] args) {

        // Criando Gerente
        Gerente gerente = new Gerente(
            "Samuel",
            10000.00,
            "Tecnologia"
        );

        // Criando Desenvolvedor
        Desenvolvedor desenvolvedor = new Desenvolvedor(
            "Matheus",
            6000.00,
            "C Ansi"
        );

        System.out.println("=== GERENTE ===");

        // Método herdado
        gerente.mostrarDados();

        // Método específico
        gerente.realizarReuniao();

        System.out.println("Setor: " + gerente.getSetor());


        System.out.println("\n=== DESENVOLVEDOR ===");

        // Método herdado
        desenvolvedor.mostrarDados();

        // Método específico
        desenvolvedor.programar();

        System.out.println("Linguagem: " + desenvolvedor.getLinguagem());
    }
}
