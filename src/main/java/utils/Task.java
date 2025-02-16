package utils;

public class Task { 
    protected String taskName;
    protected boolean isDone;

    //make the Task
    public Task(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }

    //mark the task as done
    public void markAsDone() {
        this.isDone = true;
    }

    //returns the tick or cross
    public String getStatusIcon() {
        return "[" + (isDone ? "✔" : "✘") + "]";
    }

    public String getTaskName() {
        return this.taskName;
    }
    
    @Override 
    public String toString() {
        return getStatusIcon() + " " + this.taskName;
    }
    
    public String getStorageString() {
        return "";
    }
}