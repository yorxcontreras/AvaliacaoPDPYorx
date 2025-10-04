/**
 * Estratégia concreta que implementa a regra de cálculo para transporte aéreo
 * (foca no peso).
 */
public class TarifaAerea implements CalculadoraTarifa {
    @Override
    public double calcular(DadosEntrega dados) {
        // Regra específica: Custo base + (Peso * 2.50)
        return 50.0 + (dados.pesoKg * 2.50);
    }
}