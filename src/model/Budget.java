package model;

public class Budget {

    private double monthlyBudget;

    public Budget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }

    public double getRemainingBudget(double totalExpenses) {
        return monthlyBudget - totalExpenses;
    }

    public boolean isOverBudget(double totalExpenses) {
        return totalExpenses > monthlyBudget;
    }

    @Override
    public String toString() {
        return "Monthly Budget: ₹" + monthlyBudget;
    }
}