package service;

import model.Expense;
import java.util.ArrayList;
import java.util.List;

public class ExpenseService {

    private List<Expense> expenses;

    public ExpenseService() {
        expenses = new ArrayList<>();
    }

    // ADD EXPENSE
    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added successfully!");
    }

    // VIEW EXPENSES
    public void viewExpenses() {

        System.out.println();
        System.out.println("========== ALL EXPENSES ==========");

        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }

        for (Expense expense : expenses) {
            System.out.println(expense);
        }

        System.out.println("==================================");
    }

    // TOTAL EXPENSES
    public double getTotalExpenses() {

        double total = 0;

        for (Expense expense : expenses) {
            total = total + expense.getAmount();
        }

        return total;
    }

    // UPDATE EXPENSE
    public boolean updateExpense(
            int id,
            double amount,
            String category,
            String description) {

        for (Expense expense : expenses) {

            if (expense.getId() == id) {

                expense.setAmount(amount);
                expense.setCategory(category);
                expense.setDescription(description);

                System.out.println("Expense updated successfully!");
                return true;
            }
        }

        System.out.println("Expense not found.");
        return false;
    }

    // DELETE EXPENSE
    public boolean deleteExpense(int id) {

        for (int i = 0; i < expenses.size(); i++) {

            if (expenses.get(i).getId() == id) {

                expenses.remove(i);

                System.out.println("Expense deleted successfully!");
                return true;
            }
        }

        System.out.println("Expense not found.");
        return false;
    }

    // GET ALL EXPENSES
    public List<Expense> getExpenses() {
        return expenses;
    }
}