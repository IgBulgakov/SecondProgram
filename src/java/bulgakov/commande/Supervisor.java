package bulgakov.commande;

import bulgakov.commande.graphics.IPrinter;
import bulgakov.commande.graphics.Pult;
import bulgakov.commande.sandbox.Light;
import bulgakov.commande.sandbox.LightOnCommand;
import bulgakov.commande.sandbox.GarageDoor;
import bulgakov.commande.sandbox.GarageDoorOpenCommand;
import bulgakov.commande.sandbox.SimpleRemoteControl;

public class Supervisor implements IPrinter {
    private String[] textFieldStrings = new String[] {"Свет в доме", "Гараж", "Подвал", "Парковка", "Мастерская", "Теплица 1", "Теплица 2"};
    private Pult pult;
    private int buttonsCount = 2;
    private SimpleRemoteControl remoteControl;
    public Supervisor() {
        remoteControl = new SimpleRemoteControl();
        pult = new Pult(textFieldStrings, buttonsCount, this);
    }

    @Override
    public void print(String message) {
        if (message.equals("on0")){
            Light light = new Light(pult);
            LightOnCommand lightOnCommand = new LightOnCommand(light);
            remoteControl.setCommand(lightOnCommand);
            remoteControl.buttonWasPressed();
        } else if (message.equals("on1")) {
            GarageDoor garageDoor = new GarageDoor(pult);
            GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
            remoteControl.setCommand(garageDoorOpenCommand);
            remoteControl.buttonWasPressed();
        }
    }

    public void start(){
        pult.setTextOut("Проба\nПривет Мир!");
        pult.myCreateAndShowAPI(pult);
        pult.setTextOut("Новая проба прошла!");
    }
}