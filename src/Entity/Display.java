package Entity;

import Enums.Direction;

public class Display {
    private int displayId;
    private Floor floor;
    private Direction direction;

    public Display(int displayId, Floor floor, Direction direction) {
        this.displayId = displayId;
        this.floor = floor;
        this.direction = direction;
    }

    public int getDisplayId() {
        return displayId;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
