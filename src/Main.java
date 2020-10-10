import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        BasicTask basicTask1 = new BasicTask();
        BasicTask basicTask2 = new BasicTask();

        tasks.add(basicTask1);
        tasks.add(basicTask2);



        //complete basicTask1
        Complete completeCommand = new Complete(tasks.get(0));

        UserInterface onCompleteClick = new UserInterface(completeCommand);

        onCompleteClick.click();

        //delete basicTask2
        Delete deleteCommand = new Delete(tasks.get(1));

        UserInterface onDeleteClick = new UserInterface(deleteCommand);

        onDeleteClick.click();
    }
}
