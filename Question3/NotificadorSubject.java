import java.util.ArrayList;
import java.util.List;
/**
 * Define a estrutura básica para o objeto que será observado (Subject Abstrato).
 */
public abstract class NotificadorSubject {
    protected List<LeitorObserver> leitores = new ArrayList<>();
    
    public void adicionar(LeitorObserver leitor) {
        this.leitores.add(leitor);
    }
    
    public void remover(LeitorObserver leitor) {
        this.leitores.remove(leitor);
    }
    
    public abstract void notificarLeitores(String tituloNoticia);
}