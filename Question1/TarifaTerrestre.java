/**
 * Estratégia concreta que implementa a regra de cálculo para transporte terrestre 
 * (foca na distância).
 */
public class TarifaTerrestre implements CalculadoraTarifa {
    @Override
    public double calcular(DadosEntrega dados) {
        // Regra específica: Custo base + (Distância * 0.50)
        return 10.0 + (dados.distanciaKm * 0.50);
    }
}
