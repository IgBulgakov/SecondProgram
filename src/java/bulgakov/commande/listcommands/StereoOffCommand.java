package bulgakov.commande.listcommands;

import bulgakov.commande.baseclasses.Stereo;
import bulgakov.commande.interfaces.ICommand;

public class StereoOffCommand implements ICommand {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}