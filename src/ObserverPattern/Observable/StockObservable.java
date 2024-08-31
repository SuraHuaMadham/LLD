package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class StockObservable implements IphoneObservable{
   public List<NotificationAlertObserver> list = new ArrayList<>();
   public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer) {
        list.add(observer);

    }

    @Override
    public void remove(NotificationAlertObserver obsever) {
        list.remove(obsever);

    }

    @Override
    public void notifySubs() {
        for(NotificationAlertObserver obj: list){
            obj.update();
        }

    }

    @Override
    public void setStock(int stock) {
        if(stockCount == 0){
            notifySubs();
        }
        stockCount += stock;

    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
