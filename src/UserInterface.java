public class UserInterface {
    //Invoker
    Command theCommand;

    public UserInterface(Command newCommand) {
        theCommand = newCommand;
    }

    //simulates ActionListener of a button in the UI
    public void click() {
        theCommand.execute();
    }
}
