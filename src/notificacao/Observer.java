package notificacao;
/*
 * Interface que define o que o observador deve fazer;
 * update - nova notificação;
 * */
public interface Observer {
    void update (String message);
}
