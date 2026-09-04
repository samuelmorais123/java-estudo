public class PagamentoBoleto extends Pagamento {

    private static final double TAXA_FIXA = 2.50;

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return TAXA_FIXA;
    }

    @Override
    public void processar() {
        System.out.println("Pagamento via boleto");
        System.out.println("Taxa: R$ " + calcularTaxa());
        System.out.println("Total: R$ " + calcularTotal());
    }
}
