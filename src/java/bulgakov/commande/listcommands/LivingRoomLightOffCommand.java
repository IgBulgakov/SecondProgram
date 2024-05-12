package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.Light;
import bulgakov.commande.interfaces.ICommand;

public class LivingRoomLightOffCommand implements ICommand {
    private Light light;
    public LivingRoomLightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}