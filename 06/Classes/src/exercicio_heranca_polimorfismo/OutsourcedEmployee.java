package exercicio_heranca_polimorfismo;

public class OutsourcedEmployee extends Employee {
    private double addtionalCharge;
    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double addtionalCharge) {
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public double payment() {
        double salary = super.payment();
        double bonus = 1.1 * this.addtionalCharge;
        return  salary + bonus;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salario: " + payment() +
                '}';
    }
}
