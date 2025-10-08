public class TesteNoticias {
    public static void main(String[] args) {
        // Subjects (Tópicos)
        TopicoNoticias politica = new TopicoNoticias("Política");
        TopicoNoticias tecnologia = new TopicoNoticias("Tecnologia");
        
        // Observers (Leitores)
        Leitor joao = new Leitor("João");
        Leitor maria = new Leitor("Maria");
        Leitor pedro = new Leitor("Pedro");
        
        // Inscrições
        politica.adicionar(joao); // João lê Política
        politica.adicionar(maria); // Maria lê Política e Tecnologia
        tecnologia.adicionar(maria);
        tecnologia.adicionar(pedro); // Pedro lê só Tecnologia

        // 1. Notícia em Política: João e Maria são notificados
        politica.publicarNoticia("Reforma fiscal aprovada no Congresso");

        // 2. Notícia em Tecnologia: Maria e Pedro são notificados
        tecnologia.publicarNoticia("Novo framework de IA lançado");

        // 3. Remoção e nova notificação
        politica.remover(joao);
        politica.publicarNoticia("Eleições municipais confirmadas"); // Agora só Maria é notificada
    }
}