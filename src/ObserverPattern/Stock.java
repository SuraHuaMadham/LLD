package ObserverPattern;

import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailObserver;
import ObserverPattern.Observer.MobileObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Stock {
    public void a(){
    IphoneObservable iphoneObservable = new StockObservable();
    NotificationAlertObserver obj1 = new EmailObserver(iphoneObservable,"abc@gmail.com");
    NotificationAlertObserver obj2 = new MobileObserver(iphoneObservable,100);

        iphoneObservable.add(obj1);
        iphoneObservable.add(obj2);

        iphoneObservable.setStock(100);
        iphoneObservable.setStock(0);
        iphoneObservable.setStock(1);
}
}
