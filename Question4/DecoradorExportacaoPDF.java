public class DecoradorExportacaoPDF extends RelatorioDecorador {
    public DecoradorExportacaoPDF(Relatorio relatorio) {
        super(relatorio);
    }

    private void prepararPDF() {
        System.out.println("-> Iniciando processo de exportação para PDF...");
    }

    @Override
    public String gerar() {
        // A funcionalidade pode ser executada antes, depois, ou em ambos os momentos
        prepararPDF();
        String relatorio = super.gerar(); 
        return relatorio + " | [Exportação Finalizada: PDF pronto para download]";
    }
}