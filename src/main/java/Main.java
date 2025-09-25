import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create a scanner to read input from the keyboard
        Scanner myScanner = new Scanner(System.in);
        // asking user to input their name
        System.out.print("Enter your name: ");
        String name = myScanner.nextLine();
        // Asking use to iput how many hours they worked
        System.out.print("Enter Hours worked: ");
        double hoursWorked = myScanner.nextDouble();
        // Ask user to enter hours worked
        System.out.print("Enter Pay rate: ");
        double payRate = myScanner.nextDouble();

        // Calculate gross pay
        double grossPay = hoursWorked * payRate;

        // Result
        System.out.println("\nEmployee: " + name);
        System.out.println("Gross pay: $" + grossPay);

        myScanner.close();
    }
}
