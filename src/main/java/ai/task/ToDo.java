package ai.task;

public class ToDo extends Task {
    private final static String TASK_TYPE = "T";
    public ToDo(String description){
        super(description);
    }

    public ToDo(String description, Boolean isDone){
        super(description, isDone);
    }

    @Override
    public String toString() {
        return String.format("[%s]%s", TASK_TYPE, super.toString());
    }

    @Override
    public String stringData() {
        return String.format("%s | %s", TASK_TYPE, super.stringData());
    }
}
