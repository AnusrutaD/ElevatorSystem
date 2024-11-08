package Controller;


import Entity.ElevatorCar;

import java.util.List;

public class ElevatorController {
    private int controllerId;
    private ElevatorCar car;

    public ElevatorController(int controllerId, ElevatorCar car) {
        this.controllerId = controllerId;
        this.car = car;
    }

    public void acceptNewRequest(){
        // algorithm for new request
    }

    public int getControllerId() {
        return controllerId;
    }

    public ElevatorCar getCar() {
        return car;
    }

    public void setCar(ElevatorCar car) {
        this.car = car;
    }
}
