public class DecoradorGraficos extends RelatorioDecorador {
    public DecoradorGraficos(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        String relatorio = super.gerar();
        // Adiciona a funcionalidade extra
        return relatorio + " | [Visualização: Gráfico de Vendas Mensais]";
    }
}