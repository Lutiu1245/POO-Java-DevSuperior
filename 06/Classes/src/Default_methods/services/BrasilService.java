package Default_methods.services;

public class BrasilService implements InterestService {
    private double interestRate;

    public BrasilService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
