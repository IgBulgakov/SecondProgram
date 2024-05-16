package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.Light;
import bulgakov.commande.interfaces.ICommand;


public class KitchenLightOnCommand implements ICommand {
    private Light light;
    public KitchenLightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}