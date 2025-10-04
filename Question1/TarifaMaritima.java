/**
 * Estratégia concreta que implementa a regra de cálculo para transporte marítimo
 * (foca no volume e peso).
 */
public class TarifaMaritima implements CalculadoraTarifa {
    @Override
    public double calcular(DadosEntrega dados) {
        // Regra específica: Custo base + (Volume * 10) + (Peso * 0.5)
        return 100.0 + (dados.volumeM3 * 10.0) + (dados.pesoKg * 0.5);
    }
}