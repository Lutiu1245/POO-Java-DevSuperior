package exercicio_lista_empregado;

import java.util.List;

public class Empregado {
    protected int id;
    protected String Name;
    protected double Salary;

    public Empregado(int id, String name, double salary) {
        this.id = id;
        Name = name;
        Salary = salary;
    }

    public Empregado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void increaseSalary(double porcento) {
        Salary += Salary * porcento/100;
    }

    public String toString() {
        return "[Id: " + this.id + ", Nome do empregado: " + Name + ", Salario: " + Salary + "]";
    }
}
