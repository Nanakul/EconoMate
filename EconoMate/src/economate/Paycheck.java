package economate;

public class Paycheck {
    private double paycheckAmount;
    private double savePercentage;

    public Paycheck(double paycheckAmount, double savePercentage) {
        if (paycheckAmount < 0) {
            throw new IllegalArgumentException("Paycheck amount cannot be negative");
        }
        if (savePercentage < 0 || savePercentage > 100) {
            throw new IllegalArgumentException("Percent saved must be between 0 and 100.");
        }
        this.paycheckAmount = paycheckAmount;
        this.savePercentage = savePercentage;
    }

    // Getters

    public double getPaycheckAmount() {
        return paycheckAmount;
    }

    public double getSavePercentage() {
        return savePercentage;
    }

    // Setters

    public void setPaycheckAmount(double paycheckAmount) {
        this.paycheckAmount = paycheckAmount;
    }

    public void setSavePercentage(double savePercentage) {
        this.savePercentage = savePercentage;
    }
    public double calculateSavePercentage() {
        double savings = ((savePercentage / 100) * paycheckAmount);
        return (double) Math.round(savings * 100) / 100; // Round to 2 decimal places
    }
}
