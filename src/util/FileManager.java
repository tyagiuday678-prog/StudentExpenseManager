package util;

import model.Expense;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private static final String FILE_PATH = "data/expenses.txt";

    public static void saveExpenses(List<Expense> expenses) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_PATH))) {

            for (Expense expense : expenses) {

                writer.write(
                        expense.getId() + "," +
                        expense.getAmount() + "," +
                        expense.getCategory() + "," +
                        expense.getDescription() + "," +
                        expense.getDate()
                );

                writer.newLine();
            }

            System.out.println("Expenses saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving expenses: " + e.getMessage());
        }
    }

    public static List<Expense> loadExpenses() {

        List<Expense> expenses = new ArrayList<>();

        File file = new File(FILE_PATH);

        if (!file.exists()) {
            return expenses;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",", -1);

                int id = Integer.parseInt(data[0]);
                double amount = Double.parseDouble(data[1]);
                String category = data[2];
                String description = data[3];
                LocalDate date = LocalDate.parse(data[4]);

                Expense expense = new Expense(
                        id,
                        amount,
                        category,
                        description,
                        date
                );

                expenses.add(expense);
            }

            System.out.println("Expenses loaded successfully.");

        } catch (IOException | NumberFormatException e) {

            System.out.println("Error loading expenses: " + e.getMessage());
        }

        return expenses;
    }
}