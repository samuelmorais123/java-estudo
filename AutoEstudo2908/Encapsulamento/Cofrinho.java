public class Cofrinho {

    // Atributos privados: só os métodos desta classe podem alterá-los.
    private String objetivo;
    private double saldo;

    public Cofrinho(String objetivo) {
        this.objetivo = objetivo;
        this.saldo = 0;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido.");
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Retirada inválida.");
        }
    }

    public void mostrarResumo() {
        System.out.println("Objetivo: " + objetivo);
        System.out.println("Saldo: R$ " + saldo);
    }
}
