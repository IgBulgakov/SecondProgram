package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.Light;
import bulgakov.commande.interfaces.ICommand;

public class KitchenLightOffCommand implements ICommand {
    private Light light;
    public KitchenLightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}