/**
 * Classe base para todos os decoradores. Mantém a referência ao objeto envolvido 
 * e delega o trabalho (Decorador Abstrato).
 */
public abstract class RelatorioDecorador implements Relatorio {
    protected Relatorio relatorioEnvolvido;

    public RelatorioDecorador(Relatorio relatorio) {
        this.relatorioEnvolvido = relatorio;
    }

    // Delega a chamada ao objeto envolvido (pode ser sobrescrito)
    @Override
    public String gerar() {
        return relatorioEnvolvido.gerar(); 
    }
}