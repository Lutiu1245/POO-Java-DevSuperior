package exercicio_set.services;

import java.util.Objects;

public class Aluno {
    private int Id;

    public Aluno(int id) {
        Id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Id == aluno.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Id=" + Id +
                '}';
    }
}
