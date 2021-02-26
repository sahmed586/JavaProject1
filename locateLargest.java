// Sadia Ahmed
// Project 1 Problem 3 - CSC 3020
// Locating the largest element in an array via coordinates

import java.util.Scanner;

public class locateLargest {
    public static void main(String[] args) {

        // creating scanner
        Scanner input = new Scanner(System.in);

        // prompting for user input for rows and columns in array
        System.out.print("Enter the number of rows and columns of the array: ");

        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] inputtedArray = new double[rows][columns];

        // prompting for user to enter the elements occupying the array
        System.out.println("Enter the array:");

        for (int i = 0; i < inputtedArray.length; i++)
        {
            for (int j = 0; j < inputtedArray[i].length; j++)
            {
                inputtedArray[i][j] = input.nextDouble();
            }
        }

        // locates and prints out the largest element
        int[] spot = locateLargest(inputtedArray);
        System.out.printf("The location of the largest element is at (%d, %d)%n", spot[0], spot[1]);
    }

    // function for locating largest in the array
    public static int[] locateLargest(double[][] arr)
    {
        //  initializations
        int[] location = new int[]{0, 0};
        double greatestElem = arr[0][0];


        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (greatestElem < arr[i][j])
                {
                    greatestElem = arr[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }


}
