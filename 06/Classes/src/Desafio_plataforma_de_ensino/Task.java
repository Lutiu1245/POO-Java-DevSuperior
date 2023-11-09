package Desafio_plataforma_de_ensino;

import java.time.Duration;

public class Task extends Lesson{
    private String description;
    private int quentionCount;

    public Task(String title, String description, int quentionCount) {
        super(title);
        this.description = description;
        this.quentionCount = quentionCount;
    }

    public int convertSeconds(int quentionCount) {
        int total = quentionCount * 5;
        int result = total * 60;
        return result;
    }
    public int duration() {
        int result = convertSeconds(quentionCount);
        return result;
    };

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", quentionCount=" + duration() +
                '}';
    }
}
