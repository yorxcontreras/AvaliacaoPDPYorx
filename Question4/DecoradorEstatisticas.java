public class DecoradorEstatisticas extends RelatorioDecorador {
    public DecoradorEstatisticas(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        // Chamada ao objeto envolvido e adição da nova funcionalidade
        String relatorio = super.gerar(); 
        return relatorio + " | [Estatísticas de Faturamento: Ticket Médio, Top Clientes]";
    }
}