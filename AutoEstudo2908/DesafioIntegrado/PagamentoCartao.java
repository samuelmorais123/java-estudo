public class PagamentoCartao extends Pagamento {

    private int parcelas;

    public PagamentoCartao(double valor, int parcelas) {
        super(valor);
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.03;
    }

    @Override
    public void processar() {
        System.out.println("Pagamento via cartão");
        System.out.println("Parcelas: " + parcelas);
        System.out.println("Taxa: R$ " + calcularTaxa());
        System.out.println("Total: R$ " + calcularTotal());
    }
}
