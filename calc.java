import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Add the two numbers
        int sum = number1 + number2;
	int sub= number1 -number 2;

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
	System.out .println("the difference" +" is "+sub);

        int product = number1*number2;

        
        System.out.println("The product " + number1 + " and " + number2 + " is " + product);
     

        // Close the scanner
        scanner.close();
    }
}

