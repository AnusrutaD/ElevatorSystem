package Entity;

import Button.ExternalButton;

public class Floor {
    private int floorId;
    private ExternalButton button;

    public Floor(int floorId) {
        this.floorId = floorId;
        button = new ExternalButton();
    }

    public int getFloorId() {
        return floorId;
    }

    public ExternalButton getButton() {
        return button;
    }
}
