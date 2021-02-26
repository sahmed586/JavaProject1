// Sadia Ahmed
// Project 1 Problem 1 - CSC 3020
// Calculating the future value of an investment w/ interest

import java.util.Scanner;

public class futureInvestmentValue {
    // Main Method
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // User Input Prompt for Amount
        System.out.print("The Amount Invested: ");
        double amntInvested = userInput.nextDouble();

        // User Input Prompt for Interest Rate
        System.out.print("Annual Interest Rate: ");
        double interestRate = userInput.nextDouble();

        // monthly interest calculation
        double monthlyInterest = interestRate / 1200;

        // prints the table for the future values of the investment
        System.out.println("Years      Future Value"); // column names

        // 30 years is how many years we want the info displayed to
        // per the instructions
        for (int years = 1; years <= 30; years++)
        {
            System.out.printf("%-10d", years);
            System.out.printf("%11.2f\n", futureInvestmentValue(amntInvested, monthlyInterest, years));
        }
    }

    // function def and implementation for futureInvestmentValue calculation
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
    {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12); // future value calculation
    }

}

