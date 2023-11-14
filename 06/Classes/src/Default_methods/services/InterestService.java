package Default_methods.services;

import java.security.InvalidParameterException;

public interface InterestService {
    public double getInterestRate();

    default double calculateInterest(double amount, int mounth) {
        if (amount < 1) {
            throw new InvalidParameterException("Parametro deve ser maior de zero");
        }
        return amount * Math.pow(1 + getInterestRate()/100, mounth);
    }
}
