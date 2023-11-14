package Default_methods.services;

import java.security.InvalidParameterException;

public class UsaService {
    private double interestRate;

    public UsaService(double intesrestRate) {
        this.interestRate = intesrestRate;
    }

    public double getIntesrestRate() {
        return interestRate;
    }
    public double calculeInterest(double amount, int mounth) {
        if (amount < 1) {
            throw new InvalidParameterException("Parametro deve ser maior de zero");
        }
        return amount * Math.pow(1 + interestRate/100, mounth);
    }
}
