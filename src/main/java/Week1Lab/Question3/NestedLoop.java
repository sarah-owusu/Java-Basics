package Week1Lab.Question3;

public class NestedLoop {
    public static void main(String args[]){
        int rows = 5; // Number of rows in the triangle

        // Loop to iterate through each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print the spaces before the asterisks
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Loop to print the asterisks for the current row
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
