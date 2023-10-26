package economate;

public class ExpenseCategory {
    private String expenseName;
    private double budgetAmount;
    private double spentAmount;
    // Constructors
    public ExpenseCategory(String expenseName, double budgetAmount) {
        this.expenseName = expenseName;
        this.budgetAmount = budgetAmount;
        this.spentAmount = 0.0;
    }

    public ExpenseCategory(String expenseName, double budgetAmount, double spentAmount) {
        this.expenseName = expenseName;
        this.budgetAmount = budgetAmount;
        this.spentAmount = spentAmount;
    }
    // Getters
    public String getExpenseName() {
        return expenseName;
    }
    public double getBudgetAmount() {
        return budgetAmount;
    }
    public double getSpentAmount() {
        return spentAmount;
    }
    // Setters
    public void setBudgetAmount(double budgetAmount) {
        this.budgetAmount = budgetAmount;
    }
    // Expense Methods
    public void recordExpense(double expenseAmount) {
        if (expenseAmount >= 0) {
            spentAmount += expenseAmount;
        } else {
            throw new IllegalArgumentException("Expense amount cannot be negative");
        }
    }
}
