package notificacao;

import java.util.ArrayList;
import java.util.List;

public class Notificacao implements Subject {
    private static Notificacao instance;
    private final List<Observer> observers;

    private Notificacao() {
        observers = new ArrayList<>();
    }
    public static Notificacao getInstance(){
        if (instance == null){
            instance = new Notificacao();
        }
        return instance;
    }

    @Override
    public void addObserver (Observer o ) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifObservers(String message) {
        for (Observer o: observers) {
            o.update(message);
        }
    }
    public void senNotificacao(String message) {
        System.out.println("[Centro de Notificações] Enviando: " + message);
        notifObservers(message);
    }

}

