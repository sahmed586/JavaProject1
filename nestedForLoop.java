// Sadia Ahmed
// Project 1 Problem 6 - CSC 3020
// Using nested for loop to print out the pyramid with numerical elements

public class nestedForLoop
{
    public static void main(String[] args)
    {
        // initialization of decreasing vals and white spaces
        int right = 0;
        int end = 7;

        // Displaying the numbers in each row
        // i is correlated with rows
        for (int i = 1; i <= 128; i += i)
        {
            // print out the white space (j is correlated w/ starting spaces)
            for (int j = 0; j < end; j++)
            {
                System.out.print("    ");
            }

            // print out the increasing values
            for (int k = 1; k <= i; k += k)
            {
                System.out.printf("%4d", (k));
            }

            // print out the decreasing values
            // r for right
            for (int r = right; r > 0 ; r /= 2 )
            {
                System.out.printf("%4d", (r));
            }

            System.out.println();
            end--;
            right = i;
        }
    }
}