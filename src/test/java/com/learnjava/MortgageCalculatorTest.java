package com.learnjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MortgageCalculatorTest {

    @Test
    void calculatesCorrectMonthlyPayment_forExample() {
        int principal = 200_000;
        float annualInterest = 3.75f;
        double monthlyInterest = annualInterest / 100 / 12;
        int years = 20;
        int payments = years * 12;

        double result = MortgageCalculator.calculateMonthlyPayment(principal, monthlyInterest, payments);
        // round to 2 decimals for comparison
        double rounded = Math.round(result * 100.0) / 100.0;
        assertEquals(1185.98, rounded, 0.01);
    }

    @Test
    void calculatesCorrectly_whenInterestIsZero() {
        int principal = 120_000;
        double monthlyInterest = 0.0;
        int payments = 10 * 12;

        double result = MortgageCalculator.calculateMonthlyPayment(principal, monthlyInterest, payments);
        assertEquals(1000.0, result, 1e-9);
    }

    @Test
    void returnsPositive_forSmallValues() {
        int principal = 1_000;
        double monthlyInterest = 1.0 / 100 / 12;
        int payments = 1 * 12;

        double result = MortgageCalculator.calculateMonthlyPayment(principal, monthlyInterest, payments);
        assertTrue(result > 0);
    }
}
