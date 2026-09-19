public class Main {
    public static void main(String[] args) {
        Funcionario gerente1 = new Gerente("Marcos", 8000);
        Funcionario desenvolvedor1 = new Desenvolvedor("Ana", 5000);

        gerente1.MostrarDados();
        System.out.println("Bônus do gerente: " + gerente1.calcularBonus());

        System.out.println();

        desenvolvedor1.MostrarDados();
        System.out.println("Bônus do desenvolvedor: " + desenvolvedor1.calcularBonus());
    }
}
