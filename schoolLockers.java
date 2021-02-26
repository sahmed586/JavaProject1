// Sadia Ahmed
// Project 1 Problem 3 - CSC 3020
// Students come to school and change sequence of open v closed lockers
// Program returns which lockers remain opened in the end

public class schoolLockers {

    public static void main(String[] args) {

        boolean[] lockers = new boolean[101];

        // representing how all lockers start off closed
        // false = closed
        for (int i = 1; i < lockers.length; i++)
        {
            lockers[i] = false;
        }

        // representing how student 1 opens all lockers
        // true = open
        for (int i = 1; i < lockers.length; i++)
        {
            lockers[i] = true;
        }

        // switching to the opposite of each locker with multiple of j
        for(int j = 2; j < lockers.length; j++)
        {
            for(int k = j; k < lockers.length; k=k+j)
            {
                if(lockers[k]==false) lockers[k] = true;
                else lockers[k] = false;

            }
        }

        // displaying the opened lockers
        for(int l = 1; l < lockers.length; l++)
        {
            if (lockers[l] == true) {
                System.out.println("Locker " + l + " is open.");
            }

        }
    }



}
