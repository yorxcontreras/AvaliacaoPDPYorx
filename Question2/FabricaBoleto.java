public class FabricaBoleto extends FabricaProcessador {
    @Override
    public ProcessadorPagamento criarProcessador() {
        return new ProcessadorBoleto();
    }
}