package problem1;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];

        int sum = 0;
        int maxSale = -1;
        int maxSaleId = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + i + " " + sales[i]);
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxSaleId = i;
            }
            sum += sales[i];
        }

        double averageSale = 1.0 * sum / sales.length;

        System.out.println("\nTotal sales: " + sum);
        System.out.printf("The average sale: %.3f", averageSale);
        System.out.println("\nSalesperson " + maxSaleId + " had the highest sale with $" + maxSale + ".");
    }
}