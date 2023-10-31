package homework_week_8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 *
 *                      *
 *                     * *
 *                    * * *
 *                   * * * *
 *                 * * * * * *
 *                * * * * * * *
 *                 * * * * * *
 *                  * * * * *
 *                   * * * *
 *                    * * *
 *                     * *
 *                      *
 */

public class Programme_14_DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond (odd number): ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n % 2 == 0) {
                System.out.println("Please enter an odd number for the diamond pattern.");
            } else {
                printDiamond(n);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close(); // scanner close
    }
    public static void printDiamond(int n) {
        int spaces = n / 2;
        int stars = 1;

        // Print the top half of the diamond
        int i = 0;
        while (i < n / 2 + 1) {
            printSpaces(spaces);
            printStars(stars);
            spaces--;
            stars += 2;
            i++;
        }
        // Print the bottom half of the diamond
        i = 0;
        spaces = 1;
        stars = n - 2;
        while (i < n / 2) {
            printSpaces(spaces);
            printStars(stars);
            spaces++;
            stars -= 2;
            i++;
        }
    }
    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
