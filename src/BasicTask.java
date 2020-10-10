public class BasicTask extends Task{
    //Receiver
    private boolean completed = false;

    @Override
    public void complete() {
        completed = true;
        System.out.println("Basic Task has been completed");
    }

    public void reopen() {
        completed = false;
        System.out.println("Basic Task has been reopened");
    }
}
