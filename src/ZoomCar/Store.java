package ZoomCar;

import ZoomCar.Product.Vehicle;
import ZoomCar.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location location;
    List<Reservation> reservationList = new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return inventoryManagement.getVehicleList();
    }

    public void setVehicles(List<Vehicle> vehicles){
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    public Reservation createReserve(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservationList.add(reservation);
        return reservation;

    }
}
