package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.GarageDoor;
import bulgakov.commande.interfaces.ICommand;

public class GarageDoorOpenCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
