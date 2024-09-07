package ZoomCar;

import ZoomCar.Product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicleList;

    public List<Vehicle> getVehicleList() {
        //Filtering logic
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public VehicleInventoryManagement(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
