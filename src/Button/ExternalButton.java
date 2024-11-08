package Button;

import Dispatcher.ButtonDispatcher;
import Dispatcher.ExternalButtonDispatcher;
import Entity.Floor;
import Enums.Direction;

public class ExternalButton extends Button{

    public ExternalButton() {
        super(new ExternalButtonDispatcher());
    }
}
