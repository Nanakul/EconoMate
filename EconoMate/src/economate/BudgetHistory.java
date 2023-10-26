package economate;

import java.util.ArrayList;
import java.util.List;

public class BudgetHistory {
    private List<Paycheck> paycheckHistory;
    private List<ExpenseCategory> expenseCategoryHistory;

    public BudgetHistory() {
        paycheckHistory = new ArrayList<>();
        expenseCategoryHistory = new ArrayList<>();
    }

    // Add methods
    public void addPaycheck(Paycheck paycheck) {
        paycheckHistory.add(paycheck);
    }

    public void addExpenseCategory(ExpenseCategory expenseCategory) {
        expenseCategoryHistory.add(expenseCategory);
    }

    // Getters
    public List<Paycheck> getPaycheckHistory() {
        return paycheckHistory;
    }

    public List<ExpenseCategory> getExpenseCategoryHistory() {
        return expenseCategoryHistory;
    }

    public List<Double> getSavedAmountPerPaycheck() {
        List<Double> savedAmounts = new ArrayList<>();
        for (Paycheck paycheck : paycheckHistory) {
            double savedAmount = paycheck.calculateSavePercentage();
            savedAmounts.add(savedAmount);
        }
        return savedAmounts;
    }
}
