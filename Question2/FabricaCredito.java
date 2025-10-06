public class FabricaCredito extends FabricaProcessador {
    @Override
    public ProcessadorPagamento criarProcessador() {
        return new ProcessadorCredito();
    }
}