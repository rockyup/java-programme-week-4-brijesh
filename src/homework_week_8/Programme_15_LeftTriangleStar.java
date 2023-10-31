package homework_week_8;

/**
 * Display left angle triangle of * using nested for loops
 *                  *
 *                * *
 *              * * *
 *            * * * *
 *          * * * * *
 */
public class Programme_15_LeftTriangleStar {

    public static void main(String[] args) {
        int n = 5; // Change the value of 'n' to adjust the number of rows
        // Nested for loops use
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("  "); // Print spaces for alignment
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

