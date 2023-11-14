package Default_methods.services;

public class UsaService implements InterestService {
    private double interestRate;

    public UsaService(double intesrestRate) {
        this.interestRate = intesrestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
