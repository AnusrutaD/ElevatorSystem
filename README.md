# Elevator System
This document outlines the structure and components of an elevator system using UML and Mermaid diagrams to visualize 
the relationships between different objects, enums, and components in the system.


<img width="209" alt="image" src="https://github.com/user-attachments/assets/d10266ef-47a6-48ab-a383-bb487c69b562">


## Requirements:
- **Number of Lifts:** Define the number of lifts (n) in the building.
- **Lift Dispatch Logic:** Implement logic to dispatch the lift based on requests.


## Objects

### Main Components
- Building: Represents the building that houses the elevator system.
- Floor: Represents a single floor in the building.
- ElevatorCar: Represents an individual elevator car, which includes properties like the current floor, status, and direction.
- Display: Shows the elevator's current status and direction.
- Door: Represents the door of an elevator, which can open and close based on the elevator's movement.

### Buttons
- ExternalButton: Placed on each floor to call the elevator.
- InternalButton: Placed inside the elevator for selecting floors.

### Enums
Enums represent fixed sets of values related to elevator states and directions.
- Direction: Represents the movement direction of the elevator (either UP or DOWN).
- ElevatorStatus: Indicates the elevator's current status (e.g., STAND_BY, MOVING).
- DoorStatus: Represents the status of the door (either OPENED or CLOSED).


## UML Class Diagram (PlantUML)
This UML diagram, rendered using PlantUML, represents the core components, their properties, and their relationships 
within the system.

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
## Class Diagram (Mermaid)
The following class diagram represents the system's classes and their relationships, rendered using Mermaid.

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