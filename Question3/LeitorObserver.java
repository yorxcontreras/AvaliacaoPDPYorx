/**
 * Define o contrato para os objetos que querem ser notificados (Observer Abstrato).
 */
public interface LeitorObserver {
    void atualizar(String tituloNoticia, String topico);
}