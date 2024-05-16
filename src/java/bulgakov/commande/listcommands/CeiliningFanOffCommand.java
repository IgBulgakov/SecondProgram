package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.CeilingFan;
import bulgakov.commande.interfaces.ICommand;

public class CeiliningFanOffCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeiliningFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}