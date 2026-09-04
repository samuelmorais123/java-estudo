public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.somar(10, 20);
        double resultado2 = calculadora.somar(2.5, 3.8);
        int resultado3 = calculadora.somar(1, 2, 3);

        System.out.println(resultado1); // 30
        System.out.println(resultado2); // 6.3
        System.out.println(resultado3); // 6
    }
}
