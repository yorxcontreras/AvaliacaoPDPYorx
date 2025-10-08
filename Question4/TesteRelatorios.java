public class TesteRelatorios {
    public static void main(String[] args) {
        // 1. Relatório Simples
        Relatorio relatorioSimples = new RelatorioBasico();
        System.out.println("Relatório Simples:");
        System.out.println(relatorioSimples.gerar());
        System.out.println("----------------------------------------");

        // 2. Relatório Completo (Múltiplas camadas de decoração)
        // Ordem de decoração: Básico -> Estatísticas -> Gráficos -> Exportação PDF
        Relatorio relatorioCompleto = new RelatorioBasico();
        relatorioCompleto = new DecoradorEstatisticas(relatorioCompleto);
        relatorioCompleto = new DecoradorGraficos(relatorioCompleto);
        // O último decorador é o que o cliente irá chamar
        relatorioCompleto = new DecoradorExportacaoPDF(relatorioCompleto); 

        System.out.println("Relatório Completo (Dinâmico):");
        System.out.println(relatorioCompleto.gerar());
    }
}