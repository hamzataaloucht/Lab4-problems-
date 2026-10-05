package problem1;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];

        int sum = 0;
        int maxSale = -1;
        int minSale = Integer.MAX_VALUE;
        int minSaleId = 1;
        int maxSaleId = 1;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSaleId = i + 1;
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
                minSaleId = i + 1;
            }
            sum += sales[i];
        }

        double averageSale = 1.0 * sum / sales.length;

        System.out.println("\nTotal sales: " + sum);
        System.out.printf("The average sale: %.3f", averageSale);
        System.out.println("\nSalesperson " + maxSaleId + " had the highest sale with $" + maxSale + ".");
        System.out.println("Salesperson " + minSaleId + " had the lowest sale with $" + minSale + ".");

        int amount;
        System.out.print("Enter an amount: ");
        amount = scan.nextInt();

        System.out.println("The salespersons who exceeded $" + amount + " in sales: ");
        int numSalesperson = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= amount) {
                System.out.println((i + 1) + " " + sales[i]);
                numSalesperson++;
            }
        }
        System.out.println("Their total number is: " + numSalesperson + ".");
    }
}