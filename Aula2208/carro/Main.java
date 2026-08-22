public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.cor = "Prata";
        carro1.combustivel = "Flex";
        carro1.ano = 2010;
        carro1.velocidade = 0;

        System.out.println("\nEstado Inicial: ");
        carro1.MostrarDados();
        System.out.println("\n");

        carro1.acelerar(); 

        carro1.ligar();

        System.out.println("\nAcelerando...");
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.buzinar();
        System.out.println("\n");
        
        carro1.MostrarDados();

        System.out.println("\nFreando...");
        carro1.freiar();
        carro1.freiar();
        carro1.freiar();
        
        carro1.desligar();
        System.out.println("\n");
        carro1.MostrarDados();
    }
}