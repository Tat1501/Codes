
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        double BASE_SALARY = 200.0;
        double COMMISSION_RATE = 0.09;

        double[] itemValues = {239.99, 129.75, 99.95, 350.89};
        double totalSales = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the quantity sold for each item:");
        for (int i = 0; i < itemValues.length; i++) {
            System.out.printf("Item " + (i + 1) + " (Value: " + itemValues[i] + "): ");
            while (true) {
                if (sc.hasNextInt()) {
                    int quantity = sc.nextInt();
                    if (quantity >= 0) {
                        totalSales += itemValues[i] * quantity;
                        break;
                    } else {
                        System.out.println("Please enter a non-negative quantity.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                }
            }
        }
        double commission = totalSales * COMMISSION_RATE;
        double totalEarnings = BASE_SALARY + commission;

        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Commission: $" + commission);
        System.out.println("Total Earnings: $" + totalEarnings);
    }
}
