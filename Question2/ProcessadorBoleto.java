public class ProcessadorBoleto implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.printf("Pagamento de R$ %.2f gerado via Boleto Bancário. Vencimento em 3 dias úteis.%n", valor);
    }
}