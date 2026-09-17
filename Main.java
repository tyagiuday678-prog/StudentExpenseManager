import model.Expense;
import model.Budget;
import service.ExpenseService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ExpenseService expenseService = new ExpenseService();
        Budget budget = new Budget(0);

        // Load previously saved expenses
        expenseService.getExpenses().addAll(
                util.FileManager.loadExpenses()
        );

        while (true) {

            System.out.println();
            System.out.println("==========================================");
            System.out.println("     STUDENT EXPENSE & BUDGET MANAGER");
            System.out.println("==========================================");

            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Update Expense");
            System.out.println("4. Delete Expense");
            System.out.println("5. Set Monthly Budget");
            System.out.println("6. View Budget Status");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.println();
                System.out.println("========== ADD EXPENSE ==========");

                System.out.print("Enter expense ID: ");
                int id = scanner.nextInt();

                System.out.print("Enter amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter category: ");
                String category = scanner.nextLine();

                System.out.print("Enter description: ");
                String description = scanner.nextLine();

                Expense expense = new Expense(
                        id,
                        amount,
                        category,
                        description,
                        LocalDate.now()
                );

                expenseService.addExpense(expense);

            } else if (choice == 2) {

                expenseService.viewExpenses();

            } else if (choice == 3) {

                System.out.println();
                System.out.println("========== UPDATE EXPENSE ==========");

                System.out.print("Enter expense ID: ");
                int id = scanner.nextInt();

                System.out.print("Enter new amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter new category: ");
                String category = scanner.nextLine();

                System.out.print("Enter new description: ");
                String description = scanner.nextLine();

                expenseService.updateExpense(
                        id,
                        amount,
                        category,
                        description
                );

            } else if (choice == 4) {

                System.out.println();
                System.out.println("========== DELETE EXPENSE ==========");

                System.out.print("Enter expense ID: ");
                int id = scanner.nextInt();

                expenseService.deleteExpense(id);

            } else if (choice == 5) {

                System.out.println();
                System.out.println("========== SET MONTHLY BUDGET ==========");

                System.out.print("Enter monthly budget: ");
                double amount = scanner.nextDouble();

                budget.setMonthlyBudget(amount);

                System.out.println("Monthly budget set successfully!");

            } else if (choice == 6) {

                System.out.println();
                System.out.println("========== BUDGET STATUS ==========");

                double total = expenseService.getTotalExpenses();

                double remaining =
                        budget.getRemainingBudget(total);

                System.out.println(
                        "Monthly Budget: ₹" +
                        budget.getMonthlyBudget()
                );

                System.out.println(
                        "Total Expenses: ₹" +
                        total
                );

                System.out.println(
                        "Remaining Budget: ₹" +
                        remaining
                );

                if (budget.isOverBudget(total)) {

                    System.out.println(
                            "WARNING: You have exceeded your budget!"
                    );

                } else {

                    System.out.println(
                            "You are within your budget."
                    );
                }

            } else if (choice == 7) {

                // Save expenses before exiting
                util.FileManager.saveExpenses(
                        expenseService.getExpenses()
                );

                System.out.println();
                System.out.println(
                        "Thank you for using Student Expense & Budget Manager!"
                );

                scanner.close();
                break;

            } else {

                System.out.println(
                        "Invalid choice. Please enter 1-7."
                );
            }
        }
    }
}