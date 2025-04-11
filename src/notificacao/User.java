package notificacao;

/* Aqui está o usuario,
 * com  a implementação observer que recebe e exibi mensagens. */
public class User implements Observer{
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("[" + name + "] recebeu: " + message);
    }
}

