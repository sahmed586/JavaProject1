// Sadia Ahmed
// Project 1 Problem 2 - CSC 3020
// Selection Sort of an array of strings (names)

public class stringSelectionSort {
    // main method
    public static void main(String[] args) {

        // these are the names we were given to work with
        String name[] = new String[]{
                "Collins, Bill",  "Smith, Bart",  "Michalski, Joe",
                "Griffin, Jim", "Sanchez, Manny", "Rubin, Sarah",
                "Taylor, Tyrone", "Johnson, Jill", "Allison, Jeff",
                "Moreno, Juan", "Wolfe, Bill",    "Whitman, Jean",
                "Moretti, Bella", "Wu, Hong",     "Patel, Renee",
                "Harrison, Rose", "Smith, Cathy",   "Conroy, Pat",
                "Kelly, Sean",    "Holland, Beth"
        };

        // print out the names we were given
        System.out.println("Before Sort:");
        display(name);

        // print out the names after the sorting
        System.out.println("After Sort:");
        selectionSort(name);
        display(name);
    }

    // display function
    public static void display(String []name)
    {
        for( String obj:name)
        {
            System.out.println(obj);
        }
        System.out.println("");
    }

    // selection sort function
    public static void selectionSort(String [] name)
    {
        int n = name.length;

        // traverses through the unsorted array
        for (int i = 0; i < n - 1; i++)
        {
            // Find the minimum value in unsorted array
            int minValue = i;

            for (int j = i+1; j < n; j++)
                if (name[j].compareTo(name[minValue]) < 0)
                    minValue = j;

            //swap minimum val with the first val
            String temp = name[minValue];
            name[minValue] = name[i];
            name[i] = temp;
        }
    }


}