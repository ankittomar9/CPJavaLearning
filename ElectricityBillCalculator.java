import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int units = scanner.nextInt();
        System.out.println("Enter the number of units consumed: " +units);

        if (units <= 0) {
            System.out.println("Invalid input. Units consumed must be greater than 0.");
            return; // Exit the program if the input is invalid
        }

        double billAmount = calculateBill(units);
        System.out.println("Total Electricity Bill: " + (int) billAmount); // Print the integer part
        scanner.close();
    }

    public static double calculateBill(int units) {
        double bill = 0;

        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units <= 250) {
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }

        // Add the 20% surcharge
        bill = bill * 1.20;
        return bill;
    }
}
