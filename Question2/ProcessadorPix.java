public class ProcessadorPix implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Pagamento de R$ %.2f recebido via PIX. Confirmação instantânea.%n", valor);
    }
}