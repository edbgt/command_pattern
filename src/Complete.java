public class Complete implements Command {
    Task theTask;

    public Complete(Task newTask) {
        theTask = newTask;
    }

    @Override
    public void execute() {
        theTask.complete();
    }
}
