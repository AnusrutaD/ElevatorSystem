package Entity;

import Button.InternalButton;
import Enums.Direction;
import Enums.DoorStatus;
import Enums.Status;

public class ElevatorCar {
    private int carId;
    private Display display;
    private Floor currentFloor;
    private Direction direction;
    private Status status;
    private InternalButton button;
    private DoorStatus door;

    public ElevatorCar(int carId, Display display, Floor currentFloor, Direction direction, Status status, InternalButton button, DoorStatus door) {
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public InternalButton getButton() {
        return button;
    }

    public void setButton(InternalButton button) {
        this.button = button;
    }

    public DoorStatus getDoor() {
        return door;
    }

    public void setDoor(DoorStatus door) {
        this.door = door;
    }
}
