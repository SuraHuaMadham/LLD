package Elevator;

import java.util.List;

public class Building {
    List<Floor> floorList;

    public Building(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void addFloors(Floor floor){
        floorList.add(floor);
    }

    public void removeFloors(Floor floor){
        floorList.remove(floor);
    }
}
