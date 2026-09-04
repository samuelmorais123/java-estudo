public class Pagamento {

    private double valor;

    public Pagamento(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        }
    }

    public double getValor() {
        return valor;
    }

    public double calcularTaxa() {
        return 0;
    }

    public double calcularTotal() {
        // Chamada polimórfica: em tempo de execução, Java usa a versão
        // sobrescrita por PagamentoPix ou PagamentoCartao.
        return valor + calcularTaxa();
    }

    public void processar() {
        System.out.println("Total: R$ " + calcularTotal());
    }
}
