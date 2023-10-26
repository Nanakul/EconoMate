package economate;

public class Main {
    public static void main(String[] args) {
        Paycheck paycheck1 = new Paycheck(2251.79, 15.0);
        double savedAmount = paycheck1.calculateSavePercentage();
        System.out.println("Put $" + savedAmount + " into savings.");
        double amountRemaining = paycheck1.calculatePaycheckAfterSave();
        System.out.println("After savings: " + amountRemaining);

        ExpenseCategory rent = new ExpenseCategory("Rent", 1200.0, 1200);
        double afterRent = amountRemaining - rent.getSpentAmount();
    }
}