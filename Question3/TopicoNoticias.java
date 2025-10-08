/**
 * O objeto que detém o estado (as notícias) e notifica os observadores (Concrete Subject).
 */
public class TopicoNoticias extends NotificadorSubject {
    private String nomeTopico;
    
    public TopicoNoticias(String nomeTopico) {
        this.nomeTopico = nomeTopico;
        System.out.println("Tópico criado: " + nomeTopico);
    }
    
    public void publicarNoticia(String titulo) {
        System.out.println("\n--- NOVA NOTÍCIA NO TÓPICO " + nomeTopico.toUpperCase() + " ---");
        System.out.println("Notícia publicada: " + titulo);
        // Quando o estado muda (nova notícia), notifica os leitores
        notificarLeitores(titulo); 
    }
    
    @Override
    public void notificarLeitores(String tituloNoticia) {
        for (LeitorObserver leitor : leitores) {
            leitor.atualizar(tituloNoticia, nomeTopico);
        }
    }
}