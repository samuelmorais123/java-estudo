public class Carro {
    String marca;
    String modelo;
    String cor;
    String combustivel;
    String buzina;
    int ano;
    int velocidade;
    boolean ligado;

    void acelerar() {
        if (ligado) {
            velocidade += 10;
        } else {
            System.out.println("O carro está desligado. Ligue o carro antes de acelerar.");
        }
    }

    void freiar() {
        velocidade -= 10;
    }

    void acidente() {
        velocidade = 0;
        System.out.println("Caixão e vela preta.");
    }
    
    void MostrarDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    void ligar() {
        ligado = true;
        System.out.println("Ligando o carro...");
        System.out.println("O carro foi ligado");
    }

    void desligar() {
        ligado = false;
        System.out.println("Desligando o carro...");
        System.out.println("O carro foi desligado");
    }

    void buzinar() {
        System.out.println("Biiiiiiiii");
    }

}