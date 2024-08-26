import java.util.Scanner;

/**
 * Main Class to calculate the number of ways to arrange.
 */
public class Main {

    /**
     * Main method to calculate the number of ways to arrange
     * the meeting members around the circular table.
     *
     * @param args
     */
    public static void main(String[] args) {

        // Get the number of meeting members.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of meeting members: ");
        int n = scanner.nextInt();

        long noOfWays = calculateArrangementWays(n);
        System.out.println("Number of ways to arrange the meeting members around the circular table: " + noOfWays);
    }

    /**
     * Calculate the number of ways to arrange the meeting members
     * around the circular table.
     *
     * @param n
     * @return {@link Long}
     */
    private static long calculateArrangementWays(int n) {
        if (n < 2) {
            return 0;
        }

        long result = calculateFactorials(n - 1);
        return (2 * result);
    }

    /**
     * Calculate factorials of the given number.
     *
     * @param n
     * @return {@link Long}
     */
    private static long calculateFactorials(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}