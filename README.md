# Budget Tracker - Java Console Application  

## Overview  
This is a simple Java console application that allows users to input a budget and expense amount. The program checks whether the expense exceeds the budget and throws a custom exception (`BudgetLimit`) if it does. Otherwise, it confirms that the expense is within the budget.

## Features  
- Takes user input for budget and expense.  
- Implements a custom exception (`BudgetLimit`) to handle overspending scenarios.  
- Provides error handling for invalid inputs.  
- Uses `Scanner` for user input and ensures resource management with `finally`.  

## How It Works  
1. The user enters their total budget.  
2. The user enters an expense amount.  
3. The program checks if the expense exceeds the budget:  
   - If yes, it throws and catches a `BudgetLimit` exception, displaying an error message.  
   - If no, it confirms the expense is within the budget.  
4. The program handles invalid inputs gracefully.  

## Prerequisites  
- Java Development Kit (JDK) installed (Java 8 or later).  
- A Java-compatible IDE or command-line environment.  

## How to Run  
1. Copy the Java code into a file named `BudgetTracker.java`.  
2. Open a terminal or command prompt in the directory where the file is saved.  
3. Compile the Java file using:  
   ```
   javac BudgetTracker.java
   ```  
4. Run the compiled program using:  
   ```
   java BudgetTracker
   ```  
5. Follow the prompts to enter a budget and expense.  

## Example Output  
```
Enter your budget amount: 5000  
Enter your expense amount: 6000  
Exception caught: Your expense of ₦6000.0 exceeds the budget of ₦5000.0  
```
or  
```
Enter your budget amount: 5000  
Enter your expense amount: 3000  
Expense recorded successfully within the budget!  
```

## Error Handling  
- If the user enters a non-numeric value, the program displays:  
  ```
  Invalid input! Please enter numeric values.
  ```  
- If the expense exceeds the budget, a `BudgetLimit` exception is thrown and caught.  

## Author  
Opeyemi Ajayi 
