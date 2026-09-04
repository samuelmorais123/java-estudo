public class Main {
    public static void main(String[] args) {
        // O tipo da referência é Pagamento (superclasse).
        // Os objetos reais são de subclasses diferentes: isso é polimorfismo.
        Pagamento pagamentoPix = new PagamentoPix(100);
        Pagamento pagamentoCartao = new PagamentoCartao(100, 3);

        pagamentoPix.processar();
        System.out.println();
        pagamentoCartao.processar();

        // Desafio adicional: PagamentoBoleto com taxa fixa de R$ 2,50.
        System.out.println();
        Pagamento pagamentoBoleto = new PagamentoBoleto(100);
        pagamentoBoleto.processar();
    }
}
