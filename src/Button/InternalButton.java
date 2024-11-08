package Button;

import Dispatcher.ButtonDispatcher;
import Dispatcher.InternalButtonDispatcher;
import Entity.Floor;
import Enums.Direction;

public class InternalButton extends Button{

    public InternalButton() {
        super(new InternalButtonDispatcher());
    }
}
