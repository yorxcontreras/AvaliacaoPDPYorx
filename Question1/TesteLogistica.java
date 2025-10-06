public class TesteLogistica {
    public static void main(String[] args) {
        Logistica sistemaLogistica = new Logistica();
        DadosEntrega encomenda = new DadosEntrega(500, 10, 0.2); // 500km, 10kg, 0.2m³

        // 1. Usando a estratégia Terrestre
        sistemaLogistica.setEstrategia(new TarifaTerrestre());
        double custoTerrestre = sistemaLogistica.calcularCusto(encomenda);
        System.out.printf("Custo Terrestre: R$ %.2f%n", custoTerrestre);

        // 2. Trocando para a estratégia Aérea
        sistemaLogistica.setEstrategia(new TarifaAerea());
        double custoAereo = sistemaLogistica.calcularCusto(encomenda);
        System.out.printf("Custo Aéreo: R$ %.2f%n", custoAereo);

        // 3. Trocando para a estratégia Marítima
        sistemaLogistica.setEstrategia(new TarifaMaritima());
        double custoMaritimo = sistemaLogistica.calcularCusto(encomenda);
        System.out.printf("Custo Marítimo: R$ %.2f%n", custoMaritimo);
    }
}  