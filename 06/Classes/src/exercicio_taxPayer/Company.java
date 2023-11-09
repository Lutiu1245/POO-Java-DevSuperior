package exercicio_taxPayer;

public class Company extends taxPayer{
    protected int employees;

    public Company(String name, double anualIncome, int employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public double tax() {
        if (employees > 10) {
            return anualIncome = anualIncome * 0.14;
        }
            double result = anualIncome = anualIncome * 0.16;
        return result;
    }

    @Override
    public String toString() {
        return name + ": R$" + tax() + '\'';
    }
}
