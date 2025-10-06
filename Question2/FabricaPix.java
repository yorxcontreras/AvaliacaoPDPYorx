public class FabricaPix extends FabricaProcessador {
    @Override
    public ProcessadorPagamento criarProcessador() {
        return new ProcessadorPix();
    }
}