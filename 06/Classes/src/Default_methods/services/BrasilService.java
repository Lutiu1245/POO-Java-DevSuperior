package Default_methods.services;

import java.security.InvalidParameterException;

public class BrasilService {
    private double interestRate;

    public BrasilService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double calculateInterest(double amount, int mounth) {
        if (amount < 1) {
            throw new InvalidParameterException("Parametro deve ser maior de zero");
        }
        return amount * Math.pow(1 + interestRate/100, mounth);
    }
}
