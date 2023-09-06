package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class TaskList {

    private Set<Task> taskSet;

    public TaskList() {
        this.taskSet = new HashSet<>();
    }

    public void addTask(String description){
        taskSet.add(new Task(description));
    }

    public void removeTask(String description){
        Task taskToRemove = null;
        if (!taskSet.isEmpty()){
            for (Task t : taskSet){
                if (t.getDescription().equalsIgnoreCase(description)){
                    taskToRemove = t;
                    break;
                }
            }
            taskSet.remove(taskToRemove);
        } else {
            System.out.println("The set is empty");
        }

        if(taskToRemove == null){
            System.out.println("Task not found!");
        }
    }

    public void showTasks(){
        if (!taskSet.isEmpty()){
            System.out.println(taskSet);
        } else {
            System.out.println("Task not found!");
        }
    }

    public int countTasks(){
        return taskSet.size();
    }

    public Set<Task> getTasksCompleted(){
        Set<Task> tasksCompleted = new HashSet<>();
        for (Task t : taskSet){
            if (t.isTaskCompleted()){
                tasksCompleted.add(t);
            }
        }
        return tasksCompleted;
    }

    public Set<Task> getPendingTasks(){
        Set<Task> unfinishedTasks = new HashSet<>();
        for (Task t : taskSet){
            if (!t.isTaskCompleted()){
                unfinishedTasks.add(t);
            }
        }
        return unfinishedTasks;
    }

    public void markTaskCompleted(String description){
        for (Task t : taskSet){
            if (t.getDescription().equalsIgnoreCase(description)){
                t.setTaskCompleted(true);
            }
        }
    }

    public void markPendingTask(String description){
        Task taskToMarkPending = null;
        for (Task t : taskSet){
            if (t.getDescription().equalsIgnoreCase(description)){
                taskToMarkPending = t;
                break;
            }
        }
        if (taskToMarkPending != null){
            taskToMarkPending.setTaskCompleted(true);
        } else {
            System.out.println("Task not found in the list!");
        }
    }

    public void clearTaskList(){
        if (taskSet.isEmpty()) {

            System.out.println("The list is already clean!");
        } else {
            taskSet.clear();
        }
    }

    public static void main(String[] args) {

        TaskList taskList = new TaskList();

        taskList.addTask("Study java");
        taskList.addTask("Read a book");
        taskList.addTask("Run a bike");
        taskList.addTask("Prepare a presentation.");

        taskList.showTasks();

        taskList.removeTask("Run a bike");
        taskList.showTasks();

        System.out.println("Total tasks in the list: " + taskList.countTasks());

        System.out.println(taskList.getTasksCompleted());

        System.out.println(taskList.getPendingTasks());

        taskList.markTaskCompleted("Read a book");
        taskList.markTaskCompleted("Prepare a presentation.");
        taskList.showTasks();

        taskList.markPendingTask("Study Java");
        taskList.showTasks();

        taskList.clearTaskList();
        taskList.showTasks();
    }
}
