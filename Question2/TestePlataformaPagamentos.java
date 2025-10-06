public class TestePlataformaPagamentos {
    
    /**
     * O cliente (a plataforma) trabalha apenas com a Fábrica Abstrata.
     */
    public static void realizarPagamento(FabricaProcessador fabrica, double valor) {
        // O método de fábrica é chamado para criar o objeto desejado
        ProcessadorPagamento processador = fabrica.criarProcessador(); 
        
        System.out.println("-> Iniciando pagamento via: " + processador.getClass().getSimpleName());
        processador.processar(valor);
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        // Pagamento 1: Configuramos a plataforma para usar a fábrica de Crédito
        realizarPagamento(new FabricaCredito(), 150.00); 

        // Pagamento 2: Trocamos a configuração para Boleto
        realizarPagamento(new FabricaBoleto(), 50.50); 
        
        // Pagamento 3: Trocamos para PIX
        realizarPagamento(new FabricaPix(), 25.00); 
    }
}