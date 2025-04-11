package notificacao;
/* - Interface que define o comportamento das
classes que estão sendo observadas.
- addObserver - adiciona um observador;
- removeObserver - remove um observador
- notifObservers - notifica todos os observadores com uma mensagem;
- o - nome da variavel representa o observador
* */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifObservers (String message);


}

