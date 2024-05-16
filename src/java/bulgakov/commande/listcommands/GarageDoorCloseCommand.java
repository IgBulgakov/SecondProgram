package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.GarageDoor;
import bulgakov.commande.interfaces.ICommand;

public class GarageDoorCloseCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.donw();
    }
}