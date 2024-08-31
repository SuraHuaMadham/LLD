package ObserverPattern.Observer;

import ObserverPattern.Observable.IphoneObservable;

public class MobileObserver implements NotificationAlertObserver{
    IphoneObservable obj;
    int number;
    public MobileObserver(IphoneObservable o,int number) {
        this.obj = o;
        this.number=number;
    }

    @Override
    public void update() {
        sendMail(number,"Product is back in stock");
    }
    public void sendMail(int number,String msg){
        System.out.println("Text sent to " +number);
    }
}
