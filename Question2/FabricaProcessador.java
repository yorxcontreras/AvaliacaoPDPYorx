/**
 * Classe abstrata que declara o método de fábrica (Criador Abstrato).
 */
public abstract class FabricaProcessador {
    // O Factory Method que as subclasses devem implementar
    public abstract ProcessadorPagamento criarProcessador();
}