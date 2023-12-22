package pl.javastart.task;

public class Task {
    private String name;
    private String description;
    private int priority;
    private Person responsiblePerson;

    public Task(String name, String description, int priority, Person responsiblePerson) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.responsiblePerson = responsiblePerson;
    }

    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    boolean highPriority() {
        return this.priority >= 1;
    }

    boolean mediumPriority() {
        return this.priority == 0;
    }

    boolean lowPriority() {
        return this.priority <= -1;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
