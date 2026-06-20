package FinancialForecasting;

public class Forecasting {

    /**
     * Calculates the future value recursively based on a constant annual growth rate.
     * Formula: FV = PV * (1 + r)^n
     * Recursive form: FV(n) = FV(n-1) * (1 + r); Base case: FV(0) = PV
     *
     * @param currentValue Current value of the asset/investment (Present Value)
     * @param growthRate Constant annual growth rate (e.g., 0.05 for 5%)
     * @param years Number of years to forecast
     * @return Forecasted value
     */
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base Case: 0 years remaining, value is current value
        if (years <= 0) {
            return currentValue;
        }
        // Recursive Case: Value next year is (currentValue * (1 + growthRate)) forecasted for (years - 1)
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    /**
     * Optimized Iterative Approach to avoid stack overflow for very large periods
     * and minimize recursive call overhead.
     */
    public static double calculateFutureValueIterative(double currentValue, double growthRate, int years) {
        double futureValue = currentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
