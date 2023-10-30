package sem4.Solution28;

public class USD extends Money {
    @Override
    public String getCurrencyName() {
        return "USD";
    }

    public USD(double amount) {
        super(amount);
    }
}
