package exercicio_taxPayer;

public class Individual extends taxPayer{
    protected double medicalExpeses;

    public Individual(String name, double anualIncome) {
        super(name, anualIncome);
    }

    public Individual(String name, double anualIncome, double medicalExpeses) {
        super(name, anualIncome);
        this.medicalExpeses = medicalExpeses;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getMedicalExpeses() {
        return medicalExpeses;
    }

    public void setMedicalExpeses(double medicalExpeses) {
        this.medicalExpeses = medicalExpeses;
    }

    @Override
    public double tax() {
        if (anualIncome < 20000.00) {
            return anualIncome += anualIncome * 0.15;
        }
        if (anualIncome > 20000.00 && medicalExpeses > 0) {
             double result = (anualIncome = anualIncome * 0.25) - (medicalExpeses * 0.5);
             return result;
        }
        if (anualIncome > 20000.00 && medicalExpeses < 0) {
            double result = anualIncome += anualIncome * 0.5;
            return result;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name + ": R$" + tax() + '\'';
    }
}
