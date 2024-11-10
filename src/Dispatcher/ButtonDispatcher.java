package Dispatcher;

import Controller.ElevatorController;
import Entity.Floor;
import Enums.Direction;

import java.util.ArrayList;
import java.util.List;

public abstract class ButtonDispatcher {
    List<ElevatorController> elevatorControllerList;

    public ButtonDispatcher(){
        this.elevatorControllerList = new ArrayList<ElevatorController>();
    }

    public abstract void submitRequest(Floor floor, Direction direction);
}
