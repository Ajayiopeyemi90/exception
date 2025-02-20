import java.util.Scanner;

// Custom exception class
class BudgetLimit extends Exception {
    public BudgetLimit(String message) {
        super(message);
    }
}

public class BudgetTracker {
    // Method to check budget limit
    public static void checkBudgetLimit(double expense, double budget) throws BudgetLimit {
        if (expense > budget) {
            throw new BudgetLimit("Your expense of  \u20A6" + expense + " exceeds the budget of  \u20A6" + budget);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input for budget and expense
            System.out.print("Enter your budget amount: ");
            double budget = scanner.nextDouble();

            System.out.print("Enter your expense amount: ");
            double expense = scanner.nextDouble();

            // Check if expense exceeds budget
            checkBudgetLimit(expense, budget);

            System.out.println("Expense recorded successfully within the budget!");
        } catch (BudgetLimit e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            scanner.close(); // Closing scanner to prevent resource leak
        }
    }
}