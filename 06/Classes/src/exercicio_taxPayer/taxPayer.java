package exercicio_taxPayer;
public abstract class taxPayer {
    protected String name;
    protected double anualIncome;

    public taxPayer(){}
    public taxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double tax();

    @Override
    public String toString() {
        return name + ": R$" + anualIncome + '\'';
    }
}
