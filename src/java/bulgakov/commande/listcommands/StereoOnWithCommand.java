package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.Stereo;
import bulgakov.commande.interfaces.ICommand;

public class StereoOnWithCommand implements ICommand {
    private Stereo stereo;

    public StereoOnWithCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolime("11");
    }
}