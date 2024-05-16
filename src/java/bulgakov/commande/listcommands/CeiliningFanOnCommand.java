package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.CeilingFan;
import bulgakov.commande.interfaces.ICommand;

public class CeiliningFanOnCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeiliningFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }
}