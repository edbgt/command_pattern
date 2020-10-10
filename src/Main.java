import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Invoker theInvoker = new Invoker();

        BasicTask basicTask1 = new BasicTask();
        BasicTask basicTask2 = new BasicTask();

        tasks.add(basicTask1);
        tasks.add(basicTask2);

        //complete basicTask1
        Complete completeCommand = new Complete(basicTask1);
        theInvoker.setCommand(completeCommand);
        theInvoker.clickDo();
        theInvoker.clickUndo();
        theInvoker.clickDo();

        //delete basicTask2
        Delete deleteCommand = new Delete(tasks, basicTask2);
        theInvoker.setCommand(deleteCommand);
        theInvoker.clickDo();
    }
}
