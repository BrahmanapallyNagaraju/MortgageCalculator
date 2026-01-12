package com.learnjava;

/**
 * Utility class for mortgage calculations.
 */
public class MortgageCalculator {
    /**
     * Calculate the monthly mortgage payment using the standard amortization formula.
     *
     * @param principal the loan principal (e.g., 200000)
     * @param monthlyInterest the monthly interest rate (e.g., annualRate / 100 / 12)
     * @param numberOfPayments total number of monthly payments (years * 12)
     * @return the monthly payment amount
     */
    public static double calculateMonthlyPayment(int principal, double monthlyInterest, int numberOfPayments) {
        if (monthlyInterest == 0) {
            return (double) principal / numberOfPayments;
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
    }
}
