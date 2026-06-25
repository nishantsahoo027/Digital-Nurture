import java.util.Scanner;

public class FinancialForecast {
    public static double futureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
         return futureValue(currentValue * (1 + growthRate / 100), growthRate, years - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" Financial Forecasting System");
        System.out.println("====================================");
        System.out.print("Enter Current Value : ");
        double currentValue = sc.nextDouble();
        System.out.print("Enter Annual Growth Rate (%) : ");
        double growthRate = sc.nextDouble();
        System.out.print("Enter Number of Years : ");
        int years = sc.nextInt();
        double predictedValue = futureValue(currentValue, growthRate, years);
        System.out.println("\n========== Forecast Result ==========");
        System.out.printf("Current Value       : %.2f%n", currentValue);
        System.out.printf("Growth Rate         : %.2f%%%n", growthRate);
        System.out.println("Years               : " + years);
        System.out.printf("Predicted Value     : %.2f%n", predictedValue);
        System.out.println("\n========== Complexity ==========");
        System.out.println("Time Complexity : O(n)");
        System.out.println("Space Complexity: O(n)");
        System.out.println("\nOptimization");
        System.out.println("The recursive solution can be optimized");
        System.out.println("using Dynamic Programming or an");
        System.out.println("iterative approach to avoid");
        System.out.println("excessive recursive calls.");
        sc.close();
    }
}