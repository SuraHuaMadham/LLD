package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface IphoneObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver obsever);
    public void notifySubs();
    public void setStock(int stock);
    public int getStock();
}
