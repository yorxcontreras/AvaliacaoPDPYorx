/**
 * O objeto base que contém as informações principais (Componente Concreto).
 */
public class RelatorioBasico implements Relatorio {
    @Override
    public String gerar() {
        return "Relatório Básico de Vendas: [Lista de Pedidos e Totais]";
    }
}