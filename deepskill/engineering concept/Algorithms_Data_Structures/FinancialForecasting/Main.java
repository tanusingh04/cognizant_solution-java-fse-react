package FinancialForecasting;

public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial Investment
        double growthRate = 0.07;     // 7% Annual Growth Rate
        int years = 10;               // 10-Year Horizon

        System.out.println("--- Financial Forecasting Simulation ---");
        System.out.printf("Present Value (PV): $%.2f%n", presentValue);
        System.out.printf("Growth Rate: %.1f%%%n", growthRate * 100);
        System.out.println("Forecasting Period: " + years + " years");

        // Recursive forecast
        double futureValueRecursive = Forecasting.calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("%n[Recursive] Forecasted Future Value: $%.2f%n", futureValueRecursive);

        // Iterative forecast
        double futureValueIterative = Forecasting.calculateFutureValueIterative(presentValue, growthRate, years);
        System.out.printf("[Iterative] Forecasted Future Value: $%.2f%n", futureValueIterative);

        // Assert/verify match
        if (Math.abs(futureValueRecursive - futureValueIterative) < 0.001) {
            System.out.println("\nVerification: Both methods yield identical results!");
        } else {
            System.out.println("\nVerification Failed: Mismatch in calculations.");
        }
    }
}
