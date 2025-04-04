package ui.commands;
import ui.Console;

public class AddHuman extends Command {

    public AddHuman(Console console) {
        super(console);
    }

    @Override
    public String getDescription() {
        return "Добавить человека";
    }

    @Override
    public void execute() {
        getConsole().addHuman();
    }

}
