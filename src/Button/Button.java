package Button;

import Controller.ElevatorController;
import Dispatcher.ButtonDispatcher;
import Entity.Floor;
import Enums.Direction;

import java.util.List;

public class Button {
    private ButtonDispatcher buttonDispatcher;
    public Button(ButtonDispatcher buttonDispatcher){
        this.buttonDispatcher = buttonDispatcher;
    }

    public ButtonDispatcher getButtonDispatcher() {
        return buttonDispatcher;
    }

    public void setButtonDispatcher(ButtonDispatcher buttonDispatcher) {
        this.buttonDispatcher = buttonDispatcher;
    }
}
