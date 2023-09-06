package main.java.set.Pesquisa;

@SuppressWarnings("ALL")
public class Task {

    private String description;
    private boolean taskCompleted;

    public Task(String description) {
        this.description = description;
        this.taskCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isTaskCompleted() {
        return taskCompleted;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTaskCompleted(boolean taskCompleted) {
        this.taskCompleted = taskCompleted;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", taskCompleted=" + taskCompleted +
                '}';
    }
}
