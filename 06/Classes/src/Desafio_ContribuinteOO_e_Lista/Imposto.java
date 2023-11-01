package Desafio_ContribuinteOO_e_Lista;


public class Imposto {

    private double salaryIncome;
    private double servicesIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public Imposto() {
    }

    public Imposto(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double salaryTax() {
        double salaryMonth = salaryIncome / 12.0;

        if (salaryMonth < 3000.0) {
            return salaryIncome * 0.0;
        }
        else if (salaryMonth < 5000.0) {
            return salaryIncome * 0.1;
        }
        else {
            return salaryIncome * 0.2;
        }
    }

    public double servicesTax() {
        return servicesIncome * 0.15;
    }

    public double capitalTax() {
        return capitalIncome * 0.2;
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate() {
        double spendingTotal = educationSpending + healthSpending;

        if (grossTax() < spendingTotal) {
            return grossTax() * 0.3;
        }
        else {
            return spendingTotal;
        }
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }

    public String toString() {
        return "Imposto bruto total: " + grossTax() + " Abatimento: " + taxRebate() + " Imposto devido: " + netTax();
    }
}