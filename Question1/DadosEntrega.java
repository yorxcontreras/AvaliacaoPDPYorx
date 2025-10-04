/**
 * Classe auxiliar para agrupar os dados necessários para o cálculo.
 */
public class DadosEntrega {
    public double distanciaKm;
    public double pesoKg;
    public double volumeM3;

    public DadosEntrega(double distanciaKm, double pesoKg, double volumeM3) {
        this.distanciaKm = distanciaKm;
        this.pesoKg = pesoKg;
        this.volumeM3 = volumeM3;
    }
}