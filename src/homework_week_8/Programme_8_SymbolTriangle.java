package homework_week_8;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {

    public static void main(String[] args) {
       //scanner start here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            //for loop used
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("@");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
       scanner.close(); // scanner closed
    }
}
