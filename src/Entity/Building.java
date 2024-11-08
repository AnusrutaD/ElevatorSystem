package Entity;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private int noOfFloors;
    private List<Floor> floors;

    public Building(int noOfFloors){
        this.noOfFloors = noOfFloors;
        floors = new ArrayList<>();
        for(int i = 0; i < noOfFloors; i++){
            floors.add(new Floor(i));
        }
    }

    // For construct a new floor
    public void addFloors(int additionalNoOfFloors){
        int newNoOfFloors = noOfFloors + additionalNoOfFloors;
        for(int i = (noOfFloors - 1); i < newNoOfFloors; i++){
            floors.add(new Floor(i));
        }
        noOfFloors = newNoOfFloors;
    }

    // for temporary blockage of any floor
    public void removeFloor(Floor floor){
        floors.set(floor.getFloorId(), null);
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public List<Floor> getFloors() {
        return floors;
    }

}
