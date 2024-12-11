public class BugSolution {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        // Check for division by zero before performing the operation.
        if (y == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            int z = x / y;
            System.out.println(z);
        }
    }
}