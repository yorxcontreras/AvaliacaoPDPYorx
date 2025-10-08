/**
 * O objeto que recebe a notificação do Subject (Observer Concreto).
 */
public class Leitor implements LeitorObserver {
    private String nome;
    
    public Leitor(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void atualizar(String tituloNoticia, String topico) {
        System.out.printf("[%s] Notificado! Nova notícia em '%s': '%s'%n", nome, topico, tituloNoticia);
    }
    
    public String getNome() {
        return nome;
    }
}