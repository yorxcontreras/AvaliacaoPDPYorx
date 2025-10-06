/**
 * Interface que define o contrato comum para todos os meios de pagamento (Produto Abstrato).
 */
public interface ProcessadorPagamento {
    void processar(double valor);
}