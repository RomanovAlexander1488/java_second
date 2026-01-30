package Tasks;

public class SubTask extends Base {
    private boolean isCompleted = false;

    public SubTask(String title) {
        super(title);
    }

    public void setCompleted(boolean completed) { isCompleted = completed; }
    public boolean isCompleted() { return isCompleted; }
}
