import java.util.List;

public class Delete implements Command {
    private List<Task> theTasks;
    private Task theTask;
    private int theIndex;

    public Delete(List<Task> newTasks, Task newTask) {
        theTasks = newTasks;
        theTask = newTask;
        theIndex = newTasks.indexOf(theTask);
    }

    @Override
    public void execute() {
        Task taskToDelete = theTasks.get(theIndex);
        theTasks.remove(theIndex);
        System.out.println(taskToDelete.toString() + " deleted");
    }

    //TODO load Task
    public void undo() {
        System.out.println("undo delete");
    }

    public void redo() {
        this.execute();
    }
}
