package Desafio_plataforma_de_ensino;

public abstract class Lesson {
    protected String title;

    public Lesson(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract int duration();
}
