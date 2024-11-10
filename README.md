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

class ElevatorController {
    - int controllerId;
    - ElevatorCar car;

    + void acceptNewRequest()
}

Building "1" *-- "*" Floor

Button <|-- InternalButton
Button <|-- ExternalButton

ElevatorCar "1" *-- "1" Display
ElevatorCar o-- Floor
ElevatorCar *-- Direction
ElevatorCar *-- ElevatorStatus
ElevatorCar "1" o-- "1" InternalButton
ElevatorCar "1" o-- "1" Door
Door o-- DoorStatus
Floor "1" o-- "1" ExternalButton
ButtonDispatcher <|-- InternalButtonDispatcher
ButtonDispatcher <|-- ExternalButtonDispatcher

Button "1" *-- "1" ButtonDispatcher
InternalButton "1" *-- "1" InternalButtonDispatcher
ExternalButton "1" *-- "1" ExternalButtonDispatcher
ButtonDispatcher "1" o-- "*" ElevatorController
ElevatorController "1" o-- "1" ElevatorCar

@enduml
```


```mermaid
classDiagram
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

class Direction {
    <<enumeration>>
    UP
    DOWN
}

class DoorStatus {
    <<enumeration>>
    OPENED,
    CLOSED
}

class ElevatorStatus {
    <<enumeration>>
    STAND_BY,
    MOVING
}

class Button {
    - ButtonDispatcher buttonDispatcher;
}

class InternalButton

class ExternalButton

class ButtonDispatcher {
    <<abstract>>
    - List<ElevatorController> elevatorControllerList;

    + abstract void submitRequest(Floor floor, Direction direction);
}

class InternalButtonDispatcher {
    + void submitRequest(Floor floor, Direction direction);
}

class ExternalButtonDispatcher {
    + void submitRequest(Floor floor, Direction direction);
}

class ElevatorController {
    - int controllerId;
    - ElevatorCar car;

    + void acceptNewRequest()
}

Building "1" *-- "*" Floor

Button <|-- InternalButton
Button <|-- ExternalButton

ElevatorCar "1" *-- "1" Display
ElevatorCar o-- Floor
ElevatorCar *-- Direction
ElevatorCar *-- ElevatorStatus
ElevatorCar "1" o-- "1" InternalButton
ElevatorCar "1" o-- "1" Door
Door o-- DoorStatus
Floor "1" o-- "1" ExternalButton
ButtonDispatcher <|-- InternalButtonDispatcher
ButtonDispatcher <|-- ExternalButtonDispatcher

Button "1" *-- "1" ButtonDispatcher
InternalButton "1" *-- "1" InternalButtonDispatcher
ExternalButton "1" *-- "1" ExternalButtonDispatcher
ButtonDispatcher "1" o-- "*" ElevatorController
ElevatorController "1" o-- "1" ElevatorCar
```