package Entity;

import Button.InternalButton;
import Enums.Direction;
import Enums.DoorStatus;
import Enums.ElevatorStatus;

public class ElevatorCar {
    private int carId;
    private Display display;
    private Floor currentFloor;
    private Direction direction;
    private ElevatorStatus status;
    private InternalButton button;
    private Door door;

    public ElevatorCar(int carId, Display display, Floor currentFloor, Direction direction, ElevatorStatus status, InternalButton button, Door door) {
        this.carId = carId;
        this.display = display;
        this.currentFloor = currentFloor;
        this.direction = direction;
        this.status = status;
        this.button = button;
        this.door = door;
    }

    public void move(){
        // logic for move
    }

    public int getCarId() {
        return carId;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Floor getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Floor currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public ElevatorStatus getStatus() {
        return status;
    }

    public void setStatus(ElevatorStatus status) {
        this.status = status;
    }

    public InternalButton getButton() {
        return button;
    }

    public void setButton(InternalButton button) {
        this.button = button;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
