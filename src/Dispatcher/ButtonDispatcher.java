package Dispatcher;

import Controller.ElevatorController;
import Entity.Floor;
import Enums.Direction;

import java.util.List;

public abstract class ButtonDispatcher {
    List<ElevatorController> elevatorControllerList;

    public abstract void submitRequest(Floor floor, Direction direction);
}
