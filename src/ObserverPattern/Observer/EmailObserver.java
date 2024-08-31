package ObserverPattern.Observer;

import ObserverPattern.Observable.IphoneObservable;

public class EmailObserver implements NotificationAlertObserver{
    IphoneObservable obj;
    String mail;
    public EmailObserver(IphoneObservable o,String mail) {
        this.obj = o;
        this.mail=mail;
    }

    @Override
    public void update() {
      sendMail(mail,"Product is back in stock");
    }
    public void sendMail(String mail,String msg){
        System.out.println("Mail sent to " +mail);
    }
}
