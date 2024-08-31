package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    Show show;
    Payment p;
    List<Seat> booked = new ArrayList<>();

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Payment getP() {
        return p;
    }

    public void setP(Payment p) {
        this.p = p;
    }

    public List<Seat> getBooked() {
        return booked;
    }

    public void setBooked(List<Seat> booked) {
        this.booked = booked;
    }
}
