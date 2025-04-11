package notificacao;
/*
 * cria o centro de notificações,
 * cria os usuarios,
 * inscreve os usuarios no na central,
 */
public class Main {
    public static void main(String[] args) {
        Notificacao center = Notificacao.getInstance();

        User julia = new User("Julia");
        User bruna = new User("Bruna");
        User sabrina = new User("Sabrina");

        center.addObserver(julia);
        center.addObserver(bruna);
        center.addObserver(sabrina);

        center.senNotificacao("Nova atualização");
        center.senNotificacao("aqui é o servidor falando");
        center.removeObserver(bruna);
        center.senNotificacao("Servidor será reiniciado às 22hrs");

    }
}
