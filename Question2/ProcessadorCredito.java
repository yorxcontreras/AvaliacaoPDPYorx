public class ProcessadorCredito implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Pagamento de R$ %.2f processado via Cartão de Crédito. Cobrança de taxa de 3%%.%n", valor);
    }
}