/**
 * O Contexto que utiliza a estratégia para calcular o custo.
 * Ele não sabe qual modalidade de tarifa está sendo usada (Baixo acoplamento).
 */
public class Logistica {
    private CalculadoraTarifa estrategia;

    public void setEstrategia(CalculadoraTarifa estrategia) {
        // Permite trocar a estratégia em tempo de execução
        this.estrategia = estrategia;
    }

    public double calcularCusto(DadosEntrega dados) {
        if (estrategia == null) {
            throw new IllegalStateException("A estratégia de tarifa não foi definida.");
        }
        System.out.println("Calculando custo com a estratégia: " + this.estrategia.getClass().getSimpleName());
        // Delega o trabalho para a estratégia configurada
        return estrategia.calcular(dados);
    }
}