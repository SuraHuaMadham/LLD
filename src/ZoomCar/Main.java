package ZoomCar;
import ZoomCar.Product.Car;
import ZoomCar.Product.Vehicle;
import ZoomCar.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(stores,users);

        //0. User comes
        User user = users.get(0);
        System.out.println(user);
        //1. user search store based on location
        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        Store store = vehicleRentalSystem.getStore(location);
        System.out.println(store);
        //2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicle = store.getVehicles(VehicleType.CAR);
        System.out.println(storeVehicle);
        //3.reserving the particular vehicle
        Reservation reservation = store.createReserve(storeVehicle.get(0),users.get(0));
        System.out.println(reservation);
        //4. generate the bill
        Bill bill = new Bill(reservation);
        System.out.println(bill);
        //5.Make payment
        Payment payment = new Payment();
        payment.payBill(bill);
        //6. trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.reservationId);


    }
    public static List<Vehicle> addVehicles(){
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleID(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle1.setVehicleID(2);
        vehicle1.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<User> addUsers(){

        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);
        users.add(user1);

        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }
}
