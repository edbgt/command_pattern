import java.util.List;

public class Delete implements Command {
    Task theTask;

    public Delete(Task newTask) {
        theTask = newTask;
    }

    @Override
    public void execute() {
        theTask.delete();
    }
}
