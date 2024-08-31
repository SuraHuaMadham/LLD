package BookMyShow;

import BookMyShow.Enum.SeatCategory;

public class Seat {
    int seatId;
    int row;
    SeatCategory s;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public SeatCategory getS() {
        return s;
    }

    public void setS(SeatCategory s) {
        this.s = s;
    }
}
