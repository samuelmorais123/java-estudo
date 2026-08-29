package Aula2908.Polimorfismo;

public class Main {

    public static void main(String[] args) {

        Forma forma1 = new Retangulo(10, 5);
        Forma forma2 = new Circulo(5);

        double areaRetangulo = forma1.calcularArea();
        double areaCirculo = forma2.calcularArea();

        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do círculo: " + areaCirculo);

        if (areaRetangulo > areaCirculo) {
            System.out.println("O retângulo possui uma área maior.");
        } else if (areaCirculo > areaRetangulo) {
            System.out.println("O círculo possui uma área maior.");
        } else {
            System.out.println("As áreas são iguais.");
        }
    }
}
