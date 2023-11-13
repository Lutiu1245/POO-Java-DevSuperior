package Interface;

public class Invoice {
    private double basicPayment;
    private double tax;

    private CarRental carRental;
    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Invoice(double basicPayment, double tax, CarRental carRental) {
        this.basicPayment = basicPayment;
        this.tax = tax;
        this.carRental = carRental;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double totalPayment() {
        return getBasicPayment() + getTax();
    }
}
