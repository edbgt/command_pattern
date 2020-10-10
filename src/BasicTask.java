public class BasicTask implements Task{
    //Receiver
    private boolean completed = false;

    @Override
    public void complete() {
        completed = true;
        System.out.println("Basic Task has been completed");
    }

    @Override
    public void delete() {
        System.out.println("Basic Task has been deleted");
    }
}
