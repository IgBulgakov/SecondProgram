package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.Light;
import bulgakov.commande.interfaces.ICommand;


public class LivingRoomLightOnCommand implements ICommand {
    private Light light;
    public LivingRoomLightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}