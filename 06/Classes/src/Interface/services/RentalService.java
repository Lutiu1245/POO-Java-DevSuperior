package Interface.services;

import Interface.CarRental;
import Interface.Invoice;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private TaxService braziltaxService;

    public RentalService(double pricePerHour, double pricePerDay) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public RentalService(double pricePerHour, double pricePerDay, TaxService braziltaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.braziltaxService = braziltaxService;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    private double calculateHours(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double) (t2 - t1) / 1000 / 60 / 60;
        return hours;
    }
    public void processInvoice(CarRental carRental) {
        double hours = calculateHours(carRental);
        double basicPayment;
        if (hours > 12.0) {
            basicPayment = (double) Math.ceil(hours) * pricePerHour;
        }
        else {
            basicPayment = (double) Math.ceil(hours / 24) + pricePerDay;
        }
        double tax = braziltaxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
