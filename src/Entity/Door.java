package Entity;

import Enums.DoorStatus;

public class Door {
    private int doorId;
    private DoorStatus status;

    public Door(int doorId, DoorStatus status) {
        this.doorId = doorId;
        this.status = status;
    }

    public void open(){
        this.status = DoorStatus.OPENED;
    }

    public void close(){
       this.status = DoorStatus.CLOSED;
    }

    public int getDoorId() {
        return doorId;
    }

    public DoorStatus getStatus() {
        return status;
    }
}
