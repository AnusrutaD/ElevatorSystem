# Elevator System

<img width="209" alt="image" src="https://github.com/user-attachments/assets/d10266ef-47a6-48ab-a383-bb487c69b562">


## Requirements:
- How many number of lifts? > n
- How the lift will dispatch?


## Objects
- Building
- Floor
- ExternalButton
- ElevatorCar
- Display
- InternalButton
- Door

## Enums
- Direction
- ElevatorStatus
- DoorStatus


```puml
@startuml

class Building {
    - int noOfFloors;
    - List<Floor> floors;

    + void addFloors(int additionalNoOfFloors)
    + public void removeFloor(Floor floor)
}

class Floor {
    - int floorId;
    - ExternalButton button;
}

Building *-- Floor

class ElevatorCar {
    - int carId;
    - Display display;
    - Floor currentFloor;
    - Direction direction;
    - ElevatorStatus status;
    - InternalButton button;
    - Door door;

    + void move()
}

class Display {
    - int displayId;
    - Floor floor;
    - Direction direction;
}

class Door {
    - int doorId;
    - DoorStatus status;

    + void open();
    + void close();
}

enum Direction {
    UP,
    DOWN
}

enum DoorStatus {
    OPENED,
    CLOSED
}

enum ElevatorStatus {
    STAND_BY,
    MOVING
}

class Button {
    - ButtonDispatcher buttonDispatcher;
}

class InternalButton

class ExternalButton

Button <|-- InternalButton
Button <|-- ExternalButton

ElevatorCar *-- Display
ElevatorCar o-- Floor
ElevatorCar *-- Direction
ElevatorCar *-- ElevatorStatus
ElevatorCar o-- InternalButton
ElevatorCar o-- Door
Door o-- DoorStatus
Floor o-- ExternalButton

abstract class ButtonDispatcher {
    - List<ElevatorController> elevatorControllerList;

    + abstract void submitRequest(Floor floor, Direction direction);
}

class InternalButtonDispatcher {
    + void submitRequest(Floor floor, Direction direction);
}

class ExternalButtonDispatcher {
    + void submitRequest(Floor floor, Direction direction);
}

ButtonDispatcher <|-- InternalButtonDispatcher
ButtonDispatcher <|-- ExternalButtonDispatcher

Button *-- ButtonDispatcher
InternalButton *-- InternalButtonDispatcher
ExternalButton *-- ExternalButtonDispatcher

class ElevatorController {
    - int controllerId;
    - ElevatorCar car;

    + void acceptNewRequest()
}

ButtonDispatcher o-- ElevatorController

@enduml
```
